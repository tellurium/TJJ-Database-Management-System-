package the.dao.impl;

import java.util.List;

import the.domain.model.Subsystem;
import the.dao.SubsystemDAO;

public class SubsystemDAOImpl<Subsystem> extends BaseDAOImpl implements SubsystemDAO {
	
	@Override
	Class getKlass() {
		return the.domain.model.Subsystem.class;
	}

	@Override
	String getClassName() {
		return "Subsystem";
	}

	@Override
	public List<String> getSubsystemList() {
		List<String> list = null;
		try {
			list = session.createQuery("select sub.subsystemName From Subsystem as sub").list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}