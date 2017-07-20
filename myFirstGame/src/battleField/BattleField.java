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
		vs.add("======전장 상황======");
		vs.add("내 체력 : " + pTurn.getHp() + " 마나 : " + pTurn.getMana() + " 영웅의 능력 : " + pEnd.getHero().getAbility().getInfo());
		vs.add("사용한 카드 수 : " + pTurn.getSpentCards().size());
		vs.add("덱에 남은 카드 수 : " + pTurn.getDeck().getDeck().size());
		vs.add("===사용할 수 있는 카드 목록===");
		setCanUseCard(pTurn, vs);
		vs.add("===내가 소환한 몬스터 목록===");
		setViewSummonMonster(pTurn, vs);
		vs.add("적 체력 : " + pEnd.getHp() + " 영웅의 능력 : " + pEnd.getHero().getAbility().getInfo());
		vs.add("사용한 카드 수 : " + pEnd.getSpentCards().size());
		vs.add("덱에 남은 카드 수 : " + pEnd.getDeck().getDeck().size());
		vs.add("사용할 수 있는 카드 수 : " + pEnd.getCanUseCards().size());
		vs.add("===적이 소환환 몬스터 목록===");
		setViewSummonMonster(pEnd, vs);
		println(vs);
	}
	
	public Vector<String> setCanUseCard(Player p, Vector<String> vs){
		Vector<Card> cards = p.getCanUseCards();
		for(Card c : cards){
			String s = "카드이름 : " + c.getName() + " 소모마나 : " + c.getMana() + " 카드등급 : " + c.getGrade()
			+ " 설명 : " + c.getInfo() + " 효과 : " + c.getAction().getAction_info();
			vs.add(s);
		}
		return vs;
	}
	
	public Vector<String> setViewSummonMonster(Player p, Vector<String> vs){
		Vector<Monster> monsters = p.getSummonMonster();
		int vLen = monsters.size();
		if(vLen == 0) vs.add("소환된 몬스터가 없습니다.");
		else{
			for(Monster m : monsters){
				String s = "몬스터이름 : " + m.getName() + " 소모마나 : " + m.getMana()
				+ " hp : " + m.getHp() + " 공격력 : " + m.getAttackPoint()
				+ " 효과 : " + m.getAction().getAction_info() + " 상태 : " + m.getStatus();
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
		vs.add("=====카드 사용하기=====");
		vs.add("내 체력 : " + pTurn.getHp() + "남은 마나 : " + pTurn.getMana());
		
	}
	
	public void actMonster(Player pTurn, Player pEnd){
		
	}
	
	public void playTurn(Player pTurn, Player pEnd, int turnPoint) throws IOException{
		if(turnPoint < 10) pTurn.setMana(turnPoint);
		else pTurn.setMana(10);
		int playerSelect;
		drawingCard(pTurn);
		String[] msgs = {
				pTurn.getPlayer_name() + "님의 " + turnPoint + "번째 턴",
				"나의 체력은 " + pTurn.getHp() + " 마나는  " + pTurn.getMana(),
				"뽑은 카드는 " ,
				"===행동지침을 골라주세요===",
				"0. 턴종료",
				"1. 전장보기",
				"2. 카드 사용",
				"3. 몬스터 조작"
		};
		while(true){
			do{
				println(msgs);
				System.out.print("선택하세요(0~3) : ");
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
