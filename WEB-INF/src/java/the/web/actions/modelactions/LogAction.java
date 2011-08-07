package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Log;
import the.web.actions.ModelAction;

public class LogAction<Log> extends ModelAction {
	
	private List<Log> logList;

	public String list() {
		//
		return SUCCESS;
	}

	public List<Log> getLogList() {
		return this.logList;
	}
	
	public void setLogList(List<Log> logList) {
		this.logList = logList;    	
	}

}