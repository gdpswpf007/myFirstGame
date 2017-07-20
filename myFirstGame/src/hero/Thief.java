package hero;

import action.Action;
import card.Ability;

public class Thief implements Hero {

	private final String hero_name = "�߸��� ���ͳ���";
	private final String job = "����";
	private final Ability ability =  new Ability("�ܰ��� �밡", 2, "���ݷ� 1 ������ 2 �ܰ��� �����մϴ�.", new Action("���� ����", "1/2", "���ݷ� 1 ������ 2 �ܰ��� �����մϴ�.", "���"), 9);
	private final int heroType = 9;
	
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
