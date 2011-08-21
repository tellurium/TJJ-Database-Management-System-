package the.dao.impl;

import the.domain.model.SubsystemType;

public class SubsystemTypeDAOImpl extends BaseDAOImpl<SubsystemType> {

	@Override
	Class getKlass() {
		return SubsystemType.class;
	}

	@Override
	String getClassName() {
		return "SubsystemType";
	}

	@Override
	String getPropertyName() {
		return "";
	}

}