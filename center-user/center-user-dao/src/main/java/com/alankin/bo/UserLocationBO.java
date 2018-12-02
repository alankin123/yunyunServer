
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserLocationEntity;
import com.alankin.mapper.UserLocationMapper;


/**
 * �û���λ�� bo
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@Component
public class UserLocationBO extends AbstractBaseBO<UserLocationEntity> {
	
	@Autowired
	private UserLocationMapper userLocationMapper;
	
	@Override
    protected IBaseMapper<UserLocationEntity> getMapper() {
	    return userLocationMapper;
    }
}
