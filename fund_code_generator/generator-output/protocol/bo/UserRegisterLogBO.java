
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserRegisterLogEntity;
import com.alankin.mapper.UserRegisterLogMapper;


/**
 * �û�ע����־�� bo
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@Component
public class UserRegisterLogBO extends AbstractBaseBO<UserRegisterLogEntity> {
	
	@Autowired
	private UserRegisterLogMapper userRegisterLogMapper;
	
	@Override
    protected IBaseMapper<UserRegisterLogEntity> getMapper() {
	    return userRegisterLogMapper;
    }
}
