package the.dao.user;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import the.domain.model.User;
import the.domain.model.Privilege;

import java.util.List;

public class UserDAOImpl implements UserDAO {
	
	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	@Override
	public void addUser(User user) {
		// if( user == null || user.getUserName().equals("") || user.getEmail().equals("")) {
		// 	return;
		// }
		try {
			session.save(user);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<User> listUser() {
		List<User> users = null;
		try {
			users = session.createQuery("From User").list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}

}