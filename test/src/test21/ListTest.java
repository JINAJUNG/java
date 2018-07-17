package test21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> strl = new ArrayList<String>();
		System.out.println(strl.size());
		strl.add("박경훈");
		strl.add("전승현");
		strl.add("김기섭");
		System.out.println(strl.size());
		strl.remove("김기섭");
		System.out.println(strl.size());
		int idx = strl.indexOf("김기섭");
		System.out.println(idx);

	}
}