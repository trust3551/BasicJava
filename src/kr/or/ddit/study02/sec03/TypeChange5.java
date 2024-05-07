package kr.or.ddit.study02.sec03;

public class TypeChange5 {
	public static void main(String[] args) {
		// 소수점 버림 
		double d = 10.1231;
		System.out.println("원래숫자 : "+d);

		int i10 = (int)(d*10);
		double d10 = (double)i10/10;
		
		System.out.println("소수점 첫째자리 출력: "+d10);	
		
		
		int i100 = (int)(d*100);
		double d100 = (double)i100/100;
		
		System.out.println("소수점 둘째자리 출력: "+d100);	
		
		
//		double d1 = (double)((int)(d*10))/10;
//		System.out.println("소수점 첫자리 출력: "+d1);
		
		
	}
}
