package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal1 = new Calculator();
		
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("연산자를 입력하세요.");
		String oper = sc.next();
		System.out.println("숫자를 입력하세요.");
		int b = sc.nextInt();
		
		double result = cal1.cal(oper, a, b);
		
		System.out.println(a+oper+b +"="+result);
	}
}
