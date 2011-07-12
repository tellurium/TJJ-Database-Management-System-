package the.web.actions;

import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import the.dao.user.UserDAO;
import the.dao.user.UserDAOImpl;
import the.domain.model.User;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 2L;

	private User user = new User();
	private List<User> userList = new ArrayList<User>();
	private UserDAO userDAO = new UserDAOImpl();


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;    	
	}

	public String add() {
		userDAO.addUser(user);
		return SUCCESS;
	}

	public String delete() {
		return SUCCESS;
	}

	public String list() {
		userList = userDAO.listUser();
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
	
}

