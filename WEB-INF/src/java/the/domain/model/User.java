package the.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;

import java.util.Date;

@Entity
@Table(name="user",
	  uniqueConstraints = {@UniqueConstraint(columnNames={"user_name", "email"})}
)
public class User implements java.io.Serializable {
	
	private Integer userId;
	private String userName;
	private String sex;
	private String email;
	private String password;
	private Date createDatetime;

	private Privilege privilege;

	public User() {
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Id
	@GeneratedValue
	@Column(name="user_id", nullable=false)
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;    	
	}
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="privilege_id")
	public Privilege getPrivilege() {
		return this.privilege;
	}
	
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;    	
	}

	@Column(name="user_name", nullable=false)
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;    	
	}
	
	@Column(name="sex")
	public String getSex() {
		return this.sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;    	
	}
	
	@Column(name="email")
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;    	
	}
	
	@Column(name="password")
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;    	
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="create_datetime")
	public Date getCreateDatetime() {
		return this.createDatetime;
	}
	
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;    	
	}
	
	
	
}