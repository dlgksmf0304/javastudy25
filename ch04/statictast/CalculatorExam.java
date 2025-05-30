package ch04.statictast;

public class CalculatorExam {

	public static void main(String[] args) {
		// static 연습 main메서드
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.minus(50, 30);
		int result3 = Calculator.plus(60, 50);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}//main 메서드 종료

}// 클래스 종료
