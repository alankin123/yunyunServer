
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 登陆日志
 * @author qym
 * @Date 2018-11-30 13:42:29
 * @since 1.0
 */
@TableName("user_login_log")
public class UserLoginLogEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** 用户uid. */
	private String uid;
	
	/** 登录方式 第三方/邮箱/手机等. */
	private Integer type;
	
	/** 操作类型 1登陆成功  2登出成功 3登录失败 4登出失败. */
	private Integer command;
	
	/** 客户端版本号. */
	private String version;
	
	/** 客户端. */
	private String client;
	
	/** 登录时设备号. */
	private String deviceId;
	
	/** 登录ip. */
	private String lastip;
	
	/** 手机系统. */
	private String os;
	
	/** 系统版本. */
	private String osver;
	
	/** . */
	private String text;
	
	/** 操作时间. */
	private Long createTime;
	
	

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
	

    /** set 用户uid. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get 用户uid. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set 登录方式 第三方/邮箱/手机等. */
	public void setType(Integer type) {
		this.type = type;
	}
	
	/** get 登录方式 第三方/邮箱/手机等. */
	public Integer getType() {
		return this.type;
	}
	
	@JsonIgnore
	public Integer getTypeByLike() {
		return this.type;
	}
	

    /** set 操作类型 1登陆成功  2登出成功 3登录失败 4登出失败. */
	public void setCommand(Integer command) {
		this.command = command;
	}
	
	/** get 操作类型 1登陆成功  2登出成功 3登录失败 4登出失败. */
	public Integer getCommand() {
		return this.command;
	}
	
	@JsonIgnore
	public Integer getCommandByLike() {
		return this.command;
	}
	

    /** set 客户端版本号. */
	public void setVersion(String version) {
		this.version = version;
	}
	
	/** get 客户端版本号. */
	public String getVersion() {
		return this.version;
	}
	
	@JsonIgnore
	public String getVersionByLike() {
		return "%"+this.version+"%";
	}
	

    /** set 客户端. */
	public void setClient(String client) {
		this.client = client;
	}
	
	/** get 客户端. */
	public String getClient() {
		return this.client;
	}
	
	@JsonIgnore
	public String getClientByLike() {
		return "%"+this.client+"%";
	}
	

    /** set 登录时设备号. */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	/** get 登录时设备号. */
	public String getDeviceId() {
		return this.deviceId;
	}
	
	@JsonIgnore
	public String getDeviceIdByLike() {
		return "%"+this.deviceId+"%";
	}
	

    /** set 登录ip. */
	public void setLastip(String lastip) {
		this.lastip = lastip;
	}
	
	/** get 登录ip. */
	public String getLastip() {
		return this.lastip;
	}
	
	@JsonIgnore
	public String getLastipByLike() {
		return "%"+this.lastip+"%";
	}
	

    /** set 手机系统. */
	public void setOs(String os) {
		this.os = os;
	}
	
	/** get 手机系统. */
	public String getOs() {
		return this.os;
	}
	
	@JsonIgnore
	public String getOsByLike() {
		return "%"+this.os+"%";
	}
	

    /** set 系统版本. */
	public void setOsver(String osver) {
		this.osver = osver;
	}
	
	/** get 系统版本. */
	public String getOsver() {
		return this.osver;
	}
	
	@JsonIgnore
	public String getOsverByLike() {
		return "%"+this.osver+"%";
	}
	

    /** set . */
	public void setText(String text) {
		this.text = text;
	}
	
	/** get . */
	public String getText() {
		return this.text;
	}
	
	@JsonIgnore
	public String getTextByLike() {
		return "%"+this.text+"%";
	}
	

    /** set 操作时间. */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	/** get 操作时间. */
	public Long getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public Long getCreateTimeByLike() {
		return this.createTime;
	}
	
    /** constructor */
	public UserLoginLogEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param uid			用户uid
	 * @param type			登录方式 第三方/邮箱/手机等
	 * @param command			操作类型 1登陆成功  2登出成功 3登录失败 4登出失败
	 * @param version			客户端版本号
	 * @param client			客户端
	 * @param deviceId			登录时设备号
	 * @param lastip			登录ip
	 * @param os			手机系统
	 * @param osver			系统版本
	 * @param text			
	 * @param createTime			操作时间
	 */
	public UserLoginLogEntity(String uid,Integer type,Integer command,String version,String client,String deviceId,String lastip,String os,String osver,String text,Long createTime){
		this();
		this.uid = uid;
		this.type = type;
		this.command = command;
		this.version = version;
		this.client = client;
		this.deviceId = deviceId;
		this.lastip = lastip;
		this.os = os;
		this.osver = osver;
		this.text = text;
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserLoginLogEntity[")
			.append("Id=").append(getId()).append(", ")
			.append("Uid=").append(getUid()).append(", ")
			.append("Type=").append(getType()).append(", ")
			.append("Command=").append(getCommand()).append(", ")
			.append("Version=").append(getVersion()).append(", ")
			.append("Client=").append(getClient()).append(", ")
			.append("DeviceId=").append(getDeviceId()).append(", ")
			.append("Lastip=").append(getLastip()).append(", ")
			.append("Os=").append(getOs()).append(", ")
			.append("Osver=").append(getOsver()).append(", ")
			.append("Text=").append(getText()).append(", ")
			.append("CreateTime=").append(getCreateTime())
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
		if(obj instanceof UserLoginLogEntity == false)
			return false;
		if(this == obj)
			return true;
		UserLoginLogEntity other = (UserLoginLogEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
