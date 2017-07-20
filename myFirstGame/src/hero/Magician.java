package hero;

import action.Action;
import card.Ability;

public class Magician implements Hero {

	private final String hero_name = "굴단";
	private final String job = "주술사";
	private final Ability ability =  new Ability("토템 소환", 2, "무작위 토템을 1개 소환합니다.", new Action("토템 소환", "무작위", "무작위 토템을 1개 소환합니다.", "즉시"), 7);
	private final int heroType = 7;
	
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
