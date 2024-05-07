package kr.or.ddit.study06.sec06;

public class MemberVo {

	
	static int year;
	private String id;             // 필드
	private String pass;
	private String name;
	
	
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pass=" + pass + ", name=" + name + "]";
	}
	

	public String getId() {        // 메소드
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MemberVo() {
		
	}
	
	public MemberVo(String id, String pass, String name) {    // 생성자
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	
	
}
