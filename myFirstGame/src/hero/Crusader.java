package hero;

import action.Action;
import card.Ability;

public class Crusader implements Hero {
	
	private final String hero_name = "빛의 수호자 우서";
	private final String job = "성기사";
	private final Ability ability = new Ability("병력 충원", 2, "1/1 은빛 성기사단 신병을 1명 소환합니다.", new Action("몬스터 생성", "1/1", "1/1 은빛 성기사단 신병을 1명 소환합니다.", "즉시"), 3);
	private final int heroType = 3;
	
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
