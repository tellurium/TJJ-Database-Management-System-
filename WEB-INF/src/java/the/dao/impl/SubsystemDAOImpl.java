package the.dao.impl;

import the.domain.model.Subsystem;

public class SubsystemDAOImpl<Subsystem> extends BaseDAOImpl {
	
	@Override
	Class getKlass() {
		return the.domain.model.Subsystem.class;
	}

	@Override
	String getClassName() {
		return "Subsystem";
	}

}