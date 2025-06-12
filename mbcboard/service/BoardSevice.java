package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dao.MemberDAO;
import mbcboard.dto.BoardDTO;
import mbcboard.dto.MemberDTO;

public class BoardSevice {
	// dao와 dto를 사용하여 부메뉴와 CRUD를 처리한다.
	
	// 필드
	public BoardDAO boardDAO = new BoardDAO(); // 1단계, 2단계가 수행 된다.
	public MemberDTO memberDTO = new MemberDTO();
	
	// 기본생성자
	
	
	
	
	// 메서드(부메뉴, 생성, 모두보기, 1개만 보기, 수정하기, 삭제하기)
	public MemberDTO subMenu(Scanner inputStr, MemberDTO session) throws SQLException {
		boolean sunRun = true;
		while(sunRun) {
			System.out.println("MBC아카데미 게시판 서비스 목록입니다.");
			System.out.println("1. 모두보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 자세히보기");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>");
			String subselect = inputStr.next();
			
			switch(subselect) {
			case "1" :
				System.out.println("모든게시글 보기");
				selectAll(boardDAO);
				break;
				
			case "2" :
				System.out.println("게시글 작성메서드로 진입");
				session = insertBoard(boardDAO, inputStr, session);
				break;
				
			case "3" :
				System.out.println("게시글 자세히보기메서드로 진입");
				readOne(inputStr);
				break;
				
			case "4" :
				System.out.println("게시글 수정메서드로 진입");
				modify(inputStr);
				break;
				
			case "5" :
				System.out.println("게시글 삭제메서드로 진입");
				deleteOne();
				break;
				
			case "6" :
				System.out.println("게시판 서비스 종료");
				sunRun = false;
				break;
				
			default :
				System.out.println("1~6번만 입력하세요");
				break;
				
			}//switch문 종료
		}//while문 종료
		return session;
		
		
		
		
		
	}// subMenu메서드 종료


	// 게시글 삭제 메서드 ==============================================================
	private void deleteOne() throws SQLException {
		
		Scanner inputInt = new Scanner(System.in); // 번호를 받을 객체생성
		
		System.out.print("삭제하려는 게시글 번호를 입력하세요 > ");
		int num = inputInt.nextInt();
		
		boardDAO.deleteOne(num);
		// DAO에 deleteOne메서드에 입력받은 게시글 번호를 보낸다
		
		
		
	}// 게시글 삭제 메서드 종료


	// 게시글 수정메서드 ===================================================================
	private void modify(Scanner inputStr) throws SQLException {
		System.out.print("수정할 게시글 제목을 입력하세요 >");
		String title = inputStr.next();
		
		boardDAO.modify(title, inputStr);
		System.out.println("==========끝===========");
		
	}// 게시글 수정메서드 종료


	// 게시글자세히보기 메서드 ============================================================
	private void readOne(Scanner inputStr) throws SQLException {
		// 게시글 제목 입력하면 내용이 보이도록 select 처리
		System.out.println("내용을 확인할 게시글의 제목을 입력하세요");
		System.out.print(">>");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("==========끝==========");
		
		
		
		
	}// 게시글 자세히보기 메서드 종료


	// 게시글작성 메서드 ======================================================
	private MemberDTO insertBoard(BoardDAO boardDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		BoardDTO boardDTO = new BoardDTO();	 // 빈객체 생성
		
		System.out.print("작성자 : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());

		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine()); // 띄어쓰기가 있는 문장은 Line을 써야한다.
		
		boardDAO.insertBoard(boardDTO);
		// 위에서 만든 DTO내용을 insert를 써서 DAO(db)에 저장하라는 뜻
		
		System.out.println("========insertBoard메서드 종료===========");
		return session;
		
	}//게시글작성 메서드 종료


	// 모든 게시글보기 메서드 ==========================================================
	private void selectAll(BoardDAO boardDAO) throws SQLException {
		System.out.println("==========================");
		System.out.println("=====MBC게시판 목록입니다.=====");
		boardDAO.selectAll();
		System.out.println("==========================");
		
		
		
	}// 모든 게시글보기 메서드 종료

}// 클래스 종료
