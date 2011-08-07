package the.dao;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import java.util.List;

public interface BaseDAO<T> {

	void create(T newObject);
	T read(Integer id);
	void update(T changedObject);
	void delete(Integer id);
	void delete(T targetObject);
	List<T> list();
}