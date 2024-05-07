package kr.or.ddit.study05.sec03;

public enum Week {
	MON("월요일"), TUE("화요일"), WEN("수요일"), THU("목요일"), FRI("금요일"), SAT("토요일"), SUN("일요일");
	
	String day;
	Week(String day){
		this.day = day;
	}
}
