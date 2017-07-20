package player;

import java.util.Vector;

import card.Card;
import card.Monster;
import card.Secret;
import card.Weapon;
import deck.Deck;
import hero.Hero;

public class Player {

	private int hp = 30;
	private int mana;
	private int shieldPoint;
	private Weapon player_weapon;
	private int player_level;
	private Deck deck;
	private Vector<Card> canUseCards;
	private Vector<Card> spentCards;
	private Vector<Secret> readySecret;
	private Vector<Monster> summonMonster;
	private String player_name;
	private Hero hero;
	
	public Player() {}
	public Player(int hp, int mana, int shieldPoint, Weapon player_weapon, int player_level, Deck deck, Vector<Card> canUseCards,
			Vector<Card> spentCards, Vector<Secret> readySecret, Vector<Monster> summonMonster, String player_name,
			Hero hero) {
		this.hp = hp;
		this.mana = mana;
		this.shieldPoint = shieldPoint;
		this.player_weapon = player_weapon;
		this.player_level = player_level;
		this.deck = deck;
		this.canUseCards = canUseCards;
		this.spentCards = spentCards;
		this.readySecret = readySecret;
		this.summonMonster = summonMonster;
		this.player_name = player_name;
		this.hero = hero;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getShieldPoint() {
		return shieldPoint;
	}
	public void setShieldPoint(int shieldPoint) {
		this.shieldPoint = shieldPoint;
	}
	public Weapon getPlayer_weapon() {
		return player_weapon;
	}
	public void setPlayer_weapon(Weapon player_weapon) {
		this.player_weapon = player_weapon;
	}
	public int getPlayer_level() {
		return player_level;
	}
	public void setPlayer_level(int player_level) {
		this.player_level = player_level;
	}
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public Vector<Card> getCanUseCards() {
		return canUseCards;
	}
	public void setCanUseCards(Vector<Card> canUseCards) {
		this.canUseCards = canUseCards;
	}
	public Vector<Card> getSpentCards() {
		return spentCards;
	}
	public void setSpentCards(Vector<Card> spentCards) {
		this.spentCards = spentCards;
	}
	public Vector<Secret> getReadySecret() {
		return readySecret;
	}
	public void setReadySecret(Vector<Secret> readySecret) {
		this.readySecret = readySecret;
	}
	public Vector<Monster> getSummonMonster() {
		return summonMonster;
	}
	public void setSummonMonster(Vector<Monster> summonMonster) {
		this.summonMonster = summonMonster;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
}
