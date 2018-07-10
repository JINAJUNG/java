package test07;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		int size = 10;
		int[] arrNum = new int[size];
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 70;
		arrNum[3] = 50;
		arrNum[4] = 40;

		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] % 20 == 0 && arrNum[i] != 0) {
				System.out.println(arrNum[i]);
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로 구분하여입력!");
		String pointStr = sc.nextLine();
		sc.close();
		
		String str = "a,b,c,d,e";
		String[] arrStr = pointStr.split(",");
		for(String st : arrStr) {
			System.out.println(st);
		}
		
		int[] arrNumt = new int[arrStr.length];
		
		for(int i=0;i<arrNumt.length;i++) {
			arrNumt[i]=Integer.parseInt(arrStr[i]);
		}
		
		for(int i=0;i<arrNumt.length;i++) {
			for(int j=i+1;j<arrNumt.length;j++) {
				if(arrNumt[i]>arrNumt[j]) {
					int tmp=arrNumt[j];
					arrNumt[j]=arrNumt[i];
					arrNumt[i]=tmp;
				}
			}
		}
		for(int i=0;i<arrNumt.length;i++) {
			System.out.println(arrNumt[i]);
		}


	}
}
