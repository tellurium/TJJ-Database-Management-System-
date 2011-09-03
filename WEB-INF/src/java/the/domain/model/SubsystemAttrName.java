package the.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="subsystem_attr_name")
public class SubsystemAttrName implements java.io.Serializable {

	private static final long serialVersionUID = 10L;

	private Integer subsystemAttrNameId;
	private String subsystemAttrName;

	// The Subsystem which this attr belongs to
	private Integer subsystemId;

	public SubsystemAttrName() {
	}

	public SubsystemAttrName(String subsystemAttrName, Integer subsystemId) {
		this.subsystemAttrName = subsystemAttrName;
		this.subsystemId = subsystemId;
	}

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	@Column(name="subsystem_attr_name_id")
	public Integer getSubsystemAttrNameId() {
		return this.subsystemAttrNameId;
	}
	
	public void setSubsystemAttrNameId(Integer subsystemAttrNameId) {
		this.subsystemAttrNameId = subsystemAttrNameId;    	
	}
	
	@Column(name="subsystem_attr_name", nullable=false)
	public String getSubsystemAttrName() {
		return this.subsystemAttrName;
	}
	
	public void setSubsystemAttrName(String subsystemAttrName) {
		this.subsystemAttrName = subsystemAttrName;    	
	}

	@Column(name="subsystem_id", nullable=false)
	public Integer getSubsystemId() {
		return this.subsystemId;
	}
	
	public void setSubsystemId(Integer subsystemId) {
		this.subsystemId = subsystemId;    	
	}

}