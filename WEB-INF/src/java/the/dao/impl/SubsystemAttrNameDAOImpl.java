package the.dao.impl;

import java.util.List;

import the.dao.SubsystemAttrNameDAO;
import the.domain.model.SubsystemAttrName;

public class SubsystemAttrNameDAOImpl extends BaseDAOImpl<SubsystemAttrName> implements SubsystemAttrNameDAO {

	@Override
	Class getKlass() {
		return SubsystemAttrName.class;
	}

	@Override
	String getClassName() {
		return "SubsystemAttrName";
	}

	@Override
	public List<SubsystemAttrName> listBySubsystem(Integer subsystemId) {
		return getHibernateTemplate().
				find("From " + getClassName() + " where subsystemId" + "='" + subsystemId + "'");
	}

	@Override
	public void save(SubsystemAttrName newObject) {
		create(newObject);
	}

	@Override
	public void deleteById(Integer id) {
		delete(id);
	}

}