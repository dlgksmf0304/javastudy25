package ch1;

import java.util.Scanner;

public class AndTest {

	public static void main(String[] args) {
		// and����
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ ������ �����ڵ� ��ȯ �ص帳�ϴ�.");
		System.out.print("�Է� : ");
		
		int code = input.nextInt();
		
		if ((code > 65) & (code < 90 )) {
			System.out.println("��ȯ�� �����ڵ� �� : " + (char)code);
		}else if ((code>97)&(code<122)) {
			System.out.println("��ȯ�� �����ڵ� �� : " + (char)code);
		} else {
			System.out.println("�����ڵ� ��ȯ �Ұ����մϴ�.");
		}
		
		
		

	}

}
