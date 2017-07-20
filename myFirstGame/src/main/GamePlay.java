package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import card.Card;
import hero.Hero;
import player.Player;

public class GamePlay {
	
	private static Player p1;
	private static Player p2;
	
	public GamePlay() {
		p1 = new Player();
		p2 = new Player();
	}
	
	public String[] setMsgs(String utilType, String msg, int msgsLen) {
		String[] msgs = new String[msgsLen];
		msgs[0] = msg;
		if(utilType.equals("mainMenu")){
			msgs[1] = "0. ��������";
			msgs[2] = "1. player1 ���� �����ϱ�";
			msgs[3] = "2. player1 �� �����ϱ�";
			msgs[4] = "3. player2 ���� �����ϱ�";
			msgs[5] = "4. player2 �� �����ϱ�";
			msgs[6] = "5. player �̸� �����ϱ�";
			msgs[7] = "6. ���� �����ϱ�";
			msgs[8] = "7. ī�� �����ϱ�";
			msgs[9] = "8. ����";
			msgs[10] = "9. �����ϱ�";
		}else if(utilType.equals("heroMenu")){
			msgs[1] = "0. ��������";
			msgs[2] = "1. ������";
			msgs[3] = "2. ��ɲ�";
			msgs[4] = "3. �����";
			msgs[5] = "4. ����";
			msgs[6] = "5. ����̵�";
			msgs[7] = "6. �渶����";
			msgs[8] = "7. �ּ���";
			msgs[9] = "8. ����";
			msgs[10] = "9. ����";
		}else if(utilType.equals("deckMenu")){
			msgs[1] = "0. ��������";
			msgs[2] = "1. �⺻���� ����";
			msgs[3] = "2. �� ���캸��";
			msgs[4] = "3. ī�� �߰��ϱ�";
			msgs[5] = "4. ī�� �����ϱ�";
		}else if(utilType.equals("cardMenu")){
			msgs[1] = "0. ��������";
			msgs[2] = "1. ����ī��";
			msgs[3] = "2. ����ī��";
			msgs[4] = "3. ����ī��";
			msgs[5] = "4. ���ī��";
			msgs[6] = "5. �����ɷ�";
		}
		return msgs;
	}
	
	public void msgsPrintln(String[] msgs) {
		for(String msg : msgs) System.out.println(msg);
	}
	
	public void mainOption(int userSelect) throws IOException{
		int num;
		switch(userSelect){
		case 1 : num = getIntFromSubMenu("heroSelect", p1, 1); setPlayer_hero(p1, num); break;
		case 2 : num = getIntFromSubMenu("deckSelect", p1, 1); break;
		case 3 : num = getIntFromSubMenu("heroSelect", p2, 2); setPlayer_hero(p2, num); break;
		case 4 : num = getIntFromSubMenu("deckSelect", p2, 2); break;
		case 5 : setPlayer_name(); break;
		case 6 : num = getIntFromSubMenu("heroStudy"); getHeroInfo(num); break;
		case 7 : num = getIntFromSubMenu("cardStudy"); getCardInfo(num);break;
		case 8 : System.out.println("������� ^^");
		}
	}
	
	public int getIntFromSubMenu(String menuValue, Player p, int pNum) throws IOException{
		String msg = null;
		int userSelect;
		if(menuValue.equals("heroSelect")){
			if(pNum == 1) msg = "=====player1 ���� �����ϱ�=====";
			else if(pNum == 2) msg = "=====player2 ���� �����ϱ�=====";
			userSelect = selectMenu("hero", msg, 9);
		}else if(menuValue.equals("deckSelect")){
			if(pNum == 1) msg = "=====player1 �� �����ϱ�=====";
			else if(pNum == 2) msg = "=====player2 �� �����ϱ�=====";
			userSelect = selectMenu("deck", msg, 4);
		}else userSelect = -1;
		return userSelect;
	}

	public int getIntFromSubMenu(String menuValue) throws IOException{
		String msg = null;
		int userSelect;
		if(menuValue.equals("heroStudy")){
			msg = "=====����� �����ϱ�=====";
			userSelect = selectMenu("hero", msg, 9);
		}else if(menuValue.equals("cardStudy")){
			msg = "=====ī�� �����ϱ�=====";
			userSelect = selectMenu("hero", msg, 5);
		}else userSelect = -1;
		return userSelect;
	}
	
