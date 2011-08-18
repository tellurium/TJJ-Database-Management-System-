package the.dao.impl;

import the.domain.model.Privilege;

public class PrivilegeDAOImpl extends BaseDAOImpl<Privilege> {
	
	@Override	
	Class getKlass() {
		return Privilege.class;
	}

	@Override
	String getClassName() {
		return "Privilege";
	}
}