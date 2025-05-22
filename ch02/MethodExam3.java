package ch02;

import java.util.Scanner;

public class MethodExam3 {

	public static void main(String[] args) {
		// 메서드빼기 연습 3

		
		String id = "lee";
		String pw = "2334";
		boolean idpw = true;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("엠비씨아카데미 홈페이지입니다.");
		System.out.println("원하는 항복을 선택해주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		int in = input.nextInt();
		
		switch (in){
		
		case 1 :
			System.out.println("회원가입을 진행합니다.");
			
			
			
			break;
			
		case 2 :
			System.out.println("로그인을 진행합니다.");
			idpw = login(id,pw,idpw);
			
			if(idpw == false) {
				System.out.println("id나 pw가 잘못입력됐습니다.");
			}
			
			break;
		
		}//swintch 종료
		
		
		
		
		
	}//main메서드 종료



	private static boolean login(String id, String pw, boolean idpw) {
		// 로그인 메서드
		
		Scanner inputid =  new Scanner(System.in);
		System.out.println("id : ");
		String input = inputid.next();
		
		System.out.println("pw : ");
		String inputpw = inputid.next();
		
		if(input.equals(id) && inputpw.equals(pw)) {
			System.out.println("로그인성공");
			idpw = true;
		} else {
			System.out.println("로그인실패");
			idpw = false;
		}
		
		
		
		
		return idpw ;
	}//로그인메서드 종료

}//클래스종료
