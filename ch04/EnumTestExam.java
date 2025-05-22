package ch04;

import java.util.Scanner;

public class EnumTestExam {

	public static void main(String[] args) {
		// Test 이뮴에 만든 객체를 사용하여 연습해보기

		Scanner input = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		Test[] Tests = null;
		
		System.out.println("등록할 회원수를 기입해주세요.");
		System.out.print(">>");
		int conut = input.nextInt();
		
		names = new String[conut];
		ids = new String[conut];
		pws = new String[conut];
		Tests = new Test[conut];
		//변수타입을 enum에서 만든거로 한다.
		//변수타입을 enum에서 만든거로 하면
		
		System.out.println("회원가입을 시작합니다.");
		for(int i = 0; i < names.length; i++) {
			System.out.println("등록할 유형을 선택해주세요");
			System.out.println("학생");
			System.out.println("학부모");
			System.out.println("선생님");
			System.out.print(">>");
			String name = inputStr.next();
			//변수는 처음 만들면 0이기 때문에 몇개를 할건지 선언해줘야한다.
			
			switch (name) {
			case "학생" :
				Tests[i] = Test.학생;
				System.out.println("학생으로 가입합니다.");
				break;
				
			case "학부모" :
				Tests[i] = Test.학부모;
				System.out.println("학생으로 가입합니다.");
				break;
				
			case "선생님" :
				Tests[i] = Test.선생님;
				System.out.println("학생으로 가입합니다.");
				break;
				
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			
			}//switch문 종료
			
			System.out.print("이름 : ");
			names[i] = input.next();
			
			System.out.print("id : ");
			ids[i] = input.next();
			
			System.out.print("pw : ");
			pws[i] = input.next();
			
			System.out.println(names[i] + "님이 " + Tests[i] + "(으)로 가입 되셨습니다.");
			
			
		}//for문 종료
		
		
		for (int i = 0; i < names.length; i++) {
		System.out.println("====가입현황=====");
		System.out.println("이름 : " + names[i]);
		System.out.println("id : " + ids[i]);
		System.out.println("pw : " + pws[i]);
		System.out.println("유형 : " + Tests[i]);
		}
		
		
	}//main메서드 종료

}//클래스 종료
