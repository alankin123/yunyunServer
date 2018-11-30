package com.alankin.service;

import com.alankin.common.entity.SessionUser;
import com.alankin.common.exception.CenterException;
import com.alankin.common.service.RouteService;
import com.alankin.common.service.ThreadContext;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("userRouteService")
public class UserRouteService extends RouteService {

	/**
	 * 填充默认的调用参数
	 * 
	 * @param reqMap
	 * @param methodName
	 * @throws CenterException
	 */
	@Override
	public void initReqMap(Map<String, Object> reqMap, String serviceName, String methodName){
		// 从session中注入数据权限信息
		SessionUser sessionUser = null;
		try {
			sessionUser = ThreadContext.getSessionloginUser();
		} catch (Exception e) {
			return;
		}

		reqMap.put("sysId", sessionUser.getSysId());

		if (methodName.indexOf("update") == -1 && methodName.indexOf("delete") == -1 && 0 != sessionUser.getUserId()) {
			reqMap.put("typeId", sessionUser.getTypeId());
			reqMap.put("typeCode", sessionUser.getTypeCode());
		}
	}

}
