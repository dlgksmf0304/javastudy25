package ch05.overridetest;

public class OverrideTest { 
	//오버라이드 연습 부모 클래스
	
	double areaCircle (double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.14159 * r * r ;
		//r은 더블타입이고 3.14 x r x r 로 리턴한다.
	}
	
}
