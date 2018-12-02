
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserLoginLogEntity;
import com.alankin.mapper.UserLoginLogMapper;


/**
 * ��½��־�� bo
 * @author qym
 * @Date 2018-12-02 15:09:35
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
