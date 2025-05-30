package ch05.overridetest;

public class OverrideTest1 extends OverrideTest{// 부모 선택
	// 오버라이드 연습 자식클래스
	
	
	@Override
	double areaCircle(double r) {
		
		System.out.println("Calculator 객체의 areaCircle()실행");
		return Math.PI * r * r;
	} 
	

}
