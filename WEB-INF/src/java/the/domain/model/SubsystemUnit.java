package the.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Column;

@Entity
@Table(name="subsystem_unit")
public class SubsystemUnit implements java.io.Serializable {

	private static final long serialVersionUID = 9L;
	
	private Integer subsystemUnitId;
	private String subsystemUnitName;

	private Integer subsystemTypeId;

	@Id
	@GeneratedValue
	@Column(name="subsystem_unit_id")
	public Integer getSubsystemUnitId() {
		return this.subsystemUnitId;
	}
	
	public void setSubsystemUnitId(Integer subsystemUnitId) {
		this.subsystemUnitId = subsystemUnitId;    	
	}

	@Column(name="subsystem_unit_name")
	public String getSubsystemUnitName() {
		return this.subsystemUnitName;
	}
	
	public void setSubsystemUnitName(String subsystemUnitName) {
		this.subsystemUnitName = subsystemUnitName;    	
	}

	@Column(name="subsystem_type_id")
	public Integer getSubsystemTypeId() {
		return this.subsystemTypeId;
	}
	
	public void setSubsystemTypeId(Integer subsystemTypeId) {
		this.subsystemTypeId = subsystemTypeId;    	
	}

}