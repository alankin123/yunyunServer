
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserLoginLogEntity;
import com.alankin.mapper.UserLoginLogMapper;


/**
 * 登陆日志 bo
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */
@Component
public class UserLoginLogBO extends AbstractBaseBO<UserLoginLogEntity> {
	
	@Autowired
	private UserLoginLogMapper userLoginLogMapper;
	
	@Override
    protected IBaseMapper<UserLoginLogEntity> getMapper() {
	    return userLoginLogMapper;
    }
}
