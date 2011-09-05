/* 
 * This class includes almost all of the business logic actions 
 */

package the.web.actions.logicactions;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

import the.dao.SubsystemDAO;
import the.dao.SubsystemAttrNameDAO;

public class LogicAction extends ActionSupport {

	private String subsystemName;
	private String subsystemDiscription;
	private SubsystemDAO subsystemDAO;
	private SubsystemAttrNameDAO subsystemAttrNameDAO;
	private List<String> subsystemAttrNameList;

	public void initLogicAction() {
		ActionContext ctx=ActionContext.getContext();
        Map session=ctx.getSession();
		subsystemName = (String) session.get("SUBSYSTEM_NAME");
	}

	public String showIntroduction() {
		initLogicAction();
		subsystemDiscription = subsystemDAO.getSubsystemByName(subsystemName).getSubsystemDescription();
 		return SUCCESS;
 	}

 	public String showQuery() {
 		initLogicAction();
 		// subsystemAttrNameList = subsystemAttrNameDAO. 
 		return SUCCESS;
 	}

 	public String manageSubsystem() {
 		return SUCCESS;
 	}

 	public String addType() {
 		return SUCCESS;
 	}

 	public String updateType() {
 		return SUCCESS;
 	}

 	public String manageUser() {
 		return SUCCESS;
 	}

 	public String showLog() {
 		return SUCCESS;
 	}

 	public String changePassword() {
 		return SUCCESS;
 	}




 	/* 
 	 * All the beans 
 	 */

 	public String getSubsystemName() {
		return this.subsystemName;
	}
	
	public void setSubsystemName(String subsystemName) {
		this.subsystemName = subsystemName;    	
	}

	public SubsystemDAO getSubsystemDAO() {
		return this.subsystemDAO;
	}
	
	public void setSubsystemDAO(SubsystemDAO subsystemDAO) {
		this.subsystemDAO = subsystemDAO;    	
	}

	public String getSubsystemDiscription() {
		return this.subsystemDiscription;
	}
	
	public void setSubsystemDiscription(String subsystemDiscription) {
		this.subsystemDiscription = subsystemDiscription;    	
	}

	public List<String> getSubsystemAttrNameList() {
		return this.subsystemAttrNameList;
	}
	
	public void setSubsystemAttrNameList(List<String> subsystemAttrNameList) {
		this.subsystemAttrNameList = subsystemAttrNameList;    	
	}

}