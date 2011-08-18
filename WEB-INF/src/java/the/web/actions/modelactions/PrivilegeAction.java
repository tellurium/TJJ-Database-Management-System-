package the.web.actions.modelactions;

import java.util.List;

import the.domain.model.Privilege;
import the.web.actions.ModelAction;

public class PrivilegeAction extends ModelAction<Privilege> {

	@Override
	protected void init() {
		target = new Privilege();
	}

}