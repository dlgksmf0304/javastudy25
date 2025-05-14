package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// break을 생락한 switch문
		
		
		int time = (int)(Math.random()*6)+7;//+뒤에 숫자를 변경하여 시간을 정하기
		System.out.println("현재시간은 " + time + "시 입니다.");
		
		switch(time) {
		case 6 :
			System.out.println("기상");
		case 7 :
			System.out.println("출근준비");
		case 8 :
			System.out.println("출근");
		case 9 :
			System.out.println("업무준비");
		case 10 : 
			System.out.println("업무중");
		default : 
			System.out.println("자바를 열심히 가르칩니다.");
			// break이 없기때문에 선택된 시간 이후 모든 내용이 다 나온다.
		}

	}

}
