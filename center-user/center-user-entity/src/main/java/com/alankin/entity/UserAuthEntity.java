
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 用户授权
 * @author qym
 * @Date 2018-11-30 13:42:27
 * @since 1.0
 */
@TableName("user_auth")
public class UserAuthEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** 用户id. */
	private String uid;
	
	/** 1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	private Integer identityType;
	
	/** 手机号 邮箱 用户名或第三方应用的唯一标识. */
	private String identifier;
	
	/** 密码凭证(站内的保存密码，站外的不保存或保存token). */
	private String certificate;
	
	/** 绑定时间. */
	private Long createTime;
	
	/** 更新绑定时间. */
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
	

    /** set 用户id. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get 用户id. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set 1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	public void setIdentityType(Integer identityType) {
		this.identityType = identityType;
	}
	
	/** get 1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	public Integer getIdentityType() {
		return this.identityType;
	}
	
	@JsonIgnore
	public Integer getIdentityTypeByLike() {
		return this.identityType;
	}
	

    /** set 手机号 邮箱 用户名或第三方应用的唯一标识. */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	/** get 手机号 邮箱 用户名或第三方应用的唯一标识. */
	public String getIdentifier() {
		return this.identifier;
	}
	
	@JsonIgnore
	public String getIdentifierByLike() {
		return "%"+this.identifier+"%";
	}
	

    /** set 密码凭证(站内的保存密码，站外的不保存或保存token). */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	/** get 密码凭证(站内的保存密码，站外的不保存或保存token). */
	public String getCertificate() {
		return this.certificate;
	}
	
	@JsonIgnore
	public String getCertificateByLike() {
		return "%"+this.certificate+"%";
	}
	

    /** set 绑定时间. */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	/** get 绑定时间. */
	public Long getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public Long getCreateTimeByLike() {
		return this.createTime;
	}
	

    /** set 更新绑定时间. */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get 更新绑定时间. */
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
	 * @param uid			用户id
	 * @param identityType			1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博
	 * @param identifier			手机号 邮箱 用户名或第三方应用的唯一标识
	 * @param certificate			密码凭证(站内的保存密码，站外的不保存或保存token)
	 * @param createTime			绑定时间
	 * @param updateTime			更新绑定时间
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
