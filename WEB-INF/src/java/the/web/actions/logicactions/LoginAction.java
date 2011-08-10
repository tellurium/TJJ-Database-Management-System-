package the.web.actions.logicactions;

import java.util.List;

import the.domain.model.User;
import the.web.actions.BaseAction;
import the.dao.SubsystemDAO;

public class LoginAction extends BaseAction {
	
	private String userName;
	private String password;
	private String subsystemName;
	private SubsystemDAO subsystemDAO;

	public LoginAction(){
	}

	public String execute() {
		//subsystemList = subsystemDAO.getSubsystemList();
		return SUCCESS;
	}

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

 	public String showIntroduction() {
 		return SUCCESS;
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

	public String getSubsystemName() {
		return this.subsystemName;
	}
	
	public void setSubsystemName(String subsystemName) {
		this.subsystemName = subsystemName;    	
	}
	
	public void setSubsystemDAO(SubsystemDAO subsystemDAO) {
		this.subsystemDAO = subsystemDAO;    	
	}
}