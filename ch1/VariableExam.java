package ch1;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach ;
		int distance ;
		mach = 340 ;
		distance = mach * 60 * 60 ;
		System.out.println("�Ҹ��� 1�ð����� ���� �Ÿ�");
		System.out.println(distance + "m");
		//������� ������ ���;��ϱ� ������
		//������� distance�� ���� �ڿ� ���� m�� ����Ѵ�.
		
		double radius ; 
		double area ;
		//double�� �Ǽ�Ÿ�� �����̴�.
		//�׷��� ������� 0���� ���������� �Ҽ����� ���´�.
		
		radius = 10 ;
		area = radius * radius * 3.14 ;//���� ���� ���
		
		System.out.print("��������" + radius + "��");
		System.out.println(" ���� ���� :" + area);
		//��°��� ���ٷ� ���;� �ϱ� ������ ù��° println���� ln�� ������
	}

}
