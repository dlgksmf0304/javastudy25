package ch04;

import java.util.Scanner;

public class Member {

	//필드 : 객체가 가지고 있어야 할 값 (변수)
	public int mno;
	public String id;
	public String pw;
	
	// 생성자 : Exam 클래스에서 main()메서드에서 new로 호출할 때 동작
	public Member() {
		// 기본 생성자 : 클래스명과 같은 메서드
	}
	
	//메서드 : Member클래스에서 행해는 동작
	public Member memberAdd(Scanner input) {//main에서 스캐너 객체를 받아서 씀
		Member member = new Member();//리턴용객체
		
		System.out.println("회원가입용 메서드 입니다.");
		System.out.println("회원번호를 입력하세요.");
		System.out.print(">>");
		member.mno = input.nextInt();
		
		System.out.println("id를 입력하세요.");
		System.out.print(">>");
		member.id = input.next();
		
		System.out.println("pw를 입력하세요.");
		System.out.print(">>");
		member.pw = input.next();
		
		return member;
		
		
	}//회원가입 메서드 종료
	
	public void memberAllList(Member[] members) {
		System.out.println("모든 회원 보기 리스트 메서드 입니다.");
		for(int i = 0; i < members.length; i++) {
			System.out.print("회원번호 : " + members[i].mno);
			System.out.print("회원 id : " + members[i].id);
			System.out.print("회원 pw : " + members[i].pw);
			System.out.println("==================");
		}//for문 종료
		
		
	}//리스트보기 메서드 종료
	
	public void memberLogin(Member[] members) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("로그인 메서드 입니다.");
		
		for(int i = 0; i < members.length; i++) {
			System.out.print("id : ");
			id = input.next();
			
			System.out.print("pw : ");
			pw = input.next();
			
			if(id.equals(members[i].id) && pw.equals(members[i].pw)) {
				System.out.println("로그인에 성공하셨습니다.");
			}else {
				System.out.println("로그인에 실패하셨습니다.");
				System.out.println("id, pw를 확인해주세요.");
			}//id, pw일치 확인 if문 종료
			
		}//for문 종료

	}//로그인 메서드 종료
	
	public Member memberUpdate(Member[] members) {
		Scanner input = new Scanner(System.in);
		Member member = new Member();
		
		System.out.println("회원수정 메서드 입니다.");
		System.out.println("===현재 가입된 회원목록===");
		for(int i = 0; i < members.length; i++) {
			
				System.out.print("회원번호 : " + members[i].mno);
				System.out.print("회원 id : " + members[i].id);
				System.out.print("회원 pw : " + members[i].pw);
				System.out.println("==================");
				System.out.println("========수정=======");
				System.out.print("회원번호 : " + members[i].mno + "> ");
				members[i].mno = input.nextInt();
				System.out.print("회원 id : " + members[i].id + "> ");
				members[i].id = input.next();
				System.out.print("회원 pw : " + members[i].pw + "> ");
				members[i].pw = input.next();
			
		}//for문 종료
		
		return member;
		
	}//회원수정 메서드 종료
	
	public Member memberDelete(Member[] members) {
		Member member = new Member();
		
		System.out.println("회원탈퇴 메서드 입니다.");
		
		for (int i = 0; i < members.length; i++) {
			members[i] = null;
		}//for문 종료
		System.out.println("모든 회원이 탈퇴되었습니다.");
		
		return member;
	}//회원탈퇴 메서드 종료
	
	
}
