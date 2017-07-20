package card;

import action.Action;

public class Ability implements Card {

	private String ability_name;
	private int mana;
	private String ability_info;
	private Action ability_action;
	private int heroType;
	private String grade = "±âº»";
	
	public Ability() {
		super();
	}
	public Ability(String ability_name, int mana, String ability_info, Action ability_action, int heroType) {
		super();
		this.ability_name = ability_name;
		this.mana = mana;
		this.ability_info = ability_info;
		this.ability_action = ability_action;
		this.heroType = heroType;
	}
	
	@Override
	public String getName() {
		return ability_name;
	}
	
	@Override
	public int getMana() {
		return mana;
	}
	
	@Override
	public String getInfo() {
		return ability_info;
	}
	
	@Override
	public Action getAction() {
		return ability_action;
	}
	
	@Override
	public int getHeroType() {
		return heroType;
	}
	
	public String getGrade() {
		return grade;
	}
	
}
