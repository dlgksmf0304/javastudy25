package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.dto.BoardDTO;

public class BoardDAO {
	//게시판의 db와 연동을 담당한다.
	//jdbc 5단계를 사용
	//1단계 : Connect 객체를 사용하여 ojdbc6.jar를 생성
	//2단계 : URL, ID, PW, SQL 쿼리문을 작성한다.
	//3단계 : 쿼리문을 실행한다.
	//4단계 : 쿼리문 실행 결과를 받는다.
	//5단계 : 연결 종료를 진행한다.
	
	 
	//필드 ----------------------------------------------------------------------------------
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null; //1단계에서 사용하는 객체
	public Statement statement = null; // 3단계에서 사용하는 객체(구형), 변수 직접처리 '"+name+"'
	public PreparedStatement preparedStatement = null; //3단계에서 사용하는 객체(신형), ?(인파라미터)
	public ResultSet resultSet = null; // 4단계에서 결과 받는 표 객체 executQuery(select결과)
	public int result = 0; // 4단계에서 결과 받는 정수 executeUpdate (insert, update, delete)
	// 1개의 행이 삽입 | 수정 | 삭제 되었습니다. (정상처리 -> commit)
	// 0개의 행이 삽입 | 수정 | 삭제 되었습니다. (비정상처리 -> rollback
	
	
	//기본생성자--------------------------------------------------------------------------------------------
	public BoardDAO() {
		
		try { 
			//예외가 발생할 수 있는 실행문
			// 프로그램 강제종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver");// 1단계 ojdbc6.jar호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"boardtest", "boardtest"); // 2단계(예외처리용이라 tey문을 쓰지 않으면 빨간줄이 뜬다)
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나 ojdbc6.jar파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제종료
			
			
		} catch (SQLException e) {
			System.out.println("URL, ID, PW가 잘못되었습니다. BoardDAO기본생성자를 확인해주세요");
			e.printStackTrace();
			System.exit(0);
		} // try문 종료
		
		
	}// 기본생성자 종료


	//메서드 ------------------------------------------------------------------------------------------------------
	// BoardSecice클래스메뉴 전체보기 메서드에서 SQL을 사용하여 전체목록 결과 출력
	public void selectAll() throws SQLException {
		
		try {
			String sql = "select bno, btitle, bwriter, bdate from board order by bdate desc";
			// 데이터베이스 board테이블 내용을 가져오는 쿼리문 (번호, 제목, 작성자, 작성일)
			
			statement = connection.createStatement(); // 쿼리문을 실행 객체 생성
			resultSet = statement.executeQuery(sql); // 쿼리문을 실행하여 결과를 표로 받는다.
			
			System.out.println("번호\t 제목\t 작성자\t 작성일\t");
			
			while(resultSet.next()) { 
				//결과표에 위에서부터 아래까지 내려오면서 출력
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");
				
			}// while문 종료
			
			System.out.println("===============끝==================");
		} catch (SQLException e) {
			// 오류 발생시 예외처리문
			System.out.println("selectAll()메서드에 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			// 항상 실행문
			resultSet.close();
			statement.close();
			//열린객체를 닫아야 다른 메서드도 정상작동한다
			//close();를 사용하여 객체닫기
		}// try 문 종료
		
		
	}//selectAll 메서드 종료


	// insertBoard메서드 ------------------------------------------------------------------
	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		
		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate)"
					+ "values(board_seq.nextval, ?, ?, ?, sysdate)";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			//첫번째 ?에 service에서 set으로 작성한 내용을 dto객체에서 get하여 제목을 가지고온다.
			preparedStatement.setString(2, boardDTO.getBcontent());
			//두번째 ?에 service에서 set으로 작성한 내용을 dto객체에서 get하여 내용을 가지고온다.
			preparedStatement.setString(3, boardDTO.getBwriter());
			//세번째 ?에 service에서 set으로 작성한 내용을 dto객체에서 get하여 작성자를 가지고온다.
			
			result = preparedStatement.executeUpdate(); //쿼리문 실행해서 결과를 정수로 받음
			// result = preparedStatement.executeUpdate(sql); -> 괄호안에 sql을 넣으면 오류가 발생한다.
			
