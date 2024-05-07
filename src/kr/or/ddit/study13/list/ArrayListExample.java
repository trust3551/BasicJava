package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// 배열과 유사한 구조
		// ArrayList
		// - 1차원 배열구조
		// - 중복을 허락하고 순서화 제공
		// - List 타입의 컬렉션
		
		// 주요메소드
		// .add      : 데이터 삽입
		// .clear    : 모든데이터 삭제
		// .contains : 포함 여부 확인
		// .get      : idx 자료반환
		// .remove   : idx 자료반환 후 삭제
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// 3값 지우기
		list.remove(4);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
