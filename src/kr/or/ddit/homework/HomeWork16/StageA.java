package kr.or.ddit.homework.HomeWork16;

import java.util.Random;
import java.util.Scanner;

public class StageA extends Stage {
Scanner sc = new Scanner(System.in);

	@Override
	public void game() {
		System.out.println("홀(0),짝(1)을 입력하세요.");
		int na= sc.nextInt();
		int com = new Random().nextInt(1);
		
		String a ="";						// 숫자를 한글로 바꾸기
		String b ="";
		if(na==0) a="홀";
		else if(na==1) a="짝";
		
		if(com==0) b="홀";
		else if(com==1) b="짝";
		
			
		System.out.println("나 :  " + a + ", 컴퓨터 : "+ b);
		
		if(na==com) {
			System.out.println("맞췄다.");
		}
		if(na!=com) {
			System.out.println("틀렸다.");
		}
		
	}

	@Override
	public void gameMoney() {
		
	}
	
}
