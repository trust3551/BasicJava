package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
		
	}
	
	public void method2() {     // 정말많이쓰임 중요
		// 증감연산자
		// ++ 변수 : 다른 연산을 수행하기 전에 1을 증가시킴
		// 변수 ++ : 다른 연산을 수행한 후에 1을 증가시킴
		// -- 변수 : 다른 연산을 수행하기 전에 1을 감소시킴
		// 변수 -- : 다른 연산을 수행한 후에 1을 감소시킴
		
		int val = 0;
		int res = 0;
		
		val = 10;
//		res = ++val;
		val+=1;
		res = val;
		
		System.out.println("val="+val);
		System.out.println("res="+res);
		
		val = 10;
//		res = val++;
		res = val;
		val+=1;
		
		System.out.println("val="+val);
		System.out.println("res="+res);
		
		val = 10;
		res = --val;

		System.out.println("val="+val);
		System.out.println("res="+res);
		
		val = 10;
		res = val--;

		System.out.println("val="+val);
		System.out.println("res="+res);
	}
	
	public void method1() {
		// 부호 연산자 
		// -, + 
		
		int num = -100;
		int result = -num;
		System.out.println(result);
		
	}
	
}
