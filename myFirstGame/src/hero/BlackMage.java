package hero;

import action.Action;
import card.Ability;

public class BlackMage implements Hero {

	private final String hero_name = "����";
	private final String job = "�渶����";
	private final Ability ability =  new Ability("����� ��ȯ", 2, "���ظ� 2 �Դ� ��� ī�带 1�� �̽��ϴ�.", new Action("ī�� �̱�(����� ����)", "-2/1", "���ظ� 2 �Դ� ��� ī�带 1�� �̽��ϴ�.", "���"), 6);
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
