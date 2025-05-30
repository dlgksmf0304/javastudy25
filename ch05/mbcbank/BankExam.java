package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.service.HanaBankService;
import ch05.mbcbank.service.WoriBankService;

public class BankExam {// 계좌관리 프로그램 연습하기

//	필드====================================================================
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] woriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;
	
//	생성자==================================================================
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234", "이하늘", 10000, "하나");
		hanaBank[0] = accountDTO0;
		
		AccountDTO accountDTO1 = new AccountDTO("5678", "배혜민", 20000, "우리");
		woriBank[0] = accountDTO1;
		
		AccountDTO accountDTO2 = new AccountDTO("9876", "김샛별", 30000, "농협");
		nhBank[0] = accountDTO2;
		
	}

	
	
//메서드=======================================================================
	
	public static void main(String[] args) {
		//출력테스트 
//		System.out.println("하나은행 출력테스트 : " + hanaBank[0]);
//		System.out.println("우리은행 출력테스트 : " + woriBank[0]);
//		System.out.println("농협은행 출력테스트 : " + nhBank[0]);
		
		boolean run = true;
		
		while(run) {
			System.out.println("============================");
			System.out.println("은행관리 시스템에 오신것을 환영합니다.");
			System.out.println("============================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행");
			System.out.println("3. 농협은행");
			System.out.println("4. 프로그램 종료");
			System.out.println("원하시는 항목을 선택해주세요");
			System.out.print(">>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("하나은행으로 진입합니다.");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputStr, inputInt, hanaBank);
				break;
			
			case "2" :
				System.out.println("우리은행으로 진입합니다.");
				WoriBankService woriBankService = new WoriBankService();
				woriBankService.menu(inputStr, inputInt, woriBank);
				break;
				
			case "3" :
				System.out.println("농협은행으로 진입합니다.");
				break;
				
			case "4" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("1~4중에 선택해주세요.");
				break;
			
			
			}//주메뉴선택 switch문 종료
			
			
		}//주메뉴선택 while문 종료
		
		
		

	}//main메서드 종료

}//클래스 종료
