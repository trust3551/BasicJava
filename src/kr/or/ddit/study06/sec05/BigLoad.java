package kr.or.ddit.study06.sec05;

public class BigLoad {
	private static BigLoad instance;

	private BigLoad() {
		try {
			Thread.sleep(3000);   // 3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static BigLoad getInstance() {
		if (instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}
	
}
