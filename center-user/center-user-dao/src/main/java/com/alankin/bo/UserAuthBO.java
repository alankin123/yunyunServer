
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserAuthEntity;
import com.alankin.mapper.UserAuthMapper;


/**
 * �û���Ȩ�� bo
 * @author qym
 * @Date 2018-12-02 15:09:34
 * @since 1.0
 */
@Component
public class UserAuthBO extends AbstractBaseBO<UserAuthEntity> {
	
	@Autowired
	private UserAuthMapper userAuthMapper;
	
	@Override
    protected IBaseMapper<UserAuthEntity> getMapper() {
	    return userAuthMapper;
    }
}
