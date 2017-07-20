package hero;

import action.Action;
import card.Ability;

public class Hunter implements Hero {
	
	private final String hero_name = "���縣";
	private final String job = "��ɲ�";
	private final Ability ability = new Ability("���� ���", 2, "�� �������� ���ظ� 2 �ݴϴ�.", new Action("���� �ֱ�(�� ����)", "2", "�� �������� ���ظ� 2 �ݴϴ�.", "���"), 2);
	private final int heroType = 2;
	
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
