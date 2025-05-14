package ch1;

public class EqualsTest {

	public static void main(String[] args) {
		// equals사용해보기
		// 새로운 객체 생성
		

		String a = "하늘" ;
		String b = "하늘" ;
		String c = new String ("하늘") ;
		
		System.out.println(a == b);
		System.out.println(a == c);
		
		boolean z = a.equals(c);
		System.out.println(z);
		
		
		
		
	}

}
