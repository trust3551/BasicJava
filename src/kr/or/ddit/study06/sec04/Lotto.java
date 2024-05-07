package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();
	}

	public void process() {
		 int[][][] bundle = lottoBundle(12000);
		 printBundle(bundle);
	}
	
	public void printBundle(int[][][] bundle) {
		for (int[][] paper : bundle) {
			System.out.println("===========================");
			for(int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("===========================");
		}
	}
	
	
	
	public int[][][] lottoBundle(int money) {
		
		int papers = money/5000;	  // papers 라는 변수는 입력한 돈을 5000원으로 나눔
		if(money%5000!=0)papers++;    // 5천원 배수만큼 사고 나머지가 있을때  로또 장수 1장 추가
		
		int[][][] bundle = new int [papers][5][6];  // 3차원배열 안에  번호 6개가 있는 5줄이 papers(장수)만큼
		for(int i = 0; i<bundle.length; i++) {		
			bundle[i] = lottoPaper();				
		}
		if(money%5000!=0) {							// 나머지가 장수가 있을때
			bundle[bundle.length-1] = lottoPaper((money%5000)/1000); // 번들 마지막장 
		}   
		return bundle;
	}
	
	public int[][] lottoPaper(int num){			// num값대로 줄이 생성 
		int[][]paper = new int[num][6];			//[6] 번호 6개
		
		for(int p =0; p<paper.length; p++) {
			paper[p] = generateLotto();			// 1차원 배열을 2차원배열에 담아주기 시작 p=로또 줄갯수
		}
		return paper;
	}
	
	
	public int[][] lottoPaper() { 
		return lottoPaper(5);		
	}
	
	public int[] generateLotto() { //  한줄
		int[] lotto = new int[6];   
		
		for(int i=0; i<6; i++) {
			int ran = new Random().nextInt(45)+1; // 로또번호가 0~44까지의 숫자가 나오니까 +1해서 1부터나오게
			lotto[i] = ran;						 // 6자리가 랜덤하게 순서대로 나옴
			for(int j=0; j<i; j++) {			// 랜덤중복값 제거
				if(lotto[j] == ran) {   
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);   // 정렬
		return lotto; 
		
//		
//		System.out.println(Arrays.toString(lotto));  // 주소값이 아니라 값을 불러오는 메소드
//		System.out.println(array2String(lotto));	// 아래 메소드를 불러옴
	}
	
	public String array2String(int[] arr) {
		String result = "(";
		for(int i = 0; i<arr.length; i++) {
			result += arr[i];
			if(i != arr.length-1) {
				result+=", ";
			}
		}
		result +=")";
		return result;
	}
}
