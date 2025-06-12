package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.BoardExam;
import mbcboard.dto.MemberDTO;

public class MemberDAO { // 회원용 DAO
	//게시판의 db와 연동을 담당한다.
	//jdbc 5단계를 사용
	//1단계 : Connect 객체를 사용하여 ojdbc6.jar를 생성
	//2단계 : URL, ID, PW, SQL 쿼리문을 작성한다.
	//3단계 : 쿼리문을 실행한다.
	//4단계 : 쿼리문 실행 결과를 받는다.
	//5단계 : 연결 종료를 진행한다.
	
	
	// 필드
	public static MemberDTO memberDTO = new MemberDTO();
	public static Connection connection = null; //1단계에서 사용하는 객체
	public static Statement statement = null; // 3단계에서 사용하는 객체(구형), 변수 직접처리 '"+name+"'
	public static PreparedStatement preparedStatement = null; //3단계에서 사용하는 객체(신형), ?(인파라미터)
	public static ResultSet resultSet = null; // 4단계에서 결과 받는 표 객체 executQuery(select결과)
	public static int result = 0; // 4단계에서 결과 받는 정수 executeUpdate (insert, update, delete)
	
	
	// 생성자
	public MemberDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 ojdbc6.jar호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"boardtest", "boardtest"); // 2단계(예외처리용이라 try문을 쓰지 않으면 빨간줄이 뜬다)
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나 ojdbc6.jar파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제종료
			
		} catch (SQLException e) {
			System.out.println("URL, ID, PW가 잘못되었습니다. BoardDAO기본생성자를 확인해주세요");
			e.printStackTrace();
			System.exit(0); // 강제종료
		} //try문 종료
		
		
	}// MemberDAO() 종료


	//메서드
	
	// memberAll 메서드 ==================================================================================
	public void memberAll() throws SQLException {
		
		
		try {
			String sql = "select mno, bwriter, id, pw, regidate from member order by mno desc";
			// 데이터베이스 member테이블 내용을 가져오는 쿼리문 (번호, 이름, 아이디, 비밀번호, 등록날짜)
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			System.out.println("번호\t 이름\t 아이디\t 비밀번호\t 생성일\t");
			
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("mno") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.print(resultSet.getString("id") + "\t");
				System.out.print(resultSet.getString("pw") + "\t");
				System.out.println(resultSet.getDate("regidate") + "\t");
				
			}//while문 종료
			
			
		}catch(SQLException e){
			// 오류 발생시 예외처리문
				System.out.println("memberAll()메서드 쿼리문이 잘못되었습니다.");
				e.printStackTrace();
		}finally {
			// 항상 실행문
			resultSet.close();
			statement.close();
			//열린객체를 닫아야 다른 메서드도 정상작동한다
			//close();를 사용하여 객체닫기
		}// try 문 종료
		
		
		
		
		
	}// memberAll 메서드 종료


	// insertmember 메서드 ===========================================================================
	public void insertmember(MemberDTO memberDTO) throws SQLException {
		
		try {
			String sql = "insert into member(mno, bwriter, id, pw, regidate)"
					+ "values(board_seq.nextval, ?, ?, ?, sysdate)";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			
			result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "명의 회원가입이 완료되었습니다.");
				connection.commit();
			}else {
				System.out.println("회원가입에 실패했습니다.");
				connection.rollback();
			} // if문 종료
	
		
		} catch (SQLException e) {
			System.out.println("예외발생 : insertmember()메서드를 확인해주세요");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			
		}//try메서드 종료
		
		
	}// insertmember메서드 종료


	// login메서드 =======================================================================
	public void login(MemberDTO memberDTO, Scanner inputStr) throws SQLException {
		
		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());
		
		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());
		
		
		
		try {
			String sql = "select id, pw from member where id =? and pw =?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId());
			preparedStatement.setString(2, memberDTO.getPw());
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println("로그인이 되었습니다.");
				System.out.println(memberDTO.getId() + "님 안녕하세요.");
				connection.commit();
								
			}else {
				System.out.println("로그인 실패!!");
				connection.rollback();
			}//if문 종료
			
			
		}catch (SQLException e) {
			System.out.println("login() 메서드 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			
		}// try문 종료
		
		
		
		
		
		
		
	}// login메서드 종료


	// membermodify 메서드 ==========================================================================
	public void membermodify(MemberDTO memberDTO, String id, Scanner inputStr) throws SQLException {
		
		System.out.print("변경할 PW : ");
		memberDTO.setPw(inputStr.next());
		
		
		try {
			String sql = "update member set pw = ? where id = ?";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getPw());
			preparedStatement.setString(2, id);
			
			result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + "명의 PW 변경이 완료되었습니다.");
				connection.commit();
			}else {
				System.out.println("PW변경을 실패했습니다.");
				connection.rollback();
			}//if문 종료
			
			
		} catch (SQLException e) {
			System.out.println("예외발생 : membermodify()메서드를 확인해주세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}//try문 종료
		
		
	}//membermodify메서드 종료


	// memberdeleteOne 메서드 ======================================================================
	public void memberdeleteOne(String deleteID) throws SQLException {
		
		try {
			String sql = "delete from member where id = ?";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, deleteID);
			
			result = preparedStatement.executeUpdate();
			
			if (result > 0) {
				System.out.println(result + "명의 회원 ID를 삭제했습니다.");
				connection.commit();
			}else {
				connection.rollback();
			} // if문 종료
		
		} catch (SQLException e) {
			System.out.println("예외 발생 : memberdeleteOne()메서드를 확인해주세요.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}//try문 종료
		
	}// memberdeleteOne메서드 종료




}// 클래스 종료
