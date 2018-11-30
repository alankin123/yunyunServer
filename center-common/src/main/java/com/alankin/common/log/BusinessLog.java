package com.alankin.common.log;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.entity.SessionUser;
import com.alankin.common.global.MapCache;
import com.alankin.common.service.ThreadContext;
import com.alankin.common.utils.DateUtilSafe;
import com.alankin.common.utils.StringUtil;
import com.alankin.common.utils.StringUtils;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.ValueRespVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.Map;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Service
public class BusinessLog extends ApplicationObjectSupport {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static long LOG_TYPE_CREATE = 1;
	public static long LOG_TYPE_UPDATE = 2;
	public static long LOG_TYPE_DELETE = 3;

	private static ObjectMapper objectMapper = new ObjectMapper();
	static {
		objectMapper.setDateFormat(DateUtilSafe.getSdf(DateUtilSafe.simple));
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setSerializationInclusion(Include.NON_EMPTY);
	}

	@Autowired
	BusinessLogHandler businessLogHandler;

	Object remoteLogApi;

	Method logMethod;

	@PostConstruct
	public void init() {
		try {
			remoteLogApi = getApplicationContext().getBean("centerBusinessLog");
			logMethod = remoteLogApi.getClass().getMethod("saveBusinessLog", LogBusinessEntity.class);
		} catch (Exception e) {
			return;
		}
	}

	public boolean isLog() {
		return logMethod != null;
	}

	/**
	 * 方法调用前记录
	 * 
	 * @param serviceName
	 * @param methodName
	 * @param reqMap
	 */
	public void invokBefore(String serviceName, String methodName, Map reqMap) {
		// 目前不处理调用前的日志

		// if (!isLog()) {
		// return;
		// }
		// LogServiceConfig logServiceConfig = businessLogHandler.getLogConfigMap().get(serviceName);
		// if (logServiceConfig == null) {
		// return;
		// }
		//
		// LogMethodConfig logMethodConfig = logServiceConfig.getMethodMap().get(methodName);
		// if (logMethodConfig == null || LOG_TYPE_CREATE != logMethodConfig.getLogType()) {
		// return;
		// }
		//
		// LogBusinessEntity entity = businessLogHandler.instantiationLogBusinessEntity(logServiceConfig,
		// logMethodConfig);
		//
		// saveLogEntity(serviceName, methodName, reqMap, entity);

	}

	/**
	 * 方法调用后记录
	 * 
	 * @param serviceName
	 * @param methodName
	 * @param reqMap
	 */
	public void invokAfter(String serviceName, String methodName, Map reqMap, BaseRespVO respVo) {
		if (!isLog()) {
			return;
		}
		try {
			LogServiceConfig logServiceConfig = businessLogHandler.getLogConfigMap().get(serviceName);
			if (logServiceConfig == null) {
				return;
			}

			LogMethodConfig logMethodConfig = logServiceConfig.getMethodMap().get(methodName);
			if (logMethodConfig == null) {
				return;
			}

			LogBusinessEntity entity = businessLogHandler.instantiationSysLogEntity(logServiceConfig, logMethodConfig);

			saveLogEntity(serviceName, methodName, reqMap, entity, respVo, logServiceConfig);
		} catch (Throwable e) {
			logger.debug("记录业务日志出错!", e);
		}

	}

	/**
	 * 根据业务实体保存日志信息
	 * 
	 * @param serviceName
	 * @param methodName
	 * @param user
	 * @param clentIp
	 * @param reqMap
	 * @param entity
	 * @throws JsonProcessingException
	 */
	private void saveLogEntity(String serviceName, String methodName, Map reqMap, LogBusinessEntity entity, BaseRespVO respVo,
	        LogServiceConfig logServiceConfig) throws JsonProcessingException {

		String resutStr = null;
		if (respVo == null) {
			resutStr = "未知";
		} else {
			if (respVo.isSuccess()) {
				resutStr = "成功";
			} else {
				resutStr = "失败，" + objectMapper.writeValueAsString(respVo);
			}
		}
		entity.setOperResut(resutStr);

		Object id = reqMap.get(logServiceConfig.getIdFieldName());
		if (id != null) {
			entity.setRecordId(id + "");
		} else {
			try {
				if (ValueRespVO.class.isInstance(respVo) && !StringUtils.isEmpty(logServiceConfig.getIdFieldName())) {
					ValueRespVO valueRespVO = (ValueRespVO) respVo;
					if (BaseEntity.class.isInstance(valueRespVO.getAaData())) {
						BaseEntity respEntity = (BaseEntity) valueRespVO.getAaData();
						Method method = MapCache.getMethod(respEntity.getClass(), "get" + StringUtil.firstCharUpperCase(logServiceConfig.getIdFieldName()));
						id = method.invoke(respEntity);
						entity.setRecordId(id + "");
					}
				}
			} catch (Exception e) {
				logger.debug("记录业务日志出错！", e);
			}
		}
		saveLog(entity, reqMap);
	}

	/**
	 * 记录异常信息到数据库表
	 * 
	 * @param serviceName
	 * @param methodName
	 * @param reqMap
	 * @param parameters
	 * @param t
	 */
	public Long saveExceptionLog(String serviceName, String methodName, Map reqMap, Object[] parameters, BaseRespVO resp) {
		LogBusinessEntity entity = new LogBusinessEntity();
		entity.setOperType(9l);
		entity.setModeName(serviceName);
		entity.setMethodName(methodName);
		entity.setOperResut(resp.getState() + "");
		entity.setLogContent(resp.getMsg());

		return saveLog(entity, reqMap);
	}

	/**
	 * 记录业务日志
	 * 
	 * @param serviceName
	 * @param methodName
	 * @param reqMap
	 */
	private Long saveLog(LogBusinessEntity entity, Map reqMap) {
		SessionUser user = ThreadContext.getSessionloginUser(false);
		String clentIp = ThreadContext.getRequestClientIp();

		if (user != null) {
			entity.setCreateUserId(user.getUserId());
			entity.setCreateUserName(user.getNickName());
		}
		entity.setClentIp(clentIp);

		try {
			entity.setParameters(objectMapper.writeValueAsString(businessLogHandler.copyReqMap(reqMap)));
		} catch (JsonProcessingException e) {
			entity.setParameters(e.getMessage());
		}

		try {
			return (Long) logMethod.invoke(remoteLogApi, entity);
		} catch (Throwable e) {
			logger.debug("记录业务日志出错！", e);
			return 0l;
		}

	}

}
