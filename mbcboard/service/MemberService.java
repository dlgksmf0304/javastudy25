package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;

public class MemberService { //회원용 service

	// dao와 dto를 사용하여 부메뉴와 CRUD를 처리한다.
		
	// 필드
	public MemberDAO memberDAO = new MemberDAO(); // 1단계, 2단계 수행
		
		
	// 생성자
		
		
		
		
	// 메서드
	public MemberDTO subMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		boolean run = true;
		
		while (run) {
			System.out.println("MBC아카데미 회원 서비스 목록입니다.");
			System.out.println("1. 전체회원 목록보기");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그인");
			System.out.println("4. 비밀번호 수정");
			System.out.println("5. 회원정보 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>");
			String num = inputStr.next();
			
			switch(num) {
			case "1" :
				System.out.println("전체회원 목록보기 메서드 진입");
				memberAll(memberDAO);
				break;
			
			case "2" :
				System.out.println("회원가입 메서드 진입");
				insertmember(memberDAO, inputStr);
				break;
				
			case "3" :
				System.out.println("로그인 메서드 진입");
				login(memberDAO, inputStr);
				
				
				break;
			case "4" :
				System.out.println("비밀번호 수정 메서드 진입");
				membermodify(memberDAO, inputStr);
				break;
				
			case "5" :
				System.out.println("회원정보 삭제 메서드 진입");
				memberdeleteOne(inputStr);
				break;
				
			case "6" :
				System.out.println("회원서비스 종료");
				run = false;
				break;
				
			
			
			}//switch 종료
			
			
			
			
		}//while문 종료
		return session;
	
		
		
		
	}// subMenu메서드 종료



	// 회원 삭제 메서드 =================================================================================
	private void memberdeleteOne(Scanner inputStr) throws SQLException {
		
		System.out.println("삭제할 회원의 ID를 입력하세요.");
		System.out.print("ID : ");
		String deleteID = inputStr.next();
		
		memberDAO.memberdeleteOne(deleteID);
		
		
		
	}// 회원삭제 메서드 종료



	// 비밀번호 수정 메서드 ============================================================================
	private void membermodify(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		
		MemberDTO memberDTO = new MemberDTO();
		
		
		System.out.println("비밀번호 변경을 진행합니다.");
		
		
		System.out.print("ID : ");
		String id = inputStr.next();
		
		
		memberDAO.membermodify(memberDTO, id, inputStr);
		
		
		
	}// 비밀번호 수정 메셔드 종료



	// 로그인 메서드 ================================================================================
	private void login(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		
		MemberDTO memberDTO = new MemberDTO();
		
		
		System.out.println("로그인 메서드입니다.");
		
		memberDAO.login(memberDTO, inputStr);
		

		
		
	}// 로그인메서드 종료



	// 회원가입 메서드 =====================================================================
	private void insertmember(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("회원가입을 진행합니다.");
		
		System.out.print("이름 : ");
		memberDTO.setBwriter(inputStr.next());
		
		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());
		
		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.insertmember(memberDTO);
		
		
	}// 회원가입 메서드 종료



	// 전체회원보기 메서드 ==============================================================
	private void memberAll(MemberDAO memberDAO) throws SQLException {
		
		
		System.out.println("====================");
		System.out.println("====전체회원 리스트=====");
		memberDAO.memberAll();
		System.out.println("====================");
		
		
		
		
	}// 전체회원보기 메서드 종료

}//클래스 종료
