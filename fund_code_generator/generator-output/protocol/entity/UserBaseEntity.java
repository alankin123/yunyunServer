
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 用户基础信息
 * @author qym
 * @Date 2018-11-30 13:42:27
 * @since 1.0
 */
@TableName("user_base")
public class UserBaseEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** 用户ID. */
	private String uid;
	
	/** 2正常用户 3禁言用户 4虚拟用户 5运营. */
	private Integer userRole;
	
	/** 注册来源：1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	private Integer registerSource;
	
	/** 用户账号，必须唯一. */
	private String userName;
	
	/** 用户昵称. */
	private String nickName;
	
	/** 用户性别 0-female 1-male. */
	private Integer gender;
	
	/** 用户生日. */
	private Long birthday;
	
	/** 用户个人签名. */
	private String signature;
	
	/** 手机号码(唯一). */
	private String mobile;
	
	/** 手机号码绑定时间. */
	private Long mobileBindTime;
	
	/** 邮箱(唯一). */
	private String email;
	
	/** 邮箱绑定时间. */
	private Long emailBindTime;
	
	/** 头像. */
	private String face;
	
	/** 头像 200x200x80. */
	private String face200;
	
	/** 原图头像. */
	private String srcface;
	
	/** 创建时间. */
	private java.util.Date createTime;
	
	/** 修改时间. */
	private java.util.Date updateTime;
	
	/** 用户设备push_token. */
	private String pushToken;
	
	

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
	

    /** set 2正常用户 3禁言用户 4虚拟用户 5运营. */
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	
	/** get 2正常用户 3禁言用户 4虚拟用户 5运营. */
	public Integer getUserRole() {
		return this.userRole;
	}
	
	@JsonIgnore
	public Integer getUserRoleByLike() {
		return this.userRole;
	}
	

    /** set 注册来源：1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	public void setRegisterSource(Integer registerSource) {
		this.registerSource = registerSource;
	}
	
	/** get 注册来源：1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	public Integer getRegisterSource() {
		return this.registerSource;
	}
	
	@JsonIgnore
	public Integer getRegisterSourceByLike() {
		return this.registerSource;
	}
	

    /** set 用户账号，必须唯一. */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/** get 用户账号，必须唯一. */
	public String getUserName() {
		return this.userName;
	}
	
	@JsonIgnore
	public String getUserNameByLike() {
		return "%"+this.userName+"%";
	}
	

    /** set 用户昵称. */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	/** get 用户昵称. */
	public String getNickName() {
		return this.nickName;
	}
	
	@JsonIgnore
	public String getNickNameByLike() {
		return "%"+this.nickName+"%";
	}
	

    /** set 用户性别 0-female 1-male. */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	/** get 用户性别 0-female 1-male. */
	public Integer getGender() {
		return this.gender;
	}
	
	@JsonIgnore
	public Integer getGenderByLike() {
		return this.gender;
	}
	

    /** set 用户生日. */
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	
	/** get 用户生日. */
	public Long getBirthday() {
		return this.birthday;
	}
	
	@JsonIgnore
	public Long getBirthdayByLike() {
		return this.birthday;
	}
	

    /** set 用户个人签名. */
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	/** get 用户个人签名. */
	public String getSignature() {
		return this.signature;
	}
	
	@JsonIgnore
	public String getSignatureByLike() {
		return "%"+this.signature+"%";
	}
	

    /** set 手机号码(唯一). */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/** get 手机号码(唯一). */
	public String getMobile() {
		return this.mobile;
	}
	
	@JsonIgnore
	public String getMobileByLike() {
		return "%"+this.mobile+"%";
	}
	

    /** set 手机号码绑定时间. */
	public void setMobileBindTime(Long mobileBindTime) {
		this.mobileBindTime = mobileBindTime;
	}
	
	/** get 手机号码绑定时间. */
	public Long getMobileBindTime() {
		return this.mobileBindTime;
	}
	
	@JsonIgnore
	public Long getMobileBindTimeByLike() {
		return this.mobileBindTime;
	}
	

    /** set 邮箱(唯一). */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/** get 邮箱(唯一). */
	public String getEmail() {
		return this.email;
	}
	
	@JsonIgnore
	public String getEmailByLike() {
		return "%"+this.email+"%";
	}
	

    /** set 邮箱绑定时间. */
	public void setEmailBindTime(Long emailBindTime) {
		this.emailBindTime = emailBindTime;
	}
	
	/** get 邮箱绑定时间. */
	public Long getEmailBindTime() {
		return this.emailBindTime;
	}
	
	@JsonIgnore
	public Long getEmailBindTimeByLike() {
		return this.emailBindTime;
	}
	

    /** set 头像. */
	public void setFace(String face) {
		this.face = face;
	}
	
	/** get 头像. */
	public String getFace() {
		return this.face;
	}
	
	@JsonIgnore
	public String getFaceByLike() {
		return "%"+this.face+"%";
	}
	

    /** set 头像 200x200x80. */
	public void setFace200(String face200) {
		this.face200 = face200;
	}
	
	/** get 头像 200x200x80. */
	public String getFace200() {
		return this.face200;
	}
	
	@JsonIgnore
	public String getFace200ByLike() {
		return "%"+this.face200+"%";
	}
	

    /** set 原图头像. */
	public void setSrcface(String srcface) {
		this.srcface = srcface;
	}
	
	/** get 原图头像. */
	public String getSrcface() {
		return this.srcface;
	}
	
	@JsonIgnore
	public String getSrcfaceByLike() {
		return "%"+this.srcface+"%";
	}
	

    /** set 创建时间. */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	
	/** get 创建时间. */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public java.util.Date getCreateTimeByLike() {
		return this.createTime;
	}
	

    /** set 修改时间. */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get 修改时间. */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	@JsonIgnore
	public java.util.Date getUpdateTimeByLike() {
		return this.updateTime;
	}
	

    /** set 用户设备push_token. */
	public void setPushToken(String pushToken) {
		this.pushToken = pushToken;
	}
	
	/** get 用户设备push_token. */
	public String getPushToken() {
		return this.pushToken;
	}
	
	@JsonIgnore
	public String getPushTokenByLike() {
		return "%"+this.pushToken+"%";
	}
	
    /** constructor */
	public UserBaseEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param userRole			2正常用户 3禁言用户 4虚拟用户 5运营
	 * @param registerSource			注册来源：1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博
	 * @param userName			用户账号，必须唯一
	 * @param nickName			用户昵称
	 * @param gender			用户性别 0-female 1-male
	 * @param birthday			用户生日
	 * @param signature			用户个人签名
	 * @param mobile			手机号码(唯一)
	 * @param mobileBindTime			手机号码绑定时间
	 * @param email			邮箱(唯一)
	 * @param emailBindTime			邮箱绑定时间
	 * @param face			头像
	 * @param face200			头像 200x200x80
	 * @param srcface			原图头像
	 * @param createTime			创建时间
	 * @param updateTime			修改时间
	 * @param pushToken			用户设备push_token
	 */
	public UserBaseEntity(Integer userRole,Integer registerSource,String userName,String nickName,Integer gender,Long birthday,String signature,String mobile,Long mobileBindTime,String email,Long emailBindTime,String face,String face200,String srcface,java.util.Date createTime,java.util.Date updateTime,String pushToken){
		this();
		this.userRole = userRole;
		this.registerSource = registerSource;
		this.userName = userName;
		this.nickName = nickName;
		this.gender = gender;
		this.birthday = birthday;
		this.signature = signature;
		this.mobile = mobile;
		this.mobileBindTime = mobileBindTime;
		this.email = email;
		this.emailBindTime = emailBindTime;
		this.face = face;
		this.face200 = face200;
		this.srcface = srcface;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.pushToken = pushToken;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserBaseEntity[")
			.append("Uid=").append(getUid()).append(", ")
			.append("UserRole=").append(getUserRole()).append(", ")
			.append("RegisterSource=").append(getRegisterSource()).append(", ")
			.append("UserName=").append(getUserName()).append(", ")
			.append("NickName=").append(getNickName()).append(", ")
			.append("Gender=").append(getGender()).append(", ")
			.append("Birthday=").append(getBirthday()).append(", ")
			.append("Signature=").append(getSignature()).append(", ")
			.append("Mobile=").append(getMobile()).append(", ")
			.append("MobileBindTime=").append(getMobileBindTime()).append(", ")
			.append("Email=").append(getEmail()).append(", ")
			.append("EmailBindTime=").append(getEmailBindTime()).append(", ")
			.append("Face=").append(getFace()).append(", ")
			.append("Face200=").append(getFace200()).append(", ")
			.append("Srcface=").append(getSrcface()).append(", ")
			.append("CreateTime=").append(getCreateTime()).append(", ")
			.append("UpdateTime=").append(getUpdateTime()).append(", ")
			.append("PushToken=").append(getPushToken())
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
		if(obj instanceof UserBaseEntity == false)
			return false;
		if(this == obj)
			return true;
		UserBaseEntity other = (UserBaseEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
