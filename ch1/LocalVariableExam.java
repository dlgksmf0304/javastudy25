package ch1;

public class LocalVariableExam {

	public static void main(String[] args) {
		// ������ �������� ��ȣ(��) �ȿ��� ȿ���� ������
		
		int v1 = 20 ;
		int v2 = 0 ;
		if(v1>5) { //v1�� 5���� ũ�� �۵��Ѵ�
			v2 = v1 + 10 ;//v2�� v1 + 10 ���̴�
		}
		
		int v3 = v1 + v2 + 10 ;
		
		System.out.println("v1�� �� : " + v1 );//�ֵ���ǥ("")�ȿ� ���� �ְ�
		System.out.println("v2�� �� : " + v2 );//�� �ڿ� + �������� ������
		System.out.println("v3�� �� : " + v3 );//���ڿ� �Բ� ���� ���� ���´�.
	}

}
