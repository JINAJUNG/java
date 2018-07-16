package test21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> strl = new ArrayList<String>();
		System.out.println(strl.size());
		strl.add("¹Ú°æÈÆ");
		strl.add("Àü½ÂÇö");
		strl.add("±è±â¼·");
		System.out.println(strl.size());
		strl.remove("±è±â¼·");
		System.out.println(strl.size());
		int idx = strl.indexOf("±è±â¼·");
		System.out.println(idx);

	}
}
