package test01;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해줘 ,로 구분");
		String aa = scan.nextLine();
		
		String[] pointStr = aa.split(",");
		
		for(int i=0; i<pointStr.length; i++) {
		System.out.println(pointStr[i]);
	}
}
}
