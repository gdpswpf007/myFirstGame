package hero;

import action.Action;
import card.Ability;

public class Druid implements Hero {

	private final String hero_name = "��ǻ���� ���跹����";
	private final String job = "����̵�";
	private final Ability ability =  new Ability("����", 2, "�� +1, �̹� �Ͽ��� ���ݷ� +1", new Action("����", "1/1", "�� +1, �̹� �Ͽ��� ���ݷ� +1", "���"), 5);
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
