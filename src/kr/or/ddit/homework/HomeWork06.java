package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
			
	}
	
	public void method4() {
//		양의 정수 n이 매개변수로 주어질때
//		n이 홀수라면 n 이하의 홀수인 모든 양의 정수 합
//		->  n = 5
//		     1 + 3 + 5 = 9
//		n이 짝수라면 n 이하의 짝수인 모든 양의 정수제곱의 합
//		->  n = 4  
//		    2*2 + 4*4 = 20
//		   
		
//		System.out.println("입력");    // 입력받아서 테스트해볼때
//		int n = sc.nextInt();
		
		int n =(int)(Math.random()*100)+1;
		int sum = 0;
		
		if(n%2==1) {
		for(int i=0; i<=n; i++) {
			if(i%2==1) {
				sum+=i; //  sum=sum+i
				}
			}
		System.out.println("n = "+n);
		System.out.println("n이하의 홀수의 합 : "+sum);
		}
		
		else if(n%2==0) {
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
				sum+=(i*i); //sum=sum+(i*i);
				}
			}
		System.out.println("n = "+n);
		System.out.println("n이하 짝수의 제곱의 합: "+sum);
		}
	}			
		
	
	public void method3() {
		// 구구단 전체출력 for 문 2개 이용하여 
		// 2*1 = 2  3*1 = 3  4*1 = 4......   오른쪽까지 쭉 출력 후 println
		// 3 입력시 3단을 제외하고 표시 2번이랑 똑같음
		
		System.out.println("숫자를 입력하세요.");
		int c = sc.nextInt();
		
		for(int b=1; b<=9; b++) {
			for(int a=2; a<=9; a++) {
				if(c!=a)
				System.out.print(a+" * "+b+" = "+a*b+"\t");	
				}
			System.out.println();
			}	
	}
		
	public void method2() {
		// 구구단 전체출력 for 문 2개 이용하여 
		// 2*1 = 2  3*1 = 3  4*1 = 4......   오른쪽까지 쭉 출력 후 println	
		for(int b=1; b<=9; b++) {
			for(int a=2; a<=9; a++) {
				System.out.print(a+" * "+b+" = "+a*b+"\t");				
				}
			System.out.println();
			}	
		}
	
	public void method1() {
		// 스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단을 출력하시오
		// 2~9단 외에 입력하면 잘못입력했습니다 출력
		
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		
		if(a==0 || a==1 || a>=10) {
			System.out.println("잘못입력했습니다.");	
		}else {
		for(; a<=9; a++) {
			System.out.println("===="+a+"단====");
			for(int b=1; b<=9; b++) {
				System.out.println(a+" * "+b+" = "+ a*b);
			}
			break;
		}
		}
	}
}
