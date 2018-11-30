
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 用户注册日志
 * @author qym
 * @Date 2018-11-30 13:42:29
 * @since 1.0
 */
@TableName("user_register_log")
public class UserRegisterLogEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** 自增ID. */
	private Long id;
	
	/** 用户ID. */
	private String uid;
	
	/** 注册方式1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	private Integer registerMethod;
	
	/** 注册时间. */
	private Long registerTime;
	
	/** 注册IP. */
	private String registerIp;
	
	/** 注册客户端. */
	private String registerClient;
	
	

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
	

    /** set 注册方式1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	public void setRegisterMethod(Integer registerMethod) {
		this.registerMethod = registerMethod;
	}
	
	/** get 注册方式1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博. */
	public Integer getRegisterMethod() {
		return this.registerMethod;
	}
	
	@JsonIgnore
	public Integer getRegisterMethodByLike() {
		return this.registerMethod;
	}
	

    /** set 注册时间. */
	public void setRegisterTime(Long registerTime) {
		this.registerTime = registerTime;
	}
	
	/** get 注册时间. */
	public Long getRegisterTime() {
		return this.registerTime;
	}
	
	@JsonIgnore
	public Long getRegisterTimeByLike() {
		return this.registerTime;
	}
	

    /** set 注册IP. */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	
	/** get 注册IP. */
	public String getRegisterIp() {
		return this.registerIp;
	}
	
	@JsonIgnore
	public String getRegisterIpByLike() {
		return "%"+this.registerIp+"%";
	}
	

    /** set 注册客户端. */
	public void setRegisterClient(String registerClient) {
		this.registerClient = registerClient;
	}
	
	/** get 注册客户端. */
	public String getRegisterClient() {
		return this.registerClient;
	}
	
	@JsonIgnore
	public String getRegisterClientByLike() {
		return "%"+this.registerClient+"%";
	}
	
    /** constructor */
	public UserRegisterLogEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param uid			用户ID
	 * @param registerMethod			注册方式1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博
	 * @param registerTime			注册时间
	 * @param registerIp			注册IP
	 * @param registerClient			注册客户端
	 */
	public UserRegisterLogEntity(String uid,Integer registerMethod,Long registerTime,String registerIp,String registerClient){
		this();
		this.uid = uid;
		this.registerMethod = registerMethod;
		this.registerTime = registerTime;
		this.registerIp = registerIp;
		this.registerClient = registerClient;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserRegisterLogEntity[")
			.append("Id=").append(getId()).append(", ")
			.append("Uid=").append(getUid()).append(", ")
			.append("RegisterMethod=").append(getRegisterMethod()).append(", ")
			.append("RegisterTime=").append(getRegisterTime()).append(", ")
			.append("RegisterIp=").append(getRegisterIp()).append(", ")
			.append("RegisterClient=").append(getRegisterClient())
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
		if(obj instanceof UserRegisterLogEntity == false)
			return false;
		if(this == obj)
			return true;
		UserRegisterLogEntity other = (UserRegisterLogEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
