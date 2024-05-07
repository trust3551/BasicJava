package kr.or.ddit.study02.sec04;

import java.util.Random;
import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Test obj = new Test();
		obj.process();
	}

	public void process() {
		System.out.println("숫자를 입력하세요");
		int na = sc.nextInt();
		int com = new Random().nextInt(3);
		
		String a ="";
		String b ="";
		
		if(na==0) a+="가위";
		else if(na==1) a+="바위";
		else a+="보";
		
		if(com==0) b+="가위";
		else if(com==1) b+="바위";
		else b+="보";
		
		System.out.println(a+b);
	}
	
	
}
