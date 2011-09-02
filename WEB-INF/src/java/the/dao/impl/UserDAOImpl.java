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
	public User getUserByName(String userName) {
		return read("userName", userName);
	}

	@Override
	public User getUserById(Integer id) {
		return read(id);
	}

	@Override
	public void deleteById(Integer id) {
		delete(id);
	}

	@Override
	public void saveOrUpdate(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

}