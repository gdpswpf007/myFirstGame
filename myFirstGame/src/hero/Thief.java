package hero;

import action.Action;
import card.Ability;

public class Thief implements Hero {

	private final String hero_name = "발리라 생귀나르";
	private final String job = "도적";
	private final Ability ability =  new Ability("단검의 대가", 2, "공격력 1 내구성 2 단검을 장착합니다.", new Action("무기 장착", "1/2", "공격력 1 내구성 2 단검을 장착합니다.", "즉시"), 9);
	private final int heroType = 9;
	
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
