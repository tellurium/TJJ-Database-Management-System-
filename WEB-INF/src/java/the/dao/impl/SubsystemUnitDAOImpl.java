package the.dao.impl;

import the.domain.model.SubsystemUnit;

public class SubsystemUnitDAOImpl extends BaseDAOImpl<SubsystemUnit> {

	@Override
	Class getKlass() {
		return SubsystemUnit.class;
	}

	@Override
	String getClassName() {
		return "SubsystemUnit";
	}

}