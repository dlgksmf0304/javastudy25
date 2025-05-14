package ch02;

import java.util.Scanner;

public class IfSwitchExam {

	public static void main(String[] args) {
		// switch와 if문 같이 써보기
		
		Scanner input = new Scanner(System.in);//���ø��
		System.out.println("MBC아카데미 학원 메뉴입니다.");
		System.out.println("1. 학원소개");
		System.out.println("2. 강사소개");
		System.out.println("3. 수업소개");
		System.out.print("원하시는 메뉴를 선택해주세요 : ");
		
		int num = input.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("로그인이 필요한 서비스입니다.");
			System.out.println("회원가입을 하시겠습니까 ?");
			System.out.println("'yes' or 'no'");
			String in = input.next();
			  if (in.equalsIgnoreCase("yes")) {
				  System.out.println("사용하실 아이디를 입력해주세요 : ");
				  String id = input.next();
				  System.out.println(id+"(으)로 회원가입이 완료됐습니다.");
		}//스위치문 안쪽 if문 종료
			  else {
				  System.out.println("회원가입을 실패했습니다.");
				  System.out.println("안녕히가세요");
			  }break;
			  
		case 2 :
			System.out.println("강사소개 메뉴입니다.");
			break;
			
		case 3 :
			System.out.println("수업소개 메뉴입니다.");
			break;
		

	}//스위치문 종료

}//main메서드 종료
}//클래스종료
