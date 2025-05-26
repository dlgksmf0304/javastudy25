package ch04.mariokart.dto;

import java.util.Scanner;

public class CartDTO {
	// 필드
	
	
	// 생성자
	
	
	// 메서드
	
	

	public MemberDTO menu(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginState) {
		
		// 카트메뉴
		
		//캐릭터선택==================================================================
		for(int i = 0; i < characterDTOs.length; i++) {
			if (characterDTOs[i] != null) {
				System.out.println("이름 : " + characterDTOs[i] );
			}//if 종료
		}//for 종료				
			System.out.println("캐릭터를 선택하세요.");
			System.out.print(">>");
			String selectChar = input.next();	
			
		for(int i = 0; i < characterDTOs.length; i++) {
			if(characterDTOs[i] != null && characterDTOs[i].name.equals(selectChar)) {
				loginState.characterDTO = characterDTOs[i];
				break;
				}
			
		}//for 종료
		System.out.println(loginState.nickName + "님은 " + loginState.characterDTO.name + "을 선택하셨습니다.");
	
		
		//카트 추진력 선택===========================================================================
		for(int i = 0; i < characterDTOs.length; i++) {
			if (characterDTOs[i] != null) {
				System.out.println((i + 1) + ". " + characterDTOs[i].acceleration);
			}//if 종료
		}//for 종료				
			System.out.println("원하시는 카트가속을 선택해주세요.");
			System.out.print(">>");
			String selectCar = input.next();	
			
		switch (selectCar) {
		case "1" :
			System.out.println("3.7 선택!!");
			break;
		
		case "2" :
			System.out.println("3.1 선택!!");
			break;
			
		case "3" :
			System.out.println("3.2 선택!!");
			break;
			
		case "4" :
			System.out.println("3.4 선택!!");
			break;
			
		default :
			System.out.println("1~4까지만 선택해주세요.");
			break;
		}//switch 종료
		
		// 카트스피드 선택==========================================================================
		for(int i = 0; i < characterDTOs.length; i++) {
			if (characterDTOs[i] != null) {
				System.out.println((i + 1) + ". " + characterDTOs[i].speed);
			}//if 종료
		}//for 종료				
			System.out.println("원하시는 카트속도를 선택해주세요.");
			System.out.print(">>");
			String CartGlider = input.next();
			
			switch(CartGlider) {
			case "1" :
				System.out.println("4.5 선택!!");
				break;
			
			case "2" :
				System.out.println("4.4 선택!!");
				break;
				
			case "3" :
				System.out.println("4.2 선택!!");
				break;
				
			case "4" :
				System.out.println("4.7 선택!!");
				break;
				
			default :
				System.out.println("1~4까지만 선택해주세요.");
				break;
			}//switch 종료
			
			
//===========핸들스텟===================================================================================================
			for(int i = 0; i < characterDTOs.length; i++) {
				if (characterDTOs[i] != null) {
					System.out.println((i + 1) + ". " + characterDTOs[i].handling);
				}//IF문 종료
			}//for문 종료
			System.out.println("원하시는 카트핸들을 선택해주세요.");
			System.out.print(">>");
			String CartHandling = input.next();
			
			switch(CartHandling) {
			case "1" :
				System.out.println("4.1 선택!!");
				break;
			
			case "2" :
				System.out.println("4.4 선택!!");
				break;
				
			case "3" :
				System.out.println("4.2 선택!!");
				break;
				
			case "4" :
				System.out.println("4.5 선택!!");
				break;
				
			default :
				System.out.println("1~4까지만 선택해주세요.");
				break;
			}//switch 종료
			

	//마찰력=============================================================================================================
		
			for(int i = 0; i < characterDTOs.length; i++) {
				if (characterDTOs[i] != null) {
					System.out.println((i + 1) + ". " + characterDTOs[i].friction);
				}//IF문 종료
			}//for문 종료
			System.out.println("원하시는 카트마찰력를 선택해주세요.");
			System.out.print(">>");
			String CartFriction = input.next();
			
			switch(CartFriction) {
			case "1" :
				System.out.println("3.8 선택!!");
				break;
			
			case "2" :
				System.out.println("3.2 선택!!");
				break;
				
			case "3" :
				System.out.println("3.4 선택!!");
				break;
				
			case "4" :
				System.out.println("3.5 선택!!");
				break;
				
			default :
				System.out.println("1~4까지만 선택해주세요.");
				break;
			}//switch 종료
			
			System.out.println("=====!!카트스텟 선택 완료!!=====");
			
			
		System.out.println(loginState.nickName + "님의 카트스텟이 선택 완료되었습니다.");
		System.out.println("선택하신 카트 스텟을 보시겠습니까 ?");
		System.out.println("1. YES | 2. NO");
		System.out.print(">>");
		String CartStats = input.next();
		
		switch(CartStats) {
		case "1" :
			System.out.println("캐릭터 : " + loginState.characterDTO.name);
			System.out.println("속도 : " + loginState.characterDTO.speed);
			System.out.println("가속 : " + loginState.characterDTO.acceleration);
			System.out.println("핸들 : " + loginState.characterDTO.handling);
			System.out.println("마찰력 : " + loginState.characterDTO.friction);
			break;
		
		case "2" :
			System.out.println("카트정보를 스킵합니다.");
			break;
		
		}//swich 종료
		
		System.out.println("===게임을 시작할 준비가 모두 끝났습니다.===");
		System.out.println("이제 게임을 즐겨주세요 !!!!!!!!!!");
		
		
		return loginState;
	
				
		
	}//카트메뉴 메서드 종료
	
	
	
	
	
}
