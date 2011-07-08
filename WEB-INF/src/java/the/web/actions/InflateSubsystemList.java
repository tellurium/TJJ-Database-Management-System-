package the.web.actions;

import java.util.ArrayList;

public class InflateSubsystemList {

	
	private ArrayList<String> subsystemList;

	public String execute() {
		return "success";
	}

	public InflateSubsystemList() {
	}

	public ArrayList<String> getSubsystemList() {
		return this.subsystemList;
	}
	
	public void setSubsystemList(ArrayList<String> subsystemList) {
		this.subsystemList = subsystemList;    	
	}
	
}