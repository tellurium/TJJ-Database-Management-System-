package the.web.actions;

import com.opensymphony.xwork2.ActionSupport;

import the.dao.BaseDAO;

public class BaseAction extends ActionSupport {
	
	BaseDAO dao;

	public BaseDAO getDao() {
		return this.dao;
	}
	
	public void setDao(BaseDAO dao) {
		this.dao = dao;    	
	}

}