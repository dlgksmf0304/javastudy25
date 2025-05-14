package ch1;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// 
		
		String id = "lee";
		String pw = "123";
		
		
		Scanner input = new Scanner(System.in);//외울것 !
		//콘솔에 직접 객체를 만드는 문장
		
		System.out.print("id : ");
		String id1 = input.nextLine();
		System.out.println("입력한 id : "+id1);
		
		System.out.print("pw :");
		String pw2 = input.nextLine();
		System.out.println("확인중입니다.");
		
		if((id.equals(id1)&pw.equals(pw2))) {// & : and게이트(입력이 둘 다 1일때 출력이 1이다.)
		//id랑 pw 둘 다 맞는 경우 로그인 성공
			System.out.println("�α��μ���");
		}else {
		//id랑 pw 둘 중 하나라도 다른경우 로그인 실패
			System.out.println("id또는 pw가 다릅니다.");
		}
		
		

	}

}
