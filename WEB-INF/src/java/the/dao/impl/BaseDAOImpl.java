package the.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

import the.dao.BaseDAO;

public abstract class BaseDAOImpl<T> extends HibernateDaoSupport implements BaseDAO<T> {

	// Get the Class for the session.get() method
	abstract Class getKlass();
	abstract String getClassName();

	@Override
	public void create(T newObject) {
		getHibernateTemplate().save(newObject);
	}

	@Override
	public T read(Integer id) {
		return (T) getHibernateTemplate().get(getKlass(), id);
	}

	@Override
	public T read(String property, String name) {
		return (T) getHibernateTemplate().
				find("From " + getClassName() + " where " + property + "='" + name + "'").get(0);
	}

	@Override
	public void update(T changedOjbect) {
		getHibernateTemplate().update(changedOjbect);
	}

	@Override
	public void delete(Integer id) {
		T target = (T) getHibernateTemplate().get(getKlass(), id);
		getHibernateTemplate().delete(target);
	}

	@Override
	public void delete(T targetOjbect) {
		getHibernateTemplate().delete(targetOjbect);
	}

	@Override
	public List<T> list() {
		return getHibernateTemplate().find("From " + this.getClassName());			
	}
}