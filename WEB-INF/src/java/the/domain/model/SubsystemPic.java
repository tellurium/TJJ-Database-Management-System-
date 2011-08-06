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
	
	private Integer subsystemPicId;
	private String path;
	private String name;
	private String type;
	private Boolean isLoaded;

	private SubsystemType subsystemType;

	@Id
	@GeneratedValue
	@Column(name="id")
	public Integer getSubsystemPicId() {
		return this.subsystemPicId;
	}
	
	public void setSubsystemPicId(Integer subsystemPicId) {
		this.subsystemPicId = subsystemPicId;    	
	}
	

}