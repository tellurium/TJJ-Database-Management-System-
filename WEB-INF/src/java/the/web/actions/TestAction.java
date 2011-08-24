/* 
 * Mapping with the TestDAOImpl.java
 * Test the action classes 
 */

package the.web.actions;

import the.domain.model.*;
import the.dao.UserDAO;

public class TestAction extends ModelAction<User> {
	
	@Override
	protected void init() {
		target = new User();
	}

	public String testAll() {
		/* do lots of tests */

		// test ModelAction, model class is 'User'
		// Privilege privilege = new Privilege();
		// privilege.setPrivilegeId(1);
		// privilege.setPrivilegeName("putong");
		// privilege.setDescription("just putong");

		// User user = new User("ll", "ll", "ll", "ll", privilege);
		// User delete = user;

		// // 'create' method
		// dao.create(user);

		// // read by id
		// user = (User) dao.read(1);
		// showTestLog("Id 1 s name is: " + user.getUserName());

		// // read by name
		// user = ((UserDAO) dao).getUserByName("ff");
		// showTestLog("User ff password is: " + user.getPassword());

		// // update
		// user.setPassword("nimei");
		// dao.update(user);
		// showTestLog("User ff changed password is: " + user.getPassword());

		// // delete
		// dao.delete(delete);

		// // list
		// list = dao.list();
		// showTestLog("The user size is: " + list.size());


		// Test Privilege list
		

		return SUCCESS;
	}

	public void showTestLog(String log) {
		System.out.println("******************: " + log + "****************");
	}
}