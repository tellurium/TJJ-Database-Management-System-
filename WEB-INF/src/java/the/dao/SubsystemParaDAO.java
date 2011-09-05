package the.dao;

import java.util.List;

import the.domain.model.SubsystemPara;

public interface SubsystemParaDAO {

	public void save(SubsystemPara object);
	public SubsystemPara getParaByNameId(Integer paraId);
}