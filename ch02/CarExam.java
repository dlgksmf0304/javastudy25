package ch02;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		boolean run = true; // 무한반복용 코드
		int speed = 100;//현재 속도 100km/h로 지정
		int keycode = 0;//키보드로 입력되는 값
		
		while(run) {
			if(keycode != 13 && keycode != 10) {
				System.out.println("-------------");
				System.out.println("1.엑셀 | 2.브레이크 | 3.중지");
				System.out.println("-------------");
				System.out.println("선택 : ");
				
				
			}//while안쪽 if문 종료
			
			keycode = System.in.read();
			
			if (keycode == 49) {
				speed +=5;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == 50) {
				speed -= 5;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == 51) {
				run= false ;
				System.out.println("기능이 종료됩니다.");
				System.out.println("현재 속도 : " + speed);
				System.out.println("안전운전하세요");
			}
			
					
			
		}//while문 종료

		System.out.println("프로그램 종료");
		
		
	}//main 메서드 종료

}//클래스 종료
