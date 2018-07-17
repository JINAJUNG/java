package test12;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 1-5까지 중 1개를 입력해 주세요.");
		String numStr= sc.nextLine();

		int num = Integer.parseInt(numStr);

		int[] bea = new int[5];
		
		if(num==1) {
			System.out.println("1이군");
		}else if(num==2) {
			System.out.println("2이군 왜죠?");
		}else if(num==3) {
			System.out.println("3이군 머리가 굳엇졍");
		}else if(num==4) {
			System.out.println("쥬글 사사사");
		}else if(num==5) {
			System.out.println("last five");
		}else {
			System.out.println("니가 입력한 숫자 : "+numStr);
			System.out.println("1~5중에 넣으라니깐~");
			return;
		}
		bea[num-1]=num;
		System.out.println("니가 입력한 숫자 : "+numStr);
		System.out.println("bea["+(num-1)+"]의 값 : "+bea[num-1]);
	}
}