package the.dao.impl;

import java.util.List;

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
	String getPropertyName() {
		return "userName";
	}

	@Override
	public User getUserByName(String userName) {
		return read(userName);
	}

}