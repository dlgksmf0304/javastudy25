package ch1;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// 
		
		String id = "lee";
		String pw = "123";
		
		
		Scanner input = new Scanner(System.in);//�ܿ�� !
		//�ֿܼ� ���� ��ü�� ����� ����
		
		System.out.print("id : ");
		String id1 = input.nextLine();
		System.out.println("�Է��� id : "+id1);
		
		System.out.print("pw :");
		String pw2 = input.nextLine();
		System.out.println("Ȯ�����Դϴ�.");
		
		if((id.equals(id1)&pw.equals(pw2))) {// & : and����Ʈ(�Է��� �� �� 1�϶� ����� 1�̉�)
		//id�� pw �� �� �´� ��� �α��� ����
			System.out.println("�α��μ���");
		}else {
		//id�� pw �� �� �ϳ��� �ٸ���� �α��� ����
			System.out.println("id�Ǵ� pw�� �ٸ��ϴ�.");
		}
		
		

	}

}
