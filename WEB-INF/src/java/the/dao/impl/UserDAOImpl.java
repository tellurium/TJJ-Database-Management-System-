package the.dao.impl;

import the.domain.model.User;

public class UserDAOImpl<User> extends BaseDAOImpl {

	@Override
	Class getKlass() {
		return the.domain.model.User.class;
	}

	@Override
	String getClassName() {
		return "User";
	}

}