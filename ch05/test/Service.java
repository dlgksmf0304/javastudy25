package ch05.test;

import java.util.Scanner;

public class Service extends AccountDTO{

	public Service(int Kor, int eng, int mat, String name) {
		super(name, Kor, eng, mat);
		// TODO Auto-generated constructor stub
	}
	

	public Service() {
		// TODO Auto-generated constructor stub
	}




	public void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] service) {
		// 메뉴선택
		
		boolean run = true;
		
		while(run) {
			
		System.out.println("1. 점수입력");
		System.out.println("2. 점수보기");
		System.out.println("2. 평균보기");
		System.out.println("3. 뒤로가기");
		System.out.print(">>");
		String num = inputStr.next();
		
		switch(num) {
		case "1" :
			System.out.println("정보를 입력해주세요.");
			scores(inputInt, inputStr, service);
			
			break;
			
		case "2" :
			System.out.println("점수를 확인합니다.");
			check(inputInt, inputStr, service);
			break;
			
		case "3" :
			System.out.println("평균을 확인합니다.");
		
			break;
			
		case "4" :
			System.out.println("뒤로가기를 누르셨습니다.");
			run = false;
			break;
			
		}//switch문 종료
		
		}//while문 종료
		
	}//메서드 종료


	


	private void check(Scanner inputInt, Scanner inputStr, AccountDTO[] service) {
		// 점수보기 메서드 
		
		System.out.println("지금까지 입력된 학생들 점수입니다.");
		
		for (int i = 0; i < service.length; i++) {
		    if (service[i] != null) {
		        System.out.println("이름: " + service[i].getname());
		        System.out.println("국어: " + service[i].getKor());
		        System.out.println("영어: " + service[i].getEng());
		        System.out.println("수학: " + service[i].getMat());
		        System.out.println("-------------------------");
		    }
		}
		
		
	}// 점수보기 메서드 끝


	private void scores(Scanner inputInt, Scanner inputStr, AccountDTO[] service) {
		// 점수입력 메서드
		
		
		
		System.out.print("이름 입력: ");
	    String name = inputStr.next();

	    System.out.print("국어 점수: ");
	    int kor = inputInt.nextInt();

	    System.out.print("영어 점수: ");
	    int eng = inputInt.nextInt();

	    System.out.print("수학 점수: ");
	    int mat = inputInt.nextInt();
		
		AccountDTO student = new AccountDTO(name, kor, eng, mat);
	    
		for(int i = 0 ; i < service.length; i++) {
			if(service[i] == null) {
				service[i] = student;
//				System.out.println("입력완료 : " + service[i]);
				
				break;
			}
		}
		
		
	}// 점수입력 메서드 종료


	

	
	
	
}
