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
	private List<SubsystemAttrName> attrsNameList;
	private List<SubsystemParaName> parasNameList;
	private Subsystem curSubsystem;
	
	@Override 
	protected void init() {
		target = new SubsystemType();
	}

	public void initMaps() {
		attrMap = new HashMap<String, String>();
		paraMap = new HashMap<String, String>();
	}


	// show the update page
	public String showUpdatePage() {


		return SUCCESS;
	}


	// show the add page
	public String showAddPage() {
		initMaps();
		ActionContext context = ActionContext.getContext();
		Map session = context.getSession();
		curSubsystem = subsystemDAO.getSubsystemByName((String)session.get("SUBSYSTEM_NAME"));
		attrsNameList = subsystemAttrNameDAO.listBySubsystem(curSubsystem.getSubsystemId());
		int size = attrsNameList.size();
		for (int i = 0; i < size; i++ ) {
			attrMap.put(i + "", "");
		}

		parasNameList = getParasList();
		size = parasNameList.size();
		for (int i = 0;	i < size ; i++) {
			paraMap.put(i + "", "");
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

		clearErrorsAndMessages();
		if (target.getType().equals("")) {
			addActionError(getText("type.title") + getText("can_not_be_empty.title"));
			return INPUT;
		}
		target.setType(null);
			
		Iterator iter = attrMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			// 
			System.out.println(getAttrNameById((String)entry.getKey()) + "*********************" + entry.getValue());
		}
		iter = paraMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			//
			System.out.println(getParaNameById((String)entry.getKey()) + "*********************" + entry.getValue());
		}


		// add attrs

		// add paras

		// add pics

		// add units

		return SUCCESS;
	}

	// update current subsystemType
	@Override
	public String update() {
		return SUCCESS;
	}

	// show the query result
	public String query() {
		// get the subsystemType by typename
		// target = 
		return SUCCESS;
	}


	/* 
	 * utils 
	 */
	public String getAttrNameById(String id) {
		return attrsNameList.get(Integer.parseInt(id)).getSubsystemAttrName();
	}

	public String getParaNameById(String id) {
		return parasNameList.get(Integer.parseInt(id)).getSubsystemParaName();
	}

	public String getParaValueById(String id) {
		return (String)paraMap.get(id);
	}

	public String getAttrValueById(String id) {
		return (String)attrMap.get(id);
	}

	public List<SubsystemParaName> getParasList() {
		List<SubsystemParaName> paraNames = new ArrayList<SubsystemParaName>();

		// force set the para number as 26... (not a good thing....please modified it in the future)
		char a = 'a';
		for (int i = 0; i < 26 ;i++, a += 1 ) {
			paraNames.add(new SubsystemParaName(a + "", curSubsystem.getSubsystemId()));
		}

		return paraNames;
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

}