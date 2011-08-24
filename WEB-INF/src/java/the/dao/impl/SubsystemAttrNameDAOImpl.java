package the.dao.impl;

import the.domain.model.SubsystemAttrName;

public class SubsystemAttrNameDAOImpl extends BaseDAOImpl<SubsystemAttrName> {

	@Override
	Class getKlass() {
		return SubsystemAttrName.class;
	}

	@Override
	String getClassName() {
		return "SubsystemAttrName";
	}

}