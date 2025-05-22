package ch03;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// 배열을 이용해서 총합과 평균 구하기
		
		int[] scores = {100, 50, 78};//점수 지정
		
		System.out.println("scores[0]" + scores[0]);//scores변수에 등록된 첫번째 점수
		//0번부터 시작하기 때문에 scores뒤에 0을 넣음
		System.out.println("scores[1]" + scores[1]);//두번째 점수
		System.out.println("scores[2]" + scores[2]);//세번째 점수
		
		int total = 0;
		for(int i = 0; i < 3; i++ ) {
			total += scores[i];
		}
		
		System.out.println("총점 : " + total);
		double avg = (double)total/3;
		System.out.println("평균 : " + avg);
		

	}//main 종료

}//클래스 종료
