package hero;

import action.Action;
import card.Ability;

public class Hunter implements Hero {
	
	private final String hero_name = "렉사르";
	private final String job = "사냥꾼";
	private final Ability ability = new Ability("고정 사격", 2, "적 영웅에게 피해를 2 줍니다.", new Action("피해 주기(적 영웅)", "2", "적 영웅에게 피해를 2 줍니다.", "즉시"), 2);
	private final int heroType = 2;
	
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
