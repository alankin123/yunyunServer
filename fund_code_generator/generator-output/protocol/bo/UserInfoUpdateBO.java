
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserInfoUpdateEntity;
import com.alankin.mapper.UserInfoUpdateMapper;


/**
 * �û�ע����־�� bo
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@Component
public class UserInfoUpdateBO extends AbstractBaseBO<UserInfoUpdateEntity> {
	
	@Autowired
	private UserInfoUpdateMapper userInfoUpdateMapper;
	
	@Override
    protected IBaseMapper<UserInfoUpdateEntity> getMapper() {
	    return userInfoUpdateMapper;
    }
}
