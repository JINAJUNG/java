package test22;

import java.util.Scanner;

public class StringToNumber {

	static Scanner sc = new Scanner(System.in);
	static int num = 0;
	public static boolean parseInt() {
		try {
			num = Integer.parseInt(sc.nextLine());
			return true;
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println("�Է��϶�� ���ڴ� ���Է��ϰ�");
			System.out.println("�ٽ� �Է���");
		}

		return false;
	}
	public static void main(String[] args) {

		boolean isOk = false;
		System.out.println("���� ��ȯ ���α׷��� �����մϴ�.");
		System.out.println("���ڸ� �Է��� �ּ���");
		while (!isOk) {
			isOk = parseInt();
		}
		System.out.println("�ϰ� �Է��� ���ڴ� " + num + "�̱���");
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
	}
	
	public static void test() {
		System.out.println('1');
		try {
			System.out.println('2');
			return;
		} catch (Exception e) {
			System.out.println('3');
		} finally {
			System.out.println('4');
		}
		System.out.println('5');
	}

}
