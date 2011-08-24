package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemParaName;
import the.web.actions.ModelAction;

public class SubsystemParaNameAction extends ModelAction<SubsystemParaName> {
	
	@Override 
	protected void init() {
		target = new SubsystemParaName();
	}

}