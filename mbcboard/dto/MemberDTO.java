package mbcboard.dto;

import java.sql.Date;

public class MemberDTO { // 회원용 DTO
	// 회원용의 객체를 담당하는 게터 세터
	// 필드 (테이블에있는 모든 자료 입력)
	private int mno;
	private String bwriter;
	private String id;
	private String pw;
	private Date regidate; // import java.sql.Date; -> import를 걸어야된다.
	
	
	
	// 기본생성자(아무것도 쓰지 않으면 기본생성자가 생성)
	
	
	
	//메서드
	
	public int getMno() {
		return mno;
	}
	public String getBwriter() {
		return bwriter;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	
	
	
	
	
	
	
	
	
}// 클래스 종료
