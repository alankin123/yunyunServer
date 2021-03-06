package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserLocationBO;
import com.alankin.entity.UserLocationEntity;

/**
 * �û���λ�� 业务处理
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */@Service
public class UserLocationService extends BaseService {

	@Autowired
	private UserLocationBO userLocationBo;

	/**
	 * 分页查询列表
	 */
	public ListRespVO list(ListReqVO<UserLocationEntity> reqVO) throws CenterException {
		return userLocationBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 */
	public Object queryById(@Param("id") Long id) throws CenterException {
		return userLocationBo.queryById(id);
	}

	/**
	 * 新增
	 */
	public Object create(UserLocationEntity userLocation) throws CenterException {
		userLocationBo.createForValidate(userLocation);
		return userLocation;
	}

	/**
	 * 修改
	 */
	public BaseRespVO update(UserLocationEntity userLocation) throws CenterException {
		int updateCount = userLocationBo.updateForValidate(userLocation);
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
		int deleteCount = userLocationBo.batchDeleteById(id);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
