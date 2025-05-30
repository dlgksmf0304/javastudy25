package ch05.extendss.test;

public class ExtendsTestExam extends ExtendsTest{
	// ExtendsTest를 부모객체로 선택함
	
	int field2;
	void method2() {
		// 실행문
	}//메서드 종료
	

	public static void main(String[] args) {//main메서드
		
		ExtendsTestExam b = new ExtendsTestExam(); // 객체생성
		b.field1 = 10;
		b.method1();
		
		b.field2 = 20;
		b.method2();
		
		System.out.println(b);
		
	}//main메서드 종료

}//클래스 종료