	public int selectMenu(String menuValue, String msg, int maxNum) throws IOException{
		int userSelect;
		String[] msgs = null;
		if(menuValue.equals("hero")) msgs =setMsgs("heroMenu", msg, maxNum+2);
		else if(menuValue.equals("deck")) msgs = setMsgs("deckMenu", msg, maxNum+2);
		else if(menuValue.equals("card")) msgs = setMsgs("cardMenu", msg, maxNum+2);
		do{
			msgsPrintln(msgs);
			System.out.print("�����ϼ���(0~" + maxNum + " �Է� �� ����) : ");
			userSelect = System.in.read() - '0';
			System.in.skip(2);
		}while(!(userSelect >= 0 && userSelect <= maxNum));
		return userSelect;
	}
	
	public HashMap<String, Object> getMapFromProperties(String utilType){
		Properties pr=new Properties();
		String absPath = GamePlay.class.getResource("").getPath();
		String fPath;
		if(utilType.equals("hero")) fPath = absPath + "heroList.properties";
		else if(utilType.equals("card")) fPath = absPath + "cardType.properties";
		else fPath = null;
		HashMap<String, Object> hm = new HashMap<String, Object>();
		if(fPath != null){
			try {
				FileInputStream fis = new FileInputStream(fPath);
				pr.load(fis);
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Iterator<Object> keys = pr.keySet().iterator();
			while(keys.hasNext()){
				String key = (String)keys.next();
				String value = pr.getProperty(key);
				try {
					Class classValue = Class.forName(value);
					Object obj = classValue.newInstance();
					hm.put(key, obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return hm;
	}
	
	public void setPlayer_hero(Player p, int userSelect){
		HashMap<String, Object> hm = getMapFromProperties("hero");
		Hero hero = (Hero)hm.get("" + userSelect);
		p.setHero(hero);
	}
	
	public void setPlayer_name(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("player1�� �̸��� ���Ͻÿ�(���� �� �����Է�) : ");
			String player_name = br.readLine();
			p1.setPlayer_name(player_name);
			System.out.print("player2�� �̸��� ���Ͻÿ�(���� �� �����Է�) : ");
			player_name = br.readLine();
			p2.setPlayer_name(player_name);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void getHeroInfo(int userSelect){
		HashMap<String, Object> hm = getMapFromProperties("hero");
		Hero hero = (Hero)hm.get("" + userSelect);
		String[] msgs = {"������ �̸� : " + hero.getName(), "������ ���� : " + hero.getJob(), "������ �ɷ� : " + hero.getAbility().getInfo() };
		msgsPrintln(msgs);
	}
	
	public void getCardInfo(int userSelect){
		HashMap<String, Object> hm = getMapFromProperties("card");
		Card card = (Card)hm.get("" + userSelect);
		String[] msgs = null;
		msgsPrintln(msgs);
	}
	
	public static void main(String[] args) throws IOException{
		GamePlay gp = new GamePlay();
		int userSelect;
		String[] msgs = gp.setMsgs("mainMenu", "=====�Ͻ����� �ֹܼ��� ver 0.0=====", 11);
		while(true){
			do{
				gp.msgsPrintln(msgs);
				System.out.print("�Է��Ͻÿ�(0~9) : ");
				userSelect = System.in.read() - '0';
				System.in.skip(2);
			}while(!(userSelect >= 0 && userSelect <= 9));
			if(userSelect == 0){
				System.out.println("������ �� ������ ^^");
				break;
			}
			if(userSelect == 9 && p1.getHero() != null && p1.getPlayer_name() != null && p1.getDeck() != null && 
					p2.getHero() != null && p2.getPlayer_name() != null && p2.getDeck() != null) break;
			else if(userSelect == 9) System.out.println("��� �÷��̾��� �̸�, ��, ������ �������ּ���.");
			gp.mainOption(userSelect);
		}
		if(userSelect == 9){
			
		}
	}
}
