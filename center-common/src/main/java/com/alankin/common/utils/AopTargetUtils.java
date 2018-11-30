package com.alankin.common.utils;

import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopProxy;
import org.springframework.aop.support.AopUtils;

import java.lang.reflect.Field;

/**
 * 能获取JDK动态代理/CGLIB代理对象代理的目标对象
 *
 * @author lansongtao
 * @Date 2017年11月8日
 * @since 1.0
 */
public class AopTargetUtils {
	/**
	 * 获取 目标对象
	 * 
	 * @param proxy
	 *            代理对象
	 * @return
	 * @throws Exception
	 */
	public static Object getTarget(Object proxy) {

		if (!AopUtils.isAopProxy(proxy)) {
			return proxy;// 不是代理对象
		}
		try {
			if (AopUtils.isJdkDynamicProxy(proxy)) {

				return getJdkDynamicProxyTargetObject(proxy);
			} else { // cglib
				return getCglibProxyTargetObject(proxy);
			}
		} catch (Exception e) {
			return proxy;
		}

	}

	private static Object getCglibProxyTargetObject(Object proxy) throws Exception {
		Field h = proxy.getClass().getDeclaredField("CGLIB$CALLBACK_0");
		h.setAccessible(true);
		Object dynamicAdvisedInterceptor = h.get(proxy);

		Field advised = dynamicAdvisedInterceptor.getClass().getDeclaredField("advised");
		advised.setAccessible(true);

		Object target = ((AdvisedSupport) advised.get(dynamicAdvisedInterceptor)).getTargetSource().getTarget();

		return target;
	}

	private static Object getJdkDynamicProxyTargetObject(Object proxy) throws Exception {
		Field h = proxy.getClass().getSuperclass().getDeclaredField("h");
		h.setAccessible(true);
		AopProxy aopProxy = (AopProxy) h.get(proxy);

		Field advised = aopProxy.getClass().getDeclaredField("advised");
		advised.setAccessible(true);

		Object target = ((AdvisedSupport) advised.get(aopProxy)).getTargetSource().getTarget();

		return target;
	}

}