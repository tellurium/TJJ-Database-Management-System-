package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemType;
import the.web.actions.ModelAction;

public class SubsystemTypeAction extends ModelAction<SubsystemType> {
	
	@Override 
	protected void init() {
		target = new SubsystemType();
	}

}