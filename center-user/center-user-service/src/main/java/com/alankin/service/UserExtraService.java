package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserExtraBO;
import com.alankin.entity.UserExtraEntity;

/**
 * 用户额外信息 业务处理
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */@Service
public class UserExtraService extends BaseService {

	@Autowired
	private UserExtraBO userExtraBo;

	/**
	 * 分页查询列表
	 * 
	 * @param reqVO
	 * @return
	 */
	public ListRespVO list(ListReqVO<UserExtraEntity> reqVO) throws CenterException {
		return userExtraBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 */
	public Object queryById(@Param("uid") String uid) throws CenterException {
		return userExtraBo.queryByUid(uid);
	}

	/**
	 * 新增
	 */
	public Object create(UserExtraEntity userExtra) throws CenterException {
		userExtraBo.createForValidate(userExtra);
		return userExtra;
	}

	/**
	 * 修改
	 */
	public BaseRespVO update(UserExtraEntity userExtra) throws CenterException {
		int updateCount = userExtraBo.updateForValidate(userExtra);
		if(updateCount > 0){
			return new BaseRespVO();
		}else{
			return new BaseRespVO(2,"没有要修改的记录！");
		}
		
	}

	/**
	 * 删除
	 */
	public BaseRespVO delete(@Param("uid") String[] uid) throws CenterException {
		int deleteCount = userExtraBo.batchDeleteById(uid);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
