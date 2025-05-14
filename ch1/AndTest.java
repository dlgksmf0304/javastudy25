package ch1;

import java.util.Scanner;

public class AndTest {

	public static void main(String[] args) {
		// and연습
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 넣으면 유니코드 변환 해드립니다.");
		System.out.print("입력 : ");
		
		int code = input.nextInt();
		
		if ((code > 65) & (code < 90 )) {
			System.out.println("변환된 유니코드 값 : " + (char)code);
		}else if ((code>97)&(code<122)) {
			System.out.println("변환된 유니코드 값 : " + (char)code);
		} else {
			System.out.println("유니코드 변환 불가능합니다.");
		}
		
		
		

	}

}
