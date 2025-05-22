package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		int x = 1 ;//int는 정수타입변수이다.
		
		char y = 65 ;//char는 문자타입변수지만 숫자로 변환되기도한다.
		             //유니코드표 볼것.(65는 A를 의미함)
		
		char z = 'A' ;//변수 z를 문자 A로 넣었으니 출력이 A로 되야함
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		
		//변수선언
		
		int x1 ;//초기화 안된 변수임
		x1 = 10 ;//변수에 초기값이 없기 때문에 10을 넣어줌
		System.out.println("x1 = " + x1);
		//콘솔에 변수값만 출력하고싶으면 괄호()안에 x1만 쓰면 변수값 10만 출력
		
		//다중 변수 선언
		
		int kor, mat, eng, total, avg ;//국어,수학, 영어, 총합, 평균
		
		kor = 80 ;
		mat = 70 ;
		eng = 60 ;//위에 변수값을 지정안해줘서 따로 지정해줌
		total = kor + mat + eng ;
		avg = total / 3 ;//평균은 총합점수 나누기 3
		
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		
		
		char firstname = '김' ;
		char firstName = '이';
		
		System.out.println("성 : " + firstname);
		System.out.println("성 : " + firstName);
		// 변수명에 대소문자는 다른 변수로 인식한다.
		// 그렇기때문에 변수에 대소문자를 잘 구별해야한다.
		
		
		// 리터럴 : 직접 입력된 값!
		
		int literal1 = 75 ; // 10진수
		int literal2 = 075 ; // 8진수
		int literal3 = 0b0011 ; // 2진수
		int literal4 = 0xA ; // 16진수
				
		System.out.println("10진수 75 : " + literal1);
		System.out.println("8진수 75 : " + literal2);
		System.out.println("2진수 0011 : " + literal3);
		System.out.println("16진수 A : " + literal4);
		//값을 모르겠을때엔 컴퓨터 계산기 프로그래머로 바꿔서 확인할것
				
		


	}

}
