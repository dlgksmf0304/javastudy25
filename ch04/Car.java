package ch04;

import java.util.Scanner;

public class Car {
   // 필드 (객체가 가지고 있어야 하는 값) -> 글로벌변수(GV)
   // 고유 데이터
   public String company ; // 제작회사(현대,기아,KGM,쉐보레,아우디)
   public String model ; // 아반테, 그렌져, 쏘나타
   public String color ; // 빨강, 은색, 검정색, 흰색
   public int maxSpeed ; // 최고속도
   public String oilType ; // 경유, 휘발유
   
   // 상태값(변동가능)
   public int speed ; 
   public int rpm ; 
   public int oil ;
   
   // 부품 -> 다른 클래스를 생성하여 연결한다.
//   public Body body;
//   public Engine engine;
//   public Tire tire ;
   
   // 부품에 필드 사용법
   // Car myCar = new Car(); -> 객체 생성(인스턴스)
   // myCar.maxSpeed = 300 ; -> 객체 있는 maxSpeed에 300 정수를 넣는다.
   // ----------------------------------------------------------
   
   
   // 기본생성자:생략가능 (객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름)
   public Car() {
      speed = 0 ;
      rpm = 50 ;
      oil = 50 ;
   } // 객체가 생성되면서 변수에 값이 저장됨.
   
   // 사용자지정 생성자-> 개발자가 응용하는 기법
   // 사용자 지정 생성자가 만들어 지만 기본생성자는 자동으로 생성되지 않는다.
   public Car(String company, String model, String color) {
      this.company = company ; 
      this.model = model ;
      this.color = color ;
   } // Car myCar = new Car("벤츠","이클레스","빨강") ;
      
   
   
   // 메서드 (객체가 수행해야 되는 동작)
   // c(시동시작) r(차량상태, 주행상태) u(가속, 감속, 주차) d(시동종료)
   public void start() {
      System.out.println(this.model+"가(이) 주행을 시작합니다. ");
      System.out.println("현재 속도 : " + this.speed);
      System.out.println("현재 rpm : " + this.rpm);
      System.out.println("현재 주유량 : " + this.oil);
   }
   //자동차 최대, 최소 속도(변경안됌)
   public int MAXSPEED = 200;
   public int MINSPEED = 0;
   
   //자동차 주행 
   public void run(Scanner input) {
	   

	  System.out.println("1. 가속");
	  System.out.println("2. 감속");
	  System.out.print(">>");
	  int speed = input.nextInt();
	  
	  switch(speed) {
	  case 1 : 
		  if(this.oil > 0) {//기름확인if문
		  
		  if(this.speed >= MAXSPEED) {//속도확인 if문
			  System.out.println("===최고속도입니다.===");
			  System.out.println("더이상 가속할수없습니다.");
		  }else {
			  this.speed += 50 ;
			  this.oil -= 10 ;
			  System.out.println("가속을 진행합니다.");
			  System.out.println("현재 속도 : " + this.speed + "km/h");
			  if(this.oil == 20) {// 주유권유 if문
				  System.out.println("기름이 20L남았습니다.");
				  System.out.println("기름이 떨어지기전에 주유를 해주세요.");
			  }// 주유 권유 if문 종료
		  	}//속도확인 if문 종료
		  }else {
			  System.out.println("=====기름이 부족합니다.=====");
			  System.out.println("주유를 해주세요.");
		  }//기름확인 if문 종료
		  break;
		  
	  case 2 : 
		  if(this.oil > 0) {//기름확인 if문
		  
			  if(this.speed <= MINSPEED) {//속도확인 if문
				  System.out.println("===최하속도입니다.===");
				  System.out.println("더이상 감속할수없습니다.");
			  }else {
				  this.speed -= 10 ;
				  this.oil -= 10 ;
				  System.out.println("감속을 진행합니다.");
				  System.out.println("현재 속도 : " + this.speed + "km/h");
				  if(this.oil == 20) {// 주유권유 if문
					  System.out.println("기름이 20L남았습니다.");
					  System.out.println("기름이 떨어지기전에 주유를 해주세요.");
				  }// 주유 권유 if문 종료
		  		}//속도확인 if문 종료
		  	}else {
			  System.out.println("======기름이 부족합니다.======");
			  System.out.println("주유를 해주세요.");
		  }//기름확인 if문 종료
		  break;
		  
	  }//switch문 종료

	  
   }//자동차 주행문 종료

   
  
public void speed() {//현재속도 확인
	System.out.println("현재 속도 : " + this.speed + "km/h");
	
}//현재속도 확인 종료

public void oil(Scanner input) {
	// 자동차 주유하기메서드
	
	System.out.println("주유하실 종류를 선택해주세요.");
	System.out.println("1. 경유");
	System.out.println("2. 휘발유");
	int oilnum = input.nextInt();
	
	switch(oilnum) {//경유, 휘발위 선택 switch문
	case 1 :
		System.out.println("경유를 선택하셨습니다.");
		System.out.println("주유할 양을 선택해주세요.");
		System.out.println("1.  50L | 2. 100L");
		System.out.print(">>");
		int oil1 = input.nextInt();
		
		switch(oil1) {
		case 1 : 
			System.out.println("주유를 시작합니다.");
			System.out.println("현재 주유량 : " + (oil += 50) + "L 입니다.");
			System.out.println("주유를 완료하였습니다.");
			break;
		case 2 : 
			System.out.println("주유를 시작합니다.");
			System.out.println("현재 주유량 : " + (oil += 100) + "L 입니다.");
			System.out.println("주유를 완료하였습니다.");
			break;
		}//경유주유 switch문 종료
		
		break;
		
	case 2 :
		System.out.println("휘발유를 선택하셨습니다.");
		System.out.println("주유할 양을 선택해주세요.");
		System.out.println("1.  50L | 2. 100L");
		System.out.print(">>");
		int oil2 = input.nextInt();
		
		switch(oil2) {
		case 1 : 
			System.out.println("주유를 시작합니다.");
			System.out.println("현재 주유량 : " + (oil += 50) + "L 입니다.");
			System.out.println("주유를 완료하였습니다.");
			break;
		case 2 : 
			System.out.println("주유를 시작합니다.");
			System.out.println("현재 주유량 : " + (oil += 100) + "L 입니다.");
			System.out.println("주유를 완료하였습니다.");
			break;
		}//휘발유주유 switch문 종료
		
		break;
	}//오일선택 switch 종료
	
	
}//자동차주유하기 메서드 종료

//자동자 주유량 확인메서드
public void fulloil() {
	System.out.println("현재 남아있는 기름은 " + oil + "L 입니다.");
}//자동차 주유량 확인 메서드 종료



   
}

