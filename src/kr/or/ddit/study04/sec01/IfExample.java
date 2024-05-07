package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
		
		
	}
	
	public void method6() {
		// 점수를 입력받고 학점을 출력하세요.
		// 90 이상 A,  
		// 80 이상 B
		// 70 이상 C
		// 60 이상 D
		// 60 미만 F
		// 끝자리가
		// 0~2 -
		// 3~6 0
		// 7~9 +
		
		int score = sc.nextInt();
		String grade = "";
		if(score == 100) grade = "A+";
		else if(score>=90) {
			grade="A";
		}
		else if(score>=80) {
			grade="B";
		}
		else if(score>=70) {
			grade="C";
		}
		else if(score>=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		
		if(score>60 && score !=100) {
		
		if(score%10<2) {
			grade +="-";
		}
		else if(score%10<=6) {
			grade +="0";
		}
		else if(score%10<=9) {
			grade +="+";
		}
		
	  }
		System.out.println(grade);
		
	}
	
	
	public void method5() {
		// 키와 체중을 입력받아 BMI 지수를 구하고
		// BMI 지수에 따른 정상, 과체중, 비만, 고도비만 정보를 출려하시오.
		// BMI 지수 = 체중(kg)/키(m)*키
		// 왼쪽은 포함 오른쪽은 포함x
		// 0~18.5      : 저체중
		// 18.5~23   : 정상
		// 23.0~25   : 과체중
		// 25.0~30   : 비만
		// 30이상              : 고도비만
		
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.println("키 : ");
		double key = sc.nextDouble();
		
		// key 값이 100보다 크다면 100 나눠주기   // 명령문이 한줄일 경우에는 생략가능
		if(key>100) key /=100;
			
		
		double bmi = weight/key/key;
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}
		else if(bmi<23) {
			System.out.println("정상");
		}
		else if(bmi<25) {
			System.out.println("과체중");
		}
		else if(bmi<30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도비만");
		}
		
		
	
		
		
		
	}
	
	
	
	public void method4() {
		// 월을 입력 받아 봄(3~5) 여름(6~8) 가을(9~11) 겨울(11~2)을 출력하시오
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		if(month ==3 || month==4 || month==5) {     // 왼쪽이 참이면 오른쪽을 체크하지 않는다
			System.out.println("봄");
		}
		if(month ==6 || month==7 || month==8) {
			System.out.println("여름");
		}
		if(month ==9 || month==10 || month==11) {
			System.out.println("가을");
		}
		if(month ==12 || month==1 || month==2) {
			System.out.println("겨울");
		}
		
		
	}
	
	public void method3() {
		// 점수를 입력받고 학점을 출력하세요.
		// 90 이상 A,  
		// 80 이상 B
		// 70 이상 C
		// 60 이상 D
		// 60 미만 F
		System.out.println("점수를 입력하시오.");
		int a = sc.nextInt();
		
		if(a>=90) {
			System.out.println("A학점");
		}
		else if(a>=80) {
			System.out.println("B학점");
		}
		else if(a>=70) {
			System.out.println("C학점");
		}
		else if(a>=60) {
			System.out.println("D학점");
		}
		else{
			System.out.println("F학점");
		}
		
	}
	
	public void method2() {
		// 점수를 입력받아 60점 이상이면 합격 아니면 불합격
		System.out.println("점수를 입력하시오.");
		int a = sc.nextInt();
		
//		if(a>=60) {                              // if문 사용
//			System.out.println("합격");
//		}
//		if(a<60) {
//			System.out.println("불합격");
//		}
		
		if(a>=60) {          					// if,else 사용 
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		
		
	}
	
	public void method1() {
		if(false) {
			System.out.println("IF안 실행문");
		}
		
		System.out.println("IF밖 실행문");
	}
}
