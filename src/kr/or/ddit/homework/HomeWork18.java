package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
		
	}
	public void process() {
		printHistoGram(10000);
		
		
	}
	// 주사위 한개
	public int oneDice() {
		return new Random().nextInt(6)+1;
		
	}
	public int twoDice() {
		return oneDice()+oneDice();
	
	}
	
	public Map trialNtimes(int n) {
		
		Map<Integer, Integer> resultMap = new HashMap();
		for(int i =0; i<n; i++) {
			int number = twoDice();
			int count = 1;
			if(resultMap.containsKey(number)) count+=resultMap.get(number);
			resultMap.put(number, count);
		}
		return resultMap;
	}
	
	public void printHistoGram(int num) {
		Map<Integer, Integer> resultMap = trialNtimes(num);
		
		for(int i = 2; i<=12; i++) {
			int count = resultMap.get(i);
			System.out.print(i+"\t");
			for(int j=0; j<count*100/num; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}	
	
	
//	public Map<Integer, Integer> trialNtimes(int n) {
//		Map<Integer,Integer> map = new HashMap();
//		for(int i= 0; i<n; i++) {
//			map.put(i, twoDice());
//		}
//		return map;
//	}
	
//	public void printHistoGram(int num) {
//		Map<Integer, Integer> resultMap = trialNtimes(num);
//		Set<Integer> keySet = resultMap.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		
//		for(int i = 2; i < 13; i++) {
//			System.out.print(i+"\t");
//			int cnt = 0;
//			for(int j = 0; j<num; j++) {
//				if(resultMap.get(j)==i) {
//					cnt++;
//					if(cnt ==1) {
//						System.out.print("*");
//						cnt = 0;
//					}
//				}
//			}	
//			System.out.println();
//		}
//	}
