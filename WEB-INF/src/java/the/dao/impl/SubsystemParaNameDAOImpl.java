package the.dao.impl;

import the.domain.model.SubsystemParaName;
import the.dao.SubsystemParaNameDAO;

public class SubsystemParaNameDAOImpl extends BaseDAOImpl<SubsystemParaName> implements SubsystemParaNameDAO {

	@Override
	Class getKlass() {
		return SubsystemParaName.class;
	}

	@Override
	String getClassName() {
		return "SubsystemParaName";
	}

	@Override
	public Integer getIdByName(String paraName) {
		return read("subsystemParaName", paraName).getSubsystemParaNameId();
	}

	@Override
	public void save(SubsystemParaName paraName) {
		create(paraName);
	}

}