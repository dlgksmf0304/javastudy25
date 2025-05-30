package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;

public class HanaBankService extends AccountDTO{

	
	// 하나뱅크 부메뉴=================================================================================
	public void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		boolean run = true ;
		
		while(run) {
			System.out.println("===========================");
			System.out.println("하나은행 관리메뉴로 진입하셨습니다.");
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
				System.out.println("---계좌생성 화면으로 이동합니다.---");
				careateAccount(inputStr, inputInt, hanaBank);
				break;
			
			case "2" :
				System.out.println("---계좌목록 화면으로 이동합니다.---");
				accountLists(inputStr, inputInt, hanaBank);
				break;
				
			case "3" :
				System.out.println("---입금 화면으로 이동합니다.---");
				deposit(inputStr, inputInt, hanaBank);
				break;
				
			case "4" :
				System.out.println("---출금 화면으로 이동합니다.---");
				withdrawal(inputStr, inputInt, hanaBank);
				break;
				
			case "5" :
				System.out.println("---이체 화면으로 이동합니다.---");
				Transfer(inputStr, inputInt, hanaBank);
				break;
				
			case "6" :
				System.out.println("---이전 화면으로 되돌아갑니다.---");
				run = false;
				break;
				
			default : 
				System.out.println("1~6중에 선택해주세요.");

			}//하나은행 관리메뉴 선택 switch문 종료
			
			
		}//부메뉴 while문 종료
		
	}//하나은행 부메뉴 메서드 종료
// 이체 메서드 ==================================================================================================
	private void Transfer(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		System.out.println("----이체를 진행합니다.----");
		
		System.out.println("이체 하실 계좌 번호를 입력해주세요.");
		System.out.print(">>");
		String ano = inputStr.next();
		
		
		AccountDTO inputAccount = findAccount(ano, hanaBank);
		//배열에서 이체 할 계좌가 있는지 확인하는용
		
		if(inputAccount == null) {
			System.out.println("이체하실 계좌번호를 잘못입력하셨습니다.");
			System.out.println("계좌번호를 다시 확인해주세요.");
			return;
		}// if문 종료
		
		System.out.println("이체 받을 계좌번호를 입력해주세요.");
		System.out.print(">>");
		String inano = inputStr.next();
		
		AccountDTO inputAccount1 = FindAccount(inano, hanaBank);
		// 배열에서 이체받을 계좌가 있는지 화인하는용
		
		if(inputAccount1 == null) {
			System.out.println("이체 받을 계좌번호를 잘못입력하셨습니다.");
			System.out.println("계좌번호를 다시 확인해주세요.");
			return;
		}// if문 종료
		
		if(inputAccount != null && inputAccount1 != null) {
			System.out.print("이체하실 금액을 입력해주세요 : ");
			int money = inputInt.nextInt();
			if(inputAccount.getBalance() < money) {
				System.out.println("잔액이 부족합니다.");
			}//잔액확인용 if문 종료
			inputAccount.setBalance(inputAccount.getBalance() - money);
			inputAccount1.setBalance(inputAccount1.getBalance() + money);
			System.out.println("이체가 성공적으로 완료되었습니다.");
		}//계좌확인용 if문 종료
			

		
	}// 이체메서드 종료

	
//	이체받을 계좌찾기 메서드===========================================================================================
	private AccountDTO FindAccount(String inano, AccountDTO[] hanaBank) {

		
		AccountDTO account = null;
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] != null) {
				String dbAno = hanaBank[i].getAno();
				if(dbAno.equals(inano)) {
					account = hanaBank[i];
				}// 안쪽 if문 종료
			}//if문 종료
		}//for문 종료
		
		
		
	return account;
	
	
	
}//이체받을 계좌찾기 메서드 종료
	
	
	// 출금메서드 ====================================================================================================
	private void withdrawal(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		System.out.println("----출금을 진행합니다.----");
		
		System.out.print("계좌번호 : ");
		String ano = inputStr.next();
		
		System.out.print("출금액 : ");
		int money = inputInt.nextInt();

		AccountDTO inputAccount = findAccount(ano, hanaBank);
		//배열에서 객체를 찾아주고 객체를 리턴해준다.(반복코드 배제용)
		
		if(inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다.");
			return;
		}// if문 종료
		
//		System.out.println("입금 테스트 결과 : " + inputAccount);
		if(inputAccount.getBalance() < money) {
			System.out.println("잔액이 부족합니다.");
			return;
			//출금하려는 돈이 잔액보다 많은지 확인
		}else if(inputAccount.getBalance() > money){
			inputAccount.setBalance(inputAccount.getBalance() - money);
			//계좌안에 보관중인 돈에서 입력한 값을 출금한다
		System.out.println(inputAccount.getOwner() + "님 출금이 정상적으로 처리되었습니다.");
		System.out.println("잔액 : " + inputAccount.getBalance() + "원");
		System.out.println("---------------------");
		}//if문 종료
		
	}// 출금메서드 종료
	

