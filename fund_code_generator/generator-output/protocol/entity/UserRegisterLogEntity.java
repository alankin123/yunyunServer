
package com.alankin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.alankin.common.entity.BaseEntity;
import com.alankin.common.vo.TableName;

/**
 * �û�ע����־��
 * @author qym
 * @Date 2018-12-02 15:09:35
 * @since 1.0
 */
@TableName("user_register_log")
public class UserRegisterLogEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** ����ID. */
	private Long id;
	
	/** �û�ID. */
	private String uid;
	
	/** ע�᷽ʽ1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	private Integer registerMethod;
	
	/** ע��ʱ��. */
	private Long registerTime;
	
	/** ע��IP. */
	private String registerIp;
	
	/** ע��ͻ���. */
	private String registerClient;
	
	

    /** set ����ID. */
	public void setId(Long id) {
		this.id = id;
	}
	
	/** get ����ID. */
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
	

    /** set ע�᷽ʽ1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	public void setRegisterMethod(Integer registerMethod) {
		this.registerMethod = registerMethod;
	}
	
	/** get ע�᷽ʽ1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��. */
	public Integer getRegisterMethod() {
		return this.registerMethod;
	}
	
	@JsonIgnore
	public Integer getRegisterMethodByLike() {
		return this.registerMethod;
	}
	

    /** set ע��ʱ��. */
	public void setRegisterTime(Long registerTime) {
		this.registerTime = registerTime;
	}
	
	/** get ע��ʱ��. */
	public Long getRegisterTime() {
		return this.registerTime;
	}
	
	@JsonIgnore
	public Long getRegisterTimeByLike() {
		return this.registerTime;
	}
	

    /** set ע��IP. */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	
	/** get ע��IP. */
	public String getRegisterIp() {
		return this.registerIp;
	}
	
	@JsonIgnore
	public String getRegisterIpByLike() {
		return "%"+this.registerIp+"%";
	}
	

    /** set ע��ͻ���. */
	public void setRegisterClient(String registerClient) {
		this.registerClient = registerClient;
	}
	
	/** get ע��ͻ���. */
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
	 * @param uid			�û�ID
	 * @param registerMethod			ע�᷽ʽ1�ֻ��� 2���� 3�û��� 4qq 5΢�� 6��Ѷ΢�� 7����΢��
	 * @param registerTime			ע��ʱ��
	 * @param registerIp			ע��IP
	 * @param registerClient			ע��ͻ���
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
