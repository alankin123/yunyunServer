
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserLocationEntity;
import com.alankin.mapper.UserLocationMapper;


/**
 * 用户定位 bo
 * @author qym
 * @Date 2018-11-30 13:42:28
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
