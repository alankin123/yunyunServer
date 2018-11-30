
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserBaseEntity;
import com.alankin.mapper.UserBaseMapper;


/**
 * 用户基础信息 bo
 * @author qym
 * @Date 2018-11-30 13:42:27
 * @since 1.0
 */
@Component
public class UserBaseBO extends AbstractBaseBO<UserBaseEntity> {
	
	@Autowired
	private UserBaseMapper userBaseMapper;
	
	@Override
    protected IBaseMapper<UserBaseEntity> getMapper() {
	    return userBaseMapper;
    }
}
