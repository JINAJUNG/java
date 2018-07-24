package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			pList.add(new Person(name,age));
		}

		for(Person pl : pList) {
			System.out.println(pl);
		}
	}
}
