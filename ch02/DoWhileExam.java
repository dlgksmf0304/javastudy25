package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do-while문 사용해보기
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 x를 입력하세요. ");
		
		Scanner input = new Scanner(System.in);
		String inputString ;//키보드로 입력받은 값 저장용
		
		do {
			System.out.print(">>");
			inputString = input.nextLine();// string값 입력받기
			System.out.println("출력 : " + inputString);
		} while (!inputString.equals("x"));
		System.out.println("-------------");
		System.out.println("프로그램 종료");
		System.out.println("-------------");

	}//main메서드 종료

}//클래스 종료
