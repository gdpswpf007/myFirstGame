package card;

import action.Action;

public interface Card {
	
	public String getName();
	public int getMana();
	public String getInfo();
	public Action getAction();
	public int getHeroType();
	public String getGrade();
}
