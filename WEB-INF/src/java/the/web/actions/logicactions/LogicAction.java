/* 
 * This class includes almost all of the business logic actions 
 */

package the.web.actions.logicactions;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

public class LogicAction extends ActionSupport {

	private String subsystemName;

	public void initLogicAction() {
		ActionContext ctx=ActionContext.getContext();
        Map session=ctx.getSession();
		subsystemName = (String) session.get("SUBSYSTEM_NAME");
	}

	public String showIntroduction() {
		initLogicAction();
 		return SUCCESS;
 	}

 	public String showQuery() {
 		initLogicAction();
 		return SUCCESS;
 	}

 	public String getSubsystemName() {
		return this.subsystemName;
	}
	
	public void setSubsystemName(String subsystemName) {
		this.subsystemName = subsystemName;    	
	}

}