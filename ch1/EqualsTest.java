package ch1;

public class EqualsTest {

	public static void main(String[] args) {
		// equals»ç¿ëÇØº¸±â
		// »õ·Î¿î °´Ã¼ »ý¼º
		

		String a = "ÇÏ´Ã" ;
		String b = "ÇÏ´Ã" ;
		String c = new String ("ÇÏ´Ã") ;
		
		System.out.println(a == b);
		System.out.println(a == c);
		
		boolean z = a.equals(c);
		System.out.println(z);
		
		
		
		
	}

}
