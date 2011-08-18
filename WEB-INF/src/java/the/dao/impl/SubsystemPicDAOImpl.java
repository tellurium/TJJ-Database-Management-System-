package the.dao.impl;

import the.domain.model.SubsystemPic;

public class SubsystemPicDAOImpl extends BaseDAOImpl<SubsystemPic> {

	@Override
	Class getKlass() {
		return SubsystemPic.class;
	}

	@Override
	String getClassName() {
		return "SubsystemPic";
	}

}