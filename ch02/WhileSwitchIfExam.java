package ch02;

import java.util.Scanner;

public class WhileSwitchIfExam {//클래스 시작

	public static void main(String[] args) {//main메서드 시작
		// while, switch, if를 써서 성적처리 프로그램 만들기
		
		boolean run = true ;//무한반복용 코드
		Scanner inputInt = new Scanner(System.in);
		Scanner inputChar = new Scanner(System.in);
		int total = 0;
		
		while(run) {
		
		System.out.println("성적확인용 프로그램입니다.");
		System.out.println("원하는 항목을 선택해주세요");
		System.out.println("국어");
		System.out.println("수학");
		System.out.println("영어");
		System.out.println("평균");
		System.out.println("프로그램종료");
		System.out.print(">>>");
		String num = inputChar.next();
		
		
		
			
			switch(num) {
			case "국어" :
				System.out.println("국어점수를 입력해주세요.");
				System.out.print("점수 : ");
				int kor = inputInt.nextInt();
				
				if(kor <=100 && kor >= 90) {//국어점수 검증
					System.out.println("국어 A등급입니다.");
				}else if (kor <= 89 && kor >= 80) {
					System.out.println("국어 B등급입니다.");
				}else if (kor <= 79 && kor >= 70) {
					System.out.println("국어 c등급입니다.");
				}else if (kor <= 69 && kor >= 60) {
					System.out.println("국어 D등급입니다.");
				}else if (kor <= 59 && kor >= 0) {
					System.out.println("국어 F등급입니다.");
				}else {
					System.out.println("점수를 다시 확인해주세요.");
				}//switch문 안쪽 국어if문 종료
				break;
				
			case "수학" :
				System.out.println("수학점수를 입력해주세요.");
				System.out.print("점수 : ");
				int mat = inputInt.nextInt();
				
				if(mat <=100 && mat >= 90) {//수학점수 검증
					System.out.println("수학 A등급입니다.");
				}else if (mat <= 89 && mat >= 80) {
					System.out.println("수학 B등급입니다.");
				}else if (mat <= 79 && mat >= 70) {
					System.out.println("수학 c등급입니다.");
				}else if (mat <= 69 && mat >= 60) {
					System.out.println("수학 D등급입니다.");
				}else if (mat <= 59 && mat >= 0) {
					System.out.println("수학 F등급입니다.");
				}else {
					System.out.println("점수를 다시 확인해주세요.");
				}//switch문 안쪽 수학if문 종료
				break;
				
			case "영어" :
				System.out.println("영어점수를 입력해주세요.");
				System.out.print("점수 : ");
				int eng = inputInt.nextInt();
				
				if(eng <=100 && eng >= 90) {//영어점수 검증
					System.out.println("영어 A등급입니다.");
				}else if (eng <= 89 && eng >= 80) {
					System.out.println("영어 B등급입니다.");
				}else if (eng <= 79 && eng >= 70) {
					System.out.println("영어 c등급입니다.");
				}else if (eng <= 69 && eng >= 60) {
					System.out.println("영어 D등급입니다.");
				}else if (eng <= 59 && eng >= 0) {
					System.out.println("영어 F등급입니다.");
				}else {
					System.out.println("점수를 다시 확인해주세요.");
				}//switch문 안쪽 수학if문 종료
				break;
				
			case "평균" :
				System.out.print("수학 : ");
				mat = inputInt.nextInt();
				  	  
				System.out.print("영어 : ");
				eng = inputInt.nextInt();
				 
				System.out.print("국어 : ");
				kor = inputInt.nextInt();
				
				if (mat > 100 || mat < 0) {//점수검증
					System.out.println("수학점수를 잘못 입력하셨습니다.");
				}else if (eng > 100 || eng < 0) {//100점보다 크고 0점보다 작으면 안된다.
					System.out.println("영어점수를 잘못 입력하셨습니다.");
				}else if (kor > 100 || kor < 0) {
					System.out.println("국어점수를 잘못입력하셨습니다.");
				}else {//위에 모든 조건이 통과 됐을때 평균값을 계산한다.
				 
				  
				total = kor + mat + eng ;
				double avg = (double)total / 3 ; 
				System.out.println("평균 : " + avg);
				}//switch문 안쪽 평균if문 종료
				break;
				
				
				
			case "프로그램종료" :
				System.out.println("프로그램을 종료합니다.");
				run= false ;//while문 false선언
				break;
			
			}//switch문 종료
			
		}//while문 종료
		
		
		
		
		

	}//main 메서드 종료

}//클래스 종료
