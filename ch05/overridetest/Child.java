package ch05.overridetest;

public class Child extends Parent{
	//필드메서드 접근연습 자식클래스

	
	@Override//부모를 선택하지 않으면 오버라드창에 메서드가 뜨지 않는다.
	
	public void method1() {
		// 오버라이드 하기
		super.method1();
		System.out.println("자식메서드1 호출");
		System.out.println("Child-method1");
	}

	@Override
	public void method2() {
		// 오버라이드하기
		super.method2();
		System.out.println("자식메서드2 호출");
		System.out.println("Child-method2");
	}
	

}
