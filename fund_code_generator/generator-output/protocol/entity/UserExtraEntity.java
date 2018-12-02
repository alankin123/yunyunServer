
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * �û�������Ϣ��
 * @author qym
 * @Date 2018-12-02 15:09:34
 * @since 1.0
 */
@TableName("user_extra")
public class UserExtraEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** �û� ID. */
	private String uid;
	
	/** �ֻ����̣�apple|htc|samsung��������. */
	private String vendor;
	
	/** �ͻ������ƣ���hjskang. */
	private String clientName;
	
	/** �ͻ��˰汾�ţ���7.0.1. */
	private String clientVersion;
	
	/** �豸��:android|ios. */
	private String osName;
	
	/** ϵͳ�汾��:2.2|2.3|4.0|5.1. */
	private String osVersion;
	
	/** �豸�ͺţ���:iphone6s��u880��u8800. */
	private String deviceName;
	
	/** �豸ID. */
	private String deviceId;
	
	/** ƻ���豸��IDFA. */
	private String idfa;
	
	/** ƻ���豸��IDFV. */
	private String idfv;
	
	/** ��Դ. */
	private String market;
	
	/** ���ʱ��. */
	private Long createTime;
	
	/** ����ʱ��. */
	private Long updateTime;
	
	/** ��չ�ֶ�1. */
	private String extend1;
	
	/** ��չ�ֶ�2. */
	private String extend2;
	
	/** ��չ�ֶ�3. */
	private String extend3;
	
	

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
	

    /** set �û� ID. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get �û� ID. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set �ֻ����̣�apple|htc|samsung��������. */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	/** get �ֻ����̣�apple|htc|samsung��������. */
	public String getVendor() {
		return this.vendor;
	}
	
	@JsonIgnore
	public String getVendorByLike() {
		return "%"+this.vendor+"%";
	}
	

    /** set �ͻ������ƣ���hjskang. */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	/** get �ͻ������ƣ���hjskang. */
	public String getClientName() {
		return this.clientName;
	}
	
	@JsonIgnore
	public String getClientNameByLike() {
		return "%"+this.clientName+"%";
	}
	

    /** set �ͻ��˰汾�ţ���7.0.1. */
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	
	/** get �ͻ��˰汾�ţ���7.0.1. */
	public String getClientVersion() {
		return this.clientVersion;
	}
	
	@JsonIgnore
	public String getClientVersionByLike() {
		return "%"+this.clientVersion+"%";
	}
	

    /** set �豸��:android|ios. */
	public void setOsName(String osName) {
		this.osName = osName;
	}
	
	/** get �豸��:android|ios. */
	public String getOsName() {
		return this.osName;
	}
	
	@JsonIgnore
	public String getOsNameByLike() {
		return "%"+this.osName+"%";
	}
	

    /** set ϵͳ�汾��:2.2|2.3|4.0|5.1. */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	
	/** get ϵͳ�汾��:2.2|2.3|4.0|5.1. */
	public String getOsVersion() {
		return this.osVersion;
	}
	
	@JsonIgnore
	public String getOsVersionByLike() {
		return "%"+this.osVersion+"%";
	}
	

    /** set �豸�ͺţ���:iphone6s��u880��u8800. */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	/** get �豸�ͺţ���:iphone6s��u880��u8800. */
	public String getDeviceName() {
		return this.deviceName;
	}
	
	@JsonIgnore
	public String getDeviceNameByLike() {
		return "%"+this.deviceName+"%";
	}
	

    /** set �豸ID. */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	/** get �豸ID. */
	public String getDeviceId() {
		return this.deviceId;
	}
	
	@JsonIgnore
	public String getDeviceIdByLike() {
		return "%"+this.deviceId+"%";
	}
	

    /** set ƻ���豸��IDFA. */
	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}
	
	/** get ƻ���豸��IDFA. */
	public String getIdfa() {
		return this.idfa;
	}
	
	@JsonIgnore
	public String getIdfaByLike() {
		return "%"+this.idfa+"%";
	}
	

    /** set ƻ���豸��IDFV. */
	public void setIdfv(String idfv) {
		this.idfv = idfv;
	}
	
	/** get ƻ���豸��IDFV. */
	public String getIdfv() {
		return this.idfv;
	}
	
	@JsonIgnore
	public String getIdfvByLike() {
		return "%"+this.idfv+"%";
	}
	

    /** set ��Դ. */
	public void setMarket(String market) {
		this.market = market;
	}
	
	/** get ��Դ. */
	public String getMarket() {
		return this.market;
	}
	
	@JsonIgnore
	public String getMarketByLike() {
		return "%"+this.market+"%";
	}
	

    /** set ���ʱ��. */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	/** get ���ʱ��. */
	public Long getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public Long getCreateTimeByLike() {
		return this.createTime;
	}
	

    /** set ����ʱ��. */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
	/** get ����ʱ��. */
	public Long getUpdateTime() {
		return this.updateTime;
	}
	
	@JsonIgnore
	public Long getUpdateTimeByLike() {
		return this.updateTime;
	}
	

    /** set ��չ�ֶ�1. */
	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}
	
	/** get ��չ�ֶ�1. */
	public String getExtend1() {
		return this.extend1;
	}
	
	@JsonIgnore
	public String getExtend1ByLike() {
		return "%"+this.extend1+"%";
	}
	

    /** set ��չ�ֶ�2. */
	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}
	
	/** get ��չ�ֶ�2. */
	public String getExtend2() {
		return this.extend2;
	}
	
	@JsonIgnore
	public String getExtend2ByLike() {
		return "%"+this.extend2+"%";
	}
	

    /** set ��չ�ֶ�3. */
	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}
	
	/** get ��չ�ֶ�3. */
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
	 * @param uid			�û� ID
	 * @param vendor			�ֻ����̣�apple|htc|samsung��������
	 * @param clientName			�ͻ������ƣ���hjskang
	 * @param clientVersion			�ͻ��˰汾�ţ���7.0.1
	 * @param osName			�豸��:android|ios
	 * @param osVersion			ϵͳ�汾��:2.2|2.3|4.0|5.1
	 * @param deviceName			�豸�ͺţ���:iphone6s��u880��u8800
	 * @param deviceId			�豸ID
	 * @param idfa			ƻ���豸��IDFA
	 * @param idfv			ƻ���豸��IDFV
	 * @param market			��Դ
	 * @param createTime			���ʱ��
	 * @param updateTime			����ʱ��
	 * @param extend1			��չ�ֶ�1
	 * @param extend2			��չ�ֶ�2
	 * @param extend3			��չ�ֶ�3
	 */
	public UserExtraEntity(String uid,String vendor,String clientName,String clientVersion,String osName,String osVersion,String deviceName,String deviceId,String idfa,String idfv,String market,Long createTime,Long updateTime,String extend1,String extend2,String extend3){
		this();
		this.uid = uid;
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
			.append("Id=").append(getId()).append(", ")
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
