package the.dao.log;

import java.util.List;

import the.domain.model.Log;

public interface LogDAO {
	void addLog(Log log);
	List<Log> listLog();
}