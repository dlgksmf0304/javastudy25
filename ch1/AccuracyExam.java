package ch1;

public class AccuracyExam {

	public static void main(String[] args) {
		// 사과 1개를 10조각으로 쪼개면 1조각이 0.1이 됌
		// 그럼 0.1을 1개라고 부름
		
		int apple = 1 ;//사과 1개
		double pieceUint = 0.1 ;//사과 조각 단위
		int number = 7 ;//7조각
		
		double result = apple - number * pieceUint ;
		// 1개의 사과에서 7조각을 빼고 남은 수량
		System.out.println("7조각을 빼고 남은 수 : " + result);
		//0.29999999999999993
		
		System.out.println("7조각의 합 : " + number * pieceUint);
		//0.7000000000000001
		// 정확하게 떨어지지 않기 때문에 실수를 쓰지 않는 것이 좋음
		
		//사과 1개를 쪼갤때 소수점을 쓰지말고 곱해서 활용해볼것
		//int만 활용
		int apple1 = 1 ; // 사과 1개
		int totalPieces = apple1 * 10 ; // 10조각 처리용
		int number1 = 7 ; // 사과 1조각
		int temp = totalPieces - number1 ; // 10조각 - 7조각
		
		double result1 = temp / 10.0 ; // 위에서 10조각을 원위치
		System.out.println("사과 남은 조각 수 : " + result1);
		//사과 남은 조각 수 : 0.3
		//10을 곱해서 하면 정확하게 떨어짐
		

	}

}
