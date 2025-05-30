package ch05.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		// getter_setter연습 main메서드
		Car myCar = new Car();
		
		// 잘못된 속도를 제공
		myCar.setSpeed(-50); // 값을 제공할땐 setter, 값을 받을때는 getter
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		

	}//main메서드 종료

}//클래스 종료
