package ch02;

public class LottoBreakExam {

	public static void main(String[] args) {
		// break문
		// for, while, do-while문을 실행 중지할때 씀

		int i = 0;
		while (true) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.println("로또 번호 : " + num);
			i++;
			if(i == 6) {
				System.out.println("프로그램 종료");
				break;
			}//if문 종료
		}//while문 종료
		
		
	}//main메서드 종료

}//클래스 종료
