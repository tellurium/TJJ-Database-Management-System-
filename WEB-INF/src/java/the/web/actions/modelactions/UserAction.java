package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.dao.PrivilegeDAO;
import the.domain.model.User;
import the.domain.model.Privilege;
import the.web.actions.ModelAction;

public class UserAction extends ModelAction<User> {

	private String privilegeName;
	private PrivilegeDAO privilegeDAO;
	
	@Override
	protected void init() {
		target = new User();
	}

	@Override
	public String create(){
		Privilege privilege = privilegeDAO.getPrivilegeByName(privilegeName);
		target.setPrivilege(privilege);
		dao.create(target);
		return SUCCESS;
	}

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
}

