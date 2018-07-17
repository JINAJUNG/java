package test23;

import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==유저 프로그램==");
		System.out.println("1. 유저리스트, 2. 유저생성, 3. 유저수정, 4.유저삭제, q. 종료");
		System.out.println("알맞은 명령어를 입력해 주세요.");
		
		String order="";
		while(!"q".equals(order)) {
			order=sc.nextLine();
			Controller c = new Controller();
			c.callOrder(order);
		}
		System.out.println("==유저 프로그램 종료==");
	}
}