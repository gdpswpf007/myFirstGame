package hero;

import card.Ability;

public interface Hero {

	public String getName();
	public String getJob();
	public Ability getAbility();
	public int getHeroType();
}
