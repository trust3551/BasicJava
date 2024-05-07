package kr.or.ddit.study06.sec03;

public class Food {
	
	// 제조년
	int manuYear;
	int lastYear;
	String name;
	int price;
	
	// 기본생성자
	public Food() {
		
	}
	
	// manuYear name price
	// lastYear 값은 입력 받은 제조년에서 3년 추가할것
	public Food(int manuYear,String name,int price) { // 파라미터
		this.manuYear = manuYear;
		lastYear = manuYear+3; // 파리미터에 없으면 생략가능 this.
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Food [manuYear=" + manuYear + ", lastYear=" + lastYear + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
