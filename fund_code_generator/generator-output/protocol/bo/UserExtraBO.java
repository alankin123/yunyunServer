
package com.alankin.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alankin.common.bo.AbstractBaseBO;
import com.alankin.common.mapper.IBaseMapper;

import com.alankin.entity.UserExtraEntity;
import com.alankin.mapper.UserExtraMapper;


/**
 * �û�������Ϣ�� bo
 * @author qym
 * @Date 2018-12-02 15:09:34
 * @since 1.0
 */
@Component
public class UserExtraBO extends AbstractBaseBO<UserExtraEntity> {
	
	@Autowired
	private UserExtraMapper userExtraMapper;
	
	@Override
    protected IBaseMapper<UserExtraEntity> getMapper() {
	    return userExtraMapper;
    }
}
