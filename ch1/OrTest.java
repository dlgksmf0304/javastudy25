package ch1;

import java.util.Scanner;

public class OrTest {

	public static void main(String[] args) {
		// or����
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int a = input.nextInt();
		if ((a%3 ==0 ) || (a %5==0)) {
			System.out.println("3�Ǵ� 5�� ����Դϴ�. " + a);
			
		}else {
			System.out.println("3�Ǵ� 5�� ����� �ƴմϴ�.");
		}//a��� ���� 3���� �������� �������� 0�̶� �Ȱ����� 3�� ���
		//a�� 5�� �������� �������� 0�̶� �Ȱ����� 5�� ���
		
		
		

	}

}
