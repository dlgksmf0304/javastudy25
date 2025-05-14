package ch1;

import java.util.Scanner;

public class OrTest {

	public static void main(String[] args) {
		// or연습
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int a = input.nextInt();
		if ((a%3 ==0 ) || (a %5==0)) {
			System.out.println("3또는 5의 배수입니다. " + a);
			
		}else {
			System.out.println("3또는 5의 배수가 아닙니다.");
		}//a라는 수를 3으로 나눴을때 나머지가 0이랑 똑같으면 3의 배수
		//a를 5로 나눴을때 나머지가 0이랑 똑같으면 5의 배수
		
		
		

	}

}
