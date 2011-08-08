package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

//import javax.servlet.http.HttpServletRequest;

//import org.apache.struts2.ServletActionContext;

import the.domain.model.Subsystem;
import the.web.actions.ModelAction;

public class SubsystemAction<Subsystem> extends ModelAction {
	
	private List<Subsystem> subsystemList;

	public String list() {
		//subsystemList = subsystemDAO.listSubsystem();
		return SUCCESS;
	}

	@Override 
	protected void init() {
		target = new the.domain.model.Subsystem();
	}

	// public String delete() {

	// 	//get the 'subsystemId'
	// 	HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
	// 	subsystemDAO.deleteSubsystem(Integer.parseInt( request.getParameter("subsystemId")));
	// 	return SUCCESS;
	// }

	public List<Subsystem> getSubsystemList() {
		return this.subsystemList;
	}
	
	public void setSubsystemList(List<Subsystem> subsystemList) {
		this.subsystemList = subsystemList;    	
	}
}