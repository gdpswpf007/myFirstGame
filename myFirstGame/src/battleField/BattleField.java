package battleField;

import java.io.IOException;
import java.util.Vector;

import card.Card;
import card.Monster;
import player.Player;

public class BattleField {

	private static BattleField singleton = new BattleField();
	
	private BattleField() {}
	
	public static BattleField getInstance(){
		return singleton;
	}
	
	public void drawingCard(Player p){
		Vector<Card> cards = p.getDeck().getDeck();
		int drawNum = (int)(Math.random() * cards.size());
		Card card = cards.get(drawNum);
		cards.remove(drawNum);
		Vector<Card> canUseCards = p.getCanUseCards();
		canUseCards.add(card);
		p.setCanUseCards(canUseCards); 
	}
	
	public void println(String[] msgs){
		for(String msg : msgs) System.out.println(msg);
	}
	
	public void println(Vector<String> vs){
		for(String s : vs) System.out.println(s);
	}
	
	public void viewMap(Player pTurn, Player pEnd){
		Vector<String> vs = new Vector<String>();
		vs.add("======���� ��Ȳ======");
		vs.add("�� ü�� : " + pTurn.getHp() + " ���� : " + pTurn.getMana() + " ������ �ɷ� : " + pEnd.getHero().getAbility().getInfo());
		vs.add("����� ī�� �� : " + pTurn.getSpentCards().size());
		vs.add("���� ���� ī�� �� : " + pTurn.getDeck().getDeck().size());
		vs.add("===����� �� �ִ� ī�� ���===");
		setCanUseCard(pTurn, vs);
		vs.add("===���� ��ȯ�� ���� ���===");
		setViewSummonMonster(pTurn, vs);
		vs.add("�� ü�� : " + pEnd.getHp() + " ������ �ɷ� : " + pEnd.getHero().getAbility().getInfo());
		vs.add("����� ī�� �� : " + pEnd.getSpentCards().size());
		vs.add("���� ���� ī�� �� : " + pEnd.getDeck().getDeck().size());
		vs.add("����� �� �ִ� ī�� �� : " + pEnd.getCanUseCards().size());
		vs.add("===���� ��ȯȯ ���� ���===");
		setViewSummonMonster(pEnd, vs);
		println(vs);
	}
	
	public Vector<String> setCanUseCard(Player p, Vector<String> vs){
		Vector<Card> cards = p.getCanUseCards();
		for(Card c : cards){
			String s = "ī���̸� : " + c.getName() + " �Ҹ𸶳� : " + c.getMana() + " ī���� : " + c.getGrade()
			+ " ���� : " + c.getInfo() + " ȿ�� : " + c.getAction().getAction_info();
			vs.add(s);
		}
		return vs;
	}
	
	public Vector<String> setViewSummonMonster(Player p, Vector<String> vs){
		Vector<Monster> monsters = p.getSummonMonster();
		int vLen = monsters.size();
		if(vLen == 0) vs.add("��ȯ�� ���Ͱ� �����ϴ�.");
		else{
			for(Monster m : monsters){
				String s = "�����̸� : " + m.getName() + " �Ҹ𸶳� : " + m.getMana()
				+ " hp : " + m.getHp() + " ���ݷ� : " + m.getAttackPoint()
				+ " ȿ�� : " + m.getAction().getAction_info() + " ���� : " + m.getStatus();
				vs.add(s);
			}
		}
		return vs;
	}
	
	public Vector<String> playList(Player p, String playType, Vector<String> vs){
		if(playType.equals("card")){
			
			
		}else if(playType.equals("monster")){
			
			
		}
		return vs;
	}
	
	public void useCard(Player pTurn, Player pEnd){
		Vector<String> vs = new Vector<String>();
		vs.add("=====ī�� ����ϱ�=====");
		vs.add("�� ü�� : " + pTurn.getHp() + "���� ���� : " + pTurn.getMana());
		
	}
	
	public void actMonster(Player pTurn, Player pEnd){
		
	}
	
	public void playTurn(Player pTurn, Player pEnd, int turnPoint) throws IOException{
		if(turnPoint < 10) pTurn.setMana(turnPoint);
		else pTurn.setMana(10);
		int playerSelect;
		drawingCard(pTurn);
		String[] msgs = {
				pTurn.getPlayer_name() + "���� " + turnPoint + "��° ��",
				"���� ü���� " + pTurn.getHp() + " ������  " + pTurn.getMana(),
				"���� ī��� " ,
				"===�ൿ��ħ�� ����ּ���===",
				"0. ������",
				"1. ���庸��",
				"2. ī�� ���",
				"3. ���� ����"
		};
		while(true){
			do{
				println(msgs);
				System.out.print("�����ϼ���(0~3) : ");
				playerSelect = System.in.read() - '0';
				System.in.skip(2);
				switch(playerSelect){
				case 0 : return;
				case 1 : viewMap(pTurn, pEnd); break;
				case 2 : useCard(pTurn, pEnd); break;
				case 3 : actMonster(pTurn, pEnd);
				}
			}while(!(playerSelect >= 0 && playerSelect <= 3));
			
		}
	}
}
