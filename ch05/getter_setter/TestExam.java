package ch05.getter_setter;

import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		// 연습용 main메서드
		
		Scanner input = new Scanner(System.in);
		Test test = new Test();
		test.setName("이하늘");
		test.setNum(15);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>");
		String name =  input.next();
		
		System.out.println("이름 : " + Test.getName());
		System.out.println("자리번호 : " + Test.getNum());

	}// main메서드 종료

}//클래스 종료
