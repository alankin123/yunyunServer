package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserBaseBO;
import com.alankin.entity.UserBaseEntity;

/**
 * 用户基础信息 业务处理
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */@Service
public class UserBaseService extends BaseService {

	@Autowired
	private UserBaseBO userBaseBo;

	/**
	 * 分页查询列表
	 * 
	 * @param reqVO
	 * @return
	 */
	public ListRespVO list(ListReqVO<UserBaseEntity> reqVO) throws CenterException {
		return userBaseBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 * 
	 * @param reqVO
	 * @return
	 */
	public Object queryById(@Param("uid") String uid) throws CenterException {
		return userBaseBo.queryById(uid);
	}

	/**
	 * 新增
	 * 
	 * @param reqVO
	 * @return
	 */
	public Object create(UserBaseEntity userBase) throws CenterException {
		userBaseBo.createForValidate(userBase);
		return userBase;
	}

	/**
	 * 修改
	 * 
	 * @param reqVO
	 * @return
	 */
	public BaseRespVO update(UserBaseEntity userBase) throws CenterException {
		int updateCount = userBaseBo.updateForValidate(userBase);
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
	public BaseRespVO delete(@Param("uid") String[] uid) throws CenterException {
		int deleteCount = userBaseBo.batchDeleteById(uid);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
