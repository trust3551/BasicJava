package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
		obj.mehtod4();
//		obj.mehtod5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.next();
		
		double a = Double.parseDouble(str);
		int b = (int)(a*100);
		double c = (double)b/100;
		
		System.out.println("소수점 둘째자리까지 출력: "+c);
		
		
	}
	
	public void mehtod2() {
		/*
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex) A-> a  
		 */
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.next();
		
		char c = (char)(s.charAt(0)+32);
		
		System.out.println(c);
		
		
	}
	public void mehtod3() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex) f-> F  
		 */
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.next();
		
		char c = (char)(s.charAt(0)-32);
		
		System.out.println(c);
		
	}
	
	public void mehtod4() {
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String a = sc.next();
		
		char c1 = a.charAt(0);
		char c2 = a.charAt(1);
		char c3 = a.charAt(2);
		
		int i1 = c1 - '0';
		int i2 = c2 - '0';
		int i3 = c3 - '0';
		
		int i = i1+i2+i3;
		System.out.println(i);
		
	}
	
	public void mehtod5() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 */
		
		System.out.println("숫자를 입력하세요.");
		String s = sc.next();
		
		double a = Double.parseDouble(s)*10; //122.623
		
		int b = (int)a;                    // 122
		int c = b+(int)((a-b)*2);       // 123
		double d = c/10.0;
		
		System.out.println(d);
		
//		다른방법 
//		int result = (int)(num+0.05);
		
		
	}
	
	
}
