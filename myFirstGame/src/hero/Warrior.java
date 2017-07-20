package hero;

import action.Action;
import card.Ability;

public class Warrior implements Hero {

	private final String hero_name = "가로쉬 헬스크림";
	private final String job = "전사";
	private final Ability ability =  new Ability("방어도 증가!", 2, "방어도를 +2 얻습니다.", new Action("방어 증가", "2", "방어도를 +2 얻습니다.", "즉시"), 4);
	private final int heroType = 4;
	
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
