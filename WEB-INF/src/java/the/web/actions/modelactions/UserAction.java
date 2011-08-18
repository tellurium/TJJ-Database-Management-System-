package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.User;
import the.domain.model.Privilege;
import the.web.actions.ModelAction;

public class UserAction extends ModelAction<User> {

	// private PrivilegeDAO privilegeDAO = new PrivilegeDAOImpl();
	// private Integer privilegeId;
	
	@Override
	protected void init() {
		target = new User();
	}
	
	// public Integer getPrivilegeId() {
	// 	return this.privilegeId;
	// }
	
	// public void setPrivilegeId(Integer privilegeId) {
	// 	this.privilegeId = privilegeId;    	
	// }
	
	// public PrivilegeDAO getPrivilegeDAO() {
	// 	return this.privilegeDAO;
	// }
	
	// public void setPrivilegeDAO(PrivilegeDAO privilegeDAO) {
	// 	this.privilegeDAO = privilegeDAO;    	
	// }
}

