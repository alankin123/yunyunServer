
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
@TableName("user_base")
public class UserBaseEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** �û�ID. */
	private String uid;
	
	/** 2�����û� 3�����û� 4�����û� 5��Ӫ. */
	private Integer userRole;
	
	/** ע����Դ��1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	private Integer registerSource;
	
	/** �û��˺ţ�����Ψһ. */
	private String userName;
	
	/** �û��ǳ�. */
	private String nickName;
	
	/** �û��Ա� 0-female 1-male. */
	private Boolean gender;
	
	/** �û�����. */
	private Long birthday;
	
	/** �û�����ǩ��. */
	private String signature;
	
	/** �ֻ�����(Ψһ). */
	private String mobile;
	
	/** �ֻ������ʱ��. */
	private Long mobileBindTime;
	
	/** ����(Ψһ). */
	private String email;
	
	/** �����ʱ��. */
	private Long emailBindTime;
	
	/** ͷ��. */
	private String face;
	
	/** ͷ�� 200x200x80. */
	private String face200;
	
	/** ԭͼͷ��. */
	private String srcface;
	
	/** ����ʱ��. */
	private Long createTime;
	
	/** �޸�ʱ��. */
	private Long updateTime;
	
	/** �û��豸push_token. */
	private String pushToken;
	
	

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
	

    /** set 2�����û� 3�����û� 4�����û� 5��Ӫ. */
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	
	/** get 2�����û� 3�����û� 4�����û� 5��Ӫ. */
	public Integer getUserRole() {
		return this.userRole;
	}
	
	@JsonIgnore
	public Integer getUserRoleByLike() {
		return this.userRole;
	}
	

    /** set ע����Դ��1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	public void setRegisterSource(Integer registerSource) {
		this.registerSource = registerSource;
	}
	
	/** get ע����Դ��1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	public Integer getRegisterSource() {
		return this.registerSource;
	}
	
	@JsonIgnore
	public Integer getRegisterSourceByLike() {
		return this.registerSource;
	}
	

    /** set �û��˺ţ�����Ψһ. */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/** get �û��˺ţ�����Ψһ. */
	public String getUserName() {
		return this.userName;
	}
	
	@JsonIgnore
	public String getUserNameByLike() {
		return "%"+this.userName+"%";
	}
	

    /** set �û��ǳ�. */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	/** get �û��ǳ�. */
	public String getNickName() {
		return this.nickName;
	}
	
	@JsonIgnore
	public String getNickNameByLike() {
		return "%"+this.nickName+"%";
	}
	

    /** set �û��Ա� 0-female 1-male. */
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	
	/** get �û��Ա� 0-female 1-male. */
	public Boolean getGender() {
		return this.gender;
	}
	
	@JsonIgnore
	public Boolean getGenderByLike() {
		return this.gender;
	}
	

    /** set �û�����. */
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	
	/** get �û�����. */
	public Long getBirthday() {
		return this.birthday;
	}
	
	@JsonIgnore
	public Long getBirthdayByLike() {
		return this.birthday;
	}
	

    /** set �û�����ǩ��. */
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	/** get �û�����ǩ��. */
	public String getSignature() {
		return this.signature;
	}
	
	@JsonIgnore
	public String getSignatureByLike() {
		return "%"+this.signature+"%";
	}
	

    /** set �ֻ�����(Ψһ). */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/** get �ֻ�����(Ψһ). */
	public String getMobile() {
		return this.mobile;
	}
	
	@JsonIgnore
	public String getMobileByLike() {
		return "%"+this.mobile+"%";
	}
	

    /** set �ֻ������ʱ��. */
	public void setMobileBindTime(Long mobileBindTime) {
		this.mobileBindTime = mobileBindTime;
	}
	
	/** get �ֻ������ʱ��. */
	public Long getMobileBindTime() {
		return this.mobileBindTime;
	}
	
	@JsonIgnore
	public Long getMobileBindTimeByLike() {
		return this.mobileBindTime;
	}
	

    /** set ����(Ψһ). */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/** get ����(Ψһ). */
	public String getEmail() {
		return this.email;
	}
	
	@JsonIgnore
	public String getEmailByLike() {
		return "%"+this.email+"%";
	}
	

    /** set �����ʱ��. */
	public void setEmailBindTime(Long emailBindTime) {
		this.emailBindTime = emailBindTime;
	}
	
	/** get �����ʱ��. */
	public Long getEmailBindTime() {
		return this.emailBindTime;
	}
	
	@JsonIgnore
	public Long getEmailBindTimeByLike() {
		return this.emailBindTime;
	}
	

    /** set ͷ��. */
	public void setFace(String face) {
		this.face = face;
	}
	
	/** get ͷ��. */
	public String getFace() {
		return this.face;
	}
	
	@JsonIgnore
	public String getFaceByLike() {
		return "%"+this.face+"%";
	}
	

    /** set ͷ�� 200x200x80. */
	public void setFace200(String face200) {
		this.face200 = face200;
	}
	
	/** get ͷ�� 200x200x80. */
	public String getFace200() {
		return this.face200;
	}
	
	@JsonIgnore
	public String getFace200ByLike() {
		return "%"+this.face200+"%";
	}
	

    /** set ԭͼͷ��. */
	public void setSrcface(String srcface) {
		this.srcface = srcface;
	}
	
	/** get ԭͼͷ��. */
	public String getSrcface() {
		return this.srcface;
	}
	
	@JsonIgnore
	public String getSrcfaceByLike() {
		return "%"+this.srcface+"%";
	}
	

    /** set ����ʱ��. */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	/** get ����ʱ��. */
	public Long getCreateTime() {
		return this.createTime;
	}
	
	@JsonIgnore
	public Long getCreateTimeByLike() {
		return this.createTime;
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
	

    /** set �û��豸push_token. */
	public void setPushToken(String pushToken) {
		this.pushToken = pushToken;
	}
	
	/** get �û��豸push_token. */
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
	 * @param uid			�û�ID
	 * @param userRole			2�����û� 3�����û� 4�����û� 5��Ӫ
	 * @param registerSource			ע����Դ��1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��
	 * @param userName			�û��˺ţ�����Ψһ
	 * @param nickName			�û��ǳ�
	 * @param gender			�û��Ա� 0-female 1-male
	 * @param birthday			�û�����
	 * @param signature			�û�����ǩ��
	 * @param mobile			�ֻ�����(Ψһ)
	 * @param mobileBindTime			�ֻ������ʱ��
	 * @param email			����(Ψһ)
	 * @param emailBindTime			�����ʱ��
	 * @param face			ͷ��
	 * @param face200			ͷ�� 200x200x80
	 * @param srcface			ԭͼͷ��
	 * @param createTime			����ʱ��
	 * @param updateTime			�޸�ʱ��
	 * @param pushToken			�û��豸push_token
	 */
	public UserBaseEntity(String uid,Integer userRole,Integer registerSource,String userName,String nickName,Boolean gender,Long birthday,String signature,String mobile,Long mobileBindTime,String email,Long emailBindTime,String face,String face200,String srcface,Long createTime,Long updateTime,String pushToken){
		this();
		this.uid = uid;
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
			.append("Id=").append(getId()).append(", ")
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
