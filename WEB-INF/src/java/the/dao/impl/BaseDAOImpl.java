package the.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import java.util.List;

import the.dao.BaseDAO;

public abstract class BaseDAOImpl<T> implements BaseDAO<T> {
	
	@SessionTarget
	Session session;

	@TransactionTarget
	Transaction transaction;

	// Get the Class for the session.get() method
	abstract Class getKlass();
	abstract String getClassName();
	abstract String getPropertyName();

	@Override
	public void create(T newObject) {
		try {
			session.save(newObject);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public T read(Integer id) {
		T target = null;
		try {
			target = (T) session.get(getKlass(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return target;
	}

	@Override
	public T read(String name) {
		String property = getPropertyName();
		if (property.equals("")) {
			return null;
		}
		
		T target = null;
		try {
			target = (T) session.createQuery("From " + getClassName() 
					+ " where " + property + "='" + name + "'").list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return target;
	}

	@Override
	public void update(T changedOjbect) {
		try {
			session.update(changedOjbect);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Integer id) {
		try {
			T target = (T) session.get(getKlass(), id);
			session.delete(target);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void delete(T targetOjbect) {
		try {
			session.delete(targetOjbect);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<T> list() {
		List<T> objects = null;
		try {
			objects = session.createQuery("From " + this.getClassName()).list();			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return objects;
	}
}