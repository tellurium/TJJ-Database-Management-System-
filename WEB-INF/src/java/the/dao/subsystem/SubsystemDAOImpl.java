package the.dao.subsystem;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;


import the.domain.model.Subsystem;

import java.util.List;
import java.util.ArrayList;

public class SubsystemDAOImpl implements SubsystemDAO {

	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	private List test = null;

	@Override
	public void addSubsystem(Subsystem subsystem) {
		
	}

	@Override
	public List<String> getSubsystemNameList() {
		return test;
	}

	@Override
	public List<Subsystem> listSubsystem() {
		return test;
	}

	@Override
	public void deleteSubsystem(Subsystem subsystem) {
		
	}

	@Override
	public void updateSubsystem(Subsystem subsystem) {
		
	}
}