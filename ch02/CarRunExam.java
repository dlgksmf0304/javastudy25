package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차주행 프로그램
		
		Scanner input = new Scanner(System.in);
		boolean run = true ;// 시동걸기 (무한반복코드)
		int speed = 0 ;//차 속도
		final int MAXSPEED = 300 ;// 차 최고속도 (변경불가)
		final int MINSPEED = 0;// 차 최저속도(변경불가)
		
		System.out.println("차가 입고되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도 : " + speed + "km/h");
		
		while(run) {
			System.out.println("==================");
			System.out.println("0. 시동 끄기");
			System.out.println("1. 엑셀");
			System.out.println("2. 브레이크");
			System.out.println("3. 멀티미디어");
			System.out.println("4. 주유하기");
			System.out.println("==================");
			System.out.println("숫자 입력 : ");
			
			int select = input.nextInt();
			
			switch(select) {
			
			case 0 :
				System.out.println("시동을 끕니다.");
				run = false;//시동을 끄니까 false를 넣어 while문을 종료해줘야함
				break;
				
			case 1 :
				System.out.println("가속 합니다.");
				speed += 10;
				
				if(speed >= MAXSPEED) {
					
					speed = MAXSPEED;
					
				}//switch문 안쪽 if문 종료
				
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
				
			case 2 :
				System.out.println("감속 합니다.");
				speed -= 5 ;
				
				if(speed <=MINSPEED) {
					speed = MINSPEED;
				}//switch문 안쪽 두번째 if문 종료
				
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
				
			case 3 :
				System.out.println("멀티미디어를 실행합니다.");
				break;
				
			case 4 :
				System.out.println("주유를 진행합니다.");
				break;
			
			
			}//switch문 종료
			
			
		}//while문 종료
		
		System.out.println("자동차가 사라집니다.");
		

	}//main메서드 종료

}//클래스종료
