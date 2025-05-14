package ch1;

public class Test2 {

	public static void main(String[] args) {
		// 삼항연산자
		
		int a = 75;
		char b = (a>90) ? 'A' : ((a>80)? 'B' : 'C') ;
			System.out.println(a+"점은 "+b+"등급입니다.");
			//90점이 넘으면 A
			//90점에서 80점 사이이면 B
			//80점 이하면 C가 나옴

	}

}
