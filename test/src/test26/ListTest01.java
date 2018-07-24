package test26;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		ArrayList<Number> al = new ArrayList<Number>();
		Number num = new Integer(3); //NUMBER은 추상클래스, 숫자타입은 다담을 수 있다.
		al.add(10);
		al.add(10.1);
		
		for(Number n : al) {
			System.out.println(n);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
	}
}
