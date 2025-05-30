package ch04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// singleton 연습 main메서드

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println("obj1과 obj2는 같은것인가 ? " + (obj1 == obj2));
		
		
		
		
	}//main메서드 종료

}//클래스 종료
