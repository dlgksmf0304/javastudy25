package ch02;

public class IfNestedExam {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20) + 81;
		//81~100 사이값을 랜덤으로 발생
		
		
		System.out.println("현재 점수 : " + score);
		String grade ;
		if(score >= 90) {//if문시작
			if(score >= 95) {//90점 이상일때 if문시작
				grade = "A+";
			}else {
				grade = "A";
			}//90점 이상일때 if문 끝
		}else {//90점 이하일때 if문 시작
			if(score >= 85) {
				grade = "B+";
			}else {
				grade = "B";
			}//90점 이하을때 if문 끝
		}//if문 끝
		System.out.println("학점 : " + grade);
		
		
		

	}//main메서드 종료

}//클래스 종료
