package the.dao.impl;

import the.domain.model.SubsystemAttr;

public class SubsystemAttrDAOImpl extends BaseDAOImpl<SubsystemAttr> {

	@Override
	Class getKlass() {
		return SubsystemAttr.class;
	}

	@Override
	String getClassName() {
		return "SubsystemAttr";
	}

	@Override
	String getPropertyName() {
		return "subsystemAttrName";
	}

}