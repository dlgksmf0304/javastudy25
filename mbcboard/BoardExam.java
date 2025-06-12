package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dto.MemberDTO;
import mbcboard.service.BoardSevice;
import mbcboard.service.MemberService;

public class BoardExam { //게시판 만들기 main메서드

	//필드
	public static Scanner inputStr = new Scanner(System.in);
	public static MemberDTO session = null;
		
	//생성자 -> static블럭
		
		
	//메서드
	public static void main(String[] args) throws SQLException {
		// mbc게시판용 jdbc테스트
		// dto : 객체를 담당
		// dao : 데이터베이스에서 연동을 담당
		// sevice : 부메뉴와 서비스를 담당
		
		boolean run = true; // while문 반복용		
		
		while(run) {
			System.out.println("MBC 자유 게시판입니다.");
			System.out.println("1. 회원");
			System.out.println("2. 게시판");
			System.out.println("3. 종료");
			System.out.print(">>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원용 서비스로 진입합니다.");
				MemberService membersevice = new MemberService();
				session = membersevice.subMenu(inputStr, session);
				break;
				
			case "2" :
				System.out.println("게시판 서비스로 진입합니다.");
				BoardSevice boardSevice = new BoardSevice();
				boardSevice.subMenu(inputStr, session);
				break;
				
			case "3" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("1~3번만 선택해주세요.");
				break;
				
			}// switch종료
			
		}//while문 종료
		
	}//main메서드 종료

}//클래스 종료
