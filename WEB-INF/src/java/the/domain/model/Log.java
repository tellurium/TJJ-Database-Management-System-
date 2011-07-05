package the.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="log")
public class Log implements java.io.Serializable {
	
	private Integer logId;
	private String discription;
	private Date time;
	private String event;
	private String event_type;
	private String download;

	private User user;

	public Log() {
	}

	/** 
	 * You should add a lot of things this place
	 */

}