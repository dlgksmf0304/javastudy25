package ch04;

import java.util.Scanner;

public class CarExam {

   public static void main(String[] args) {
      // 자동차 주 실행 프로그램
      Scanner input = new Scanner(System.in);
      boolean run = true ;
      System.out.println("===차량정보 입력===");
      
      Car myCar = new Car();  // 기본생성자로 객체 생성
      // 생성시 속도과 rpm과 오일량은 기본값으로 생성
      System.out.print("제조회사 : ");
      myCar.company = input.next();
      
      System.out.print("모델 : ");
      myCar.model = input.next();
      
      System.out.print("색상 : ");
      myCar.color = input.next();
      
      
      while (run) {
    	 System.out.println("0. 차량 현재속도");
         System.out.println("1. 차량 정보확인");
         System.out.println("2. 차량 시동걸기");
         System.out.println("3. 차량 주행하기");
         System.out.println("4. 차량 주유하기");
         System.out.println("5. 차량 주유량확인");
         System.out.println("6. 차량 주행종료");
         System.out.print(">>>");
         String select = input.next();
         
         switch(select) {
         
         case "0" :
        	 myCar.speed();
        	 break;
        	 
         case "1" :
            System.out.println("차량명 : " + myCar.company);
            System.out.println("모델명 : " + myCar.model);
            System.out.println("색상 : " + myCar.color);
            break ;
         case "2" :
            System.out.println("차량에 시동이 걸렸습니다.");
            myCar.start();
            break ;
         
         case "3" :
        	 System.out.println("주행을 시작합니다.");
        	 myCar.run(input);
        	 break;
        	 
         case "4" :
        	 System.out.println("주유를 시작합니다.");
        	 myCar.oil(input);
        	 break;
        	 
         case "5" :
        	 System.out.println("=====현재주유량=====");
        	 myCar.fulloil();
        	 break;
         case "6" :
        	 System.out.println("주행을 종료합니다.");
        	 run = false;
        	 break;
        	 
        default : 
        	System.out.println("번호를 잘못 입력하셨습니다.");
        	break;
         }//스위치문 종료
         
         
      } // while문 종료
      
      

   }//main메서드 종료

}//클래스 종료

