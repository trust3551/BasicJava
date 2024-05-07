package kr.or.ddit.study02.sec04;

import java.util.Scanner;  // ctrl + shift + o 

public class ScanExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		obj.process();
	}
	
	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
		
	}
	
	public void method5() {
		System.out.println("3자리 문자를 입력하세요 ");
		String word = sc.next();
		// Sting -> char
		char ch1 = word.charAt(0);
		char ch2 = word.charAt(1);
		char ch3 = word.charAt(2);
		System.out.println("1번째 문자 : "+ch1);
		System.out.println("2번째 문자 : "+ch2);
		System.out.println("3번째 문자 : "+ch3);
		
		
	}
	
	
	public void method4() {
		
		System.out.print("환전할 달러를 입력하세요 : ");
		String dollor = sc.next();
		double exchangeRate = 1349.88;
		double won = Double.parseDouble(dollor)*exchangeRate;
		int wons = (int)won/10*10;
		
		System.out.println(dollor+"$는 "+wons +"원 입니다.");
		
	}
	
	public void method3() {
		//숫자 2개를 입력 받아 두수를 더하시오.
		System.out.println("숫자를 입력하세요");
		String input = sc.next();
		
		System.out.println("숫자를 입력하세요");
		String input2 = sc.next();
		
		int result = Integer.valueOf(input) + Integer.valueOf(input2);
		System.out.println(input+"+"+input2+"="+result);
		
		
	}
	
	public void method2() {
		System.out.println("숫자를 입력하세요");
		String input = sc.next();
		
		// input을 int로 바꾼후 10을 더하세요
		int num = Integer.parseInt(input)+10;
		System.out.println("10을 더한 결과값 : "+num);
		
		
	}
	
	public void method1() {
		System.out.print("문자를 입력하세요: ");
		String input = sc.next();
		System.out.println("입력 결과 값: "+input);
	}

	
}
