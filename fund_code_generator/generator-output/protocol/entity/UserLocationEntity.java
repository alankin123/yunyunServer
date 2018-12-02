
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * �û���λ��
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@TableName("user_location")
public class UserLocationEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** �û�ID. */
	private String uid;
	
	/** ���ڵع�. */
	private String currNation;
	
	/** ���ڵ�ʡ. */
	private String currProvince;
	
	/** ���ڵ���. */
	private String currCity;
	
	/** ���ڵص���. */
	private String currDistrict;
	
	/** �����ַ. */
	private String location;
	
	/** ����. */
	private java.math.BigDecimal longitude;
	
	/** γ��. */
	private java.math.BigDecimal latitude;
	
	/** �޸�ʱ��. */
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
	

    /** set ���ڵع�. */
	public void setCurrNation(String currNation) {
		this.currNation = currNation;
	}
	
	/** get ���ڵع�. */
	public String getCurrNation() {
		return this.currNation;
	}
	
	@JsonIgnore
	public String getCurrNationByLike() {
		return "%"+this.currNation+"%";
	}
	

    /** set ���ڵ�ʡ. */
	public void setCurrProvince(String currProvince) {
		this.currProvince = currProvince;
	}
	
	/** get ���ڵ�ʡ. */
	public String getCurrProvince() {
		return this.currProvince;
	}
	
	@JsonIgnore
	public String getCurrProvinceByLike() {
		return "%"+this.currProvince+"%";
	}
	

    /** set ���ڵ���. */
	public void setCurrCity(String currCity) {
		this.currCity = currCity;
	}
	
	/** get ���ڵ���. */
	public String getCurrCity() {
		return this.currCity;
	}
	
	@JsonIgnore
	public String getCurrCityByLike() {
		return "%"+this.currCity+"%";
	}
	

    /** set ���ڵص���. */
	public void setCurrDistrict(String currDistrict) {
		this.currDistrict = currDistrict;
	}
	
	/** get ���ڵص���. */
	public String getCurrDistrict() {
		return this.currDistrict;
	}
	
	@JsonIgnore
	public String getCurrDistrictByLike() {
		return "%"+this.currDistrict+"%";
	}
	

    /** set �����ַ. */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/** get �����ַ. */
	public String getLocation() {
		return this.location;
	}
	
	@JsonIgnore
	public String getLocationByLike() {
		return "%"+this.location+"%";
	}
	

    /** set ����. */
	public void setLongitude(java.math.BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	/** get ����. */
	public java.math.BigDecimal getLongitude() {
		return this.longitude;
	}
	
	@JsonIgnore
	public java.math.BigDecimal getLongitudeByLike() {
		return this.longitude;
	}
	

    /** set γ��. */
	public void setLatitude(java.math.BigDecimal latitude) {
		this.latitude = latitude;
	}
	
	/** get γ��. */
	public java.math.BigDecimal getLatitude() {
		return this.latitude;
	}
	
	@JsonIgnore
	public java.math.BigDecimal getLatitudeByLike() {
		return this.latitude;
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
	public UserLocationEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param uid			�û�ID
	 * @param currNation			���ڵع�
	 * @param currProvince			���ڵ�ʡ
	 * @param currCity			���ڵ���
	 * @param currDistrict			���ڵص���
	 * @param location			�����ַ
	 * @param longitude			����
	 * @param latitude			γ��
	 * @param updateTime			�޸�ʱ��
	 */
	public UserLocationEntity(String uid,String currNation,String currProvince,String currCity,String currDistrict,String location,java.math.BigDecimal longitude,java.math.BigDecimal latitude,Long updateTime){
		this();
		this.uid = uid;
		this.currNation = currNation;
		this.currProvince = currProvince;
		this.currCity = currCity;
		this.currDistrict = currDistrict;
		this.location = location;
		this.longitude = longitude;
		this.latitude = latitude;
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserLocationEntity[")
			.append("Id=").append(getId()).append(", ")
			.append("Uid=").append(getUid()).append(", ")
			.append("CurrNation=").append(getCurrNation()).append(", ")
			.append("CurrProvince=").append(getCurrProvince()).append(", ")
			.append("CurrCity=").append(getCurrCity()).append(", ")
			.append("CurrDistrict=").append(getCurrDistrict()).append(", ")
			.append("Location=").append(getLocation()).append(", ")
			.append("Longitude=").append(getLongitude()).append(", ")
			.append("Latitude=").append(getLatitude()).append(", ")
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
		if(obj instanceof UserLocationEntity == false)
			return false;
		if(this == obj)
			return true;
		UserLocationEntity other = (UserLocationEntity)obj;
		
		return this.toString().equals(other.toString());
	}
}
