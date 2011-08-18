package the.web.actions.modelactions;

import java.util.List;
import java.util.ArrayList;

import the.domain.model.SubsystemAttr;
import the.web.actions.ModelAction;

public class SubsystemAttrAction extends ModelAction<SubsystemAttr> {
	
	@Override 
	protected void init() {
		target = new SubsystemAttr();
	}

}