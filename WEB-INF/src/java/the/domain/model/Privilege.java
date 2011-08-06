package the.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="privilege", uniqueConstraints = {@UniqueConstraint(columnNames={"privilege_name"})})
@org.hibernate.annotations.Entity(
		dynamicUpdate = true
) // Hibernate will never update all the fields again
public class Privilege implements java.io.Serializable {
	
	private Integer privilegeId;
	private String privilegeName;
	private String description;

	public Privilege() {
	}

	public Privilege(String privilegeName) {
		this.privilegeName = privilegeName;
	}


	@Id
	@GeneratedValue
	@Column(name="privilege_id", nullable=false)
	public Integer getPrivilegeId() {
		return this.privilegeId;
	}
	
	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;    	
	}
	
	@Column(name="privilege_name", nullable=false)
	public String getPrivilegeName() {
		return this.privilegeName;
	}
	
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;    	
	}
	
	@Column(name="description")
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;    	
	}

}