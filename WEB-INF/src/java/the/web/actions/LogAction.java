package the.web.actions;

import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import the.domain.model.Log;
import the.dao.log.LogDAO;
import the.dao.log.LogDAOImpl;

public class LogAction extends ActionSupport implements ModelDriven<Log> {
	
	private static final long serialVersionUID = 4L;

	private Log log = new Log();
	private List<Log> logList = new ArrayList<Log>();
	private LogDAO logDAO = new LogDAOImpl();

	@Override
	public Log getModel() {
		return log;
	}

	public String add() {
		if (log == null) {
			return SUCCESS;
		}
		logDAO.addLog(log);
		return SUCCESS;
	}

	public String list() {
		logList = logDAO.listLog();
		return SUCCESS;
	}

	public Log getLog() {
		return this.log;
	}
	
	public void setLog(Log log) {
		this.log = log;    	
	}
	
	public List<Log> getLogList() {
		return this.logList;
	}
	
	public void setLogList(List<Log> logList) {
		this.logList = logList;    	
	}
		
	public void setLogDAO(LogDAO LogDAO) {
		this.logDAO = logDAO;    	
	}

}