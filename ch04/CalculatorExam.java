package ch04;

import java.util.Scanner;

public class CalculatorExam {

	public static void main(String[] args) {
		// 계산기프로그램 연습

		Calculator myCalc = new Calculator();	
		myCalc.poweron();
		
		int result1 = myCalc.plus(10, 20);
		System.out.println("10 + 20 = " + result1);
		
		int x = 30 ;
		int y = 10 ;
		int result2 = myCalc.minus(x, y);
		System.out.println(x + " - " + y + " = " + result2);
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int result3 = myCalc.multiply(a, b);
		System.out.println(a + " x " + b + " = " + result3);
		
		myCalc.poweroff();
		
		
		
	}//main메서드 종료

}//클래스 종료
