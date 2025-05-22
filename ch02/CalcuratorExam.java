package ch02;

import java.util.Scanner;

public class CalcuratorExam {
	
	
	static int plus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	}//plus 종료
	
	static int minus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	}// minus 종료
	
	static int times(int x1, int x3) {
		int x4 = 0;
		x4 = x1 * x3;
		return x4;
	}//times 종료
	
	static int divide(int x1, int x3) {
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	}//divide 종료

	public static void main(String[] args) {
		
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0;
		boolean run = true, run2 = true;
		
		String y1 = "연산기호";
		
		Scanner scInt = new Scanner(System.in);
		
		while (run) {
			if (x1 == 0) {
				System.out.println("숫자를 입력해주세요");
				x1 = scInt.nextInt();
			}
			
			System.out.println("부호를 선택해주세요");
			x2 = scInt.nextInt();
			
			System.out.println("숫자를 입력해주세요");
			x3 = scInt.nextInt();
			
			run2 = true;
			
			switch (x2) {
			
			case 1 :
				x4 = plus(x1, x3); y1 = "+";
				break;
				
			case 2 :
				x4 = plus(x1, x3); y1 = "-";
				break;
				
			case 3 :
				x4 = plus(x1, x3); y1 = "x";
				break;
				
			case 4 :
				x4 = plus(x1, x3); y1 = "/";
				break;
			
			}//switch 종료
			
			System.out.println("계산결과 : "+x1+""+y1+""+x3+" = "+x4);
			
			while(run2) {
				if(x4 != 0) {
					
					System.out.println("1. 종료하기");
					System.out.println("2. 다시하기");
					System.out.println("3. 이어서계산하기");
					
				}else {
					System.out.println("1. 종료하기");
					System.out.println("2. 다시하기");
				}//while안쪽 if 종료
				
				x5 = scInt.nextInt();
				
				switch (x5) {
				
				case 2 :
					x1 = 0;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;
				
				case 3 :
					x1 = x4;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;
					
				case 1 :
					run = false; run2 = false;
					break;
					
					default :
						System.out.println("숫자를 잘못 선택했습니다.");
						System.out.println("다시 입력해주세요.");
					
				}//while 안쪽 switch 종료
				
			}//while안쪽 while 종료
			
		}//while 종료
		
		
		
		
	}//main메서드 종료

}//클래스 종료
