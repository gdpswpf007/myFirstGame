package hero;

import action.Action;
import card.Ability;

public class Druid implements Hero {

	private final String hero_name = "말퓨리온 스톰레이지";
	private final String job = "드루이드";
	private final Ability ability =  new Ability("변신", 2, "방어도 +1, 이번 턴에만 공격력 +1", new Action("변신", "1/1", "방어도 +1, 이번 턴에만 공격력 +1", "즉시"), 5);
	private final int heroType = 5;
	
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
