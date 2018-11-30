package com.alankin.common.api;

import com.alankin.common.vo.BaseRespVO;

import java.util.Map;

public interface IRouteService {

	/**
	 * 各个子系统的web请求通用入口
	 * 
	 * @param mode
	 * @param service
	 * @param method
	 * @param reqMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	BaseRespVO webProcess(String mode, String service, String method, Map reqMap);

}
