package kr.or.ddit.study06.sec06;

public class AcessMain {
	public static void main(String[] args) {
		AcessPrivate ap = new AcessPrivate();
		
		AcessDefault as = new AcessDefault();
		int a = as.a;
		as.defaultMethod1();
		
		AcessProtect ap2 = new AcessProtect();
		int a2 = ap2.a;
		
		AcessPublic ap3 = new AcessPublic();
		int a3 = ap3.a;
		ap3.publicMethod();
		
		
	}
}
