package deck;

import java.util.Vector;

import card.Card;
import player.Player;

public class Deck {

	private Vector<Card> deck;
	private Player player;
	
	public Deck() {}
	public Deck(Vector<Card> deck, Player player) {
		super();
		this.deck = deck;
		this.player = player;
	}
	
	public Vector<Card> getDeck() {
		return deck;
	}
	public void setDeck(Vector<Card> deck) {
		this.deck = deck;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
