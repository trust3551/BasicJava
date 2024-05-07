package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
		method10();
//		method11();
	}

	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt(); 			//입력한 숫자
		for(int i=0; i<row; i++) {			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}				
	}
	
	
	public void method2() {   //완료
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		int row = sc.nextInt(); 			//입력한 숫자
		for(int i=0; i<row; i++) {		
			for(int space=row-1-i; space>0; space--) {
				System.out.print(" ");
			}
			for(int star=0; star<i+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}
//		int row = sc.nextInt();
//		for(int i=0; i<row; i++) {			
//			for(int j = row-i; j>1; j--) {
//				System.out.print(" ");
//			}
//			for(int a = 0; a<=i; a++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int space=0; space<i; space++) {
				System.out.print(" ");
			}
			
			for(int star = 0; star<row-i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
//		int row = sc.nextInt(); 
//		for(int i=0; i<row; i++) {
//			for(int j = 0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int a = row; a>i; a--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

	public void method4() {   // 완료
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 			//입력한 숫자
		for(int i=0; i<row; i++) {			
			for(int j=0; j<row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}				
		
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		
		int row = sc.nextInt();
		for(int i = 0; i<row; i++) {
			for(int space =0; space<row-1-i; space++) {
				System.out.print(" ");
			}
			for(int star=0; star<i*2+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//		int row = sc.nextInt(); 
//		for(int i=1; i<=row; i++) {
//			for(int j=0; j<row-i; j++) {
//				System.out.print(" ");
//			}
//			for(int a=0; a<2*i-1; a++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		int row = sc.nextInt(); 
		for(int i=row; i>0; i--) {
			for(int j=row-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int a = i*2-1; a>0; a--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method7() {    // 끝
		/*                         10 입력하면 별 10개짜리 정사각형
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
		
		int row = sc.nextInt(); 			
		for(int i=0; i<row; i++) {
			for(int j=0; j<row; j++) {
			System.out.print("*");
			}
			System.out.println();		
		}		
	}
	
	public void method8() {
		// 1  2  3  4  5
		// 6  7  8  9  10 
		// 11 12 13 14 15
		// 16 17 18 19 20 
		// 21 22 23 24 25 
		// 출력하기 
	}

	
	public void method9() {     
		// 1  6  11 16 20           세로로 숫자출력
		// 2  7  . 
		// 3 
		// 4 
		// 5  10       25
		// 출력하기 
	}
	
	public void method10() {
		// 1  10 11  20 21	   왔다갔다 숫자출력
		// 2    . 
		// 3 
		// 4 
		// 5  6  16  17 25
		// 출력하기 
		
		for(int h=0; h<5; h++) {
			for(int w=0; w<5; w++) {
				if(w%2==0) {
					System.out.print(1+h+w*5+"\t");
				}else {
					System.out.print(5+w*5-h+"\t");
				}
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void method11() {
		// 1  2  3  4  5	가로로 왔다갔다 숫자출력
//         10          6	
		// 11          15  
		// 20          16
		// 21          25 
		// 출력하기 
	}
	
			
	
}
