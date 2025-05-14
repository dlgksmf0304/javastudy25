package ch02;

import java.util.Scanner;

public class IfExam2 {//클래스시작

	public static void main(String[] args) {//main메서드 시작
		// if�� ����Ͽ� ��� �� ����ϱ�
		int total = 0 ;
		System.out.print("과목 : ");
		Scanner in = new Scanner(System.in);
		String in1 = in.next();
		
		System.out.print("점수 : ");
		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		
		System.out.print("과목 : ");
		Scanner in2 = new Scanner(System.in);
		String in3 = in.next();
		
		System.out.print("점수 : ");
		Scanner b = new Scanner(System.in);
		int b1 = a.nextInt();
		
		System.out.print("과목 : ");
		Scanner in4 = new Scanner(System.in);
		String in5 = in.next();
		
		System.out.print("점수 : ");
		Scanner c = new Scanner(System.in);
		int c1 = a.nextInt();
		
		
		if(a1 > 100 || a1 < 0) {//점수검증
			System.out.println(in1 + " 점수 확인바랍니다.");
		}else if(b1 > 100 || b1 < 0) {
			System.out.println(in3 + " 점수 확인바랍니다.");
		}else if(c1 > 100 || c1 < 0) {
			System.out.println(in5 + " 점수 확인 바랍니다.");
		}else {
			total = a1 + b1 + c1 ;
			System.out.println(in1 +", " + in3+", " + in5 + "총 합은");
			System.out.println(total + "점 입니다.");
		}//
		
		System.out.println(in1 +", " + in3+", " + in5 + "의 평균을 구하시겠습니까 ?");
		System.out.println("yes 또는 no를 입력하세요.");
		
		double avg = (double) total / 3 ;
		
		String answer = in.next();
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("평균 : " + avg);
		}else {
			System.out.println("안녕히가세요.");
		}//평균계산 구하는 if문 종료
		
		
		
		

	}//main메서드 종료

}//클래스종료
