package test21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> strl = new ArrayList<String>();
		System.out.println(strl.size());
		strl.add("�ڰ���");
		strl.add("������");
		strl.add("��⼷");
		System.out.println(strl.size());
		strl.remove("��⼷");
		System.out.println(strl.size());
		int idx = strl.indexOf("��⼷");
		System.out.println(idx);

	}
}
