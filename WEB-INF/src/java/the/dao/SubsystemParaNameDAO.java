package the.dao;

import the.domain.model.SubsystemParaName;

public interface SubsystemParaNameDAO {

	public Integer getIdByName(String paraName);
	public void save(SubsystemParaName paraName);
}	