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
	public List<String> getPrivilegeList() {
		return getHibernateTemplate().
				find("Select privilege.privilegeName From Privilege as privilege");
	}

	@Override
	public Privilege getPrivilegeByName(String privilegeName) {
		return read("privilegeName", privilegeName);
	}
}