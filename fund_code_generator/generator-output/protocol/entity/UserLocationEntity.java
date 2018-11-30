
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * 用户定位
 * @author qym
 * @Date 2018-11-30 13:42:28
 * @since 1.0
 */
@TableName("user_location")
public class UserLocationEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** 用户ID. */
	private String uid;
	
	/** 所在地国. */
	private String currNation;
	
	/** 所在地省. */
	private String currProvince;
	
	/** 所在地市. */
	private String currCity;
	
	/** 所在地地区. */
	private String currDistrict;
	
	/** 具体地址. */
	private String location;
	
	/** 经度. */
	private java.math.BigDecimal longitude;
	
	/** 纬度. */
	private java.math.BigDecimal latitude;
	
	/** 修改时间. */
	private Long updateTime;
	
	

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
	

    /** set 所在地国. */
	public void setCurrNation(String currNation) {
		this.currNation = currNation;
	}
	
	/** get 所在地国. */
	public String getCurrNation() {
		return this.currNation;
	}
	
	@JsonIgnore
	public String getCurrNationByLike() {
		return "%"+this.currNation+"%";
	}
	

    /** set 所在地省. */
	public void setCurrProvince(String currProvince) {
		this.currProvince = currProvince;
	}
	
	/** get 所在地省. */
	public String getCurrProvince() {
		return this.currProvince;
	}
	
	@JsonIgnore
	public String getCurrProvinceByLike() {
		return "%"+this.currProvince+"%";
	}
	

    /** set 所在地市. */
	public void setCurrCity(String currCity) {
		this.currCity = currCity;
	}
	
	/** get 所在地市. */
	public String getCurrCity() {
		return this.currCity;
	}
	
	@JsonIgnore
	public String getCurrCityByLike() {
		return "%"+this.currCity+"%";
	}
	

    /** set 所在地地区. */
	public void setCurrDistrict(String currDistrict) {
		this.currDistrict = currDistrict;
	}
	
	/** get 所在地地区. */
	public String getCurrDistrict() {
		return this.currDistrict;
	}
	
	@JsonIgnore
	public String getCurrDistrictByLike() {
		return "%"+this.currDistrict+"%";
	}
	

    /** set 具体地址. */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/** get 具体地址. */
	public String getLocation() {
		return this.location;
	}
	
	@JsonIgnore
	public String getLocationByLike() {
		return "%"+this.location+"%";
	}
	

    /** set 经度. */
	public void setLongitude(java.math.BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	/** get 经度. */
	public java.math.BigDecimal getLongitude() {
		return this.longitude;
	}
	
	@JsonIgnore
	public java.math.BigDecimal getLongitudeByLike() {
		return this.longitude;
	}
	

    /** set 纬度. */
	public void setLatitude(java.math.BigDecimal latitude) {
		this.latitude = latitude;
	}
	
	/** get 纬度. */
	public java.math.BigDecimal getLatitude() {
		return this.latitude;
	}
	
	@JsonIgnore
	public java.math.BigDecimal getLatitudeByLike() {
		return this.latitude;
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
	public UserLocationEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param currNation			所在地国
	 * @param currProvince			所在地省
	 * @param currCity			所在地市
	 * @param currDistrict			所在地地区
	 * @param location			具体地址
	 * @param longitude			经度
	 * @param latitude			纬度
	 * @param updateTime			修改时间
	 */
	public UserLocationEntity(String currNation,String currProvince,String currCity,String currDistrict,String location,java.math.BigDecimal longitude,java.math.BigDecimal latitude,Long updateTime){
		this();
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
