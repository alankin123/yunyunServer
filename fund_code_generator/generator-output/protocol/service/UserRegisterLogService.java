package com.alankin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import com.alankin.bo.UserRegisterLogBO;
import com.alankin.entity.UserRegisterLogEntity;

/**
 * �û�ע����־�� 业务处理
 * @author qym
 * @Date 2018-12-02 15:09:36
 * @since 1.0
 */@Service
public class UserRegisterLogService extends BaseService {

	@Autowired
	private UserRegisterLogBO userRegisterLogBo;

	/**
	 * 分页查询列表
	 */
	public ListRespVO list(ListReqVO<UserRegisterLogEntity> reqVO) throws CenterException {
		return userRegisterLogBo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 */
	public Object queryById(@Param("id") Long id) throws CenterException {
		return userRegisterLogBo.queryById(id);
	}

	/**
	 * 新增
	 */
	public Object create(UserRegisterLogEntity userRegisterLog) throws CenterException {
		userRegisterLogBo.createForValidate(userRegisterLog);
		return userRegisterLog;
	}

	/**
	 * 修改
	 */
	public BaseRespVO update(UserRegisterLogEntity userRegisterLog) throws CenterException {
		int updateCount = userRegisterLogBo.updateForValidate(userRegisterLog);
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
		int deleteCount = userRegisterLogBo.batchDeleteById(id);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
