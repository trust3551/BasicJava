package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}
	
	public void process() {
		/*
		 *   6개의 단어가 제공되며 
		 *   이중 임의의 단어가 선택된다. 
		 *   
		 *   사용자는 이를 보고 원래의 단어를 입력한다. 
		 *   사용자가 단어를 맞출때까지 반복하며 단어를 맞추었을때 시도 횟수 출력
		 */
		String[] words = 
					  { "deserve", "cart", "he", "jet", "fright", "frustrate", "blossom", "scrub", "choir", "amount",
						"mechanism", "long", "chip", "blink", "too", "chop", "pave", "flavor", "habitat", "neither",
						"slip", "paragraph", "apply", "pad", "role", "from", "peak", "happen", "blonde", "organ",
						"format", "assess", "laugh", "manipulat", "meat", "column", "jar", "undergo", "fan", "through",
						"tend", "consensus", "quit", "oblige", "mood", "resort", "knight", "hat", "broad", "theater",
						"versus", "against", "via", "quarter", "hundred", "decade", "teenage", "billion", "dozen",
						"century", "dose", "double", "may", "the", "could", "should", "would", "dare", "shall", "can",
						"ought", "bit", "whereas", "criteria", "protein", "notion", "without" };
		
		int ran = new Random().nextInt(words.length);
		
		String select = words[ran];
		System.out.println("정답 : "+select);
		/*
		 *  String -> char 배열로 바꿔줌
		 *  toCharArray
		 */
		//decade => 'd' 'e' 'c' 'a' 'd' 'e' 
		char[] ch = select.toCharArray();
		/*
		 *  문자 섞기 
		 */
		for(int i=0; i< 1000000; i++) {
			int ran2 = new Random().nextInt(ch.length);
			// 0번째 배열의 값과 ran2번째 배열의 값을 바꾸기
			char ch2 = ch[0];
			ch[0] = ch[ran2];
			ch[ran2] = ch2;	
		}
		System.out.println(ch);
		
		int cnt = 0;
		while(true) {
			String answer = sc.next();
			if(answer.equals(select)) {
				System.out.println("정답입니다.");
				cnt++;
				System.out.println(cnt + "회 시행되었습니다.");
				break;
			}
			else {
				cnt++;
				System.out.println(cnt + "회 시행되었습니다.");
			}
		}
		
//		int cnt =0;
//		while(true) {
//			cnt++;
//			for(int i =0; i<ch.length; i++) {
//				System.out.println(ch[i]);
//			}
//			System.out.println("정답을 입력하세요 : ");
//			String s = sc.next();
//			if(s.contentEquals(select))
//		}
//		
		
	}
}
