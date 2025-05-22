package ch03;

import java.util.Scanner;

public class ArrayTestExam3 {

	public static void main(String[] args) {
		// 음료수자판기

		Scanner input = new Scanner(System.in);
		
		String[] drink = {"콜라", "사이다", "생수"};// 음료이름
		int[] money = {1500, 1300, 1000};//음료 가격
		int[] number = {5,5,5};// 음료 재고
		int[] sold = {0,0,0};//음료 판매량 확인 배열
		int[] total = {0};// 음료 총 합 금액 확인변수
	
		
		String id = "lee";//관리자 id
		String pw = "123";//관리자 pw
		boolean run = true;//while 반복재생용
		boolean mode = false;//관리자모드 로그인 실패시 돌아오기
		
		while (run) {
			System.out.println("----음료수 자판기----");
			System.out.println("원하는 모드를 선택해주세요");
			System.out.println("1.관리자 2.사용자");
			System.out.print(">>");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("관리자 모드입니다.");
				user(id, pw, drink, money, number, sold, total, mode);
				break;

			case 2:
				System.out.println("사용자 모드입니다.");
				user1(drink, money, sold, number, total);
				break;
			}//모드선택 switch종료	
				
		}//while종료
		
		
		
	}//main 메서드 종료

	private static void user1(String[] drink, int[] money, int[] sold, int[] number, int[] total) {
		// 사용자 메서드
		
		Scanner input = new Scanner(System.in);
		Scanner inputstr = new Scanner(System.in);
		boolean run = true;
		
	
		System.out.println("음료를 살 금액을 입금해주세요.");
		System.out.print(">>");
		int drinkmoney = input.nextInt();
		//돈 입금
		
		while (run) {//사용자 메뉴 while 종료
			System.out.println("원하는 메뉴를 선택해주세요.");
			System.out.println("1. 음료선택");
			System.out.println("2. 재고확인");			
			System.out.println("3. 나가기");
			System.out.print(">>");
			int num = input.nextInt();
			
			
			switch (num) {//사용자 메뉴 switch문 

			case 1:
				for (int i = 0; i < drink.length; i++) {
					System.out.println((i+1) + "." + drink[i] + " > " + money[i] + "원");
				}
				System.out.println("원하는 음료를 선택해주세요 : ");
				int manu = input.nextInt() -1;
				if (drinkmoney >= money[manu]) {
					int change = drinkmoney - money[manu];// 잔돈계산
					System.out.println(drink[manu] + "를 선택했습니다.");
					
					
					number[manu]--;//재고차감
					sold[manu]++;//판매 된 음료 수량 업
					total[0] += money[manu];//총합 계산
				
					System.out.println("현재 잔액 : " + (drinkmoney -= money[manu]));
					
				}else {
					System.out.println("금액이 부족합니다.");
				}//음료선택 종료
				
				break;
				
			case 2 : 
				for (int i = 0; i < drink.length; i++) {
					System.out.println(drink[i] + "재고 : " + number[i]); 
				}
				break;
				
			case 3 : 
				System.out.println("사용자모드를 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("잘못 선택하셨습니다.");
				break;
				

			}//사용자 메뉴 switch문 종료
		}//사용자메뉴 while 종료
		
		
		
	}// 사용자 메서드 종료

	static boolean user(String id, String pw, String[] drink, int[] money, int[] number, int[] sold, int[] total, boolean mode) {
		// 관리자 메서드
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		boolean run = true;
		
		
		System.out.println("로그인이 필요한 서비스입니다.");
		System.out.print("id : ");
		String inputid = input.next();
		
		System.out.print("pw : ");
		String inputpw = input.next();
		
		if (id.equals(inputid) && pw.equals(inputpw)) {
			//관리자모드 로그인 판단 if문
			System.out.println("로그인에 성공하셨습니다.");
		}else {
			System.out.println("로그인에 실패하셨습니다.");
			System.out.println("id또는 pw를 확인해주세요.");
			run = false;
		}//관리자모드 로그인 판단 if문 종료
		
		while (run) {
			System.out.println("1. 메뉴수정");
			System.out.println("2. 가격수정");
			System.out.println("3. 총 매출 보기");
			System.out.println("4. 나가기");
			System.out.println("원하는 메뉴를 선택해주세요.");
			System.out.print(">>");
			int num = input.nextInt();
			
			switch (num) {//메뉴선택 switch문
			case 1:
				System.out.println("메뉴수정을 선택하셨습니다.");
				for (int i = 0; i < drink.length; i++) {//메뉴 변경
					System.out.print(drink[i] + "> 변경할 이름 : ");
					drink[i] = input1.next();
				}
				break;

			case 2:
				System.out.println("가격수정을 선택하셨습니다.");
				for (int i = 0; i < money.length; i++) {
					System.out.print(money[i] + " > 새로운 가격 : ");
					money[i] = input.nextInt();
				}
				break;

			case 3:
				System.out.println("총 매출 보기 선택하셨습니다.");
				for (int i = 0; i < sold.length; i++) {
					System.out.println(drink[i] + " : " + sold[i] + "개");
				}
				System.out.println("총 매출 : " + total[0] + "원");
				break;

			case 4:
				System.out.println("관리자모드에서 나갑니다.");
				run = false;
				break;

			default :
				System.out.println("잘못 선택하셨습니다.");
				break;
			}//메뉴선택 switch문 종료
		}//while 종료
		

		return run;
	}//관리자 메서드 종료


}//클래스 종료
