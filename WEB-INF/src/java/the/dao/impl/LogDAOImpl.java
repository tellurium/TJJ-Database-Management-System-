package the.dao.impl;

import the.domain.model.Log;

public class LogDAOImpl<Log> extends BaseDAOImpl {

	@Override
	Class getKlass() {
		return the.domain.model.Log.class;
	}

	@Override
	String getClassName() {
		return "Log";
	}

}