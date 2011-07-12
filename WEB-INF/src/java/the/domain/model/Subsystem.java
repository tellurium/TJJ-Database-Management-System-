package the.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.UniqueConstraint;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="subsystem", uniqueConstraints = {@UniqueConstraint(columnNames={"subsystem_name"})})
public class Subsystem implements java.io.Serializable {
	
	private Integer subsystemId;
	private String subsystemName;
	private String subsystemDescription;
	private Date createTime;

	private User createUser; 

	public Subsystem() {
	}

	public Subsystem(String subsystemName) {
		this.subsystemName = subsystemName;
	}

	@Id
	@GeneratedValue
	@Column(name="subsystem_id", nullable=false)
	public Integer getSubsystemId() {
		return this.subsystemId;
	}
	
	public void setSubsystemId(Integer subsystemId) {
		this.subsystemId = subsystemId;    	
	}

	@OneToOne
	@JoinColumn(name="user_id")
	public User getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(User createUser) {
		this.createUser = createUser;    	
	}
	
	@Column(name="subsystem_name", nullable=false)
	public String getSubsystemName() {
		return this.subsystemName;
	}
	
	public void setSubsystemName(String subsystemName) {
		this.subsystemName = subsystemName;    	
	}
	
	@Column(name="subsystem_description")
	public String getSubsystemDescription() {
		return this.subsystemDescription;
	}
	
	public void setSubsystemDescription(String subsystemDescription) {
		this.subsystemDescription = subsystemDescription;    	
	}
	
	@Column(name="create_time", columnDefinition="TIMESTAMP ", updatable = false)
	public Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;    	
	}

}