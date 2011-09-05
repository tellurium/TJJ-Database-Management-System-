package the.dao.impl;

import java.util.List;

import the.domain.model.SubsystemPara;
import the.dao.SubsystemParaDAO;

public class SubsystemParaDAOImpl extends BaseDAOImpl<SubsystemPara> implements SubsystemParaDAO {

	@Override
	Class getKlass() {
		return SubsystemPara.class;
	}

	@Override
	String getClassName() {
		return "SubsystemPara";
	}

	@Override
	public void save(SubsystemPara object) {
		create(object);
	}

	@Override
	public SubsystemPara getParaByNameId(Integer paraId) {
		return read("subsystemParaNameId", paraId + "");
	}

}