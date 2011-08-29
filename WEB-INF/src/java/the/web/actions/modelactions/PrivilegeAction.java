package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Privilege;
import the.web.actions.ModelAction;
import the.dao.PrivilegeDAO;

public class PrivilegeAction extends ModelAction<Privilege> {

	private List<String> privilegeList;
	private PrivilegeDAO privilegeDAO;

	@Override
	protected void init() {
		target = new Privilege();
	}

	public String showPrivilegeList() {
		privilegeList = privilegeDAO.getPrivilegeList();
		return SUCCESS;
	}

	public List<String> getPrivilegeList() {
		return this.privilegeList;
	}
	
	public void setPrivilegeList(List<String> privilegeList) {
		this.privilegeList = privilegeList;    	
	}

	public PrivilegeDAO getPrivilegeDAO() {
		return this.privilegeDAO;
	}
	
	public void setPrivilegeDAO(PrivilegeDAO privilegeDAO) {
		this.privilegeDAO = privilegeDAO;    	
	}

}