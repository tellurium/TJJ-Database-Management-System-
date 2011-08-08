package the.web.actions;

import com.opensymphony.xwork2.ModelDriven;

public abstract class ModelAction<T> extends BaseAction implements ModelDriven<T> {
	
	protected T target;

	public ModelAction() {
		super();
		init();
	}

	protected abstract void init();

	@Override
	public T getModel() {
		return target;
	}

	public T getTarget() {
		return this.target;
	}
	
	public void setTarget(T target) {
		this.target = target;    	
	}
	
	public String create() {
		dao.create(target);
		return SUCCESS;
	}

	public String read() {
		return SUCCESS;
	}

	public String update() {
		dao.update(target);
		return SUCCESS;
	}

	public String delete() {
		dao.delete(target);
		return SUCCESS;
	}
}