package ch02;

public class BreakOutterExam {

	public static void main(String[] args) {
		// break 라벨 문
		// break outter라는 라벨을 생성하고
		// 중지하고 싶은 반복문앞에 적으면 종료시점을 만들 수 있다.

		Outter : for(char upper='A'; upper<='Z'; upper++) {//A~Z까지 하나씩 반복된다
			for(char lower='a'; lower <='z' ; lower++) {//a~z까지 하나씩 반복된다
				System.out.println(upper + "-" + lower);
				if(lower=='c') {//c가 나오면 break문이 되도록 설정
					break Outter;//Outter 라벨문으로 break의 범위를 결정한다.
				}//if문 종료
			}//for문 안쪽 for문 종료
		}//for문 종료
		
		
		
		
	}//main 메서드 종료

}//클래스 종료
