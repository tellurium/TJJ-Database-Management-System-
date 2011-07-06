package the.web.actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import the.domain.model.User;

public class LoginAction extends ActionSupport {
	
	private String userName;
	private String password;

	public String execute() {
		return "success";
	}

	//validate login information
	public void validate() {
		clearErrorsAndMessages();
        if (getUserName().length() == 0) {
            addFieldError("userName", "User Name is required");
        } else if (!getUserName().equals("admin")) {
            addFieldError("userName", "Invalid User");
        }
        if (getPassword().length() == 0) {
            addFieldError("password", "password.required");
        }
    }

	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;    	
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;    	
	}
	
}