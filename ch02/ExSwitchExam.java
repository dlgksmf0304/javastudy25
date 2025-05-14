package ch02;

import java.util.Scanner;

public class ExSwitchExam {

	public static void main(String[] args) {
		// case 뒤에 값이 여러개 존재 할 수 있다.
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("둥물 이름 : ");
		String Monster = in.nextLine();
		String kind = WhoIsIt(Monster);
		System.out.println(Monster + "는 "+ kind + "그룹 동물입니다.");
		
	}//main메서드 종료
	
	//메서드 추가
	
	static String WhoIsIt(String Monster) {
		String kind = "미지의 생물";
		switch(Monster) {
		case "호랑이", "사자", "강아지", "고양이", "고래" -> kind = "포유류";
		//향상된 switch문에는 break를 사용 할 수 없다.
		case "독수리", "참새", "까마귀", "비둘기", "닭" -> kind = "조류";
		
		case "고등어", "연어", "참치", "갈치", "꽁치" -> kind = "어류";
		
		default -> System.out.println("등록되지 않은 monster입니다.");
		 
		}//switch문 종료
		
		return kind;
		
	}//WhoIsIt메서드 종료
	
	

}//클래스 종료
