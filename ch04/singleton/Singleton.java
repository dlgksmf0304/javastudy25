package ch04.singleton;

public class Singleton {
	// singleton연습
	
	// 정적 필드===================================================
	private static Singleton singleton = new Singleton();
	
	
	// 생성자 =====================================================
	private Singleton() {
		
	}
	
	//정적 메서드 =================================================

	public static Singleton getInstance() {
		return singleton;
	}
	
	
}
