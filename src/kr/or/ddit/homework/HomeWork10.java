package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork10 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HomeWork10 obj = new HomeWork10();
		obj.process();
		
	}
	
	public void process() {
		Student[] stuList = new Student[100];
		int cur = 0;
		while(true) {
			System.out.println("1.학생추가");
			System.out.println("2.전체출력");
			System.out.println("3.종료");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("지역, 이름, 나이 입력.");
				String region = sc.next();
				Student stu;   // 만든 생성사 stu에 저장
				
				// 지역을 입력받고 지역이 대전이라면
				// 파라미터 "이름","나이" 인 생성자
				if(region.equals("대전")) {
					String name = sc.next();
					int age = sc.nextInt();
					 stu = new Student(name,age);
					
				}else {
					// 지역이 대전이 아니라면 "지역","이름","나이" 인 생성자 호출
					String name = sc.next();
					int age = sc.nextInt();
					stu = new Student(region,name,age);
				}
				stuList[cur++]=stu;
			}
			if(sel ==2) {
				for(int i=0; i<cur; i++) {
					System.out.println(stuList[i]);
				}
			}
			if(sel ==3)break;
		}
	}
}

class Student{
	// 나라, 지역, 이름, 나이필드
	String nation, region, name;
	int age;
	
	public Student(String name, int age) {
		this("대전",name,age);
	}
	
	public Student(String region,String name,int age) {
		this("대한민국",region,name,age);
	}
	
	public Student(String nation,String region,String name,int age) {
		this.nation = nation;
		this.region = region;
		this.name = name;
		this.age = age;
	}
	//toString 메소드 만들기 

	@Override
	public String toString() {
		return "Student [nation=" + nation + ", region=" + region + ", name=" + name + ", age=" + age + "]";
	}
	
}
