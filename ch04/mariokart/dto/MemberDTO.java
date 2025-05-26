package ch04.mariokart.dto;

public class MemberDTO {
	
	
	public String id ; //아이디 (로그인용)
	public String pw ; //암호 (로그인용)
	public String nickName ; // 별명(게임용)
	public String email ;    // 암호찾기용
	
	public CharacterDTO characterDTO ; // 계정별 캐릭터 객체
}
