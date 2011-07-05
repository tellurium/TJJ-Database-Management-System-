package the.web.actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import the.domain.model.User;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	private User user;

	public String execute() {
		return "success";
	}

	@Override
	public User getModel() {
		return user;
	}

	//validate login information
	public void validate() {
		if (user != null) {
	        if (getUser().getUserName().length() == 0) {
	            addFieldError("userName", "User Name is required");
	        } else if (!getUser().getUserName().equals("Eswar")) {
	            addFieldError("userName", "Invalid User");
	        }
	        if (getUser().getPassword().length() == 0) {
	            addFieldError("password", getText("password.required"));
	        }
		}
    }

	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;    	
	}
	
}