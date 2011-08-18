package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemUnit;
import the.web.actions.ModelAction;

public class SubsystemUnitAction extends ModelAction<SubsystemUnit> {
	
	@Override 
	protected void init() {
		target = new SubsystemUnit();
	}

}