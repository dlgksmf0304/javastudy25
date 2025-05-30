package ch05.overridetest;

public class ChildExam {

	public static void main(String[] args) {
		// 필드메서드 접근연습 main메서드
		
		Child child = new Child();
		Parent pr = child;
		
		pr.method1();//부모메서드와 오버라이드한 자식메서드 둘 다 출력됌
		pr.method2();//부모메서드와 오버라이드한 자식메서드 둘 다 출력됌
		
	}//main메서드 종료

}//클래스 종료
