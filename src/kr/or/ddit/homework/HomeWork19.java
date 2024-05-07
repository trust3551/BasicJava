package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork19 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork19 obj = new HomeWork19();
		obj.process();
	}

	public void process() {
		List<Map<String, Object>> parkList = inputDate();
		parkPay(parkTime(parkList));
	}

	// 3. 요금 계산하기
	public void parkPay(Map<String, Integer> subPark) {
		// 기본시간(분)		기본 요금(원)		단위 시간(분)		단위 요금(원)
		// 180			5000			10				600
		int cal = 0;
		Set<String> keySet = subPark.keySet(); // keySet()은 key로 이루어진 hashSet 값을 가져옴. MapExample01에 나옵니다.
		for (String key : keySet) { // keySet 값을 순서대로 key값에 저장하고 실행문 실행 -> key에는 keySet에 저장된 key값이 저장
			if (subPark.get(key) < 180) { // 주차 시간 180분 미만
				System.out.println("차량번호 " + key + "의 요금 : 5000원");
			} else { // 주차 시간 180분 이상
				cal = (subPark.get(key) - 180) / 10 * 600 + 5000;
				System.out.println("차량번호 " + key + "의 요금 : " + cal + "원");
			}
		}
	}

	// 2. 차량별 주차 시간 구하기
	public Map<String, Integer> parkTime(List<Map<String, Object>> parkList) {
		Map<String, Integer> parkIn = new HashMap<String, Integer>(); // (차량번호, 입차시간)Map
		Map<String, Integer> parkOut = new HashMap<String, Integer>(); // (차량번호, 출차시간)Map
		Map<String, Integer> subPark = new HashMap<String, Integer>(); // (차량번호, 출차시간-입차시간)Map

		for (Map<String, Object> map : parkList) {
			String carNum = (String) map.get("차량번호"); // carNum에 차량번호 저장
			int time = getMin((String) map.get("시각")); // time에 getMin()이용해서 int 값으로 시간 저장
			String list = (String) map.get("내역"); // list에 입차, 출차 저장

			if (list.equals("입차")) { // 내역이 입차일 때
				parkIn.put(carNum, time); // (차량번호, 입차시간)Map에 저장
			} else if (list.equals("출차")) { // 내역이 출차일 때
				parkOut.put(carNum, time); // (차량번호, 출차시간)Map
				if (!subPark.containsKey(carNum)) { // (차량번호, 출차시간-입차시간)Map에 데이터가 없을 때 -> 처음으로 출차
					subPark.put(carNum, parkOut.get(carNum) - parkIn.get(carNum)); // 데이터가 없기 때문에 바로 저장
				} else { // (차량번호, 출차시간-입차시간)Map에 데이터가 있을 때
					subPark.put(carNum, parkOut.get(carNum) - parkIn.get(carNum) + subPark.get(carNum)); // 데이터가 있었기 때문에 덮어쓰기
				}
			}
		}

		return subPark;
	}

	public int getMin(String time) {
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		return hour * 60 + min;
	}

	// 1. 데이터 넣기
	public List<Map<String, Object>> inputDate() {
		// 시각		차량번호	내역
		// 05:34	5961 	입차
		// 06:00	0000 	입차
		// 06:34	0000 	출차
		// 07:59	5961 	출차
		// 07:59	0148 	입차
		// 18:59	0000	입차
		// 19:09	0148	출차
		// 22:59	5961	입차
		// 23:00	5961	출차
		// 23:00    0000	출차
		Map<String, Object> park1 = new HashMap();
		park1.put("시각", "05:34");
		park1.put("차량번호", "5961");
		park1.put("내역", "입차");

		Map<String, Object> park2 = new HashMap();
		park2.put("시각", "06:00");
		park2.put("차량번호", "0000");
		park2.put("내역", "입차");

		Map<String, Object> park3 = new HashMap();
		park3.put("시각", "06:34");
		park3.put("차량번호", "0000");
		park3.put("내역", "출차");

		Map<String, Object> park4 = new HashMap();
		park4.put("시각", "07:59");
		park4.put("차량번호", "5961");
		park4.put("내역", "출차");

		Map<String, Object> park5 = new HashMap();
		park5.put("시각", "07:59");
		park5.put("차량번호", "0148");
		park5.put("내역", "입차");

		Map<String, Object> park6 = new HashMap();
		park6.put("시각", "18:59");
		park6.put("차량번호", "0000");
		park6.put("내역", "입차");

		Map<String, Object> park7 = new HashMap();
		park7.put("시각", "19:09");
		park7.put("차량번호", "0148");
		park7.put("내역", "출차");

		Map<String, Object> park8 = new HashMap();
		park8.put("시각", "22:59");
		park8.put("차량번호", "5961");
		park8.put("내역", "입차");

		Map<String, Object> park9 = new HashMap();
		park9.put("시각", "23:00");
		park9.put("차량번호", "5961");
		park9.put("내역", "출차");

		Map<String, Object> park10 = new HashMap();
		park10.put("시각", "23:00");
		park10.put("차량번호", "0000");
		park10.put("내역", "출차");

		List<Map<String, Object>> list = new ArrayList();

		list.add(park1);
		list.add(park2);
		list.add(park3);
		list.add(park4);
		list.add(park5);
		list.add(park6);
		list.add(park7);
		list.add(park8);
		list.add(park9);
		list.add(park10);

		return list;

	}
}