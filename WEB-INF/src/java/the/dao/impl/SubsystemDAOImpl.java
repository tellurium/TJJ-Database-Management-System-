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
	public List<String> getSubsystemList() {
		return getHibernateTemplate().find("Select sub.subsystemName From Subsystem as sub");
	}

	@Override
	public List<Subsystem> listAll(){
		return list();
	}

	@Override
	public Subsystem getSubsystemById(Integer id) {
		return read(id);
	}

	@Override
	public void deleteById(Integer id) {
		delete(id);
	}

	@Override
	public Subsystem getSubsystemByName(String subsystemName) {
		return read("subsystemName", subsystemName);
	}


}