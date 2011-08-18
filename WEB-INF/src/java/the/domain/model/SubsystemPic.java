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
@Table(name="subsystem_pic")
public class SubsystemPic implements java.io.Serializable {

	private static final long serialVersionUID = 8L;
	
	private Integer subsystemPicId;
	private String subsystemPicPath;
	private String subsystemPicName;
	private String subsystemPicType;
	private Boolean isLoaded;

	private Integer subsystemTypeId;

	public SubsystemPic() {
	}

	public SubsystemPic(String name, String type, String path) {
		this.subsystemPicPath = path;
		this.subsystemPicType = type;
		this.subsystemPicName = name;
	}

	@Id
	@GeneratedValue
	@Column(name="subsystem_pic_id")
	public Integer getSubsystemPicId() {
		return this.subsystemPicId;
	}
	
	public void setSubsystemPicId(Integer subsystemPicId) {
		this.subsystemPicId = subsystemPicId;    	
	}

	@Column(name="subsystem_pic_path")
	public String getSubsystemPicPath() {
		return this.subsystemPicPath;
	}
	
	public void setSubsystemPicPath(String subsystemPicPath) {
		this.subsystemPicPath = subsystemPicPath;    	
	}
	
	@Column(name="subsystem_pic_name")
	public String getSubsystemPicName() {
		return this.subsystemPicName;
	}
	
	public void setSubsystemPicName(String subsystemPicName) {
		this.subsystemPicName = subsystemPicName;    	
	}
	
	@Column(name="subsystem_pic_type")
	public String getSubsystemPicType() {
		return this.subsystemPicType;
	}
	
	public void setSubsystemPicType(String subsystemPicType) {
		this.subsystemPicType = subsystemPicType;    	
	}
	
	@Column(name="is_loaded")
	public Boolean getIsLoaded() {
		return this.isLoaded;
	}
	
	public void setIsLoaded(Boolean isLoaded) {
		this.isLoaded = isLoaded;    	
	}
	
	@Column(name="subsystem_type_id")
	public Integer getSubsystemTypeId() {
		return this.subsystemTypeId;
	}
	
	public void setSubsystemTypeId(Integer subsystemTypeId) {
		this.subsystemTypeId = subsystemTypeId;    	
	}
	

}