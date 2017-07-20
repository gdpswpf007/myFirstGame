package hero;

import action.Action;
import card.Ability;

public class Warrior implements Hero {

	private final String hero_name = "���ν� �ｺũ��";
	private final String job = "����";
	private final Ability ability =  new Ability("�� ����!", 2, "���� +2 ����ϴ�.", new Action("��� ����", "2", "���� +2 ����ϴ�.", "���"), 4);
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
