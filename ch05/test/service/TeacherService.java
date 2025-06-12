package ch05.test.service;

import java.util.Scanner;

import ch05.test.DTO.ScoreDTO;

public class TeacherService {//선생님 전용 메서드
	
	

	public void menu(Scanner inputInt, Scanner inputStr, ScoreDTO[] scores) {
		
		boolean run = true ;
		
		while (run) {
			System.out.println("===교사전용===");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적수정");
			System.out.println("3. 성적삭제");
			System.out.println("4. 돌아가기");
			System.out.print(">>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("성적 입력을 진행하겠습니다.");
				scoreAdd(inputInt, inputStr, scores);
				break;
				
			case "2" :
				System.out.println("성적 수정을 진행하겠습니다.");
				scoreEdit(inputInt, inputStr, scores);
				break;
				
			case "3" :
				System.out.println("성적 삭제를 진행하겠습니다.");
				scoreOut(inputStr, scores);
				break;
				
			case "4" :
				System.out.println("이전화면으로 되돌아갑니다.");
				run = false;
				break;
			
			default :
				System.out.println("1~4 값만 입력해주세요.");
			
			
			}// switch종료
		}//while종료
		
		
		
	}//선생님 전용 메서드 종료

	// 성적삭제 메서드=================================================================
	private void scoreOut(Scanner inputStr, ScoreDTO[] scores) {
	
		System.out.println("성적을 삭제할 학생 이름을 입력하세요.");
		System.out.print(">>>");
		String name = inputStr.next();
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] != null && scores[i].getName() != null &&
					scores[i].getName().equals(name)) {
				scores[i] = null;
				System.out.println(name + "학생 성적이 삭제되었습니다.");
				break;
			}//if종료
		}//for종료
		
		
}//성적삭제 메서드 종료

	// 성적수정 메서드==========================================================================
	private void scoreEdit(Scanner inputInt, Scanner inputStr, ScoreDTO[] scores) {
	
		System.out.println("성적 수정을 시작합니다.");
		System.out.print("성적수정 학생 이름 : ");
		String name = inputStr.next();
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] != null && scores[i].getName() != null &&
					scores[i].getName().equals(name)) {
				System.out.println("===등록된 점수===");
				System.out.println("국어 : " + scores[i].getKor());
				System.out.println("영어 : " + scores[i].getEng());
				System.out.println("수학 : " + scores[i].getMat());
				System.out.println("------------------");
				
				System.out.println("수정할 점수를 입력하세요.");
				
				System.out.print("국어 : " );
				int editkor = inputInt.nextInt();
				
				System.out.print("영어 : " );
				int editeng = inputInt.nextInt();
				
				System.out.print("수학 : " );
				int editmat = inputInt.nextInt();
				
				System.out.println("=====변경된 점수=====");
				
				scores[i].setKor(editkor);
				scores[i].setEng(editeng);
				scores[i].setMat(editmat);
				
				System.out.println("국어 : " + scores[i].getKor());
				System.out.println("영어 : " + scores[i].getEng());
				System.out.println("수학 : " + scores[i].getMat());
				break;
			}//if문 종료
			
			
		}//for문 종료
		
		
}// 성적수정 메서드 종료
	
	
	

	// 성적입력 메서드 ===========================================================================

private void scoreAdd(Scanner inputInt, Scanner inputStr, ScoreDTO[] scores) {
	
	System.out.println("정보를 입력해주세요.");
	ScoreDTO myscore = new ScoreDTO();
	
	System.out.print("이름 : ");
	myscore.setName(inputStr.next());
	
	System.out.print("국어 : ");
	myscore.setKor(inputInt.nextInt());
	
	System.out.print("영어 : ");
	myscore.setEng(inputInt.nextInt());
	
	System.out.print("수학 : ");
	myscore.setMat(inputInt.nextInt());
	
	
	for(int i = 0 ; i < scores.length; i++) {
		if(scores[i] == null) {
			scores[i] = myscore;
			break;
		}//if문 종료
	}//for문 종료
	
	
	
}// 성적입력 메서드 종료
	

}//교사전용 메서드 종료