//	입금 메서드 ===============================================================================================
	private void deposit(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		
		System.out.println("----입금을 진행합니다.----");
		
		System.out.print("계좌번호 : ");
		String ano = inputStr.next();
		
		System.out.print("입금액 : ");
		int money = inputInt.nextInt();
		
		AccountDTO inputAccount = findAccount(ano, hanaBank);
		//배열에서 객체를 찾아주고 객체를 리턴해준다.(반복코드 배제용)
		
		if(inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다.");
			return;
		}// if문 종료
		
		inputAccount.setBalance(inputAccount.getBalance() + money);
		//원래있던 계좌안 돈에서 입금한 돈을 더해서 넣는다.
//		System.out.println("입금 테스트 결과 : " + inputAccount);
		
		System.out.println(inputAccount.getOwner() + "님 입금이 정상적으로 처리되었습니다.");
		System.out.println("잔액 : " + inputAccount.getBalance() + "원");
		System.out.println("---------------------");
		
		
	}// 입금메서드 종료

	
//	계촤찾기 메서드 =============================================================================================
	private AccountDTO findAccount(String ano, AccountDTO[] hanaBank) {
	// 계좌번호를 이용해서 객체 찾기
		
		AccountDTO account = null; //빈객체
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] != null) {
				String dbAno = hanaBank[i].getAno();
				if(dbAno.equals(ano)) {
					account = hanaBank[i];
					//빈객체에 찾은 객체를 넣는다.
				}//같은번호인지 판단하는 if문종료
				
			}// 빈객체인지 판단하는 if문 종료
	
			
		}//for문종료

		
	return account;

	
}//계좌찾기 메서드 종료
	

	// 계좌목록보기 메서드======================================================================================
	private void accountLists(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		
		System.out.println("-----하나은행계좌리스트-----");
		
		for(int i = 0; i < hanaBank.length; i++) {
			AccountDTO accountlist = hanaBank[i];
			if(accountlist != null) {
				System.out.print(accountlist.getAno());
				System.out.print("\t");
				
				System.out.print(accountlist.getOwner());
				System.out.print("\t");
				
				System.out.print(accountlist.getBalance());
				System.out.print("\t\n");
				System.out.println("---------------------------");
				
			}//if문 종료
			
			
		}//for문 종료
		
		
	}// 계좌 목록보기 메서드 종료
	

// 계좌생성 메서드 ================================================================================================
	
	private void careateAccount(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		System.out.println("계좌생성합니다.");
		System.out.println("정보를 입력해주세요.");
		AccountDTO myAccount = new AccountDTO();
		
		System.out.print("계좌번호 : ");
		myAccount.setAno(inputStr.next());
		
		System.out.print("계좌주 : ");
		myAccount.setOwner(inputStr.next());
		
		System.out.print("입금액 :  ");
		myAccount.setBalance(inputInt.nextInt());
		myAccount.setBankname("하나"); //빈객체에 "하나"라는 데이터 입력 완료.
		
		//null값인 배열에 객체 삽입
		for(int i = 0 ; i < hanaBank.length; i++) {
			if(hanaBank[i] == null) {
				hanaBank[i] = myAccount;
				System.out.println("입력완료 : " + hanaBank[i]);
				System.out.println("계좌생성이 정상적으로 처리 되었습니다.");
				break; //null값인 모든 배열에 다 들어가기 때문에 break를 걸어줘야함
			}//계좌생성 가능한지 확인하는 if문 종료
	
		}//하나은행 배열 0에서부터 반복하는 for문 종료
		
		
	}// 계좌생성 메서드 종료


	
}//하나은행 클래스 종료
