package ch03;

public class ArrayCreateExam2 {

	public static void main(String[] args) {
		// 메서드랑 배열을 활용해서 평균 계산

		int sum = add(new int[] {90, 80, 90});
		System.out.println("총합 : " + sum);
		
		
		
	}//main 종료

		static int add(int[] scores) {
		// TODO Auto-generated method stub
			int sum = 0;
			for(int i = 0; i < 3 ; i++) {
				sum+= scores[i];
			}
			
			
			
		return sum;
	}

}//클래스 종료
