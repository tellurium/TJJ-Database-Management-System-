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
	public List<String> getSubsystemList() {
		List<String> subsystemList = null;
		try {
			subsystemList = session.createQuery("select subsystem.subsystemName From Subsystem subsystem").list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return subsystemList;
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
	public void deleteSubsystem(Integer subsystemId) {
		try {
			Subsystem subsystem = (Subsystem) session.get(Subsystem.class, subsystemId);
			session.delete(subsystem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateSubsystem(Subsystem subsystem) {
		
	}

	@Override
	public Subsystem getSubsystem(Integer subsystemId) {
		Subsystem subsystem = null;
		try {
			subsystem = (Subsystem) session.get(Subsystem.class, subsystemId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subsystem;
	}
}
