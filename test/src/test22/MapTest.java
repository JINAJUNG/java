package test22;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		//al�� add�Ҷ� hashmap�� ���� �� �ٸ� ���� �����Ҷ�
		//20������ó�� ��ũ�� ���� ���� �δ���
		//���� �����ؼ� �ִ��� �ؾ���
		
		hm.put("�̸�", "�ڰ���");
		hm.put("�ּ�", "������");
		hm.put("�ֿϵ�������", "������");
		al.add(hm);
		
		hm = new HashMap<String,String>();
		hm.put("�̸�", "�ڰ���1");
		hm.put("�ּ�", "������2");
		hm.put("�ֿϵ�������", "������3");
		al.add(hm);
		
		String name = hm.get("�̸�");
		System.out.println(name);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(0).get("�ּ�"));
	}
}
