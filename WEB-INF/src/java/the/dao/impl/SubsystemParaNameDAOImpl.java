package the.dao.impl;

import the.domain.model.SubsystemParaName;

public class SubsystemParaNameDAOImpl extends BaseDAOImpl<SubsystemParaName> {

	@Override
	Class getKlass() {
		return SubsystemParaName.class;
	}

	@Override
	String getClassName() {
		return "SubsystemParaName";
	}

}