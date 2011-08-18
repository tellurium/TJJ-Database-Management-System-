package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemPic;
import the.web.actions.ModelAction;

public class SubsystemPicAction extends ModelAction<SubsystemPic> {
	
	@Override 
	protected void init() {
		target = new SubsystemPic();
	}

}