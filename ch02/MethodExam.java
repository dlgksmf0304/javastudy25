package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {
		// 메서드 빼기 연습
		
		
		boolean run = true ;//while 무한반복용 코드
		Scanner inputInt = new Scanner(System.in);
		String id = "lee";
		String pw = "123";
		boolean session = false;//로그인상태 저장용
		boolean total = true;
		boolean kkw = true;
		
		
		
		while (run) {
			System.out.println("=====성적처리용======");
			System.out.println("1. 로그인");
			System.out.println("2. 교사정보");
			System.out.println("3. 학생관리");
			System.out.println("4. 성적관리");
			System.out.println("5. 관리자모드");
			System.out.println("9. 프로그램종료");
			System.out.print("원하는 항목을 선택해주세요 : ");
			int select = inputInt.nextInt();
			
			switch (select) {

			case 1:
				System.out.println("로그인메뉴로 이동합니다.");
				session = LoginOK(id, pw, session);

				if (session == true) {
					System.out.println(id + "님 환영합니다.");
					System.out.println("2~4메뉴를 사용하실 수 있습니다.");
				} else {
					System.out.println("id나 pw를 잘못입력하셨습니다.");
					System.out.println("확인바랍니다.");
				} //switch 안쪽 if종료
				break;

			case 2:
				System.out.println("교사관리 메뉴로 이동합니다."); 
				kkw = kkwT(kkw);
				
				if(kkw == false) {
					System.out.println("메뉴에 없는 항목입니다.");
				}
				
				break;

			case 3:
				System.out.println("학생관리 메뉴로 이동합니다.");
				break;

			case 4:
				System.out.println("성적관리 메뉴로 이동합니다.");
				total = mke(total);
				
				if(total == false) {
					System.out.println("점수를 잘못 입력 하셨습니다.");
				}
				
				
				break;
				
			case 5 :
				System.out.println("관리자모드를 시작합니다.");
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			}//switch 종료
		}//while 종료
		
		

	}//main메서드 종료

		private static boolean kkwT(boolean kkw) {
		// 교사관리 메서드
			
			Scanner inputChar = new Scanner(System.in);
			System.out.println("강의정보");
			System.out.println("교사정보");
			System.out.print("원하시는 메뉴를 선택해주세요 : ");
			String inChar = inputChar.next();
			
			switch (inChar) {
			case "강의정보" :
				System.out.println("풀스텍기반 JAVA수업");
				break;
				
			case "교사정보" :
				System.out.println("성함 : 김기원");
				kkw = true;
				break;
				
				default :
				kkw = false;
			
			}//switch 종료
			
			
			
		return kkw;
	}//교사관리 메서드 종료
		
		

		private static boolean mke(boolean total) {
		// 성적메서드
			
			Scanner in = new Scanner(System.in);
			System.out.print("점수를 입력해주세요 : ");
			int inInt = in.nextInt();
			
			if((100 >= inInt) && (90 <= inInt)) {
				System.out.println(inInt + "점은 A등급입니다.");
			}else if((89 >= inInt) && (80 <= inInt)) {
				System.out.println(inInt + "점은 B등급입니다.");
			}else if((79 >= inInt) && (70 <= inInt)) {
				System.out.println(inInt + "점은 C등급입니다.");
			}else if((69 >= inInt) && (60 <= inInt)) {
				System.out.println(inInt + "점은 D등급입니다.");
			}else if((59 >= inInt) && (0 <= inInt)) {
				System.out.println(inInt + "점은 F등급입니다.");
				total = true;
			}else {
				total = false;
			}
			
	
			
			
		return total;
	}//성적메서드 종료

		static boolean LoginOK(String id, String pw, boolean session) {
		// 로그인 여부 결정하는 메서드
			
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 id를 입력하세요.");
		System.out.print(">>");
		String inputId = inputLogin.next();// id입력
		
		System.out.println("로그인 pw를 입력하세요.");
		System.out.print(">>");
		String inputPw = inputLogin.next();//pw입력
		
		if(id.equals(inputId)&&pw.equals(inputPw)) {
			System.out.println("id와 pw가 일치합니다.");
			System.out.println("로그인 성공");
			session = true;
			
		}else {
			System.out.println("id와 pw가 일치하지않습니다.");
			System.out.println("로그인 실패");
			session = false;
		}// id pw 일치 판단용 if문 종료
		
		return session;
				
	}//로그인여부 메서드 종료
		
		
}//클래스 종료
