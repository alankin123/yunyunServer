
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserBaseEntity;
import com.alankin.mapper.UserBaseMapper;


/**
 * �û�������Ϣ�� bo
 * @author qym
 * @Date 2018-12-02 15:09:34
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
