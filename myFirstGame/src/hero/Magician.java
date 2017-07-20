package hero;

import action.Action;
import card.Ability;

public class Magician implements Hero {

	private final String hero_name = "����";
	private final String job = "�ּ���";
	private final Ability ability =  new Ability("���� ��ȯ", 2, "������ ������ 1�� ��ȯ�մϴ�.", new Action("���� ��ȯ", "������", "������ ������ 1�� ��ȯ�մϴ�.", "���"), 7);
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
