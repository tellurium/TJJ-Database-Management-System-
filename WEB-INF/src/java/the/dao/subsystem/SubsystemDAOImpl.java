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
		// if (subsystem.getSubsystemName().equals("")) {
		// 	return;
		// }
		try {
			session.save(subsystem);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<String> getSubsystemNameList() {
		return test;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subsystem> listSubsystem() {
		List<Subsystem> subsystems = null;
		try {
			subsystems = session.createQuery("From Subsystem").list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return subsystems;
	}

	@Override
	public void deleteSubsystem(Subsystem subsystem) {
		
	}

	@Override
	public void updateSubsystem(Subsystem subsystem) {
		
	}
}
