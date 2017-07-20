package hero;

import action.Action;
import card.Ability;

public class Wizard implements Hero {
	
	private final String hero_name = "제이나 프라우드무어";
	private final String job = "마법사";
	private final Ability ability = new Ability("화염 작렬", 2, "피해를 1 줍니다.", new Action("피해 주기", "1", "피해를 1 줍니다.", "즉시"), 1);
	private final int heroType = 1;
	
	@Override
	public String getName() {
		return hero_name;
	}

	@Override
	public String getJob() {
		return job;
	}

	@Override
	public Ability getAbility() {
		return ability;
	}
	
	@Override
	public int getHeroType() {
		return heroType;
	}

}
