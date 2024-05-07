package kr.or.ddit.study11;

import java.util.Scanner;

public class StringExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
		method9();
	}
	
	public void method9() {
		System.out.println("계속 하시겠습니다(y/n)");
		String yn = sc.next();
//		if(yn.equals("y")) {
		if(yn.equalsIgnoreCase("y")) { //소문자나 대문자 상관없이 인식 y
			System.out.println("계속");
		}
		else if(yn.equals("n")){
			System.out.println("종료합니다.");
		}
	}
	
	public void method8() {
		String str = null;
		if(str == null || str.isEmpty()) {
			System.out.println("빈 문자열");
		}
	}
	
	public void method7() {
		String test = "문자열 test 입니다.";
		if(test.contains("test")) {
			System.out.println("test 문자가 포함되어 있다.");
		}
	}
	
	public void method6() {
		String str = "Book1.csv";
		if(str.startsWith("Book1")) {               // ~로 시작
			System.out.println("Book1로 시작합니다.");
		}
		if(str.endsWith(".csv")) {					// ~로 끝
			System.out.println(".csv로 끝납니다.");
		}
	}
	
	public void method5() {
		String str ="12378456";
		str = str.substring(0,5); //(0번자리부터 5개)
		System.out.println(str);
	}
	
	public void method4() {
		String str = "ooo 바보 바보 바보 ";
		str = str.replace("바보", ""); // 원하는 글자를 바꿀수 있음
		System.out.println(str);
		
	}
	
	public void method3() {
		String space = " a b c \n\n\r"; 
		System.out.println(space);
		space = space.trim(); 		// 앞과 뒤의 공백 제거
		System.out.println(space);
	}
	
	public void method2() {
		String test = "a, b, c";
		String[] tokens = test.split(","); // 괄호안의 문자를 기준으로 쪼개줌
		for(String token : tokens) {
			token = token.trim();
			System.out.println(token);
		}
		
	}
	
	public void method1() {
		String test ="aBcD";
		
		
		test = test.toUpperCase(); //대문자로 바꿔준다
		System.out.println(test);

		test = test.toLowerCase(); //소문자로 바꿔준다
		System.out.println(test);

		if(test.equals("abcd")) {
			System.out.println("같다");
		}
	}
}
