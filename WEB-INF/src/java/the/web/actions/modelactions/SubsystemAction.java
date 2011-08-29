package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Subsystem;
import the.web.actions.ModelAction;
import the.dao.SubsystemDAO;

public class SubsystemAction extends ModelAction<Subsystem> {

	private List<String> subsystemList;
	private SubsystemDAO subsystemDAO;

	@Override
	protected void init() {
		target = new Subsystem();
	}

	public String showSubsystemList() {
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