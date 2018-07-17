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
			System.out.println("입력하라는 숫자는 안입력하고");
			System.out.println("다시 입력해");
		}

		return false;
	}
	public static void main(String[] args) {

		boolean isOk = false;
		System.out.println("숫자 변환 프로그램을 시작합니다.");
		System.out.println("숫자를 입력해 주세요");
		while (!isOk) {
			isOk = parseInt();
		}
		System.out.println("니가 입력한 숫자는 " + num + "이구나");
		System.out.println("프로그램이 정상적으로 종료되엇습니다.");
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
