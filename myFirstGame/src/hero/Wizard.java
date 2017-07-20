package hero;

import action.Action;
import card.Ability;

public class Wizard implements Hero {
	
	private final String hero_name = "���̳� �����幫��";
	private final String job = "������";
	private final Ability ability = new Ability("ȭ�� �۷�", 2, "���ظ� 1 �ݴϴ�.", new Action("���� �ֱ�", "1", "���ظ� 1 �ݴϴ�.", "���"), 1);
	private final int heroType = 1;
	
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
