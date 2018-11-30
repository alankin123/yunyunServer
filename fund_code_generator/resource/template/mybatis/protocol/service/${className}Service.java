package ${basepackage}.service${modepackage};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alankin.common.exception.CenterException;
import com.alankin.common.service.BaseService;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.common.vo.Param;
import com.alankin.common.vo.ListVo.ListReqVO;
import com.alankin.common.vo.ListVo.ListRespVO;

import ${basepackage}.bo${modepackage}.${table.className}BO;
import ${basepackage}.entity${modepackage}.${table.classNameEntity};

<#include "/include/java_classService.include">
@Service
public class ${table.className}Service extends BaseService {

	@Autowired
	private ${table.className}BO ${table.classNameFirstLower}Bo;

	/**
	 * 分页查询列表
	 */
	public ListRespVO list(ListReqVO<${table.className}Entity> reqVO) throws CenterException {
		return ${table.classNameFirstLower}Bo.queryPageAutomatic(reqVO);
	}
	
	/**
	 * 根据ID查询单条记录
	 */
	public Object queryById(@Param("${table.primaryKeyParName}") ${table.pkType} ${table.primaryKeyParName}) throws CenterException {
		return ${table.classNameFirstLower}Bo.queryById(${table.primaryKeyParName});
	}

	/**
	 * 新增
	 */
	public Object create(${table.className}Entity ${table.classNameFirstLower}) throws CenterException {
		${table.classNameFirstLower}Bo.createForValidate(${table.classNameFirstLower});
		return ${table.classNameFirstLower};
	}

	/**
	 * 修改
	 */
	public BaseRespVO update(${table.className}Entity ${table.classNameFirstLower}) throws CenterException {
		int updateCount = ${table.classNameFirstLower}Bo.updateForValidate(${table.classNameFirstLower});
		if(updateCount > 0){
			return new BaseRespVO();
		}else{
			return new BaseRespVO(2,"没有要修改的记录！");
		}
		
	}

	/**
	 * 删除
	 */
	public BaseRespVO delete(@Param("${table.primaryKeyParName}") ${table.pkType}[] ${table.primaryKeyParName}) throws CenterException {
		int deleteCount = ${table.classNameFirstLower}Bo.batchDeleteById(${table.primaryKeyParName});
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
