package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserLoginLogBO;
import com.alankin.entity.UserLoginLogEntity;

/**
 * 登陆日志 业务处理
 * @author qym
 * @Date 2018-11-30 13:42:29
 * @since 1.0
 */@Service
public class UserLoginLogService extends BaseService {

	@Autowired
	private UserLoginLogBO userLoginLogBo;

	/**
	 * 分页查询列表
	 * 
	 * @param reqVO
	 * @return
	 */
	public ListRespVO list(ListReqVO<UserLoginLogEntity> reqVO) throws CenterException {
		return userLoginLogBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 */
	public Object queryById(@Param("id") Long id) throws CenterException {
		return userLoginLogBo.queryById(id);
	}

	/**
	 * 新增
	 */
	public Object create(UserLoginLogEntity userLoginLog) throws CenterException {
		userLoginLogBo.createForValidate(userLoginLog);
		return userLoginLog;
	}

	/**
	 * 修改
	 */
	public BaseRespVO update(UserLoginLogEntity userLoginLog) throws CenterException {
		int updateCount = userLoginLogBo.updateForValidate(userLoginLog);
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
		int deleteCount = userLoginLogBo.batchDeleteById(id);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
