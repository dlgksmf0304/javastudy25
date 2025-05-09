package ch1;

public class PromotionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 10;
		int intValue = byteValue ;
		System.out.println("자동타입 변환된 int : " + intValue);
		
		char charValue = '가';
		//char는 문자타입이기 때문에 '가'를 넣어서 변환한다
		intValue = charValue ;
		//위에 int intValue는 byteValue변수 지정해줬기 때문에
		//여기선 int지정 하지 않아도 된다.
		System.out.println("자동타입 변환된 int : " + intValue);
		
		
		
		

	}

}
