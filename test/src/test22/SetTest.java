package test22;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("b");
		hs.add("c");
		System.out.println(hs.size());
		System.out.println(hs);
	}
}
