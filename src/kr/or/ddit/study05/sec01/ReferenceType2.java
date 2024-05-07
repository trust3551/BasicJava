package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType2 obj = new ReferenceType2();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
	}
	
	public void method2() {
		
//		String a = "";  힙영역에 있고 값이 없음
		String a = null; // 참조타입에 연결된게 없음
		
//		if(a == null || a.isEmpty()) {
//			System.out.println("빈 문자열");
//		}

		if(a.isEmpty() || a == null) {           // if 왼쪽부터 계산 , 연결자체가 안되어있기 떄문에 에러발생
			System.out.println("빈 문자열");
		}
		
	}
	
	public void method1() {
		int a = 10;
		//1
		int b = 15;
		{	//2
			String c = "test";
			//3
		}
			//4
			String d = "test";
		{
			int e = 4;	
			//5
			{
				int f = 10;
				//6
			}
			int g = 3;
			//7
			d = "test2";
			//8
		}
	}
}
