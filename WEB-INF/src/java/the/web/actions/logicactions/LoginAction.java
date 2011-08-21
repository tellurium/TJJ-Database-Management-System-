package the.web.actions.logicactions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import the.domain.model.User;
import the.web.actions.BaseAction;
import the.dao.UserDAO;
import the.dao.BaseDAO;

public class LoginAction extends ActionSupport {
	
	private String userName;
	private String password;
	private String subsystemName;

	private BaseDAO userDAO;

	public LoginAction(){
	}

	public String execute() {
		return SUCCESS;
	}

	public void validate() {
		User user = null;

		// First level validate
		clearErrorsAndMessages();
        if (getUserName().length() == 0) {
            addFieldError("userName", "User Name is required");
            return ;
        }
  		
        if (getPassword().length() == 0) {
            addFieldError("userName", "Password is required");
            return ;
        }

        // Validate the password
        user = (User) userDAO.read(userName);
        if (user == null || !getPassword().equals(user.getPassword())) {
        	addActionError("User Name or password is wrong");
        }
        
    }

 	public String showIntroduction() {
 		return SUCCESS;
 	}

 	public String showQuery() {
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

	public BaseDAO getUserDAO() {
		return this.userDAO;
	}
	
	public void setUserDAO(BaseDAO userDAO) {
		this.userDAO = userDAO;    	
	}
}