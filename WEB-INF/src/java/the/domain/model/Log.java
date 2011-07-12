package the.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

import java.util.Date;

@Entity
@Table(name="log")
public class Log implements java.io.Serializable {
	
	private Integer logId;
	private String discription;
	private String event;
	private String eventType;
	private String download;
	private Date time;

	private User user;

	public Log() {
	}

	@Id
	@GeneratedValue
	@Column(name="log_id", nullable=false)
	public Integer getLogId() {
		return this.logId;
	}
	
	public void setLogId(Integer logId) {
		this.logId = logId;    	
	}
	
	@Column(name="discription")
	public String getDiscription() {
		return this.discription;
	}
	
	public void setDiscription(String discription) {
		this.discription = discription;    	
	}
	
	@Column(name="event")
	public String getEvent() {
		return this.event;
	}
	
	public void setEvent(String event) {
		this.event = event;    	
	}
	
	@Column(name="event_type")
	public String getEventType() {
		return this.eventType;
	}
	
	public void setEventType(String eventType) {
		this.eventType = eventType;    	
	}
	
	@Column(name="download")
	public String getDownload() {
		return this.download;
	}
	
	public void setDownload(String download) {
		this.download = download;    	
	}
	
	@OneToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;    	
	}
	
	@Column(name="time", columnDefinition="TIMESTAMP ", updatable = false)
	public Date getTime() {
		return this.time;
	}
	
	public void setTime(Date time) {
		this.time = time;    	
	}
	
	
}