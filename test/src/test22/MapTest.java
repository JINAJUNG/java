package test22;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		//al에 add할때 hashmap을 넣을 때 다른 값이 들어가야할때
		//20번라인처럼 링크를 끊고 새로 맺던지
		//새로 선언해서 넣던지 해야함
		
		hm.put("이름", "박경훈");
		hm.put("주소", "강서구");
		hm.put("애완동무리름", "동동이");
		al.add(hm);
		
		hm = new HashMap<String,String>();
		hm.put("이름", "박경훈1");
		hm.put("주소", "강서구2");
		hm.put("애완동무리름", "동동이3");
		al.add(hm);
		
		String name = hm.get("이름");
		System.out.println(name);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(0).get("주소"));
	}
}
