package ch05.test;

import java.util.Scanner;

public class TestExam {
	
	
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	
	public static AccountDTO[] service = new AccountDTO[10];
	public static int count = 0;
	
	static {
		AccountDTO accountDTO = new AccountDTO();
		service[0] = accountDTO;
		
	}
	
	
	
	public static void main(String[] args) {
		// 성적처리 프로그램 main메서드

		boolean run = true;
		
		while(run) {
			
		
		System.out.println("성적관리프로그램입니다.");
		System.out.println("1. 메인메뉴");
		System.out.println("2. 프로그램 종료");
		System.out.print(">>");
		int num = inputInt.nextInt();
		switch(num) {
		case 1 :
			System.out.println("메인메뉴로 진입합니다.");
			Service menu = new Service();
			menu.menu(inputStr, inputInt, service);
			break;
		case 2 :
			System.out.println("프로그램을 종료합니다.");
			run = false;
			break;
		}
		
		}
		
	}//main메서드 종료

}// 클래스 종료
