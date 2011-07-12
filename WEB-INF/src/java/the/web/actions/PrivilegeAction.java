package the.web.actions;

import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import the.dao.privilege.PrivilegeDAO;
import the.dao.privilege.PrivilegeDAOImpl;
import the.domain.model.Privilege;


public class PrivilegeAction extends ActionSupport implements ModelDriven<Privilege> {
	
	private static final long serialVersionUID = 1L;

	private Privilege privilege = new Privilege();
	private PrivilegeDAO privilegeDAO = new PrivilegeDAOImpl();
	private List<Privilege> privilegeList = new ArrayList<Privilege>();

	@Override
	public Privilege getModel() {
		return privilege;	
	}

	public String add() {
		privilegeDAO.addPrivilege(privilege);
		return SUCCESS;
	}

	public String list() {
		privilegeList = privilegeDAO.listPrivilege();
		return SUCCESS;
	}
	
	public void setPrivilegeDAO(PrivilegeDAO privilegeDAO) {
		this.privilegeDAO = privilegeDAO;    	
	}
	
	public List<Privilege> getPrivilegeList() {
		return this.privilegeList;
	}
	
	public void setPrivilegeList(List<Privilege> privilegeList) {
		this.privilegeList = privilegeList;    	
	}
	
	public Privilege getPrivilege() {
		return this.privilege;
	}
	
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;    	
	}
}