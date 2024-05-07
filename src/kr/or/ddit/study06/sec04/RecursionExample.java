package kr.or.ddit.study06.sec04;

import java.util.Date;
import java.util.Scanner;

public class RecursionExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RecursionExample obj = new RecursionExample();
		obj.process();
	}

	public void process() {
//		method(5);
//		int add = add(5);
//		System.out.println(add);
//		
//		int rhq = rhq(5);
//		System.out.println(rhq);
		
		Date d1 = new Date();
		// 50 26237
//		long fibo = fibonacci(100);
		long fibo = fibo2(100);
		Date d2 = new Date();
		System.out.println(d2.getTime()-d1.getTime());
		System.out.println(fibo);
	}
	
	long[] fiboList = new long[3000];
	
	
	public long fibo2(int num) {
		if(num==2) return 2;
		if(num==1) return 1;
		
		if(fiboList[num] != 0) {
			return fiboList[num];
		}
		
		long result = fibo2(num-1) + fibo2(num-2);
		fiboList[num] = result;
		return result;
	}
	
	// f7 => f6 f5
	// f6 => f5 f4
	// f5 => f4 f3
	
	//1 2 3 5 8 13 21 
	//1+2=>3
	//2+3=>5
	public long fibonacci(int num) {
		if(num==2) return 2;
		if(num==1) return 1;
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	// 5*4*3*2*1
	public int rhq(int num) {
		if(num==1) return 1;
		return num*rhq(num-1);
	}
	
	
	// 5 -> 5+4+3+2+1 결과값을 리턴하세요
	public int add(int num) {
		if(num==1) return 1;
		return num+add(num-1);
		
	}
	
	public void method(int num) {
		System.out.println(num);
		if(num>0) {
			method(num-1);			
		}
	}
}
