package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork20 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork20 obj = new HomeWork20();
		obj.process();
	}

	
	Map<String, Student2> data = new HashMap();
	
	String loginId = null;
	
	public void process() {
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정 ");
			System.out.println("4. 내정보 출력");
			System.out.println("5. 로그인 ");
			System.out.println("6. 로그아웃 ");
			int sel = sc.nextInt();
			if(sel == 1) {
				insert();
			}
			if(sel ==2 ) {
				
			}
			if(sel ==3) {
				
			}
			if(sel ==4) {
				
			}
			if(sel ==5) {
				
			}
			if(sel ==6) {
				
			}
		}
	}
	
	public void insert() {
		// id 중복 체크 
		while(true) {
		
		System.out.println("아이디를 입력하세요.");
		String id = sc.next();
		
		
		System.out.println("비밀번호를 입력하세요.");
		String pass = sc.next();
		System.out.println("이름을 입력하세요.");
		String name = sc.next();

		}
	
	
	}
	
	public void delete() {
		// 로그인 후 id pass 같을 경우 회원 탈퇴 
	}
	
	public void update() {
		// 로그인 후 id pass 같을 경우 수정 
	}
	
	public void print() {
		// 로그인 후 id pass 같을 경우 수정 
	}
	
	public void login() {
		// 로그인 
		
	}
	
	public void logout() {
		// 로그 아웃 
		loginId = null;
		
	}
	
	
}
class Student2{
	String id;
	String pass;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