			if(result > 0) {
				System.out.println(result + "개의 게시물이 등록 됐습니다.");
				connection.commit(); // 내용을 영구저장한다.
			}else {
				System.out.println("쿼리 실행결과 : " + result);
				System.out.println("입력실패 !!");
				connection.rollback(); // 저장취소(내용 롤백)
			} //if문 종료
			
			
		} catch (SQLException e) {
			System.out.println("예외발생 : insertBoard()메서드 쿼리문을 확인하세요.");
			e.printStackTrace();
			
		}finally {
			// 예외 발생 및 정상 실행 후 무조건 처리되는 실행문
			preparedStatement.close();
			//객체를 닫아줘야 다른 메서드들이 정상작동한다.
		}//try문 종료
		
		
	}// insertBoard메서드 종료


	// readOne메서드------------------------------------------------------------------------------------------------
	public void readOne(String title) throws SQLException { // 제목 문자열이 넘어온것을 select처리하여 출력함
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board where btitle = ?";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title); // service에서 넘어온 찾고싶은 제목이 ?로 넘어간다.
			resultSet = preparedStatement.executeQuery(); // 쿼리문 실행 후 결과를 표로 받는다.
			
			if(resultSet.next()) {
				//검색결과가 있으면
				BoardDTO boardDTO = new BoardDTO(); // 빈객체 생성
				
				boardDTO.setBno(resultSet.getInt("bno"));
				boardDTO.setBtitle(resultSet.getString("btitle"));
				boardDTO.setBcontent(resultSet.getString("bcontent"));
				boardDTO.setBwriter(resultSet.getString("bwriter"));
				boardDTO.setBdate(resultSet.getDate("bdate"));
				//데이터 베이스에 있는 행을 객체에 넣기 완료
				
				System.out.println("==================================");
				System.out.println("번호 : " + boardDTO.getBno());
				System.out.println("제목 : " + boardDTO.getBtitle());
				System.out.println("내용 : " + boardDTO.getBcontent());
				System.out.println("작성자 : " + boardDTO.getBwriter());
				System.out.println("작성일 : " + boardDTO.getBdate());
				
			}else { //검색결과가 없으면
				System.out.println("해당하는 게시물이 존재하지 않습니다.");
			} //if문 종료
			
		} catch (SQLException e) {
			System.out.println("예외발생 : readOne()메서드를 확인하세요.");
			e.printStackTrace();
		}finally { //항상 실행문 
			preparedStatement.close();
			resultSet.close();
			// 객체를 close();로 닫아야 다른 메서드들이 정상작동 한다.
		}
		
	}// readOne메서드 종료


	// modify메서드======================================================================
	public void modify(String title, Scanner inputStr) throws SQLException {
		// 제목을 찾아서 내용을 수정한다.
		
		BoardDTO boardDTO = new BoardDTO(); // 빈객체 생성
		
		System.out.println("[수정할 내용을 입력하세요]");
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());
		
		try {
			String sql = "update board set btitle =?, bcontent =?, bdate = sysdate where btitle =?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, title);
			
			result = preparedStatement.executeUpdate(); //쿼리문 실행 후 결과를 정수로 보냄
			
			if(result>0) { // result는 정수로 값이 반환되기 때문에 1(성공), 0(실패)이다.
				System.out.println(result + "개의 데이터가 수정 되었습니다.");
				connection.commit(); // 영구저장
			}else {
				System.out.println("수정이 되지 않았습니다.");
			} //if문 종료
		
		
		} catch (SQLException e) {
			System.out.println("예외발생 : modify()메서드를 확인해주세요");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			// 객체를 닫아줘야 다른 메서드들이 정상작동 한다
		}//try문 종료
		
		
	}//modify메서드 종료


	// deleteOne메서드 ----------------------------------------------------------------------------
	public void deleteOne(int num) throws SQLException {
		// sevice에서 입력반은 번호를 이용해서 데이터 삭제
		
		try {
			String sql = "delete from board where bno = ? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, num);
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println(result + "개의 게시물이 삭제 되었습니다.");
				connection.commit(); // 영구저장
			}else {
				System.out.println("게시물이 삭제되지 않았습니다.");
				connection.rollback(); // 롤백
			} //if문 종료
			
			System.out.println("=======================");
			selectAll(); // 삭제후 전체리스트 출력
		
		
		} catch (SQLException e) {
			System.out.println("예외발생 : deleteOne()메서드를 확인해주세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			// 열린 객체를 닫아줘야 다른 메서드들이 정상작동함
		} //try문 종료
		
		
		
		
		
		
	}// deleteOne메서드 종료
	
	
	
	
	

}//클래스 종료
