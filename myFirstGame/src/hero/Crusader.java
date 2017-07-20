package hero;

import action.Action;
import card.Ability;

public class Crusader implements Hero {
	
	private final String hero_name = "���� ��ȣ�� �켭";
	private final String job = "�����";
	private final Ability ability = new Ability("���� ���", 2, "1/1 ���� ������ �ź��� 1�� ��ȯ�մϴ�.", new Action("���� ����", "1/1", "1/1 ���� ������ �ź��� 1�� ��ȯ�մϴ�.", "���"), 3);
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
