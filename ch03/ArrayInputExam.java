package ch03;

import java.util.Scanner;

public class ArrayInputExam {

	public static void main(String[] args) {
		// 성적처리프로그램 만들기 연습

		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("=======성적처리 프로그램==========");
		System.out.print("학생수를 입력해주세요 : ");
		int count = inputInt.nextInt();
		System.out.println(count + "명의 성적을 입력하겠습니다.");
		//내가 입력해서 넣은 숫자가 count
		
		String[] names = new String[count];
		int[] kors = new int[count];//학생수만큼 입력해서 넣어야 하니까
		int[] mats = new int[count];//대괄호안에 count변수를 넣어야한다.
		int[] engs = new int[count];
		
		boolean run = true ;
		
		while (run) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체성적보기");
			System.out.println("3. 개인성적보기");
			System.out.println("4. 성적수정하기");
			System.out.println("5. 성적삭제하기");
			System.out.println("9. 프로그램종료");
			System.out.print("메뉴를 선택해주세요 : ");
			int select = inputInt.nextInt();
			
			switch(select) {
			
			case 1 :
				System.out.println("성적입력 메뉴입니다.");
				scoreAdd(names, kors, mats, engs);
				
				break;
				
			case 2 :
				System.out.println("전체성적보기 메뉴입니다.");
				total(names, kors, mats, engs);
				break;
				
			case 3 :
				System.out.println("개인성적보기 메뉴입니다.");
				nkme(names, kors, mats, engs);
				
				break;
				
			case 4 :
				System.out.println("성적수정하기 메뉴입니다.");
				scoreMod(names, kors, mats, engs);
				
				break;
				
			case 5 :
				System.out.println("성적삭제하기 메뉴입니다.");
				delete(names, kors, mats, engs);
				
				break;
				
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			
			default :
				System.out.println("메뉴를 정확히 선택해주세요");
				break;
			
			}//switch종료
			
			
		}//while 종료
		
		

	}//main메서드 종료

		private static void total(String[] names, int[] kors, int[] mats, int[] engs) {
		// 전체성적보기 메서드
			
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + "학생의 점수");
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
			}
			
		
	}//전체성적 보기 메서드 종료

		static void nkme(String[] names, int[] kors, int[] mats, int[] engs) {
		// 개인성적보기 메서드
			Scanner inputStr = new Scanner(System.in);
			System.out.println("확인하고싶은 학생 이름을 입력하세요.");
			System.out.print(">>");
			String name = inputStr.nextLine();
			
			for (int i = 0; i < names.length; i++) {
			if(names[i].equals(name)) {
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				System.out.println();
				
				
				
			}//if 종료
		}//for 종료
	}//개인성적보기 메서드 종료

		static void delete(String[] names, int[] kors, int[] mats, int[] engs) {
		// 성적삭제
		

			names = null;
			kors = null;
			mats = null;
			engs = null;
			System.out.println("성적이 삭제되었습니다.");
			
	
			
		
		
	}//성적삭제 메서드 종료

	private static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
		// 성적수정
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		System.out.print("수정할 학생 : ");
		String name = inputStr.nextLine();
		
		for (int i = 0; i < names.length; i++) {
			
			if(names[i].equals(name)) {
				//키보드로 쓴 이름과 수정하려고 쓴 이름이 같은지 비교
				System.out.println("====현재 점수 목록====");
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				System.out.println("==================");
				System.out.println("수정할 점수를 입력하세요.");
				
				System.out.print("국어 : ");
				kors[i] = inputInt.nextInt();
				
				System.out.print("수학 : ");
				mats[i] = inputInt.nextInt();
				
				System.out.print("영어 : ");
				engs[i] = inputInt.nextInt();
				System.out.println("수정완료");
				
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				break;
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}//성적수정 for종료
		
		
		
	}//성적수정 종료

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
		// 성적입력
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 : ");
			names[i] = inputStr.nextLine();
			
			System.out.print("국어 : ");
			kors[i] = inputInt.nextInt();
			
			System.out.print("수학 : ");
			mats[i] = inputInt.nextInt();

			System.out.print("영어 : ");
			engs[i] = inputInt.nextInt();
			
		}//지정된 인원수만큼 반복해서 성적입력하는 for문 종료
		
		System.out.println("성적입력 완료");
		
		
		
	}//성적입력메서드 종료

}//클래스종료
