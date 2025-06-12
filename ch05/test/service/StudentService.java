package ch05.test.service;

import java.util.Scanner;

import ch05.test.DTO.ScoreDTO;

public class StudentService {

	public void menu(Scanner inputInt, Scanner inputStr, ScoreDTO[] scores) {
		// 학생전용 메서드
		boolean run = true;
		
		while(run) {
			
			
			System.out.println("===학생전용===");
			System.out.println("1. 전체성적보기");
			System.out.println("2. 개인성적보기");
			System.out.println("3. 개인성적 평균보기");
			System.out.println("4. 뒤로가기");
			System.out.print(">>");
			String num = inputStr.next();
			
			switch(num) {
			case "1" :
				System.out.println("전체성적을 확인합니다.");
				StudentTotal(scores);
				break;
				
			case "2" : 
				System.out.println("개인성적을 확인합니다.");
				individual(inputStr, scores);
				break;
				
			case "3" : 
				System.out.println("개인성적 평균을 확인합니다.");
				Average(inputStr, scores);
				break;
				
			case "4" : 
				System.out.println("이전화면으로 돌아갑니다.");
				run = false;
				break;
				
			default :
				System.out.println("1~4값만 입력하세요.");
				break;
			
			
			
			}//switch문 종료
		
		}//while문 종료
		
		
	}//학생전용 메서드 종료

	
	
	// 개인성적 평균 메서드==============================================================
	private void Average(Scanner inputStr, ScoreDTO[] scores) {
		
		System.out.println("평균확인하고싶은 학생이름을 입력하세요.");
		System.out.print(">>");
		String name = inputStr.next();
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] != null && scores[i].getName() != null &&
					scores[i].getName().equals(name)) {
				
				int kor = scores[i].getKor();
				int eng = scores[i].getEng();
				int mat = scores[i].getMat();
				
				double total = kor + eng + mat ;
				double avg = total/3;
				
				System.out.println(name + "학생의 평균 : " + avg);
				break;
				
				
				
			}//if종료
			
			
			
		}//for종료
		
		
		
	}//개인성적 평균메서드 종료



	// 개인성적보기 메서드===============================================================
	private void individual(Scanner inputStr, ScoreDTO[] scores) {
		
		System.out.println("성적확인하고싶은 학생이름을 입력하세요.");
		System.out.print(">>");
		String name = inputStr.next();
		
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] != null && scores[i].getName() != null &&
					scores[i].getName().equals(name)) {
				System.out.println("===등록된 점수===");
				System.out.println("국어 : " + scores[i].getKor());
				System.out.println("영어 : " + scores[i].getEng());
				System.out.println("수학 : " + scores[i].getMat());
				System.out.println("------------------");
			
			}//if종료
			
		}//for 종료
		
		
		
	}//개인성적보기 메서드 종료
	
	

	// 전체성적보기 메서드 ====================================================================
	private void StudentTotal(ScoreDTO[] scores) {
		
		System.out.println("===지금까지 등록된 학생성적 리스트=== ");
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] != null && scores[i].getName() != null) {
				
			System.out.println("이름 : " + scores[i].getName());
			System.out.println("국어 : " + scores[i].getKor());
			System.out.println("영어 : " + scores[i].getEng());
			System.out.println("수학 : " + scores[i].getMat());
			System.out.println("------------------");
			}//if종료
		
		}//for 종료
		
		
	}// 전체성적보기 메서드 종료

}//클래스 종료
