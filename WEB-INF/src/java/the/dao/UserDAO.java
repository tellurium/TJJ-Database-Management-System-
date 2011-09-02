package the.dao;

import the.domain.model.User;

public interface UserDAO {

	public User getUserByName(String userName);
	public User getUserById(Integer id);
	public void deleteById(Integer id);
	public void saveOrUpdate(User user);

}