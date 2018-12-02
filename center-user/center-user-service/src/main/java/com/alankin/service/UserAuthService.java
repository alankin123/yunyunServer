package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserAuthBO;
import com.alankin.entity.UserAuthEntity;

/**
 * �û���Ȩ�� 业务处理
 * @author qym
 * @Date 2018-12-02 15:09:34
 * @since 1.0
 */@Service
public class UserAuthService extends BaseService {

	@Autowired
	private UserAuthBO userAuthBo;

	/**
	 * 分页查询列表
	 */
	public ListRespVO list(ListReqVO<UserAuthEntity> reqVO) throws CenterException {
		return userAuthBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 */
	public Object queryById(@Param("id") Long id) throws CenterException {
		return userAuthBo.queryById(id);
	}

	/**
	 * 新增
	 */
	public Object create(UserAuthEntity userAuth) throws CenterException {
		userAuthBo.createForValidate(userAuth);
		return userAuth;
	}

	/**
	 * 修改
	 */
	public BaseRespVO update(UserAuthEntity userAuth) throws CenterException {
		int updateCount = userAuthBo.updateForValidate(userAuth);
		if(updateCount > 0){
			return new BaseRespVO();
		}else{
			return new BaseRespVO(2,"没有要修改的记录！");
		}
		
	}

	/**
	 * 删除
	 */
	public BaseRespVO delete(@Param("id") Long[] id) throws CenterException {
		int deleteCount = userAuthBo.batchDeleteById(id);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
