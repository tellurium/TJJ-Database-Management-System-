package the.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="subsystem_para_name")
public class SubsystemParaName implements java.io.Serializable {
	
	private static final long serialVersionUID = 11L;

	private Integer subsystemParaNameId;
	private String subsystemParaName;

	// The Subsystem which this attr belongs to
	private String subsystemName;
		
	public SubsystemParaName() {
	}

	public SubsystemParaName(String subsystemParaName, String subsystemName) {
		this.subsystemParaName = subsystemParaName;
		this.subsystemName = subsystemName;
	}

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	@Column(name="subsystem_para_name_id")
	public Integer getSubsystemParaNameId() {
		return this.subsystemParaNameId;
	}
	
	public void setSubsystemParaNameId(Integer subsystemParaNameId) {
		this.subsystemParaNameId = subsystemParaNameId;    	
	}
	
	@Column(name="subsystem_para_name", nullable=false)	
	public String getSubsystemParaName() {
		return this.subsystemParaName;
	}
	
	public void setSubsystemParaName(String subsystemParaName) {
		this.subsystemParaName = subsystemParaName;    	
	}
	
	@Column(name="subsystem_name", nullable=false)
	public String getSubsystemName() {
		return this.subsystemName;
	}
	
	public void setSubsystemName(String subsystemName) {
		this.subsystemName = subsystemName;    	
	}
}