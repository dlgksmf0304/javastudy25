package ch1;

public class AccuracyExam {

	public static void main(String[] args) {
		// ��� 1���� 10�������� �ɰ��� 1������ 0.1�� ��
		// �׷� 0.1�� 1����� �θ�
		
		int apple = 1 ;//��� 1��
		double pieceUint = 0.1 ;//��� ���� ����
		int number = 7 ;//7����
		
		double result = apple - number * pieceUint ;
		// 1���� ������� 7������ ���� ���� ����
		System.out.println("7������ ���� ���� �� : " + result);
		//0.29999999999999993
		
		System.out.println("7������ �� : " + number * pieceUint);
		//0.7000000000000001
		// ��Ȯ�ϰ� �������� �ʱ� ������ �Ǽ��� ���� �ʴ°��� ����
		
		//��� 1���� �ɰ��� �Ҽ����� �������� ���ؼ� Ȱ���غ���
		//int�� Ȱ��
		int apple1 = 1 ; // ��� 1��
		int totalPieces = apple1 * 10 ; // 10���� ó����
		int number1 = 7 ; // ��� 1����
		int temp = totalPieces - number1 ; // 10���� - 7����
		
		double result1 = temp / 10.0 ; // ������ 10������ ����ġ
		System.out.println("��� ���� ���� �� : " + result1);
		//��� ���� ���� �� : 0.3
		//10�� ���ؼ� �ϸ� ��Ȯ�ϰ� ������
		

	}

}
