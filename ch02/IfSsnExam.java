package ch02;

import java.util.Scanner;

public class IfSsnExam {//클래스시작

	public static void main(String[] args) {//메인메서드 시작
		//주민번호로 성별구분, 나이, 태어난 계절 계산하기
		
		System.out.println("주민등록번호를 입력하세요(-생략) : ");
		Scanner input = new Scanner(System.in);
		
		String ssn = input.next();
		
		char ssn2 = ssn.charAt(6);//7번째 숫자를 선택(성별확인용)
		int num = Character.getNumericValue(ssn2);
		
		if(num % 2 == 0) {//성별 확인용 if문 시작
			//2로 나눴을때 나머지가 0(짝수)
			System.out.println("여자");
		}else if(num % 2 == 1) {
			//2로 나눴을때 나머지가 1(홀수)
			System.out.println("남자");
		}else {
			System.out.println("확인바랍니다.");
		}//성별확인용 if문 끝
		
		int year = Integer.parseInt(ssn.substring(0,2)); //태어난 년도 확인
		
		if(num == 1 || num == 2 || num == 5 || num == 6) {
			System.out.println("나이는 " + (2025 - (1900+year) + 1) + "입니다.");
			
		}else if(num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("나이는 " + (2025 - (2000+year) + 1) + "입니다.");
		}else {
			System.out.println("확인바랍니다.");
		}// 태어난 년도 확인용 if문 끝
		
		int month = Integer.parseInt(ssn.substring(2,4));//태어난 월 확인용
		
		if(month <= 0 || month >= 13) {
			System.out.println("확인바랍니다.");
		}else if(month >=3 && month <= 5) {
			System.out.println("봄에 태어났습니다.");
		}else if(month >=6 && month <= 8) {
			System.out.println("여름에 태어났습니다.");
		}else if(month >=9 && month <= 11) {
			System.out.println("가을에 태어났습니다.");
		}else  {
			System.out.println("겨울에 태어났습니다.");
		}//태어난 월 확인용 if문 종료
		
		

	}//main메서드 종료

}//클래스종료
