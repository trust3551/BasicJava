package kr.or.ddit.study07.tell;

public class PriortyAllocation extends Schedular {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("우선 순위가 높은 상담전화를 대기열에서 가져옴");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 스킬이 가장 우수한 상담원에게 상담전화를 분배");
	}

	
}
