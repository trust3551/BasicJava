package kr.or.ddit.study06.sec03;

public class Point {
	int x;
	int y;
	
	
	
	//기본생성자 x
	
	// 생성자 x y 파라미터로
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+", "+y+")";
	}
}
