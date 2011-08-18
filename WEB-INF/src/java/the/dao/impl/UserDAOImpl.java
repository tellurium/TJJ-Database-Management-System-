package the.dao.impl;

import the.domain.model.User;
import the.dao.UserDAO;

public class UserDAOImpl extends BaseDAOImpl<User> implements UserDAO {

	@Override
	Class getKlass() {
		return User.class;
	}

	@Override
	String getClassName() {
		return "User";
	}

	@Override
	public User getUserByName(String userName) {

		User user = null;
		try {
			user = read(1);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return user;
	}

}