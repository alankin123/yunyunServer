
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * �û���Ȩ��
 * @author qym
 * @Date 2018-12-02 15:09:34
 * @since 1.0
 */
@TableName("user_auth")
public class UserAuthEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** �û�id. */
	private String uid;
	
	/** 1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	private Integer identityType;
	
	/** �ֻ��� ���� �û����������Ӧ�õ�Ψһ��ʶ. */
	private String identifier;
	
	/** ����ƾ֤(վ�ڵı������룬վ��Ĳ�����?�token). */
	private String certificate;
	
	/** ��ʱ��. */
	private Long createTime;
	
	/** ���°�ʱ��. */
	private Long updateTime;
	
	

    /** set . */
	public void setId(Long id) {
		this.id = id;
	}
	
	/** get . */
	public Long getId() {
		return this.id;
	}
	
	@JsonIgnore
	public Long getIdByLike() {
		return this.id;
	}
	

    /** set �û�id. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get �û�id. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set 1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	public void setIdentityType(Integer identityType) {
		this.identityType = identityType;
	}
	
	/** get 1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	public Integer getIdentityType() {
		return this.identityType;
	}
	
	@JsonIgnore
	public Integer getIdentityTypeByLike() {
		return this.identityType;
	}
	

    /** set �ֻ��� ���� �û����������Ӧ�õ�Ψһ��ʶ. */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	/** get �ֻ��� ���� �û����������Ӧ�õ�Ψһ��ʶ. */
	public String getIdentifier() {
		return this.identifier;
	}
	
	@JsonIgnore
	public String getIdentifierByLike() {
		return "%"+this.identifier+"%";
	}
	

    /** set ����ƾ֤(վ�ڵı������룬վ��Ĳ�����?�token). */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	/** get ����ƾ֤(վ�ڵı������룬վ��Ĳ�����?�token). */
	public String getCertificate() {
		return this.certificate;
	}
	
	@JsonIgnore
	public String getCertificateByLike() {
		return "%"+this.certificate+"%";
	}
	

    /** set ��ʱ��. */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	/** get ��ʱ��. */
	public Long getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public Long getCreateTimeByLike() {
		return this.createTime;
	}
	

    /** set ���°�ʱ��. */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get ���°�ʱ��. */
	public Long getUpdateTime() {
		return this.updateTime;
	}
	
	@JsonIgnore
	public Long getUpdateTimeByLike() {
		return this.updateTime;
	}
	
    /** constructor */
	public UserAuthEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param uid			�û�id
	 * @param identityType			1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��
	 * @param identifier			�ֻ��� ���� �û����������Ӧ�õ�Ψһ��ʶ
	 * @param certificate			����ƾ֤(վ�ڵı������룬վ��Ĳ�����?�token)
	 * @param createTime			��ʱ��
	 * @param updateTime			���°�ʱ��
	 */
	public UserAuthEntity(String uid,Integer identityType,String identifier,String certificate,Long createTime,Long updateTime){
		this();
		this.uid = uid;
		this.identityType = identityType;
		this.identifier = identifier;
		this.certificate = certificate;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserAuthEntity[")
			.append("Id=").append(getId()).append(", ")
			.append("Uid=").append(getUid()).append(", ")
			.append("IdentityType=").append(getIdentityType()).append(", ")
			.append("Identifier=").append(getIdentifier()).append(", ")
			.append("Certificate=").append(getCertificate()).append(", ")
			.append("CreateTime=").append(getCreateTime()).append(", ")
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
		if(obj instanceof UserAuthEntity == false)
			return false;
		if(this == obj)
			return true;
		UserAuthEntity other = (UserAuthEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
