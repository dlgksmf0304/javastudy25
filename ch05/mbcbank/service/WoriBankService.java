package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;

public class WoriBankService extends AccountDTO{// 부모선택
	//우리 은행 서비스

	public void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] woriBank) {
		// 우리은행 메뉴
		boolean run = true;
		
		while(run) {//우리은행 메뉴선택 while문 시작
			System.out.println("==========================");
			System.out.println("우리은행 관리메뉴로 진입하셨습니다.");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌목록");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 돌아가기");
			System.out.print(">>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("----계좌생성 화면으로 이동합니다.----");
				careateAccount(inputInt, inputStr, woriBank);
				break;
				
			case "2" :
				System.out.println("----계좌목록 화면으로 이동합니다.----");
				accountLists(inputInt, inputStr, woriBank);
				break;
				
			case "3" :
				System.out.println("----계좌입금 화면으로 이동합니다.----");
				break;
				
			case "4" :
				System.out.println("----계좌출금 화면으로 이동합니다.----");
				break;
				
			case "5" :
				System.out.println("----계좌이체 화면으로 이동합니다.----");
				break;
				
			case "6" :
				System.out.println("----이전화면으로 이동합니다.----");
				break;
				
			default :
				System.out.println("1~6중에 선택해주세요.");
				
			}//우리은행 메뉴번호선택 swich문 종료
			
		}//메뉴선택 반복while문 종료
		
		
	}// 우리은행 메뉴 종료

	// 계좌 목록 메서드=======================================================================================
	private void accountLists(Scanner inputInt, Scanner inputStr, AccountDTO[] woriBank) {
	
		System.out.println("------우리은행 계좌목록------");
		
		for(int i = 0; i < woriBank.length; i++) {
			AccountDTO accountlists = woriBank[i];
			if(woriBank[i] != null) {
				System.out.print(accountlists.getOwner());
				System.out.print("\t");
				
				System.out.print( accountlists.getAno());
				System.out.print("\t");
				
				System.out.print(accountlists.getBalance());
				System.out.print("\t");
				System.out.println("=========================");
			}//if문 종료
			
			
		}//for문 종료
		
		
		
}//계좌목록보기 메서드 종료

		// 계좌생성 메서드====================================================================================
	private void careateAccount(Scanner inputInt, Scanner inputStr, AccountDTO[] woriBank) {
		
		System.out.println("계좌를 생성합니다.");
		System.out.println("정보를 입력해주세요");
		AccountDTO myAccount = new AccountDTO();
		
		System.out.print("계좌번호 : ");
		myAccount.setAno(inputStr.next());
		
		System.out.print("계좌주 : ");
		myAccount.setOwner(inputStr.next());
		
		System.out.print("입금액 : ");
		myAccount.setBalance(inputInt.nextInt());
		myAccount.setBankname("우리");
		
		for(int i = 0; i < woriBank.length; i++) {
			if(woriBank[i] != null) {
				woriBank[i] = myAccount;
//				System.out.println("완료 : " + woriBank[i]);
				System.out.println("계좌가 정상적으로 생성되었습니다.");
				break;
			}//if문 종료
		}//for문 종료
		
		
		
	}//계좌생성 메서드 종료

}//우리은행 서비스 종료
