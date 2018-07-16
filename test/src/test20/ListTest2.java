package test20;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0;i<6;i++) {
			intList.add((int)(Math.random()*45)+1);
		}
		for(int a : intList) {
			//System.out.println(a);
		}
		for(int i=0;i<6;i++) {
			System.out.println(intList.get(i));
		}
	}
}
