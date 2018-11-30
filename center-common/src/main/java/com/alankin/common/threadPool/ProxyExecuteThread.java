package com.alankin.common.threadPool;

import com.alankin.common.global.MapCache;
import com.alankin.common.service.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyExecuteThread implements Runnable {

	private static final Logger logger = LoggerFactory.getLogger(ProxyExecuteThread.class);

	private Object obj;
	private String methodName;
	private Object[] args;

	public ProxyExecuteThread(Object obj, String methodName, Object... args) {
		super();
		this.obj = obj;
		this.methodName = methodName;
		this.args = args;
	}

	@Override
	public void run() {
		Method method = null;
		try {
			method = MapCache.getMethod(obj, methodName);
			method.invoke(obj, args);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			ThreadContext.unbindContext();
		}

	}

}
