
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserInfoUpdateEntity;
import com.alankin.mapper.UserInfoUpdateMapper;


/**
 * 用户注册日志 bo
 * @author qym
 * @Date 2018-11-30 13:42:28
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
