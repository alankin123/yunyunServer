
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * ��½��־��
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@TableName("user_login_log")
public class UserLoginLogEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** �û�uid. */
	private String uid;
	
	/** ��¼��ʽ ������/����/�ֻ���. */
	private Integer type;
	
	/** �������� 1��½�ɹ�  2�ǳ��ɹ� 3��¼ʧ�� 4�ǳ�ʧ��. */
	private Integer command;
	
	/** �ͻ��˰汾��. */
	private String version;
	
	/** �ͻ���. */
	private String client;
	
	/** ��¼ʱ�豸��. */
	private String deviceId;
	
	/** ��¼ip. */
	private String lastip;
	
	/** �ֻ�ϵͳ. */
	private String os;
	
	/** ϵͳ�汾. */
	private String osver;
	
	/** . */
	private String text;
	
	/** ����ʱ��. */
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
	

    /** set �û�uid. */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/** get �û�uid. */
	public String getUid() {
		return this.uid;
	}
	
	@JsonIgnore
	public String getUidByLike() {
		return "%"+this.uid+"%";
	}
	

    /** set ��¼��ʽ ������/����/�ֻ���. */
	public void setType(Integer type) {
		this.type = type;
	}
	
	/** get ��¼��ʽ ������/����/�ֻ���. */
	public Integer getType() {
		return this.type;
	}
	
	@JsonIgnore
	public Integer getTypeByLike() {
		return this.type;
	}
	

    /** set �������� 1��½�ɹ�  2�ǳ��ɹ� 3��¼ʧ�� 4�ǳ�ʧ��. */
	public void setCommand(Integer command) {
		this.command = command;
	}
	
	/** get �������� 1��½�ɹ�  2�ǳ��ɹ� 3��¼ʧ�� 4�ǳ�ʧ��. */
	public Integer getCommand() {
		return this.command;
	}
	
	@JsonIgnore
	public Integer getCommandByLike() {
		return this.command;
	}
	

    /** set �ͻ��˰汾��. */
	public void setVersion(String version) {
		this.version = version;
	}
	
	/** get �ͻ��˰汾��. */
	public String getVersion() {
		return this.version;
	}
	
	@JsonIgnore
	public String getVersionByLike() {
		return "%"+this.version+"%";
	}
	

    /** set �ͻ���. */
	public void setClient(String client) {
		this.client = client;
	}
	
	/** get �ͻ���. */
	public String getClient() {
		return this.client;
	}
	
	@JsonIgnore
	public String getClientByLike() {
		return "%"+this.client+"%";
	}
	

    /** set ��¼ʱ�豸��. */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	/** get ��¼ʱ�豸��. */
	public String getDeviceId() {
		return this.deviceId;
	}
	
	@JsonIgnore
	public String getDeviceIdByLike() {
		return "%"+this.deviceId+"%";
	}
	

    /** set ��¼ip. */
	public void setLastip(String lastip) {
		this.lastip = lastip;
	}
	
	/** get ��¼ip. */
	public String getLastip() {
		return this.lastip;
	}
	
	@JsonIgnore
	public String getLastipByLike() {
		return "%"+this.lastip+"%";
	}
	

    /** set �ֻ�ϵͳ. */
	public void setOs(String os) {
		this.os = os;
	}
	
	/** get �ֻ�ϵͳ. */
	public String getOs() {
		return this.os;
	}
	
	@JsonIgnore
	public String getOsByLike() {
		return "%"+this.os+"%";
	}
	

    /** set ϵͳ�汾. */
	public void setOsver(String osver) {
		this.osver = osver;
	}
	
	/** get ϵͳ�汾. */
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
	
    /** constructor */
	public UserLoginLogEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param uid			�û�uid
	 * @param type			��¼��ʽ ������/����/�ֻ���
	 * @param command			�������� 1��½�ɹ�  2�ǳ��ɹ� 3��¼ʧ�� 4�ǳ�ʧ��
	 * @param version			�ͻ��˰汾��
	 * @param client			�ͻ���
	 * @param deviceId			��¼ʱ�豸��
	 * @param lastip			��¼ip
	 * @param os			�ֻ�ϵͳ
	 * @param osver			ϵͳ�汾
	 * @param text			
	 * @param createTime			����ʱ��
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
