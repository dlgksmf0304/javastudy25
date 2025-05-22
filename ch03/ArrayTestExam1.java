package ch03;

import java.util.Scanner;

public class ArrayTestExam1 {

	public static void main(String[] args) {
		// 자판기만들기연습
		
		
		String[] drink = {"콜라", "사이다", "토레타", "생수"};
		int[] money = {1000, 1000, 1500, 800};
		Scanner input = new Scanner(System.in);
		String id = "lee";//관리자모드 id
		String pw = "123";//관리자모드 pw
		boolean mode = false;
		boolean run = true;
		
		
		while (run) {
			System.out.println("---------음료자판기--------");
			System.out.println("1.관리자모드  2.일반고객모드");//모드선택
			System.out.println("원하시는 모드를 선택해주세요.");
			System.out.print(">>");
			int num = input.nextInt();
			switch (num) {//모드선택 switch문 
			case 1:
				System.out.println("관리자모드입니다.");
				idpw(id, pw, mode);
				mode = true;
				System.out.println("원하는 목록을 선택해주세요.");
				System.out.println("1. 메뉴확인");
				int manunum = input.nextInt();
				
				switch(manunum) {//메뉴확인 switch문
				case 1 :
					System.out.println("---현재 메뉴 목록---");
					System.out.println("1. 콜라");
					System.out.println("2. 사이다");
					System.out.println("3. 토레타");
					System.out.println("4. 생수");
					break;
					
				
					
				}//메뉴확인 switch문 종료

				break;

			case 2:
				System.out.println("일반고객모드입니다.");
				System.out.println("금액을 충전해주세요.");
				System.out.print(">>");
				int money1 = input.nextInt();
				manu(money1);
				break;

			}//모드선택 switch문 종료
		}


	}//main 클래스 종료

	static void manu(int money1) {
		// 일반고객 메뉴선택메서드
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("금액이 충전되셨습니다.");
		System.out.println("원하시는 번호를 선택해주세요.");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 토레타");
		System.out.println("4. 생수");
		System.out.println("5. 금액확인");
		System.out.print(">>");
		int num = input.nextInt();
		//메뉴선택
		
		switch (num) {
		case 1 :
			System.out.println("1000원 입니다.");
			if(money1 > 1000) {
				System.out.println("음료와 거스름돈을 받아주세요.");
				System.out.println("거스름돈은 "+ (money1 - 1000) + "원 입니다." );
				System.out.println("안녕히가세요.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
			
			break;
		case 2 :
			System.out.println("1000원 입니다.");
			if(money1 > 1000) {
				System.out.println("음료와 거스름돈을 받아주세요.");
				System.out.println("거스름돈은 "+ (money1 - 1000) + "원 입니다." );
				System.out.println("안녕히가세요.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
			break;
			
		case 3 :
			System.out.println("1500원 입니다.");
			if(money1 > 1500) {
				System.out.println("음료와 거스름돈을 받아주세요.");
				System.out.println("거스름돈은 "+ (money1 - 1500) + "원 입니다." );
				System.out.println("안녕히가세요.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
			break;
			
		case 4 :
			System.out.println("800원 입니다.");
			if(money1 > 800) {
				System.out.println("음료와 거스름돈을 받아주세요.");
				System.out.println("거스름돈은 "+ (money1 - 800) + "원 입니다." );
				System.out.println("안녕히가세요.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
			break;
			
		case 5 :
			System.out.println("금액확인");
			System.out.println("현재 금액은 " + money1 + "원 입니다.");
			break;
			
		default :
			System.out.println("번호를 잘못 입력하셨습니다.");
			break;
		}//일반고객 메뉴선택 switch 종료
		
	}//일반고객 메뉴선택 메서드 종료


	static boolean idpw(String id, String pw, boolean mode) {
		// 관리자모드 메서드
		Scanner inputID = new Scanner(System.in);
		Scanner inputPW = new Scanner(System.in);
		
			System.out.println("로그인이 필요한 서비스입니다.");

			System.out.print("id : ");
			String inputid = inputID.next();
			
			System.out.print("pw : ");
			String inputpw = inputPW.next();
			
			if(id.equals(inputid) && pw.equals(inputpw)) {
				//관리자모드 id, pw 확인
				System.out.println("로그인에 성공하셨습니다.");
				mode = true;
			}else {
				System.out.println("id, pw를 확인해주세요.");
				mode = false;
			}//관리자모드 id, pw확인 if문 종료

			return mode ;
		
	}//관리자모드 메서드 종료

}//클래스종료
