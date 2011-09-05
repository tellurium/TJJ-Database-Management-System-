package the.web.actions.modelactions;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import the.dao.PrivilegeDAO;
import the.dao.UserDAO;
import the.domain.model.User;
import the.domain.model.Privilege;
import the.web.actions.ModelAction;

public class UserAction extends ModelAction<User> {

	private String privilegeName;
	private PrivilegeDAO privilegeDAO;
	private UserDAO userDAO;
	private Boolean isChangePasswordOK = false;
	private String oldPassword;
	private String passwordInput;
	private String passwordSubmit;

	@Override
	protected void init() {
		target = new User();
	}

	@Override
	public String create(){
		System.out.println(target.getUserName() + "*********************" + target.getEmail());
		Privilege privilege = privilegeDAO.getPrivilegeByName(privilegeName);
		target.setPrivilege(privilege);
		dao.create(target);
		return SUCCESS;
	}

	@Override
	public String update() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.
				getContext().get( ServletActionContext.HTTP_REQUEST);
		target = userDAO.getUserById(Integer.parseInt(request.getParameter("userId")));
		return SUCCESS;
	}

	public String delete() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.
				getContext().get( ServletActionContext.HTTP_REQUEST);
		userDAO.deleteById(Integer.parseInt(request.getParameter("userId")));
		return SUCCESS;
	}

	public String changePassword() {
		if (isChangePasswordOK && passwordInput != null && passwordSubmit != null) {
			passwordInput = null;
			passwordSubmit = null;
			return SUCCESS;
		}
		isChangePasswordOK = false;
		return SUCCESS;
	}

	public String submitPassword() {

		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		target = userDAO.getUserByName((String)session.get("USER_NAME"));
		if (target.getPassword().equals(oldPassword)) {
			if (passwordInput.equals(passwordSubmit)) {
				target.setPassword(passwordInput);
				userDAO.saveOrUpdate(target);  //saveOrUpdate this 'target'
				isChangePasswordOK = true;
			}
		}


		return SUCCESS;
	}


	/* 
	 * All the beans 
	 */
	public String getPrivilegeName() {
		return this.privilegeName;
	}
	
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;    	
	}
	
	public PrivilegeDAO getPrivilegeDAO() {
		return this.privilegeDAO;
	}
	
	public void setPrivilegeDAO(PrivilegeDAO privilegeDAO) {
		this.privilegeDAO = privilegeDAO;    	
	}

	public UserDAO getUserDAO() {
		return this.userDAO;
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;    	
	}

	public Boolean getIsChangePasswordOK() {
		return this.isChangePasswordOK;
	}
	
	public void setIsChangePasswordOK(Boolean isChangePasswordOK) {
		this.isChangePasswordOK = isChangePasswordOK;    	
	}

	public String getOldPassword() {
		return this.oldPassword;
	}
	
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;    	
	}
	
	public String getPasswordInput() {
		return this.passwordInput;
	}
	
	public void setPasswordInput(String passwordInput) {
		this.passwordInput = passwordInput;    	
	}
	
	public String getPasswordSubmit() {
		return this.passwordSubmit;
	}
	
	public void setPasswordSubmit(String passwordSubmit) {
		this.passwordSubmit = passwordSubmit;    	
	}
	
}

