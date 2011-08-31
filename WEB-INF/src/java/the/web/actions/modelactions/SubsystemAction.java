package the.web.actions.modelactions;

import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
 
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import the.dao.SubsystemDAO;
import the.dao.SubsystemAttrNameDAO;
import the.domain.model.Subsystem;
import the.domain.model.SubsystemAttrName;
import the.web.actions.ModelAction;

public class SubsystemAction extends ModelAction<Subsystem> {

	private final String ADD_TAG = "add";
	private final String UPDATE_TAG = "update";
	private final String UPDATE_ATTR_TAG = "update_attr";
	private List<String> subsystemList;
	private List<SubsystemAttrName> attrNameList;
	private SubsystemDAO subsystemDAO;
	private SubsystemAttrNameDAO subsystemAttrNameDAO;
	private String oprationTag;
	private String attrName;	   // current attrname be added
	private Boolean isAddOrUpdate; // mean if it's necessary to show the add or update form
	private SubsystemAttrName attr; // current subsystemAttrName object

	@Override
	protected void init() {
		target = new Subsystem();
		attr = new SubsystemAttrName();
		oprationTag = ADD_TAG;
		isAddOrUpdate = false;
	}

	// list all the subsystem
	@Override
	public String list() {
		list = subsystemDAO.listAll();
		if (oprationTag.equals(UPDATE_ATTR_TAG)) {
			attrNameList = subsystemAttrNameDAO.listBySubsystem(attr.getSubsystemId());
		}
		return SUCCESS;
	}

	// update the selected Subsystem by id
	@Override
	public String update() {
		isAddOrUpdate = !isAddOrUpdate;
		HttpServletRequest request = (HttpServletRequest) ActionContext.
				getContext().get( ServletActionContext.HTTP_REQUEST);
		target = subsystemDAO.getSubsystemById(Integer.parseInt(request.getParameter("subsystemId")));
		oprationTag = UPDATE_TAG;
		if (!isAddOrUpdate) {
			isAddOrUpdate = !isAddOrUpdate;
		}
		return SUCCESS;
	}

	@Override
	public String create() {
		ActionContext ctx=ActionContext.getContext();
        Map session=ctx.getSession();
		target.setUserName((String) session.get("USER_NAME"));
		dao.create(target);
		return SUCCESS;
	}

	// show the subsystem name list
	public String showSubsystemList() {
		subsystemList = subsystemDAO.getSubsystemList();
		return SUCCESS;
	}

	// delete the selected Subsystem by id
	public String delete() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.
				getContext().get( ServletActionContext.HTTP_REQUEST);
		subsystemDAO.deleteById(Integer.parseInt(request.getParameter("subsystemId")));

		return SUCCESS;
	}

	// Add a subsystem attribute name for current subsystem
	public String addSubsystemAttrName() {
		attr.setSubsystemAttrName(attrName);
		subsystemAttrNameDAO.save(attr);
		attrNameList = subsystemAttrNameDAO.listBySubsystem(attr.getSubsystemId());
		return SUCCESS;
	}

	// Delete the subsystem attribute name
	public String deleteSubsystemAttrName() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.
				getContext().get( ServletActionContext.HTTP_REQUEST);
		subsystemAttrNameDAO.deleteById(Integer.parseInt(request.getParameter("subsystemAttrNameId")));
		return SUCCESS;
	}

	// Show the attrs list
	public String showAttrs() {
		isAddOrUpdate = false;
		oprationTag = UPDATE_ATTR_TAG;
		HttpServletRequest request = (HttpServletRequest) ActionContext.
				getContext().get( ServletActionContext.HTTP_REQUEST);
		target = subsystemDAO.getSubsystemById(Integer.parseInt(request.getParameter("subsystemId")));
		attr.setSubsystemId(target.getSubsystemId());
		if(getModel() != null){
			attrNameList = subsystemAttrNameDAO.listBySubsystem(target.getSubsystemId());
		}
		return SUCCESS;
	}

	// Show the form of add or update a subsystem
	public String showAddSubsystemForm() {
		isAddOrUpdate = !isAddOrUpdate;

		oprationTag = ADD_TAG;
		attrNameList = null;
		if (!isAddOrUpdate) {
			isAddOrUpdate = !isAddOrUpdate;
		}
		return SUCCESS;
	}



	/* 
	 * All the beans 
	 */
	
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

	public SubsystemAttrNameDAO getSubsystemAttrNameDAO() {
		return this.subsystemAttrNameDAO;
	}
	
	public void setSubsystemAttrNameDAO(SubsystemAttrNameDAO subsystemAttrNameDAO) {
		this.subsystemAttrNameDAO = subsystemAttrNameDAO;    	
	}

	public List<SubsystemAttrName> getAttrNameList() {
		return this.attrNameList;
	}
	
	public void setAttrNameList(List<SubsystemAttrName> attrNameList) {
		this.attrNameList = attrNameList;    	
	}

	public String getOprationTag() {
		return this.oprationTag;
	}
	
	public void setOprationTag(String oprationTag) {
		this.oprationTag = oprationTag;    	
	}

	public String getAttrName() {
		return this.attrName;
	}
	
	public void setAttrName(String attrName) {
		this.attrName = attrName;    	
	}

	public Boolean getIsAddOrUpdate() {
		return this.isAddOrUpdate;
	}
	
	public void setIsAddOrUpdate(Boolean isAddOrUpdate) {
		this.isAddOrUpdate = isAddOrUpdate;    	
	}
	
	
}