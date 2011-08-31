package the.dao;

import java.util.List;
import the.domain.model.Subsystem;

public interface SubsystemDAO {

	public List<String> getSubsystemList();
	public List<Subsystem> listAll();
	public Subsystem getSubsystemById(Integer id);
	public Subsystem getSubsystemByName(String subsystemName);
	public void deleteById(Integer id);
}