package kr.or.ddit.homework.HomeWork16;

import java.util.Random;
import java.util.Scanner;


public class StageC extends Stage {
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void game() {
		
		HomeWork16.money-=10000;
		System.out.println(HomeWork16.money);
		System.out.println("숫자를 입력하세요.");
		int na = sc.nextInt();
		int com = (new Random().nextInt(6)+1);
		
		System.out.println("나 : "+na+", 컴퓨터 : "+com);
		if(na==com) {
			System.out.println("맞췄다.");
			HomeWork16.money+=100000;
		}
		if(na!=com) {
			System.out.println("틀렸다.");
		}
		
	}
	@Override
	public void gameMoney() {
		
	}
	
}
