package the.dao;

import java.util.List;
import the.domain.model.Privilege;

public interface PrivilegeDAO {

	public List<String> getPrivilegeList();
	public Privilege getPrivilegeByName(String privilegeName);
}