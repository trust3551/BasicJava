package kr.or.ddit.Atest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DAL {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DAL obj = new DAL();
		obj.process();
	}

	public void process() {
		Calendar cal = Calendar.getInstance();
		while(true) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			System.out.println("--------------------"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월------------------------");
			System.out.println("<이전달\t\t\t\t\t\t다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
				
			// <이전달   다음달>
			cal.set(Calendar.DATE,1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
//			System.out.println("요일"+day);
			
			// 이번달에 마지막일
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//			System.out.println(lastDay);
			
			int currentDay = 1;
			
			for(int i =0; i<=42; i++) {
				if(i < day) {
					System.out.print("\t");
				} else {
					System.out.printf("%02d\t",currentDay);
					currentDay++;
				}
				if(i % 7 == 0) {
					System.out.println();
				}
				if(currentDay > lastDay) {
					break;
				}
			}
			
			
			
			
			
			String str = sc.next();
			
			
		}
	}
}
