package the.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="subsystem_attr")
public class SubsystemAttr implements java.io.Serializable {

	private static final long serialVersionUID = 6L;

	private Integer subsystemAttrId;
	private String subsystemAttrName;
	private String subsystemAttrValue;

	// The Subsystem which this attr belongs to
	private Integer subsystemTypeId;

	public SubsystemAttr() {
	}

	public SubsystemAttr(String subsystemAttrName, String subsystemAttrValue) {
		this.subsystemAttrName = subsystemAttrName;
		this.subsystemAttrValue = subsystemAttrValue;
	}

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	@Column(name="subsystem_attr_id")
	public Integer getSubsystemAttrId() {
		return this.subsystemAttrId;
	}
	
	public void setSubsystemAttrId(Integer subsystemAttrId) {
		this.subsystemAttrId = subsystemAttrId;    	
	}
	
	@Column(name="subsystem_attr_name")
	public String getSubsystemAttrName() {
		return this.subsystemAttrName;
	}
	
	public void setSubsystemAttrName(String subsystemAttrName) {
		this.subsystemAttrName = subsystemAttrName;    	
	}
	
	@Column(name="subsystem_attr_value")
	public String getSubsystemAttrValue() {
		return this.subsystemAttrValue;
	}
	
	public void setSubsystemAttrValue(String subsystemAttrValue) {
		this.subsystemAttrValue = subsystemAttrValue;    	
	}

	@Column(name="subsystem_type_id")
	public Integer getSubsystemTypeId() {
		return this.subsystemTypeId;
	}
	
	public void setSubsystemTypeId(Integer subsystemTypeId) {
		this.subsystemTypeId = subsystemTypeId;    	
	}
									  
}