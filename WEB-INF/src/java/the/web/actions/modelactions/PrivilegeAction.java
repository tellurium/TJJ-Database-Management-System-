package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Privilege;
import the.web.actions.ModelAction;
import the.dao.PrivilegeDAO;

public class PrivilegeAction extends ModelAction<Privilege> {

	private List<String> privilegeList;

	@Override
	protected void init() {
		target = new Privilege();
	}

	public String showPrivilegeList() {
		privilegeList = ((PrivilegeDAO) dao).getPrivilegeList();
		return SUCCESS;
	}

	public List<String> getPrivilegeList() {
		return this.privilegeList;
	}
	
	public void setPrivilegeList(List<String> privilegeList) {
		this.privilegeList = privilegeList;    	
	}

}