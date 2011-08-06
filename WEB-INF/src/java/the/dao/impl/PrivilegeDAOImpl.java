package the.dao.impl;

import the.domain.model.Privilege;

public class PrivilegeDAOImpl<Privilege> extends BaseDAOImpl {
	
	@Override	
	Class getKlass() {
		return the.domain.model.Privilege.class;
	}

	@Override
	String getClassName() {
		return "Privilege";
	}
}