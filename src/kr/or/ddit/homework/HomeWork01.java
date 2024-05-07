package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		// 기준일로 부터 지난 시간
		long time = date.getTime();
		System.out.println(time);
		
		int a = 365;  // 일
		int b = 24;   // 시간
		int c = 60;   // 분,초
		int d = 1000; // ns
		
		// 기준일로부터 ?년 ?일 ?시 ?분 ?초 지났습니다.
	
		long year = time / d / c / c / b / a;          //년
		long years = time - year * d * c * c * b * a;  //년도 구하고 나머지값
		
		long day = years / d / c / c / b;              //일
		long days = years - day * d * c * c * b ;      //일수 구하고 나머지값
		
		long hour = days / d / c / c;                 //시간
		long hours = days - hour * d * c * c;         //시간 구하고 나머지값
		
		long min = hours / d / c ;                    //분
		long mins = hours - min * d * c;              //분 구하고 나머지값
	
		long sec = mins / d ;
		
		System.out.println("기준일로부터 "+year+"년 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초 지났습니다.");
		
		// 답안
//		long sec =1000;
//		long min = sec*60;
//		long hour = min*60;
//		long day = hour*24;
//		long year = day*365;
//		
//		long years= time/year;
//		time = time-year*year;
//		
//		long days = time/day;
//		time = time-day*day;
//		
//		long hours = time/hour;
//		time = time-day*hours;
//		
//		long mins = time/min;
//		time = time-day*mins;		
//		
//		long secs = time/sec;
//		time = time-day*secs;		
		
		
		
		
		
	}
}
