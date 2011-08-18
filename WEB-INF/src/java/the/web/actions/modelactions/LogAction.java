package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Log;
import the.web.actions.ModelAction;

public class LogAction extends ModelAction<Log> {

	@Override
	protected void init() {
		target = new Log();
	}

}