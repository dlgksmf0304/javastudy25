package ch1;

public class EqualsTest {

	public static void main(String[] args) {
		// equals����غ���
		// ���ο� ��ü ����
		

		String a = "�ϴ�" ;
		String b = "�ϴ�" ;
		String c = new String ("�ϴ�") ;
		
		System.out.println(a == b);
		System.out.println(a == c);
		
		boolean z = a.equals(c);
		System.out.println(z);
		
		
		
		
	}

}
