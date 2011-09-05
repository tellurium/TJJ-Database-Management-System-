package the.dao;

import java.util.List;

import the.domain.model.SubsystemParaName;

public interface SubsystemParaNameDAO {

	public Integer getIdByName(String paraName);
	public void save(SubsystemParaName paraName);
	public List<SubsystemParaName> listBySubsystemType(Integer typeId);
}	