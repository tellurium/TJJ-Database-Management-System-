package the.dao.impl;

import the.domain.model.SubsystemAttr;
import the.dao.SubsystemAttrDAO;

public class SubsystemAttrDAOImpl extends BaseDAOImpl<SubsystemAttr> implements SubsystemAttrDAO {

	@Override
	Class getKlass() {
		return SubsystemAttr.class;
	}

	@Override
	String getClassName() {
		return "SubsystemAttr";
	}

	@Override
	public void save(SubsystemAttr object) {
		create(object);
	}

}