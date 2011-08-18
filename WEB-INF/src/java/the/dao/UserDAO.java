package the.dao;

import the.domain.model.User;

public interface UserDAO {

	public User getUserByName(String userName);

}