package ch04;

public class Calculator {
	//계산기프로그램 연습 메서드
	
	void poweron() {
		System.out.println("전원을 킵니다.");
	}
	
	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	int minus(int x , int y) {
		int result = x - y ;
		return result;
	}
	
	int multiply(int x , int y) {
		int result = x * y ;
		return result;
	}
	
	double divide(int x , int y) {
		double result = (double)x / (double)y ;
		return result;
	}
	
	int remainder(int x , int y) {
		int result = x % y;
		return result;
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	

}
