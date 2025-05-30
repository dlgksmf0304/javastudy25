package ch04.statictast;

public class Calculator {
	// static연습
	
	// 필드 ==============================
	static double pi = 3.14159;
	
	// 생성자 ===============================
	static int plus(int x, int y) {
		return x + y ;
	}//plus 메서드 생성 후 x + y 값을 리턴한다.
	
	static int minus(int x, int y) {
		return x - y ;
	}// minus 메서드 생성 후 x - y 값을 리턴한다.
	
	
}
