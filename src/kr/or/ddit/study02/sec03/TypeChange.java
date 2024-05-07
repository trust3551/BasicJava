package kr.or.ddit.study02.sec03;

public class TypeChange {
	public static void main(String[] args) {
		int a = 500;  // 500초
		int b = 60;
		
		int min = a/b; //분
		int sec = a-min*b;
		System.out.println(min+","+sec);
		
	}
}

