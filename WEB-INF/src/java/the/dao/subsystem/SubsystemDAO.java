package the.dao.subsystem;

import the.domain.model.Subsystem;

import java.util.ArrayList;
import java.util.List;

public interface SubsystemDAO {
	
	void addSubsystem(Subsystem subsystem);
	List<String> getSubsystemNameList();
	List<Subsystem> listSubsystem();
	void deleteSubsystem(Integer id);
	void updateSubsystem(Subsystem subsystem);
	Subsystem getSubsystem(Integer id);
	
}