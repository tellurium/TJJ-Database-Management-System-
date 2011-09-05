package the.web.actions.logicactions;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

import the.domain.model.User;
import the.dao.UserDAO;

public class LoginAction extends ActionSupport {
	
	private String userName;
	private String password;
	private String subsystemName;
	private UserDAO userDAO;
	private User user;

	public LoginAction(){
	}

	public String execute() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.put("USER_NAME", userName);
		session.put("IS_LOGIN", true);
		session.put("SUBSYSTEM_NAME", subsystemName);
		session.put("USER_PRIVILEGE", user.getPrivilege().getPrivilegeName());
		return SUCCESS;
	}

	public void validate() {
		clearErrorsAndMessages();

		if (subsystemName.equals("-1")) {
			addActionError(getText("please_select_subsystem.title"));
		}

		user = null;

		// First level validate
		
        if (getUserName().length() == 0) {
            addActionError(getText("password.required"));
            return ;
        }
  		
        if (getPassword().length() == 0) {
            addActionError(getText("username.required"));
            return ;
        }

        // Validate the password
        user = userDAO.getUserByName(userName);
        if (user == null || !getPassword().equals(user.getPassword())) {
        	addActionError(getText("username_or_password_wrong.title"));
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

	public String getSubsystemName() {
		return this.subsystemName;
	}
	
	public void setSubsystemName(String subsystemName) {
		this.subsystemName = subsystemName;    	
	}

	public UserDAO getUserDAO() {
		return this.userDAO;
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;    	
	}
}