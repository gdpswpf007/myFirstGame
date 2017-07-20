package hero;

import action.Action;
import card.Ability;

public class Priest implements Hero {

	private final String hero_name = "안두인 린";
	private final String job = "사제";
	private final Ability ability =  new Ability("하급 치유", 2, "방어도 +1, 생명력을 2 회복시킵니다.", new Action("치유", "2", "생명력을 2 회복시킵니다.", "즉시"), 8);
	private final int heroType = 8;
	
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
