package kr.or.ddit.study06.sec06;

public class Sing {
	// 노래 제목
	private String title;
	
	// 노래 가사일부
	private String lyrics;
	
	// 가수
	private String singer;
	
	// 발매년도
	private String pubYear;
	
	//getter/setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLyrics() {
		return lyrics;
	}
	
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String getPubYear() {
		return pubYear;
	}
	
	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}
}
