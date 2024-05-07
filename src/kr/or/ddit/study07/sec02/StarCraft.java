package kr.or.ddit.study07.sec02;

import java.util.Scanner;

public class StarCraft {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StarCraft obj = new StarCraft();
		obj.process();
	}

	public void process() {
		while(true) {
			System.out.println("1.뮤탈");
			System.out.println("2.질럿");
			Unit unit = null;
			int sel = sc.nextInt();
			if(sel ==1) unit = new Mutal();
			if(sel ==2) unit = new Zealot();
			
			System.out.println("1.이동");
			System.out.println("2.공격");
			
			sel = sc.nextInt();
			if(sel==1) unit.move();
			if(sel==2) unit.attack();
		}
		
	}
}
