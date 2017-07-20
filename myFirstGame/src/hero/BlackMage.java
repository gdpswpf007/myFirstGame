package hero;

import action.Action;
import card.Ability;

public class BlackMage implements Hero {

	private final String hero_name = "굴단";
	private final String job = "흑마법사";
	private final Ability ability =  new Ability("생명력 전환", 2, "피해를 2 입는 대신 카드를 1장 뽑습니다.", new Action("카드 뽑기(생명력 감소)", "-2/1", "피해를 2 입는 대신 카드를 1장 뽑습니다.", "즉시"), 6);
	private final int heroType = 6;
	
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
