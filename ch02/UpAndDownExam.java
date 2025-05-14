package ch02;

import java.util.Scanner;

public class UpAndDownExam {

	public static void main(String[] args) {
		// up and down 랜덤게임 만들기
		
		int input = 0;
		int  answer = 0;
		
		answer = (int)(Math.random()*50)+1 ;//1~50까지의 랜덤수를 넣는다.
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1~50사이의 숫자를 입력하세요.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("down");
			}else if (input < answer) {
				System.out.println("up");
			}//if문 종료
			
		}//do-while문 종료
		 while (input!=answer);
		System.out.println("정답입니다." + answer);
		
		
		

	}//main메서드 종료

}//클래스 종료
