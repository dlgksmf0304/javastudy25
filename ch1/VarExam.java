package ch1;

public class VarExam {

	public static void main(String[] args) {
		
		int x = 1 ;//int�� ����Ÿ�Ժ����̴�.
		
		char y = 65 ;//char�� ����Ÿ�Ժ������� ���ڷ� ��ȯ�Ǳ⵵�Ѵ�.
					 //�����ڵ�ǥ ����.(65�� A�� �ǹ���)
		
		char z = 'A' ;//���� z�� ���� A�� �־����� ����� A�� �Ǿ���
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		
		//��������
		
		int x1 ;//�ʱ�ȭ �ȵ� ������
		x1 = 10 ;//������ �ʱⰪ�� ���� ������ 10�� �־���
		System.out.println("x1 = " + x1);
		//�ֿܼ� �������� ����ϰ������ ��ȣ()�ȿ� x1�� ���� ������ 10�� ���
		
		//���� ���� ����
		
		int kor, mat, eng, total, avg ;//����,����, ����, ����, ���
		
		kor = 80 ;
		mat = 70 ;
		eng = 60 ;//���� �������� ���������༭ ���� ��������
		total = kor + mat + eng ;
		avg = total / 3 ;//����� �������� ������ 3
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		
		char firstname = '��' ;
		char firstName = '��';
		
		System.out.println("�� : " + firstname);
		System.out.println("�� : " + firstName);
		// ������ ��ҹ��ڴ� �ٸ� ������ �ν��Ѵ�.
		// �׷��⶧���� ������ ��ҹ��ڸ� �� �����ؾ��Ѵ�.
		
		
		// ���ͷ� : ���� �Էµ� ��!
		
		int literal1 = 75 ; // 10����
		int literal2 = 075 ; // 8����
		int literal3 = 0b0011 ; // 2����
		int literal4 = 0xA ; // 16����
				
		System.out.println("10���� 75 : " + literal1);
		System.out.println("8���� 75 : " + literal2);
		System.out.println("2���� 0011 : " + literal3);
		System.out.println("16���� A : " + literal4);
		//���� �𸣰������� ��ǻ�� ���� ���α׷��ӷ� �ٲ㼭 Ȯ���Ұ�
				
		


	}

}
