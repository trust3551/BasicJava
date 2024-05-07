package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork13 {
	
	public static void main(String[] args) {
		/*
		 *  예약 시스템.
		 */
//		Reserve reserve = Reserve.getInstance();
//		reserve.reservation(name);
//		reserve.complete();
		
		Scanner sc = new Scanner(System.in);     
		Reserve res = Reserve.getInstance();	// Reserve 사용위해 res
	
		while(true) {								// 반복문시작
//			Reserve res = null;
			System.out.println("1. 예약");
			System.out.println("2. 예약자 삭제");
			System.out.println("3. 종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("예약자 이름을 입력해주세요.");
				String name = sc.next();
				res.reservation(name);
			}
			if(sel == 2) {
				res.complete();
			}
			if(sel == 3) {
				break;
			}
		}
		
		
	}
}
class Reserve{
	 private String  name;
	 private boolean reserve;
	
	// 싱글톤 적용하기
	private static Reserve instance;

	public static Reserve getInstance() {
		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
		private Reserve() {
			reserve = false;
	}

	/*
	 *  예약하는 메소드 만들기 
	 *  이미 예약되어있다면 "예약이 되어있습니다." 출력 
	 *  아니면 예약에 name ="예약 할사람 이름", 
	 *            reserve = true;
	 */
	
	public void reservation(String name) {
		if(reserve == true) {
			System.out.println("예약이 되어있습니다.");
		}else if(reserve == false) {
			this.name = name;
			reserve = true;
			System.out.println("예약 접수 완료");
		}
	}
	/*
	 * 예약 처리 하는 메소드 만들기.
	 * name = null; 
	 * resever = false; 
	 * 
	 * "예약된 사람 이름" 님 처리 완료되었습니다.
	 */
	public void complete() {
		if(reserve == false) return;
		System.out.println(name + "님 처리 완료되었습니다.");
		name = null;
		reserve = false;

	}
	
}
