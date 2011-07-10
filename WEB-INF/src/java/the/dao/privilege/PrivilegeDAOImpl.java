package the.dao.privilege;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import the.domain.model.Privilege;

import java.util.List;
import java.util.ArrayList;

public class PrivilegeDAOImpl implements PrivilegeDAO {

	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	@Override
	public void addPrivilege(Privilege privilege) {
		try {
			session.save(privilege);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Privilege> listPrivilege() {
		List<Subsystem> privileges = null;
		try {
			privileges = session.createQuery("From Privilege").list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return privileges;
	}
}