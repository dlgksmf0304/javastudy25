package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// 성적평균
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = input.next();
		
		System.out.print("수학 : ");
		int mat = input.nextInt();
		  	  
		System.out.print("영어 : ");
		int eng = input.nextInt();
		 
		System.out.print("국어 : ");
		int kor = input.nextInt();
		
		if (mat > 100 || mat < 0) {//점수검증
			System.out.println("수학점수를 잘못 입력하셨습니다.");
		}else if (eng > 100 || eng < 0) {//100점보다 크고 0점보다 작으면 안된다.
			System.out.println("영어점수를 잘못 입력하셨습니다.");
		}else if (kor > 100 || kor < 0) {
			System.out.println("국어점수를 잘못입력하셨습니다.");
		}else {//위에 모든 조건이 통과 됐을때 평균값을 계산한다.
		 
		  
		int total = mat + eng + kor ;
		double avg = (double)total / 3 ; 
		System.out.println("평균 : " + avg);
		
		}
		
		

	}

}
