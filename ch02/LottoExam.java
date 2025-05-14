package ch02;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 로또 당첨 프로그램
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("1부터 45까지의 번호중 6개를 입력하세요.");
		
		int myNum1 = in.nextInt();
		System.out.println("첫번째 번호 : " + myNum1);
		
		int myNum2 = in.nextInt();
		System.out.println("두번째 번호 : " + myNum2);
		
		int myNum3 = in.nextInt();
		System.out.println("세번째 번호 : " + myNum3);
		
		int myNum4 = in.nextInt();
		System.out.println("네번째 번호 : " + myNum4);
		
		int myNum5 = in.nextInt();
		System.out.println("다섯번째 번호 : " + myNum5);
		
		int myNum6 = in.nextInt();
		System.out.println("6번째 번호 : " + myNum6);//키보드로 6개번호를 입력받아 저장
		
		int num1 = (int) (Math.random()*45) + 1;
		int num2 = (int) (Math.random()*45) + 1;
		int num3 = (int) (Math.random()*45) + 1;
		int num4 = (int) (Math.random()*45) + 1;
		int num5 = (int) (Math.random()*45) + 1;
		int num6 = (int) (Math.random()*45) + 1;// 6개의 로또 랜덤번호 생성 후 저장
		
		int x = 0;//맞은숫자
		
		if (myNum1 == num1 || myNum1 == num2 || myNum1 == num3 || myNum1 == num4 ||
			 myNum1 == num5 || myNum1 == num6) {
			
			++ x;
		}
		if (myNum2 == num1 || myNum2 == num2 || myNum2 == num3 || myNum2 == num4 ||
				 myNum2 == num5 || myNum2 == num6) {
				
				++ x;
			}
		if (myNum3 == num1 || myNum3 == num2 || myNum3 == num3 || myNum3 == num4 ||
				 myNum3 == num5 || myNum3 == num6) {
				
				++ x;
			}
		if (myNum4 == num1 || myNum4 == num2 || myNum4 == num3 || myNum4 == num4 ||
				 myNum4 == num5 || myNum4 == num6) {
				
				++ x;
			}
		if (myNum5 == num1 || myNum5 == num2 || myNum5 == num3 || myNum5 == num4 ||
				 myNum5 == num5 || myNum5 == num6) {
				
				++ x;
			}
		if (myNum6 == num1 || myNum6 == num2 || myNum6 == num3 || myNum6 == num4 ||
				 myNum6 == num5 || myNum6 == num6) {
				
				++ x;
			}
		System.out.println("이번주 로또 당첨번호입니다.");
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
		
		if (x==0) {
			System.out.println("번호가 하나도 맞지 않습니다.");
		}else if (x==1) {
			System.out.println("1개 번호가 맞았습니다.");
		}else if (x==2) {
			System.out.println("2개 번호가 맞았습니다.");
		}else if (x==3) {
			System.out.println("3개 번호가 맞았습니다.");
		}else if (x==4) {
			System.out.println("4개 번호가 맞았습니다.");
		}else if (x==5) {
			System.out.println("5개 번호가 맞았습니다.");
		}else if (x==6) {
			System.out.println("6개 번호가 맞았습니다.");
		}else {
			System.out.println("다시 확인해주세요.");
		}

	}

}
