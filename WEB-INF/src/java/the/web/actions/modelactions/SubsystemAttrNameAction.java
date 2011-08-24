package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemAttrName;
import the.web.actions.ModelAction;

public class SubsystemAttrNameAction extends ModelAction<SubsystemAttrName> {
	
	@Override 
	protected void init() {
		target = new SubsystemAttrName();
	}

}