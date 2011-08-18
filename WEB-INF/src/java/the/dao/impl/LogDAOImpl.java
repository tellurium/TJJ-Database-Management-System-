package the.dao.impl;

import the.domain.model.Log;

public class LogDAOImpl extends BaseDAOImpl<Log> {

	@Override
	Class getKlass() {
		return Log.class;
	}

	@Override
	String getClassName() {
		return "Log";
	}

}