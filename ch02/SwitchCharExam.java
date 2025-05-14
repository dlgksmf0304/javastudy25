package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// 동등비교 연산자로 문자(char) 동등비교하기
		
		Scanner inchar = new Scanner(System.in);
		
		System.out.print("회원등급을 입력해주세요 : ");
		
		char a = inchar.next().charAt(0);
		
		switch(a) {
		
		case 'a' :
		case 'A' :
			System.out.println("VIP회원입니다.");
			break;
			
		case 'b' :
		case 'B' :
			System.out.println("우수회원입니다.");
			break;
			
		case 'c' :
		case 'C' :
			System.out.println("일반회원입니다.");
			break;	
			
		default :
			System.out.println("등급이 확인되지않습니다.");
			System.out.println("회원번호로 등급찾기를 하시겠습니까 ?");
			System.out.println("등급찾기를 원하시면yes를 눌러주세요.");
			String num = inchar.next();
			if(num.equalsIgnoreCase("yes")) {//등급찾기 if문
				System.out.println("등급 찾기입니다 회원번호를 입력해주세요.");
				System.out.print("회원번호 : ");
				
			
			
			char num1 = inchar.next().charAt(0);//0번째 번호를 선택한다
			
			switch(num1) {
			case '1' :
				System.out.println("A등급입니다.");
				break;
			case '2' :
				System.out.println("B등급입니다.");
				break;
			case '3' :
				System.out.println("C등급입니다.");
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				System.out.println("다시한번 확인해주세요.");
			}//if안쪽 스위치문 종료
				
			}//if문종료
			
			
		}//스위치문 종료
		
		
		

	}//메인메서드종료

}//클래스종료
