package the.dao.log;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import java.util.List;

import the.domain.model.Log;

public class LogDAOImpl implements LogDAO {
	
	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	@Override
	public void addLog(Log log) {
		try {
			session.save(log);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<Log> listLog() {
		List<Log> logs = null;
		try {
			logs = session.createQuery("From Log").list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return logs;
	}


}