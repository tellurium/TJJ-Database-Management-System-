package the.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import java.util.Date;

@Entity
@Table(name="subsystem", uniqueConstraints = {@UniqueConstraint(columnNames={"subsystem_name"})})
public class Subsystem implements java.io.Serializable {

	private static final long serialVersionUID = 3L;
	
	private Integer subsystemId;
	private String subsystemName;
	private String subsystemDescription;
	private Date createTime;
	private String userName; // Create user name

	public Subsystem() {
	}

	public Subsystem(String subsystemName) {
		this.subsystemName = subsystemName;
	}

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	@Column(name="subsystem_id", nullable=false)
	public Integer getSubsystemId() {
		return this.subsystemId;
	}
	
	public void setSubsystemId(Integer subsystemId) {
		this.subsystemId = subsystemId;    	
	}

	@Column(name="user_name", nullable=false)
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;    	
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