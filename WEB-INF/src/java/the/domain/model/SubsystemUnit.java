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
	
	private Integer subsystemUnitId;

	@Id
	@GeneratedValue
	@Column(name="subsystem_unit_id")
	public Integer getSubsystemUnitId() {
		return this.subsystemUnitId;
	}
	
	public void setSubsystemUnitId(Integer subsystemUnitId) {
		this.subsystemUnitId = subsystemUnitId;    	
	}
	
	


}