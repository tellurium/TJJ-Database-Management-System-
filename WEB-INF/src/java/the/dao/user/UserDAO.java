package the.dao.user;

import the.domain.model.User;

import java.util.List;
import java.util.ArrayList;

public interface UserDAO {

	void addUser(User user);
	List<User> listUser();
}