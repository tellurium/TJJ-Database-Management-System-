package the.dao;

import java.util.List;

import the.domain.model.SubsystemAttrName;

public interface SubsystemAttrNameDAO {

	public List<SubsystemAttrName> listBySubsystem(Integer subsystemId);
	public void save(SubsystemAttrName newObject);
	public void deleteById(Integer id);
	
	
}	