package the.dao.impl;

import the.domain.model.SubsystemType;
import the.dao.SubsystemTypeDAO;

public class SubsystemTypeDAOImpl extends BaseDAOImpl<SubsystemType> implements SubsystemTypeDAO {

	@Override
	Class getKlass() {
		return SubsystemType.class;
	}

	@Override
	String getClassName() {
		return "SubsystemType";
	}

}