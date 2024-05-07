package kr.or.ddit.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);
	Member[] memList = new Member[100];
	int cur = 0;

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	public void process() {
		while(true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			int sel = sc.nextInt();
			if(sel==1) {
				addMember();
			}
			if(sel==2) {
				removeMember();
			}
			if(sel==3) {
				updateMember();
			}
			if(sel==4) {
				printMemberList();
			}
		}
	}
	

	public void addMember() {
		String id;
		String pass;
		String name;
		String nickName;
		int age;
		
		// id 입력시 4~8자 입력 받을것.
		while(true) {
			try {
				System.out.println("ID를 입력하세요.");
				id = sc.next();
				idCheck(id);	
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		// pass 입력시 4~8자 입력
		while(true) {
			try {
				System.out.println("비밀번호를 입력하세요.");
				pass = sc.next();
				passCheck(pass);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		// name 입력시 2~5자 입력 
		while(true) {
			try {
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				nameCheck(name);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		 
		// nickName 2~8자 입력시 욕설등 금지어 체크
		while(true) {
			try {
				System.out.println("닉네임을 입력하세요.");
				nickName = sc.next();
				nickNameCheck(nickName);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		// age 숫자 입력 체크
		while(true) {
			try {
				System.out.println("나이를 입력하세요.");
				age = sc.nextInt();
				ageCheck(age);
				break;	
			} 
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
			}		
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			sc.nextLine();
			continue;		
		}
		
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("====================");
		
		Member m1 = new Member();
		m1.setName(name);
		m1.setAge(age);
		m1.setId(id);
		m1.setNickName(nickName);
		m1.setPass(pass);
		memList[cur]=m1;
		cur++;
	}
	
	public void idCheck(String id) throws Exception {
		if(id.length() <4 || id.length()>8) {
			throw new Exception("4~8자리 아이디를 다시 입력해주세요.");
		}	
	}
	public void passCheck(String pass) throws Exception{
		if(pass.length()<4 || pass.length()>8) {
			throw new Exception("4~8자리 비밀번호를 다시 입력해주세요.");
		}
	}
	public void nameCheck(String name) throws Exception{
		if(name.length()<2 || name.length()>5) {
			throw new Exception("2~5자리 이름을 다시 입력해주세요.");
		}
	}
	public void nickNameCheck(String nickName) throws Exception{
		if(nickName.length()<2 || nickName.length()>8 || nickName.contains("바보")) {
			throw new Exception("욕설이 포함되어있거나 2~8자리 닉네임을 다시 입력해주세요.");
		}
	}
	public void ageCheck(int age) throws Exception{
		if(age<=0)
			throw new Exception("나이를 다시 확인해주세요.");
	}
	
	
	public void removeMember() {
		Member[]temp = new Member[100];
		System.out.println("삭제할 회원 번호를 입력하세요.");
	int num = sc.nextInt();
	int add =0;
	for(int i = 0; i<cur; i++) {
		if(i==num) add++;
		temp[i] = memList[i+add];
	}
	memList = temp;
	cur--;
	printMemberList();
	}
	

	public void updateMember() {
		String id;
		String pass;
		String name;
		String nickName;
		int age;

		System.out.println("수정할회원번호");
		printMemberList();
		
		int num = sc.nextInt();
		Member member = memList[num];
		
		// id 입력시 4~8자 입력 받을것.
		while(true) {
			try {
				System.out.println("수정할 ID를 입력하세요.");
				id = sc.next();
				idCheck(id);	
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		// pass 입력시 4~8자 입력
		while(true) {
			try {
				System.out.println("수정할 비밀번호를 입력하세요.");
				pass = sc.next();
				passCheck(pass);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		// name 입력시 2~5자 입력 
		while(true) {
			try {
				System.out.println("수정할 이름을 입력하세요.");
				name = sc.next();
				nameCheck(name);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		 
		// nickName 2~8자 입력시 욕설등 금지어 체크
		while(true) {
			try {
				System.out.println("수정할 닉네임을 입력하세요.");
				nickName = sc.next();
				nickNameCheck(nickName);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		// age 숫자 입력 체크
		while(true) {
			try {
				System.out.println("수정할 나이를 입력하세요.");
				age = sc.nextInt();
				ageCheck(age);
				break;	
			} 
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
			}		
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	
			continue;		
		}
		
		

		
		member.setName(name);
		member.setAge(age);
		member.setId(id);
		member.setPass(pass);
		member.setNickName(nickName);

	}
	
	public void printMemberList() {
		for (int i=0; i<cur; i++) {
			Member member = memList[i];
			// get 메소드를 이용하여 출력
			System.out.println("회원번호 : "+i+",\t이름 : "+member.getName()+",\t나이 : "
			+member.getAge()+",\t닉네임 : "+member.getNickName()+",\tID : "+member.getId()+",\t비밀번호 : "+member.getPass());
			
		}
	}
}
	


class Member{
	private String id;
	private String pass;
	private String name;
	private String nickName;
	private int age;
	
	// Getter Setter
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

