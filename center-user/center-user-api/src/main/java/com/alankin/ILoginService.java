package com.alankin;


import com.alankin.vo.LoginRespVo;

import java.util.Map;

@SuppressWarnings("rawtypes")
public interface ILoginService {

	/**
	 * 登录
	 * 
	 * @param reqMap
	 * @return
	 */

	LoginRespVo login(Map reqMap);

}
