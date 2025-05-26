package ch04.mariokart;

import java.util.Scanner;

import ch04.mariokart.dto.CartDTO;
import ch04.mariokart.dto.CharacterDTO;
import ch04.mariokart.dto.GliderDTO;
import ch04.mariokart.dto.ItemDTO;
import ch04.mariokart.dto.MemberDTO;
import ch04.mariokart.dto.TireDTO;
import ch04.mariokart.serivce.MemberSerivce;

public class MarioKartExam {
	// 필드 -> main()메서드가 있는 필드 static용으로 만든다.
	public static Scanner input = new Scanner(System.in);
	
	public static MemberDTO[] memberDTOs = new MemberDTO[10];
	// 회원 10명
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15];
	// 캐릭터 15명
	public static CartDTO[] CartDTOs = new CartDTO[10];
	// 카트 자동차 10개
	public static GliderDTO[] GliderDTOs = new GliderDTO[8];
	// 글라이더 8개
	public static TireDTO[] TireDTOs = new TireDTO[5];
	// 타이어 5개
	public static ItemDTO[] ItemDTOs = new ItemDTO[15];
	// 아이템 15개
	
	
	public static MemberDTO LoginState ;
	// 로그인 성공시 객체를 가지고 있는 용도
	// 세션과 같은 기능
	
	//=======================================================================
	
	// 생성자 -> new MarioKartExam()로 객체를 생성하지 않는다.
	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오",3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지",3.2, 4.4, 3.1, 4.4, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오",3.4, 4.2, 3.2, 4.2, 3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.1, 4.7, 3.4, 4.5, 3.5);
		// 객체생성
		
		//객체를 배열에 넣어서 관리
		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;
		
		
	}// static 종료
	
	
//====================================================================================	
	
	public static void main(String[] args) {
		// 마리오카트 만들기 연습
		
		
		System.out.println("=========마리오카트 게임을 시작합니다.===========");
		boolean run = true ;
		
		while(run) {
			System.out.println("원하시는 항목을 선택해주세요.");
			System.out.println("1. 회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 게임종료");
			System.out.print(">>");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원관리 클래스로 진입합니다.");
				MemberSerivce memberSerivce = new MemberSerivce();
				LoginState = memberSerivce.menu(input, memberDTOs, LoginState);
				break;
				
			case "2" :
				System.out.println("카트관리 클래스로 진입합니다.");
				CartDTO cartDTO = new CartDTO();
				LoginState = cartDTO.menu(input, characterDTOs, LoginState);
				break;
				
			case "3" :
				System.out.println("게임실행 클래스로 진입합니다.");
				ItemDTO itemDTO = new ItemDTO();
				LoginState = itemDTO.menu(input, CartDTOs, LoginState);
				break;
				
			case "4" :
				System.out.println("게임을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("1~4번 숫자만 입력하세요.");
				break;
				
				
			}//switch 종료
		}//while 종료
		
		
		

	}//main메서드 연습

}//클래스종료
