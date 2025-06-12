package mbcjdbc;

import java.sql.SQLException;
import java.util.Scanner;

import mbcjdbc.DAO.EmpDAO;

public class JDBCExam {

	private static final String searchName = null;

	public static void main(String[] args) throws SQLException {
		// Referenced Libraries가 추가된다 -> ojdbc6.jar를 import할 수 없다.
		// 예외처리 : 서비스 제공중에 런타임이 중단되는 것을 막기 위한 기법
		// throws SQLException sql 런타임 중에 오류나 버그로 중단되는 것을 처리함
		// 맨 위 import java.sql.SQLException; 확인
		
		// 패키지는 3개로 나눠 구현된다.
		// DTO -> 객체용(게터, 세터)
		// DAO -> 데이터베이스에 접속하여 crud쿼리 처리용
		// service -> 자바에서 crud 부메뉴용
		
		Scanner input = new Scanner(System.in); //스캐너 객체생성
		
		System.out.print("사원 이름 : ");
		String name = input.next();
		
		System.out.print("회사 명 : ");
		String dept = input.next();
		
		System.out.print("입사 점수 : ");
		double score = input.nextDouble(); //소수점 점수 입력하기 위해 double사용
		// 키보드로 입력 -> num은 db에서 시퀀스 객체로 자동 주입
		
		EmpDAO empDAO = new EmpDAO(); //DAO객체 생성 -> 메서드 호출하여 값 전달
		empDAO.insertEMP(name, dept, score);
		
		System.out.println("모든 데이터 확인해보기");
		empDAO.selectEMPALL();
		
		System.out.println("검색하고싶은 이름을 입력하세요.");
		System.out.print(">>");
		empDAO.searchEMP(searchName);
		
		
		
		
		
	}// main메서드 종료

}//클래스 종료
