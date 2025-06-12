package ch05.test;

import java.util.Scanner;

import ch05.test.DTO.ScoreDTO;
import ch05.test.service.StudentService;
import ch05.test.service.TeacherService;

public class TestExam {//성적프로그램 만들기 main메서드
	
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static ScoreDTO[] scores = new ScoreDTO[5];  
	
	
	
	//생성자 ==============================================================
	

	static {
		ScoreDTO scoreDTO = new ScoreDTO();
		scores[0] = scoreDTO;
		
	}
	
	
// 메서드 ===============================================================
	public static void main(String[] args) {
	
		boolean run = true ;
		
		while(run) {
			System.out.println("======성적프로그램======");
			System.out.println("1. 교사전용");
			System.out.println("2. 학생전용");
			System.out.print("메뉴를 선택해주세요 : ");
			int select = inputInt.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("교사전용 화면으로 넘어갑니다.");
				TeacherService teacherService = new TeacherService();
				teacherService.menu(inputInt, inputStr, scores);
				break;
				
			case 2 :
				System.out.println("학생전용 화면으로 넘어갑니다.");
				StudentService studenService = new StudentService();
				studenService.menu(inputInt, inputStr, scores);
				break;
				
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("1~2번만 선택해주세요.");
				
			}//switch 종료
		}//while 종료
		
		
	}//main메서드 종료



}//클래스 종료
