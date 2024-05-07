package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}

	public void process() {
//		0 -> 가위, 
//		1 -> 바위
//		2 -> 보
//		
//		컴퓨터가 랜덤으로 내는 가위 바위 보랑
//		내가 입력한 가위 바위 보를 비교하여 승패를 출력하시오
//		if 문 사용
//		ex) 컴퓨터 : 가위, 사람: 보, 결과 : 졌다 이겼다 비겼다.
		
		System.out.println("숫자를 입력하세요.");
		int na = sc.nextInt();
		int com = new Random().nextInt(3);
		
		String a ="";						// 숫자를 한글로 바꾸기
		String b ="";
		
		if(na==0) a="가위";					// a 나
		else if(na==1) a="바위";
		else a="보";
		
		if(com==0) b="가위";				// b 컴
		else if(com==1) b="바위";
		else b="보";
		
		if(na==com) {
			System.out.println("컴퓨터 : "+ b + ", 사람 : "+ a + ", 결과 : 비겼다.");		
			}
		else if((com==0 && na==2 )||(com==1 && na==0)||(com==2 && na==1)) {
			System.out.println("컴퓨터 : "+ b + ", 사람 : "+ a + ", 결과 : 졌다.");
		}
		else {
			System.out.println("컴퓨터 : "+ b + ", 사람 : "+ a + ", 결과 : 이겼다. ");
		}
		
	}
}
