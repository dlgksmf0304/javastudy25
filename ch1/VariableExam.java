package ch1;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach ;
		int distance ;
		mach = 340 ;
		distance = mach * 60 * 60 ;
		System.out.println("소리가 1시간동안 가는 거리");
		System.out.println(distance + "m");
		//결과값과 단위가 나와야하기 때문에
		//결과값인 distance를 쓰고 뒤에 단위 m을 써야한다.
		
		double radius ; 
		double area ;
		//double은 실수타입 변수이다.
		//그래서 결과값이 0으로 떨어지더라도 소수점이 나온다.
		
		radius = 10 ;
		area = radius * radius * 3.14 ;//원의 넓이 계산
		
		System.out.print("반지름이" + radius + "인");
		System.out.println(" 원의 넓이 :" + area);
		//출력값이 한줄로 나와야 하기 때문에 첫번째 println에서 ln을 삭제함
	}

}
