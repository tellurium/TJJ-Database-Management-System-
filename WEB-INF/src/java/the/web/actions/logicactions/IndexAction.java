package the.web.actions.logicactions;

import java.util.List;

import the.web.actions.BaseAction;
import the.dao.SubsystemDAO;

public class IndexAction extends BaseAction {

	private List<String> subsystemList;
	private SubsystemDAO subsystemDAO;
	
	public String showIndex() {
		subsystemList = subsystemDAO.getSubsystemList();
		return SUCCESS;
	}

	public List<String> getSubsystemList() {
		return this.subsystemList;
	}
	
	public void setSubsystemList(List<String> subsystemList) {
		this.subsystemList = subsystemList;    	
	}

	public SubsystemDAO getSubsystemDAO() {
		return this.subsystemDAO;
	}
	
	public void setSubsystemDAO(SubsystemDAO subsystemDAO) {
		this.subsystemDAO = subsystemDAO;    	
	}	
}