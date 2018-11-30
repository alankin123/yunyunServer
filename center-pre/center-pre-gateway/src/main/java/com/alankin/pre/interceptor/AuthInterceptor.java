package com.alankin.pre.interceptor;

import com.alankin.common.entity.SessionUser;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.pre.utils.Constants;
import com.alankin.pre.utils.Utils;
import com.alankin.vo.AuthCheckVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.Map;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	private Map<String, String> overtApiMap;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		/*// 截取访问地址
		String uri = request.getRequestURI();
		uri = uri.replaceAll("//", "/");
		uri = uri.substring(uri.indexOf("/", uri.indexOf("api/")));

		// 判断访问的接口是否为公开接口
		if (isOvertApi(uri)) {
			return true;
		}

		// 判断用户是否已登录
		HttpSession session = request.getSession(false);
		if (session == null) {
			Utils.writeRespones(response, new BaseRespVO(97, "登录信息过期，请重新登录！"));
			return false;
		}
		SessionUser loginUser = (SessionUser) session.getAttribute(com.alankin.common.Constants.SESSION_LOGIN_USER);
		if (loginUser == null) {
			Utils.writeRespones(response, new BaseRespVO(97, "会话超时，请重新登录！"));
			return false;
		}

		// 校验当前IP是否与登录时的IP一致
		String reqIp = Utils.getIpAddr(request);
		if (!reqIp.startsWith("0:0:0:0") && !"127.0.0.1".equals(reqIp)
		        && !reqIp.equalsIgnoreCase(session.getAttribute(com.alankin.common.Constants.REQUEST_CLIENT_IP) + "")) {
			logger.error("接口:{},token:{},访问IP与登录不一致！{}---{}", request.getRequestURI(), request.getParameter("token"), reqIp,
			        session.getAttribute(com.alankin.common.Constants.REQUEST_CLIENT_IP));
			Utils.writeRespones(response, new BaseRespVO(97, "访问IP与登录不一致，请重新登录！"));
			return false;
		}

		// 超级管理员账号不验证权限
		if (0l == loginUser.getUserId()) {
			return true;
		}

		// 校验接口访问权限
		AuthCheckVo authCheckVo = (AuthCheckVo) session.getAttribute(Constants.SESSION_AUTHS_KEY);
		// 目前无法单独校验菜单权限(因为api没有定义在数据库中，无法与菜单关联)
		if (!authCheckVo.isButtonCheck()) {
			return true;
		}
		// 按钮权限校验
		Map<String, String> authsMap = authCheckVo.getButtons();
		if (authsMap == null || !authsMap.containsKey(uri)) {
			Utils.writeRespones(response, new BaseRespVO(98, "您没有权限访问" + uri + "，请联系管理员！"));
			return false;
		}*/
		return true;
	}

	/**
	 * 校验访问的接口是否公开不需要权限控制
	 * 
	 * @param request
	 * @return
	 */
	private boolean isOvertApi(String uri) {
		for (Iterator<String> iterator = overtApiMap.keySet().iterator(); iterator.hasNext();) {
			if (uri.startsWith(iterator.next())) {
				return true;
			}
		}
		return false;
	}

}