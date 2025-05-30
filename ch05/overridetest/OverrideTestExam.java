package ch05.overridetest;

public class OverrideTestExam extends OverrideTest{

	public static void main(String[] args) {
		// 오버라이드 연습 main메서드
		
		int r = 10 ;
		
		OverrideTest over = new OverrideTest();
		System.out.println("원 면적 : " + over.areaCircle(r));
		System.out.println();
		
		OverrideTest1 over1 = new OverrideTest1();
		System.out.println("원 면적 : " + over1.areaCircle(r));
		System.out.println();
		
	}// main메서드 종료

}//클래스 종료
