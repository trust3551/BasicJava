package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType3 obj = new ReferenceType3();
		obj.process();
	}

	public void process() {
		method1();
		
	}
	
	public void method1() {
		int a = 10;
		//1   stack에 a = 10
		{
			int b = 12;
			int[] c;
			//2  stack에 b =12 , int c [] 생김
			c = new int[] {1,2,3};
			//3 stack  c 에 주소값
		}
		//4 stack에  b,c 사라짐
		String d  = "test";
		//5 heap에 test , stack 에 주소값 200
		{
			String[] e = new String[3];
			//6  heap 에 공간 3개생김, stack 에 string e=  주소값
			e[0] = d;
			//7  heap 300: 주소값 200 
			String f = "test2";
			//8 heap 에 test2 , stack 에 string f = 주소값
			e[1] = f;
			//9  
			e[2] ="test";
			//10
		}
	}
	
}
