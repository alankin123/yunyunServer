
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 用户额外信息
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */
@TableName("user_extra")
public class UserExtraEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** 用户 ID. */
	private String uid;
	
	/** 手机厂商：apple|htc|samsung，很少用. */
	private String vendor;
	
	/** 客户端名称，如hjskang. */
	private String clientName;
	
	/** 客户端版本号，如7.0.1. */
	private String clientVersion;
	
	/** 设备号:android|ios. */
	private String osName;
	
	/** 系统版本号:2.2|2.3|4.0|5.1. */
	private String osVersion;
	
	/** 设备型号，如:iphone6s、u880、u8800. */
	private String deviceName;
	
	/** 设备ID. */
	private String deviceId;
	
	/** 苹果设备的IDFA. */
	private String idfa;
	
	/** 苹果设备的IDFV. */
	private String idfv;
	
	/** 来源. */
	private String market;
	
	/** 添加时间. */
	private Long createTime;
	
	/** 更新时间. */
	private Long updateTime;
	
	/** 扩展字段1. */
	private String extend1;
	
	/** 扩展字段2. */
	private String extend2;
	
	/** 扩展字段3. */
	private String extend3;
	
	

    /** set 用户 ID. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get 用户 ID. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set 手机厂商：apple|htc|samsung，很少用. */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	/** get 手机厂商：apple|htc|samsung，很少用. */
	public String getVendor() {
		return this.vendor;
	}
	
	@JsonIgnore
	public String getVendorByLike() {
		return "%"+this.vendor+"%";
	}
	

    /** set 客户端名称，如hjskang. */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	/** get 客户端名称，如hjskang. */
	public String getClientName() {
		return this.clientName;
	}
	
	@JsonIgnore
	public String getClientNameByLike() {
		return "%"+this.clientName+"%";
	}
	

    /** set 客户端版本号，如7.0.1. */
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	
	/** get 客户端版本号，如7.0.1. */
	public String getClientVersion() {
		return this.clientVersion;
	}
	
	@JsonIgnore
	public String getClientVersionByLike() {
		return "%"+this.clientVersion+"%";
	}
	

    /** set 设备号:android|ios. */
	public void setOsName(String osName) {
		this.osName = osName;
	}
	
	/** get 设备号:android|ios. */
	public String getOsName() {
		return this.osName;
	}
	
	@JsonIgnore
	public String getOsNameByLike() {
		return "%"+this.osName+"%";
	}
	

    /** set 系统版本号:2.2|2.3|4.0|5.1. */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	
	/** get 系统版本号:2.2|2.3|4.0|5.1. */
	public String getOsVersion() {
		return this.osVersion;
	}
	
	@JsonIgnore
	public String getOsVersionByLike() {
		return "%"+this.osVersion+"%";
	}
	

    /** set 设备型号，如:iphone6s、u880、u8800. */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	/** get 设备型号，如:iphone6s、u880、u8800. */
	public String getDeviceName() {
		return this.deviceName;
	}
	
	@JsonIgnore
	public String getDeviceNameByLike() {
		return "%"+this.deviceName+"%";
	}
	

    /** set 设备ID. */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	/** get 设备ID. */
	public String getDeviceId() {
		return this.deviceId;
	}
	
	@JsonIgnore
	public String getDeviceIdByLike() {
		return "%"+this.deviceId+"%";
	}
	

    /** set 苹果设备的IDFA. */
	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}
	
	/** get 苹果设备的IDFA. */
	public String getIdfa() {
		return this.idfa;
	}
	
	@JsonIgnore
	public String getIdfaByLike() {
		return "%"+this.idfa+"%";
	}
	

    /** set 苹果设备的IDFV. */
	public void setIdfv(String idfv) {
		this.idfv = idfv;
	}
	
	/** get 苹果设备的IDFV. */
	public String getIdfv() {
		return this.idfv;
	}
	
	@JsonIgnore
	public String getIdfvByLike() {
		return "%"+this.idfv+"%";
	}
	

    /** set 来源. */
	public void setMarket(String market) {
		this.market = market;
	}
	
	/** get 来源. */
	public String getMarket() {
		return this.market;
	}
	
	@JsonIgnore
	public String getMarketByLike() {
		return "%"+this.market+"%";
	}
	

    /** set 添加时间. */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	/** get 添加时间. */
	public Long getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public Long getCreateTimeByLike() {
		return this.createTime;
	}
	

    /** set 更新时间. */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get 更新时间. */
	public Long getUpdateTime() {
		return this.updateTime;
	}
	
	@JsonIgnore
	public Long getUpdateTimeByLike() {
		return this.updateTime;
	}
	

    /** set 扩展字段1. */
	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}
	
	/** get 扩展字段1. */
	public String getExtend1() {
		return this.extend1;
	}
	
	@JsonIgnore
	public String getExtend1ByLike() {
		return "%"+this.extend1+"%";
	}
	

    /** set 扩展字段2. */
	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}
	
	/** get 扩展字段2. */
	public String getExtend2() {
		return this.extend2;
	}
	
	@JsonIgnore
	public String getExtend2ByLike() {
		return "%"+this.extend2+"%";
	}
	

    /** set 扩展字段3. */
	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}
	
	/** get 扩展字段3. */
	public String getExtend3() {
		return this.extend3;
	}
	
	@JsonIgnore
	public String getExtend3ByLike() {
		return "%"+this.extend3+"%";
	}
	
    /** constructor */
	public UserExtraEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param vendor			手机厂商：apple|htc|samsung，很少用
	 * @param clientName			客户端名称，如hjskang
	 * @param clientVersion			客户端版本号，如7.0.1
	 * @param osName			设备号:android|ios
	 * @param osVersion			系统版本号:2.2|2.3|4.0|5.1
	 * @param deviceName			设备型号，如:iphone6s、u880、u8800
	 * @param deviceId			设备ID
	 * @param idfa			苹果设备的IDFA
	 * @param idfv			苹果设备的IDFV
	 * @param market			来源
	 * @param createTime			添加时间
	 * @param updateTime			更新时间
	 * @param extend1			扩展字段1
	 * @param extend2			扩展字段2
	 * @param extend3			扩展字段3
	 */
	public UserExtraEntity(String vendor,String clientName,String clientVersion,String osName,String osVersion,String deviceName,String deviceId,String idfa,String idfv,String market,Long createTime,Long updateTime,String extend1,String extend2,String extend3){
		this();
		this.vendor = vendor;
		this.clientName = clientName;
		this.clientVersion = clientVersion;
		this.osName = osName;
		this.osVersion = osVersion;
		this.deviceName = deviceName;
		this.deviceId = deviceId;
		this.idfa = idfa;
		this.idfv = idfv;
		this.market = market;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserExtraEntity[")
			.append("Uid=").append(getUid()).append(", ")
			.append("Vendor=").append(getVendor()).append(", ")
			.append("ClientName=").append(getClientName()).append(", ")
			.append("ClientVersion=").append(getClientVersion()).append(", ")
			.append("OsName=").append(getOsName()).append(", ")
			.append("OsVersion=").append(getOsVersion()).append(", ")
			.append("DeviceName=").append(getDeviceName()).append(", ")
			.append("DeviceId=").append(getDeviceId()).append(", ")
			.append("Idfa=").append(getIdfa()).append(", ")
			.append("Idfv=").append(getIdfv()).append(", ")
			.append("Market=").append(getMarket()).append(", ")
			.append("CreateTime=").append(getCreateTime()).append(", ")
			.append("UpdateTime=").append(getUpdateTime()).append(", ")
			.append("Extend1=").append(getExtend1()).append(", ")
			.append("Extend2=").append(getExtend2()).append(", ")
			.append("Extend3=").append(getExtend3())
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
		if(obj instanceof UserExtraEntity == false)
			return false;
		if(this == obj)
			return true;
		UserExtraEntity other = (UserExtraEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
