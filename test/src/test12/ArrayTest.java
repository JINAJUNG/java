package test12;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� 1-5���� �� 1���� �Է��� �ּ���.");
		String numStr= sc.nextLine();

		int num = Integer.parseInt(numStr);

		int[] bea = new int[5];
		
		if(num==1) {
			System.out.println("1�̱�");
		}else if(num==2) {
			System.out.println("2�̱� ����?");
		}else if(num==3) {
			System.out.println("3�̱� �Ӹ��� ������");
		}else if(num==4) {
			System.out.println("��� ����");
		}else if(num==5) {
			System.out.println("last five");
		}else {
			System.out.println("�ϰ� �Է��� ���� : "+numStr);
			System.out.println("1~5�߿� ������ϱ�~");
			return;
		}
		bea[num-1]=num;
		System.out.println("�ϰ� �Է��� ���� : "+numStr);
		System.out.println("bea["+(num-1)+"]�� �� : "+bea[num-1]);
	}
}
