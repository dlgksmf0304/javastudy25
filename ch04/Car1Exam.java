package ch04;

public class Car1Exam {

	public static void main(String[] args) {
		// this연습 메인메서드

		
		Car1 mycar1 = new Car1(null) ;
		System.out.println("mycar1.company : " + mycar1.company);
		System.out.println();
		
		Car1 mycar2 = new Car1("자가용") ;
		System.out.println("mycar2.company : " + mycar2.company);
		System.out.println("mycar2.model : " + mycar2.model);
		System.out.println();
		
		Car1 mycar3 = new Car1("SUV", "흰색") ;
		System.out.println("mycar3.company : " + mycar3.company);
		System.out.println("mycar3.model : " + mycar3.model);
		System.out.println("mycar3.color : " + mycar3.color);
		System.out.println();
		
		Car1 mycar4 = new Car1("SUV", "검정",400) ;
		System.out.println("mycar4.company : " + mycar4.company);
		System.out.println("mycar4.model : " + mycar4.model);
		System.out.println("mycar4.color : " + mycar4.color);
		System.out.println("mycar4.maxSpeed : " + mycar4.maxSpeed);
		System.out.println();
		
		
		
		
	}//main메서드 종료

}//클래스종료
