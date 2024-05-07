package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork11 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11 obj = new HomeWork11();
		obj.process();
	}

	public void process() {
		Deck deck = new Deck();
		deck.suffle();
		deck.printCardList();  // 잘섞였는지 확인 후 주석처리
		
		// 내카드랑 랜덤 카드랑 비교해서 
		// 숫자가 높다면 이김 , 같거나 작으면 컴이 이김
		Card myCard = deck.getCard(0);
		// 컴퓨터 카드 랜덤 카드
		int ran_com = new Random().nextInt(52);
		Card comCard = deck.getCard(ran_com);
		print(myCard,comCard);
		
	}
	public void print(Card my, Card com) {
		// 결과값 출력
		// 내카드 ♤ 1 컴퓨터 ◇5
		// 결과 : lose
		String result = "Lose";
		int my_num = my.num;
		int com_num = com.num;
		if(my_num > com_num) {
			result = "Win";
		}else if (my_num == com_num) {
			result = "draw";
		}
		System.out.println("내카드 : " + my + "컴퓨터 카드 : " +com+"결과"+result);

	}
	
}
	class Card{
		String type; // 카드모양
		int num;     // 카드번호
		
		// 생성자 type, num 입력할것.
		public Card(String type, int num) {
			this.type = type;
			this.num = num;
		}

		@Override
		public String toString() {
			// type ♤♡◇♧
			// num 1~13
			// 1 => a 로 출력
			// 11 => J, 12=> Q, 13 => K
			
			String result=type+num;
			if(num == 1) result = type+"A";
			if(num == 11) result = type+"J";
			if(num == 12) result = type+"Q";
			if(num == 13) result = type+"K";
			return result;
		}
	
	}
	
	class Deck{                    //class Deck 생성
		Card[] cardList;		
		public Deck() {
			cardList = new Card[52];
			String[] type = {"♤","◇","♡","♧"};
			int cnt = 0;
			for(String t : type) {
				for(int i=1; i<=13; i++) {
					cardList[cnt++] = new Card(t,i); // type, num  값
				}
			} 
		} 
		
		public void suffle() {
			// 카드섞기
			Card[] temp = new Card[1];
			for (int i = 0; i < 10000000; i++) {
				int ran = new Random().nextInt(cardList.length);
				temp[0] = cardList[0];
				cardList[0] = cardList[ran];
				cardList[ran] = temp[0];		
			}

		}
		
		public void printCardList() {
			for(int i=0; i<cardList.length; i++) {
				System.out.print(cardList[i]+"\t");
				if(i%10-9 == 0) {
					System.out.println();
				}
			}
		}
		public Card getCard(int ran) {
			return cardList[ran];
		}
		
		
	}
