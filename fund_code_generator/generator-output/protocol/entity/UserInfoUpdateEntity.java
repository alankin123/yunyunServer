
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * �û�ע����־��
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@TableName("user_info_update")
public class UserInfoUpdateEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** ����ID. */
	private Long id;
	
	/** �û�ID. */
	private String uid;
	
	/** ������. */
	private String attributeName;
	
	/** ���Զ�Ӧ�ɵ�ֵ. */
	private String attributeOldVal;
	
	/** ���Զ�Ӧ�µ�ֵ. */
	private String attributeNewVal;
	
	/** �޸�ʱ��. */
	private Long updateTime;
	
	

    /** set ����ID. */
	public void setId(Long id) {
		this.id = id;
	}
	
	/** get ����ID. */
	public Long getId() {
		return this.id;
	}
	
	@JsonIgnore
	public Long getIdByLike() {
		return this.id;
	}
	

    /** set �û�ID. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get �û�ID. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set ������. */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	/** get ������. */
	public String getAttributeName() {
		return this.attributeName;
	}
	
	@JsonIgnore
	public String getAttributeNameByLike() {
		return "%"+this.attributeName+"%";
	}
	

    /** set ���Զ�Ӧ�ɵ�ֵ. */
	public void setAttributeOldVal(String attributeOldVal) {
		this.attributeOldVal = attributeOldVal;
	}
	
	/** get ���Զ�Ӧ�ɵ�ֵ. */
	public String getAttributeOldVal() {
		return this.attributeOldVal;
	}
	
	@JsonIgnore
	public String getAttributeOldValByLike() {
		return "%"+this.attributeOldVal+"%";
	}
	

    /** set ���Զ�Ӧ�µ�ֵ. */
	public void setAttributeNewVal(String attributeNewVal) {
		this.attributeNewVal = attributeNewVal;
	}
	
	/** get ���Զ�Ӧ�µ�ֵ. */
	public String getAttributeNewVal() {
		return this.attributeNewVal;
	}
	
	@JsonIgnore
	public String getAttributeNewValByLike() {
		return "%"+this.attributeNewVal+"%";
	}
	

    /** set �޸�ʱ��. */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get �޸�ʱ��. */
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
	 * @param uid			�û�ID
	 * @param attributeName			������
	 * @param attributeOldVal			���Զ�Ӧ�ɵ�ֵ
	 * @param attributeNewVal			���Զ�Ӧ�µ�ֵ
	 * @param updateTime			�޸�ʱ��
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
