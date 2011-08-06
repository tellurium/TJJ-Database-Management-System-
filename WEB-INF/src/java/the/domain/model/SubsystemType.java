package the.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="subsystem_type")
public class SubsystemType implements java.io.Serializable {

	private Integer subsystemTypeId;
	private List<SubsystemAttr> attrs = new ArrayList<SubsystemAttr>();
	private List<SubsystemUnit> units = new ArrayList<SubsystemUnit>();
	private List<SubsystemPic> pics = new ArrayList<SubsystemPic>();
	private List<SubsystemPara> paras = new ArrayList<SubsystemPara>();
	private Subsystem subsystem;
	private String type;
	
	@Id
	@GeneratedValue
	@Column(name="subsystem_type_id")
	public Integer getSubsystemTypeId() {
		return this.subsystemTypeId;
	}
	
	public void setSubsystemTypeId(Integer subsystemTypeId) {
		this.subsystemTypeId = subsystemTypeId;    	
	}

	@Column(name="type")
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;    	
	}

	@ManyToOne
	@JoinColumn(name="subsystem_id")
	public Subsystem getSubsystem() {
		return this.subsystem;
	}
	
	public void setSubsystem(Subsystem subsystem) {
		this.subsystem = subsystem;    	
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subsystemType")
	public List<SubsystemAttr> getAttrs() {
		return this.attrs;
	}
	
	public void setAttrs(List<SubsystemAttr> attrs) {
		this.attrs = attrs;    	
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subsystemType")
	public List<SubsystemUnit> getUnits() {
		return this.units;
	}
	
	public void setUnits(List<SubsystemUnit> units) {
		this.units = units;    	
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subsystemType")
	public List<SubsystemPic> getPics() {
		return this.pics;
	}
	
	public void setPics(List<SubsystemPic> pics) {
		this.pics = pics;    	
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subsystemType")
	public List<SubsystemPara> getParas() {
		return this.paras;
	}
	
	public void setParas(List<SubsystemPara> paras) {
		this.paras = paras;    	
	}	
}