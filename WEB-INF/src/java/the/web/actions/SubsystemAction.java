package the.web.actions;

import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import the.domain.model.Subsystem;
import the.dao.subsystem.SubsystemDAO;
import the.dao.subsystem.SubsystemDAOImpl;

public class SubsystemAction extends ActionSupport implements ModelDriven<Subsystem> {
	
	private static final long serialVersionUID = 3L;

	private SubsystemDAO subsystemDAO = new SubsystemDAOImpl();
	private List<Subsystem> subsystemList = new ArrayList<Subsystem>();
	private Subsystem subsystem = new Subsystem();

	@Override
	public Subsystem getModel() {
		return subsystem;
	}

	public String add() {
		subsystemDAO.addSubsystem(subsystem);
		return SUCCESS;
	}

	public String list() {
		subsystemList = subsystemDAO.listSubsystem();
		return SUCCESS;
	}

	public String edit() {
		//subsystem = subsystemDAO.getSubsystem(subsystemId);
		return SUCCESS;
	}

	public String delete() {

		//get the 'subsystemId'
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		subsystemDAO.deleteSubsystem(Integer.parseInt( request.getParameter("subsystemId")));
		return SUCCESS;
	}

	public void setSubsystemDAO(SubsystemDAO subsystemDAO) {
		this.subsystemDAO = subsystemDAO;
	}

	public List<Subsystem> getSubsystemList() {
		return this.subsystemList;
	}
	
	public void setSubsystemList(List<Subsystem> subsystemList) {
		this.subsystemList = subsystemList;    	
	}

	public Subsystem getSubsystem() {
		return this.subsystem;
	}
	
	public void setSubsystem(Subsystem subsystem) {
		this.subsystem = subsystem;    	
	}

}