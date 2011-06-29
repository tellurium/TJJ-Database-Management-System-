package the.web.actions;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUser extends ActionSupport {

	public String userName;
	public String message;

	public WelcomeUser() {
	}

	public String execute() {
		message = "Welcome " + userName;
		return SUCCESS;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;    	
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setMessage(String message) {
		this.message = message;    			
	}		
	
	public String getMessage() {
		return this.message;
	}		
	
	
}