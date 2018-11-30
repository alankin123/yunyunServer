package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserInfoUpdateBO;
import com.alankin.entity.UserInfoUpdateEntity;

/**
 * 用户注册日志 业务处理
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */@Service
public class UserInfoUpdateService extends BaseService {

	@Autowired
	private UserInfoUpdateBO userInfoUpdateBo;

	/**
	 * 分页查询列表
	 * 
	 * @param reqVO
	 * @return
	 */
	public ListRespVO list(ListReqVO<UserInfoUpdateEntity> reqVO) throws CenterException {
		return userInfoUpdateBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 * 
	 * @param reqVO
	 * @return
	 */
	public Object queryById(@Param("id") Long id) throws CenterException {
		return userInfoUpdateBo.queryById(id);
	}

	/**
	 * 新增
	 * 
	 * @param reqVO
	 * @return
	 */
	public Object create(UserInfoUpdateEntity userInfoUpdate) throws CenterException {
		userInfoUpdateBo.createForValidate(userInfoUpdate);
		return userInfoUpdate;
	}

	/**
	 * 修改
	 * 
	 * @param reqVO
	 * @return
	 */
	public BaseRespVO update(UserInfoUpdateEntity userInfoUpdate) throws CenterException {
		int updateCount = userInfoUpdateBo.updateForValidate(userInfoUpdate);
		if(updateCount > 0){
			return new BaseRespVO();
		}else{
			return new BaseRespVO(2,"没有要修改的记录！");
		}
		
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	public BaseRespVO delete(@Param("id") Long[] id) throws CenterException {
		int deleteCount = userInfoUpdateBo.batchDeleteById(id);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
