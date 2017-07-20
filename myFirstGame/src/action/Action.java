package action;

public class Action {

	private String action_type;
	private String action_value;
	private String action_info;
	private String action_timing;
	
	public Action() {}
	public Action(String action_type, String action_value, String action_info, String action_timing) {
		this.action_type = action_type;
		this.action_value = action_value;
		this.action_info = action_info;
		this.action_timing = action_timing;
	}

	public void doAction() {
	}
	
	public String getAction_type() {
		return action_type;
	}
	public String getAction_value() {
		return action_value;
	}
	public String getAction_info() {
		return action_info;
	}
	public String getAction_timing(){
		return action_timing;
	}
	
}
