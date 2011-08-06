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
@Table(name="subsystem_attr")
public class SubsystemAttr implements java.io.Serializable {

	private Integer subsystemAttrId;
	private String attrName;
	private String attrValue;

	@Id
	@GeneratedValue
	@Column(name="subsystem_attr_id")
	public Integer getSubsystemAttrId() {
		return this.subsystemAttrId;
	}
	
	public void setSubsystemAttrId(Integer subsystemAttrId) {
		this.subsystemAttrId = subsystemAttrId;    	
	}
	
	@Column(name="attr_name")
	public String getAttrName() {
		return this.attrName;
	}
	
	public void setAttrName(String attrName) {
		this.attrName = attrName;    	
	}
	
	@Column(name="attr_value")
	public String getAttrValue() {
		return this.attrValue;
	}
	
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;    	
	}
									  
}