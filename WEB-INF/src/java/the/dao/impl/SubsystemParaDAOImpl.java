package the.dao.impl;

import the.domain.model.SubsystemPara;

public class SubsystemParaDAOImpl extends BaseDAOImpl<SubsystemPara> {

	@Override
	Class getKlass() {
		return SubsystemPara.class;
	}

	@Override
	String getClassName() {
		return "SubsystemPara";
	}

}