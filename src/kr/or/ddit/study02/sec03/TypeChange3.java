package kr.or.ddit.study02.sec03;

public class TypeChange3 {
	public static void main(String[] args) {
		String str = "10";
		int num = Integer.parseInt(str);
		System.out.println(num+3);
		
		// String -> 기본타입
		// 기본타입(대문자).parser기본타입();
		// Long.parseLong();
		// Double.parseDouble();
		// Integer.parseInt();
		
		// String -> byte
		String str1 = "10";
		byte b1 = Byte.parseByte(str1);
		System.out.println("String->byte "+b1);
		
		// String -> short
		String str2 = "100";
		short b2 = Short.parseShort(str2);
		System.out.println("String->Shorts "+b2);
		
		// String -> int
		String str3 = "1000";
//		int b3 = Integer.parseInt(str3);
		int b3 = Integer.valueOf(str3);               // 똑같음 편한걸로
		System.out.println("String->int "+b3);
		
		// String -> long
		String str4 = "10000";
		long b4 = Long.parseLong(str4);
		System.out.println("String->long "+b4);
		
		// String -> float;
		String str5 = "0.05";
		float b5 = Float.parseFloat(str5);
		System.out.println("String->float "+b5);
		
		// String -> double;
		String str6 = "2.11";
		double b6 = Double.parseDouble(str6);
		System.out.println("String->double "+b6);
		
	}
}
