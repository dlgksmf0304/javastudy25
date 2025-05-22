package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		// Member클래스를 호출하여 처리 해보기 연습
		
		Scanner input = new Scanner(System.in);
		Member[] members = null;
		
		System.out.println("가입할 회원수를 입력하세요.");
		System.out.print(">>");
		int count = input.nextInt();
		members = new Member[count];//키보드로 입력한 숫자만큼 생성
		
		System.out.println("회원가입 프로그램을 시작합니다.");
		boolean run = true;
		
		while (run) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원전체보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("1~5외에 다른 숫자를 입력하시면 꺼집니다.");
			System.out.print(">>");
			int num = input.nextInt();
			
			switch (num) {
			case 1 : 
				
				Member member1 = new Member();//객체 생성
				for(int i = 0; i < members.length; i++) {
				member1 = member1.memberAdd(input);// 생성된 객체 메서드 호출 및 실행
				//memberAdd()괄호 안에 input을 넣으면 Member 메서드에서도 스캐너를 쓸 수 있다.
				
				members[i] = member1;
				}
				break;
				
			case 2 : 
				Member member2 = new Member();//객체 생성
				
				member2.memberAllList(members);//회원 전체보기 메서드
				break;
				
			case 3 : 
				Member member3 = new Member();
				member3.memberLogin(members);//로그인 메서드
				break;
				
			case 4 : 
				Member member4 = new Member();
				member4.memberUpdate(members);//회원수정 메서드
				break;
				
			case 5 : 
				Member member5 = new Member();
				member5.memberDelete(members);//회원탈퇴 메서드
				break;
				
			default :
				System.out.println("회원가입 프로그램이 종료되었습니다.");
				run = false;

			}//switch 종료
			
			
		}//while문 종료
		
		

	}//main메서드 종료

}//클래스 종료
