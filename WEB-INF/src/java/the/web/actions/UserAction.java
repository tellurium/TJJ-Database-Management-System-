package the.web.actions;

import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import the.dao.BaseDAO;
import the.dao.privilege.PrivilegeDAO;
import the.dao.privilege.PrivilegeDAOImpl;
import the.domain.model.User;
import the.domain.model.Privilege;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 2L;

	private User user = new User();
	private List<User> userList = new ArrayList<User>();
	private BaseDAO userDAO;
	private PrivilegeDAO privilegeDAO = new PrivilegeDAOImpl();
	private Integer privilegeId;


	public void setUserDAO(BaseDAO userDAO) {
		this.userDAO = userDAO;    	
	}

	public String add() {
		user.setPrivilege(privilegeDAO.getPrivilege(privilegeId));
		userDAO.create(user);
		return SUCCESS;
	}

	public String delete() {
		return SUCCESS;
	}

	public String list() {
		userList = userDAO.list();
		return SUCCESS;
	}
	

	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;    	
	}
	
	public List<User> getUserList() {
		return this.userList;
	}
	
	public void setUserList(List<User> userList) {
		this.userList = userList;    	
	}

	public Integer getPrivilegeId() {
		return this.privilegeId;
	}
	
	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;    	
	}
	
	public PrivilegeDAO getPrivilegeDAO() {
		return this.privilegeDAO;
	}
	
	public void setPrivilegeDAO(PrivilegeDAO privilegeDAO) {
		this.privilegeDAO = privilegeDAO;    	
	}
}

