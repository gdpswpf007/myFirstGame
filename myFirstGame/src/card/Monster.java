package card;

import action.Action;

public class Monster implements Card {

	private String monster_name;
	private int mana;
	private String monster_info;
	private Action monster_action;
	private int heroType;
	private String grade;
	private boolean behavior;
	private int hp;
	private int attackPoint;
	private String tribe;
	private String status;
	
	public Monster(){}
	public Monster(String monster_name, int mana, String monster_info, Action monster_action, int heroType,
			String grade, boolean behavior, int hp, int attackPoint, String tribe, String status) {
		super();
		this.monster_name = monster_name;
		this.mana = mana;
		this.monster_info = monster_info;
		this.monster_action = monster_action;
		this.heroType = heroType;
		this.grade = grade;
		this.behavior = behavior;
		this.hp = hp;
		this.attackPoint = attackPoint;
		this.tribe = tribe;
		this.status = status;
	}

	@Override
	public String getName() {
		return monster_name;
	}
	
	@Override
	public int getMana() {
		return mana;
	}
	
	@Override
	public String getInfo() {
		return monster_info;
	}
	
	@Override
	public Action getAction() {
		return monster_action;
	}
	
	@Override
	public int getHeroType() {
		return heroType;
	}
	
	@Override
	public String getGrade() {
		return grade;
	}

	public void setBehavior(boolean behavior) {
		this.behavior = behavior;
	}

	public boolean isBehavior() {
		return behavior;
	}

	public void setHp(int hp){
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public String getTribe() {
		return tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
