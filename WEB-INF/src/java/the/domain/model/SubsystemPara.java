package the.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="subsystem_para")
public class SubsystemPara implements java.io.Serializable {
	
	private static final long serialVersionUID = 7L;

	private Integer subsystemParaId;
	private String subsystemParaName;
	private String subsystemParaValue;

	// The Subsystem which this attr belongs to
	private Integer subsystemTypeId;
		
	public SubsystemPara() {
	}

	public SubsystemPara(String subsystemParaName, String subsystemParaValue) {
		this.subsystemParaName = subsystemParaName;
		this.subsystemParaValue = subsystemParaValue;
	}

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	@Column(name="subsystem_para_id")
	public Integer getSubsystemParaId() {
		return this.subsystemParaId;
	}
	
	public void setSubsystemParaId(Integer subsystemParaId) {
		this.subsystemParaId = subsystemParaId;    	
	}
	
	@Column(name="subsystem_para_name")	
	public String getSubsystemParaName() {
		return this.subsystemParaName;
	}
	
	public void setSubsystemParaName(String subsystemParaName) {
		this.subsystemParaName = subsystemParaName;    	
	}
	
	@Column(name="subsystem_para_value")
	public String getSubsystemParaValue() {
		return this.subsystemParaValue;
	}
	
	public void setSubsystemParaValue(String subsystemParaValue) {
		this.subsystemParaValue = subsystemParaValue;    	
	}
	
	@Column(name="subsystem_type_id")
	public Integer getSubsystemTypeId() {
		return this.subsystemTypeId;
	}
	
	public void setSubsystemTypeId(Integer subsystemTypeId) {
		this.subsystemTypeId = subsystemTypeId;    	
	}
}