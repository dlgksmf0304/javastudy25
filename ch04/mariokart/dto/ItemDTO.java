package ch04.mariokart.dto;

import java.util.Scanner;

public class ItemDTO {

	public MemberDTO menu(Scanner input, CartDTO[] cartDTOs, MemberDTO loginState) {
		// 게임실행 메서드
		
		System.out.println(loginState.nickName + "님 어서오세요.");
		System.out.println("게임을 시작하시겠습니까 ?");
		System.out.println("1. START | 2. EXIT");
		String GameStart = input.next();
		
		switch(GameStart) {
		case "1" :
			System.out.println("마리오카트 게임을 시작합니다!!!!");
			break;
			
		case "2" :
			System.out.println("마리오카트 게임시작을 취소합니다.");
			break;
			
		default :
			System.out.println("START와 EXIT 둘 중 하나만 선택해주세요.");
			break;
		}//switch문 종료
		
		
		
		
		
		return loginState;
		
	
	}// 게임실행 메서드 종료

}
