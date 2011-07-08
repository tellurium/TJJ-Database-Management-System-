package the.dao.subsystem;

import the.domain.model.Subsystem;

import java.util.ArrayList;
import java.util.List;

public interface SubsystemDAO {
	
	void addSubsystem(Subsystem subsystem);
	List<String> getSubsystemNameList();
	List<Subsystem> listSubsystem();
	void deleteSubsystem(Subsystem subsystem);
	void updateSubsystem(Subsystem subsystem);
	
}