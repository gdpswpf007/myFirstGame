package hero;

import action.Action;
import card.Ability;

public class Priest implements Hero {

	private final String hero_name = "�ȵ��� ��";
	private final String job = "����";
	private final Ability ability =  new Ability("�ϱ� ġ��", 2, "�� +1, ������� 2 ȸ����ŵ�ϴ�.", new Action("ġ��", "2", "������� 2 ȸ����ŵ�ϴ�.", "���"), 8);
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
