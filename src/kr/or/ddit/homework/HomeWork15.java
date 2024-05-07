package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork15 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();
	}

	public void process() {
		Calendar cal = Calendar.getInstance();
		
		while(true) {
			// 첫날의 요일 구하기
			cal.add(Calendar.MONTH, 0);  // 3월부터 
			cal.set(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			
			// 이번달에 마지막날짜 구하기
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	
			//출력
			System.out.println("<이전달---------------"+cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월-----------------다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("----------------------------------------------------");
			for (int i = 1; i < day; i++) {      // day보다 작으면 빈칸 반복 
				System.out.print("\t");
			}
			for (int i = 1; i <= lastDay; i++) {  // last day 까지 숫자표시 반복
				System.out.print(i+"\t");
				
				if (day%7==0) {					// 일주일이 지나면 줄바꿈
					System.out.println();	
				}
				day++;							// 반복시 하루씩 늘어남
			}
			System.out.println();
			
			// < 이전달     다음달>
			System.out.println("입력");
			String str = sc.next();
			
			if (str.equals(">")) {
				cal.add(Calendar.MONTH, 1);
			}
			else if (str.equals("<")) {
				cal.add(Calendar.MONTH, -1);
			}
		}
	}
}











