package test05;

import java.util.Scanner;

public class arrMulti {

	public static void main(String[] args) {
		// int size = 10;
		// int x = 0, y = 0;
		// char[][] bor = new char[size][size];
		//
		// int[][] shipBor = { { 0, 1, 0, 0, 0, 1, 1, 1, 0 }, { 1, 0, 1, 1, 1, 0, 0, 0,
		// 1 }, { 1, 1, 0, 0, 0, 0, 0, 0, 1 },
		// { 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 0, 0, 1,
		// 1, 0, 0, 1, 1 },
		// { 0, 0, 0, 0, 1, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1, 0, 1, 0 }, { 1, 0, 0, 1,
		// 0, 0, 1, 0, 1 } };
		//
		// for (int i = 1; i < 10; i++) {
		// bor[0][i] = bor[i][0] = (char) (i + '0');
		// }
		// Scanner sc = new Scanner(System.in);
		//
		// while (true) {
		// System.out.println("좌표를 입력하세요 종료는 00");
		// String inputSc = sc.nextLine();
		//
		// if (inputSc.length() == 2) {
		// x = (int) inputSc.charAt(0) - '0';
		// y = (int) inputSc.charAt(1) - '0';
		//
		// if (x == 0 && y == 0) {
		// System.out.println("종료");
		// break;
		// }
		// } else {
		// System.out.println("잘못 입력했습니다 다시입력해 주세요.");
		// continue;
		// }
		// System.out.println(x);
		// System.out.println(y);
		// bor[x][y] = shipBor[x - 1][y - 1] == 1 ? 'O' : 'X';
		//
		// for (int i = 0; i < size; i++) {
		// System.out.println(bor[i]);
		// // char배열 타입만 1차원배열을 호출하는게 가능하다!!
		// }
		// System.out.println();
		// }

		// 2빙고
//		int size = 5;
//		int[][] bingo = new int[size][size];
//
//		for (int i = 0; i < bingo.length; i++) {
//			for (int j = 0; j < bingo[i].length; j++) {
//				bingo[i][j] = i * size + j + 1;
//			}
//		}
//
//		for (int i = 0; i < bingo.length; i++) {
//			for (int j = 0; j < bingo[i].length; j++) {
//				int rowR = (int) (Math.random() * bingo.length);
//				int columnR = (int) (Math.random() * bingo.length);
//				int tmp = bingo[i][j];
//				bingo[i][j] = bingo[rowR][columnR];
//				bingo[rowR][columnR] = tmp;
//			}
//		}
//
//		int num = 0;
//		do {
//			for (int i = 0; i < bingo.length; i++) {
//				for (int j = 0; j < bingo[i].length; j++) {
//					System.out.print(bingo[i][j]+" ");
//				}
//				System.out.println();
//			}
//
//			Scanner sc = new Scanner(System.in);
//			System.out.println("1~25범위 안의 값을 입력해 주세요.");
//			num = Integer.parseInt(sc.nextLine());
//			if (num <= 25 && num >= 1) {
//				for (int i = 0; i < bingo.length; i++) {
//					for (int j = 0; j < bingo[i].length; j++) {
//						if (bingo[i][j] == num) {
//							bingo[i][j] = 0;
//							break;
//						}
//					}
//				}
//			}else if(num==0) {
//				System.out.println("종료");
//			}else {
//				System.out.println("1~25범위 안의 값을 다시 입력해 주세요");
//			}
//
//		} while (num != 0);
		
		
		
		
	}

}
