package the.dao.impl;

import java.util.List;

import the.domain.model.Subsystem;
import the.dao.SubsystemDAO;

public class SubsystemDAOImpl extends BaseDAOImpl<Subsystem> implements SubsystemDAO {

	@Override
	Class getKlass() {
		return Subsystem.class;
	}

	@Override
	String getClassName() {
		return "Subsystem";
	}

	@Override
	String getPropertyName() {
		return "subsystemName";
	}

	@Override
	public List<String> getSubsystemList() {
		List<String> list = null;

		try {
			list = session.createQuery("Select sub.subsystemName From Subsystem as sub").list();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

}