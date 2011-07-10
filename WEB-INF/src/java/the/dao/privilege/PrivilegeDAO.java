package the.dao.privilege;

import the.domain.model.Privilege;

import java.util.List;

public interface PrivilegeDAO {
	void addPrivilege(Privilege privilege);
	List<Privilege> listPrivilege();
}
