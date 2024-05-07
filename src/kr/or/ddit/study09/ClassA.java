package kr.or.ddit.study09;

public class ClassA {
	int a = 10;
	
	public static void main(String[] args) {
		// ClassA 에 a값 호출해보기
		ClassA classA = new ClassA();
		System.out.println(classA.a);
		
		// ClassB 에 b값 호출해보기
		ClassB classB = classA.new ClassB();
		System.out.println(classB.b);
		
		// ClassC 에 c값 호출해보기
		ClassC classC = new ClassA.ClassC();
		System.out.println(classC.c);
	}
	
	class ClassB{
		int b = 11;
		
	}
	
	static class ClassC{
		int c = 12;
	}
}
