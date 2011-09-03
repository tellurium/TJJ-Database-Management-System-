package the.web.actions.modelactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import the.dao.SubsystemAttrDAO;
import the.dao.SubsystemAttrNameDAO;
import the.dao.SubsystemDAO;
import the.dao.SubsystemParaDAO;
import the.dao.SubsystemParaNameDAO;
import the.dao.SubsystemTypeDAO;

import the.domain.model.Subsystem;
import the.domain.model.SubsystemAttr;
import the.domain.model.SubsystemAttrName;
import the.domain.model.SubsystemPara;
import the.domain.model.SubsystemParaName;
import the.domain.model.SubsystemType;
import the.web.actions.ModelAction;

public class SubsystemTypeAction extends ModelAction<SubsystemType> {

	private SubsystemAttrDAO subsystemAttrDAO;
	private SubsystemAttrNameDAO subsystemAttrNameDAO;
	private SubsystemDAO subsystemDAO;
	private SubsystemParaDAO subsystemParaDAO;
	private SubsystemParaNameDAO subsystemParaNameDAO;
	private SubsystemTypeDAO subsystemTypeDAO;
	private Map<String, String> attrMap;
	private Map<String, String> paraMap;
	private List<SubsystemAttr> attrList;
	private List<SubsystemAttrName> attrsNameList;
	private List<SubsystemPara> paraList;
	private List<SubsystemParaName> parasNameList;
	private Subsystem curSubsystem;
	
	@Override 
	protected void init() {
		target = new SubsystemType();
		attrMap = new HashMap<String, String>();
		paraMap = new HashMap<String, String>();
		attrList = new ArrayList<SubsystemAttr>();
		paraList = new ArrayList<SubsystemPara>();
	}


	// show the update page
	public String showUpdatePage() {


		return SUCCESS;
	}


	// show the add page
	public String showAddPage() {
		ActionContext context = ActionContext.getContext();
		Map session = context.getSession();
		curSubsystem = subsystemDAO.getSubsystemByName((String)session.get("SUBSYSTEM_NAME"));
		attrsNameList = subsystemAttrNameDAO.listBySubsystem(curSubsystem.getSubsystemId());
		for (SubsystemAttrName attrName : attrsNameList) {
			attrList.add(new SubsystemAttr(attrName.getSubsystemAttrNameId()));
			// attrMap.put(attrName.getSubsystemAttrName(), "dd");
		}
		
		return SUCCESS;
	}

	// show current page
	public String showType() {
		if (target.getType() != null) {
						




			target.setType(null);
		}
		return SUCCESS;
	}

	// add a new subsystemType
	public String add() {
		Iterator iter = attrMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			// 
			System.out.println(entry.getKey() + "*********************" + entry.getValue());
		}
		return SUCCESS;
	}

	// update current subsystemType
	@Override
	public String update() {
		return SUCCESS;
	}

	/* 
	 * All of the beans 
	 */
	public SubsystemAttrDAO getSubsystemAttrDAO() {
		return this.subsystemAttrDAO;
	}
	
	public void setSubsystemAttrDAO(SubsystemAttrDAO subsystemAttrDAO) {
		this.subsystemAttrDAO = subsystemAttrDAO;    	
	}
	
	public SubsystemAttrNameDAO getSubsystemAttrNameDAO() {
		return this.subsystemAttrNameDAO;
	}
	
	public void setSubsystemAttrNameDAO(SubsystemAttrNameDAO subsystemAttrNameDAO) {
		this.subsystemAttrNameDAO = subsystemAttrNameDAO;    	
	}
	
	public SubsystemParaDAO getSubsystemParaDAO() {
		return this.subsystemParaDAO;
	}

	public SubsystemDAO getSubsystemDAO() {
		return this.subsystemDAO;
	}
	
	public void setSubsystemDAO(SubsystemDAO subsystemDAO) {
		this.subsystemDAO = subsystemDAO;    	
	}
	
	public void setSubsystemParaDAO(SubsystemParaDAO subsystemParaDAO) {
		this.subsystemParaDAO = subsystemParaDAO;    	
	}
	
	public SubsystemParaNameDAO getSubsystemParaNameDAO() {
		return this.subsystemParaNameDAO;
	}
	
	public void setSubsystemParaNameDAO(SubsystemParaNameDAO subsystemParaNameDAO) {
		this.subsystemParaNameDAO = subsystemParaNameDAO;    	
	}
	
	public SubsystemTypeDAO getSubsystemTypeDAO() {
		return this.subsystemTypeDAO;
	}
	
	public void setSubsystemTypeDAO(SubsystemTypeDAO subsystemTypeDAO) {
		this.subsystemTypeDAO = subsystemTypeDAO;    	
	}

	public Map<String, String> getAttrMap() {
		return this.attrMap;
	}
	
	public void setAttrMap(Map<String, String> attrMap) {
		this.attrMap = attrMap;    	
	}
	
	public Map<String, String> getParaMap() {
		return this.paraMap;
	}
	
	public void setParaMap(Map<String, String> paraMap) {
		this.paraMap = paraMap;    	
	}

	public List<SubsystemAttrName> getAttrsNameList() {
		return this.attrsNameList;
	}
	
	public void setAttrsNameList(List<SubsystemAttrName> attrsNameList) {
		this.attrsNameList = attrsNameList;    	
	}

	public List<SubsystemParaName> getParasNameList() {
		return this.parasNameList;
	}
	
	public void setParasNameList(List<SubsystemParaName> parasNameList) {
		this.parasNameList = parasNameList;    	
	}

	public List<SubsystemAttr> getAttrList() {
		return this.attrList;
	}
	
	public void setAttrList(List<SubsystemAttr> attrList) {
		this.attrList = attrList;    	
	}
	
	public List<SubsystemPara> getParaList() {
		return this.paraList;
	}
	
	public void setParaList(List<SubsystemPara> paraList) {
		this.paraList = paraList;    	
	}

}