package the.dao.impl;

import java.util.List;

import the.domain.model.Privilege;
import the.dao.PrivilegeDAO;

public class PrivilegeDAOImpl extends BaseDAOImpl<Privilege> implements PrivilegeDAO {
	
	@Override	
	Class getKlass() {
		return Privilege.class;
	}

	@Override
	String getClassName() {
		return "Privilege";
	}

	@Override
	String getPropertyName() {
		return "privilegeName";
	}

	@Override
	public List<String> getPrivilegeList() {
		List<String> list = null;

		try {
			list = session.createQuery("Select privilege.privilegeName From Privilege as privilege").list();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Privilege getPrivilegeByName(String privilegeName) {
		return	read(privilegeName);
	}
}