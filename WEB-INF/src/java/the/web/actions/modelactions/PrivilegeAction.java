package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Privilege;
import the.web.actions.ModelAction;

public class PrivilegeAction<Privilege> extends ModelAction {
	
	private List<Privilege> privilegeList;

	@Override
	protected void init() {
		target = new the.domain.model.Privilege();
	}

	public String list() {
		//privilegeList = privilegeDAO.listPrivilege();
		return SUCCESS;
	}
	
	public List<Privilege> getPrivilegeList() {
		return this.privilegeList;
	}
	
	public void setPrivilegeList(List<Privilege> privilegeList) {
		this.privilegeList = privilegeList;    	
	}
}