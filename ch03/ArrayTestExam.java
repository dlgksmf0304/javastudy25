package ch03;

import java.util.Scanner;

public class ArrayTestExam {

	public static void main(String[] args) {
		// 계산기프로그램 만들기

		Scanner input = new Scanner(System.in);
		Scanner inputmoney = new Scanner(System.in);
		String[] name = {"콜라","사이다","포카리스웨트"};
		
		
		System.out.println("음료수자판기입니다.");
		System.out.println("금액을 입력해주세요.");
		System.out.print(">>");
		int money = inputmoney.nextInt();

			

			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 포카리스웨트");
			System.out.println("4. 금액확인");
			System.out.println("원하시는 번호를 선택해주세요.");
			System.out.print(">>>");
			int num = input.nextInt();
			name = new String [num];
			
		switch (num) {//메뉴선택 switch문
			case 1:
				System.out.println("콜라를 선택하셨습니다.");
				col(money);
				break;

			case 2:
				System.out.println("사이다를 선택하셨습니다.");;
				sa(money);
				break;

			case 3:
				System.out.println("포카리스웨트를 선택하셨습니다.");
				po(money);
				break;

			case 4:
				System.out.println("금액확인을 선택하셨습니다.");
				cash(money);
				break;

			default:
				System.out.println("번호를 잘못 선택하셨습니다.");
				break;

			}//메뉴선택 switch문 종료

		
			
		
	}//main 메서드 종료

	static void cash(int money) {
		// 금액확인 메서드
		

			System.out.println("현재금액은 " + money + "원 입니다.");
		
		
		
	}//금액확인 메서드 종료

	static void po(int money) {
		// 포카리스웨트 메서드
		
			if(money >= 1500) {
				System.out.println("1500원입니다.");
				System.out.println("거스름돈 " + (money - 1500) + "원을 받으세요.");
			}else {
				System.out.println((money - 1500) + "금액이 부족합니다.");
			}//금액확인 if문 종료

		
		
	}//포카리스웨트 메서드 종료

	private static void sa(int money) {
		// 사이다 메서드
		
			if(money >= 1000) {
				System.out.println("1000원입니다.");
				System.out.println("거스름돈 " + (money - 1000) + "원을 받으세요.");
			}else {
				System.out.println((money - 1500) + "금액이 부족합니다.");
			}//금액확인 if문 종료
		
	}//사이다 메서드 종료

	static void col(int money) {
		// 콜라메서드
		
			if(money >= 1000) {
				System.out.println("1000원입니다.");
				System.out.println("거스름돈 " + (money - 1000) + "원을 받으세요.");
			}else {
				System.out.println((money - 1000) + "금액이 부족합니다.");
			}//금액확인 if문 종료
		
		
	}//콜라메서드 종료




}//클래스 종료
