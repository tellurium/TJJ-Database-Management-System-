package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemPara;
import the.web.actions.ModelAction;

public class SubsystemParaAction extends ModelAction<SubsystemPara> {
	
	@Override 
	protected void init() {
		target = new SubsystemPara();
	}

}