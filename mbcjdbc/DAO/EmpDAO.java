package mbcjdbc.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {
	// jdbc를 담당하는 클래스
	// 오라클과 쿼리를 작성하여 crud를 제공
	// jdbc는 이미 만들어진 외부 라이브러리로 5단계로 설정이 필수이다.
	// 1단계 : 연결하는 객체 Connection
	// 2단계 : 쿼리문을 생성하는 객체 Statement(구형, 정적쿼리) / PreparedStatement(신형, 동적쿼리)
	// 3단계 : 쿼리문을 실행
	// 4단계 : 쿼리문 실행결과를 받음 select(resultset)/나머지는 int
	// 5단계 : 연결을 종료
	
	// 필드
	
	
	
	// 기본생성자 (생략시 기본으로 만들어진다)
	
	
	
	//메서드

	public void insertEMP(String name, String dept, double score) throws SQLException {
		// 3개의 값을 매개값으로 전달받아 emp테이블로 전달해야 함.
		
		Connection conn = null;          // db에 연결하는 객체
		Statement stmt = null;           // 쿼리문 저장 객체 (구형)
		PreparedStatement pstmt = null; //쿼리문 저장 객체 (신형)
		ResultSet resultSet = null;     // 쿼리 샐행 결과를 표로 출력 select용
		int result = 0;                 // 쿼리 실행 결과를 정수로 출력 c,u,d는 결과값이 1(성공), 0(실패)
		// 성공시 -> 1개의 행이 삽입 | 수정 | 삭제 되었습니다.
		// 실패시 -> 0개의 행이 삽입 | 수정 | 삭제 되었습니다.
		
		try { //예외가 발생 가능성이 있는 실행문에서 활용
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계용(ojdbc6.jar호출)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", // 주소확인 -> oracle(jdbctest) 우클릭 -> Properties
					"jdbctest","jdbctest");
			
			stmt = conn.createStatement(); //쿼리 처리용 객체 생성
			// insert into emp(num,name,dept,score) values(emp_seq.nextval,'name','dept','score');
			
			String sql = "insert into emp(num,name,dept,score)"
					+ " values(emp_seq.nextval,'"
					+ name + "," + dept + "," + score + "')";//쿼리문 완성
			
			result = stmt.executeUpdate(sql); // int타입으로 결과를 받을 명령어
			
			if(result > 0) {
				System.out.println(result + "행의 데이터를 추가 했습니다. \n");
				conn.commit();
			}else {
				System.out.println("결과 : " + result + "입니다.");
				System.out.println("입력 실패 롤백 됩니다.");
				conn.rollback();
			}
			
		}catch(ClassNotFoundException e) {// ojdbc6.jar를 찾을 수 없거나 forName이름이 잘못됨
			System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
			e.printStackTrace(); // 오류메시지 출력(빨간글자들)
			
		}catch(SQLException e) {//url이나 id, pw에 대한 예외 처리용
			System.out.println("URL이나 ID,PW,쿼리문을 확인해주세요.");
			e.printStackTrace(); // 오류메시지 출력(빨간글자들)
		}finally {
			//성공이든 실패든 무조건 마지막에 실행되는 문
			//열림과 반대로 닫아줌
			stmt.close();
			System.out.println("스테이트문 종료");
			conn.close();
			System.out.println("conn문 종료");
		}
		
		
		
	}//insertEMP 메서드 종료

	public void selectEMPALL() throws SQLException{
	      // TODO Auto-generated method stub
	      
	      // emp 테이블에 모든 정보를 번호기준으로 내림차순 출력
	      Connection conn = null; // 연결하는 객체
	      Statement stmt = null; // 쿼리문을 처리하는 객체(구형)
	      PreparedStatement pstmt = null; // 쿼리문을 처리하는 객체(신형)
	      ResultSet resultSet = null; // select의 결과를 표형식으로 생성객체
	      int result = 0; // update, delete, create 결과가 정수로 나옴( 1행 처리 완료)

	      try { 
	         // 오류가 발생 가능성 있는 실행문
	         Class.forName("oracle.jdbc.driver.OracleDriver");  // 1단계용  ojdbc6.jar 호출
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
	               , "jdbctest", "jdbctest");
	         
	         stmt = conn.createStatement(); // 쿼리 처리용 객체 생성
	         
	         String sql = "SELECT * FROM EMP ORDER BY NUM ASC" ; // num 오름차순
	         resultSet = stmt.executeQuery(sql); // 결과를 표로 받음
	         
	         System.out.println("-----------------------------------------");
	         System.out.println("사원번호\t 이름\t 부서\t 입사점수");
	         System.out.println("-----------------------------------------");
	         
	         while(resultSet.next()) { // 결과로 받음 표내용을 출력한다.
	            //resultSet.next() 표에 행이 있으면 true, 없으면 false
	            System.out.print(resultSet.getInt(1)+"\t"); // 필드명이 num
	            System.out.print(resultSet.getString(2)+"\t");
	            System.out.print(resultSet.getString(3)+"\t");
	            System.out.println(resultSet.getDouble(4)+"\t");
//	            System.out.print(resultSet.getInt("num")+"\t"); // 필드명이 num
//	            System.out.print(resultSet.getString("name")+"\t");
//	            System.out.print(resultSet.getString("dept")+"\t");
//	            System.out.println(resultSet.getDouble("score")+"\t");

	         }
	         
	         
	      }catch(ClassNotFoundException e) { // ojdbc6.jar를 찾을수 없거나 forName 이름이 잘못됨
	         System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
	         e.printStackTrace(); // 자바에서 제공하는 오류 메시지 출력 (빨간 글자들)
	         
	      }catch(SQLException e) { // url이나 id, pw에 대한 예외처리용
	         System.out.println("URL이나 ID, PW, 쿼리문을 확인 해주세요 ");
	         e.printStackTrace(); // 자바에서 제공하는 오류 메시지 출력 (빨간 글자들)
	      }finally {
	         // 성공이든 실패든 무조건 마지막에 실행되는 문
	         // 열림과 반대로 닫아줌.
	         resultSet.close();
	         System.out.println("resultSet 종료");
	         stmt.close(); 
	         System.out.println("스테이트문 종료");
	         conn.close();
	         System.out.println("conn문 종료");
	      }
	      
	   } //selectEMPALL() 메서드 종료



	public void searchEMP(String searchName) throws SQLException {
		// 키보드로 입력받은 객체를 db 에서 찾아 출력한다.
	      
	      Connection conn = null; // 연결하는 객체
	      Statement stmt = null; // 쿼리문을 처리하는 객체(구형)
	      PreparedStatement pstmt = null; // 쿼리문을 처리하는 객체(신형)
	      ResultSet resultSet = null; // select의 결과를 표형식으로 생성객체
	      int result = 0; // update, delete, create 결과가 정수로 나옴( 1행 처리 완료)

	      try { 
	         // 오류가 발생 가능성 있는 실행문
	         Class.forName("oracle.jdbc.driver.OracleDriver");  // 1단계용  ojdbc6.jar 호출
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
	               , "jdbctest", "jdbctest");
	         
	         stmt = conn.createStatement(); // 쿼리 처리용 객체 생성
	         
	         String sql = "SELECT * FROM EMP where name='" + searchName +"'" ; // num 오름차순
	         System.out.println("입력된 쿼리문: " + sql);
	         resultSet = stmt.executeQuery(sql); // 결과를 표로 받음
	         
	         System.out.println("-----------------------------------------");
	         System.out.println("사원번호\t 이름\t 부서\t 입사점수");
	         System.out.println("-----------------------------------------");
	         
	         while(resultSet.next()) { // 결과로 받음 표내용을 출력한다.
	            //resultSet.next() 표에 행이 있으면 true, 없으면 false
	            System.out.print(resultSet.getInt(1)+"\t"); // 필드명이 num
	            System.out.print(resultSet.getString(2)+"\t");
	            System.out.print(resultSet.getString(3)+"\t");
	            System.out.println(resultSet.getDouble(4)+"\t");
//	            System.out.print(resultSet.getInt("num")+"\t"); // 필드명이 num
//	            System.out.print(resultSet.getString("name")+"\t");
//	            System.out.print(resultSet.getString("dept")+"\t");
//	            System.out.println(resultSet.getDouble("score")+"\t");

	         }
	         
	         
	      }catch(ClassNotFoundException e) { // ojdbc6.jar를 찾을수 없거나 forName 이름이 잘못됨
	         System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
	         e.printStackTrace(); // 자바에서 제공하는 오류 메시지 출력 (빨간 글자들)
	         
	      }catch(SQLException e) { // url이나 id, pw에 대한 예외처리용
	         System.out.println("URL이나 ID, PW, 쿼리문을 확인 해주세요 ");
	         e.printStackTrace(); // 자바에서 제공하는 오류 메시지 출력 (빨간 글자들)
	      }finally {
	         // 성공이든 실패든 무조건 마지막에 실행되는 문
	         // 열림과 반대로 닫아줌.
	         resultSet.close();
	         System.out.println("resultSet 종료");
	         stmt.close(); 
	         System.out.println("스테이트문 종료");
	         conn.close();
	         System.out.println("conn문 종료");
	      }

		
	}
}