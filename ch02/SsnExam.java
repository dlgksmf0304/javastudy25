package ch02;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// 주민번호로 남 여 구분하기
		
		System.out.print("주민전호를 입력하세요. : ");
		Scanner input = new Scanner(System.in);
		String regNo = input.nextLine();
		char a = regNo.charAt(6);//7번째 글자 선택
		
		
		
		System.out.println("주민번호 뒷자리 첫글자는 " + a + "입니다.");
		
		switch(a) {
		
		case '1' :
		case '3' :
		case '5' :
		case '7' :
			System.out.println(a + "(은)는 남자입니다.");
			break;
		
		case '2' :
		case '4' :
		case '6' :
		case '8' :
			System.out.println(a + "(은)는 여자입니다.");
			break;
			
		default :
			System.out.println("잘못입력하셨습니다.");
			System.out.println("다시한번 확인바랍니다.");
			
			
		}//스위치문 종료
		
		

	}//main메서드 종료

}//클래스 종료
