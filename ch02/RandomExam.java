package ch02;

import java.util.Scanner;

public class RandomExam {

	public static void main(String[] args) {
		// 랜덤숫자 홀짝구분
		
		double random = Math.random()*6 + 1;
		System.out.println(random);
		
		int num = (int)random;
		System.out.println(num);
		
		Scanner in = new Scanner(System.in);
		System.out.print("숫자 : ");
		int number = in.nextInt();
		
		if (number % 2 == 0)//2로 나눴을때 나머지가 0
			System.out.println("짝수");
		else 
				System.out.println("홀수");//나머지가 0이 아니면 홀수
				System.out.println("끝");

	}

}
