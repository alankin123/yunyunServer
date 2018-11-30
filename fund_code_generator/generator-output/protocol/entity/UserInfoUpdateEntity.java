
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 用户注册日志
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */
@TableName("user_info_update")
public class UserInfoUpdateEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** 自增ID. */
	private Long id;
	
	/** 用户ID. */
	private String uid;
	
	/** 属性名. */
	private String attributeName;
	
	/** 属性对应旧的值. */
	private String attributeOldVal;
	
	/** 属性对应新的值. */
	private String attributeNewVal;
	
	/** 修改时间. */
	private Long updateTime;
	
	

    /** set 自增ID. */
	public void setId(Long id) {
		this.id = id;
	}
	
	/** get 自增ID. */
	public Long getId() {
		return this.id;
	}
	
	@JsonIgnore
	public Long getIdByLike() {
		return this.id;
	}
	

    /** set 用户ID. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get 用户ID. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set 属性名. */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	/** get 属性名. */
	public String getAttributeName() {
		return this.attributeName;
	}
	
	@JsonIgnore
	public String getAttributeNameByLike() {
		return "%"+this.attributeName+"%";
	}
	

    /** set 属性对应旧的值. */
	public void setAttributeOldVal(String attributeOldVal) {
		this.attributeOldVal = attributeOldVal;
	}
	
	/** get 属性对应旧的值. */
	public String getAttributeOldVal() {
		return this.attributeOldVal;
	}
	
	@JsonIgnore
	public String getAttributeOldValByLike() {
		return "%"+this.attributeOldVal+"%";
	}
	

    /** set 属性对应新的值. */
	public void setAttributeNewVal(String attributeNewVal) {
		this.attributeNewVal = attributeNewVal;
	}
	
	/** get 属性对应新的值. */
	public String getAttributeNewVal() {
		return this.attributeNewVal;
	}
	
	@JsonIgnore
	public String getAttributeNewValByLike() {
		return "%"+this.attributeNewVal+"%";
	}
	

    /** set 修改时间. */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get 修改时间. */
	public Long getUpdateTime() {
		return this.updateTime;
	}
	
	@JsonIgnore
	public Long getUpdateTimeByLike() {
		return this.updateTime;
	}
	
    /** constructor */
	public UserInfoUpdateEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param uid			用户ID
	 * @param attributeName			属性名
	 * @param attributeOldVal			属性对应旧的值
	 * @param attributeNewVal			属性对应新的值
	 * @param updateTime			修改时间
	 */
	public UserInfoUpdateEntity(String uid,String attributeName,String attributeOldVal,String attributeNewVal,Long updateTime){
		this();
		this.uid = uid;
		this.attributeName = attributeName;
		this.attributeOldVal = attributeOldVal;
		this.attributeNewVal = attributeNewVal;
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserInfoUpdateEntity[")
			.append("Id=").append(getId()).append(", ")
			.append("Uid=").append(getUid()).append(", ")
			.append("AttributeName=").append(getAttributeName()).append(", ")
			.append("AttributeOldVal=").append(getAttributeOldVal()).append(", ")
			.append("AttributeNewVal=").append(getAttributeNewVal()).append(", ")
			.append("UpdateTime=").append(getUpdateTime())
		.append("]").toString();
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj instanceof UserInfoUpdateEntity == false)
			return false;
		if(this == obj)
			return true;
		UserInfoUpdateEntity other = (UserInfoUpdateEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
