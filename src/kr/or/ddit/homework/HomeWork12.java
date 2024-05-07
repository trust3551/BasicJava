package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork12 obj = new HomeWork12();
		obj.process();

	}

	public void process() {


		// 로또범위를 1~8 당첨확인
		//
		int money = 1000000;
		while (true) {
			System.out.println("보유금액 : " + money);
			System.out.println("구매할 로또 금액 입력");
			int buy = sc.nextInt();
			int[] winning = generateLotto();
			// 구매한거랑 win번호랑 비교하소 같으면 3만원
			if (buy > money) {
					System.out.println("돈이 충분하지 않습니다.");
					continue;
			}
				money -= buy;
				int[][][] bundle = lottoBundle(buy);
				money += checkWinning(bundle, winning);
				// money 100원넘거나 0이면 종료
				if(money == 0 || money > 10000000) {
					break;
				}
				
		}
		
	}
	public int checkWinning(int[][][] bundle, int[] winning) {
		
		int win = 0;
		for(int[][] paper : bundle) {
			for(int[] lotto : paper) {
				// 1 반복문 이용해보기.
				boolean chk = true;
				for(int i=0; i<lotto.length; i++) {
					if(lotto[i] != winning[i]) chk = false;
				}
				if(chk) win+=30000;
				// 2 Arrays.toString 이용해보기      ,위의 for문과 같은방법
//				if(Arrays.toString(lotto).equals(Arrays.toString(winning))) {        
//					win+=30000;
//				}
			}
		}
		return 0;
	}


	public void printBundle(int[][][] bundle) {
		for (int[][] paper : bundle) {
			System.out.println("====================");
			for (int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("====================");
		}
	}

	public int[][][] lottoBundle(int money) {
		int papers = money / 5000;
		if (money % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][6];

		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if (papers % 5000 != 0) {
			bundle[bundle.length - 1] = lottoPaper(money % 5000 / 1000);
		}
		return bundle;
	}

	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for (int i = 0; i < paper.length; i++) {
			paper[i] = generateLotto();
		}
		return paper;
	}

	public int[][] lottoPaper() {

		return lottoPaper(5);
	}

	public int[] generateLotto() {
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			int ran = new Random().nextInt(8) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

	public String array2String(int[] arr) {
		String result = "(";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != arr.length - 1) {
				result += ", ";
			}
		}
		result += ")";
		return result;
	}
}
