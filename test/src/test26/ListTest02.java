package test26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ListTest02 {
	public static void main(String[] args) {
		List<String> strl = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			Integer num = (int) (Math.random() * 10) + 1;
			String str = StringUtils.leftPad(num.toString(), 2,'0');
			strl.add(str);
		}

		Collections.sort(strl);
		Collections.reverse(strl);
		for (int i = 0; i < strl.size(); i++) {
			System.out.println(strl.get(i));
		}
	}
}
