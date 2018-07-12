package test16;

import java.util.Scanner;

public class ListTest {

	public String[] bea;
	public String[] arrStr=new String[0];
	private int idx = 0;
	
	public boolean add(String str) {
			bea=new String[arrStr.length+1];
			bea[arrStr.length]=str;
			
			if(arrStr.length>0) {
				for(int i=0;i<arrStr.length;i++) {
					String tmp=arrStr[i];
					bea[i]=tmp;	
				}
			}
			arrStr=bea;
			return true;
	}
	
	public int indexOf(String str) {
		for(int i=0;i<this.arrStr.length;i++) {
			if(this.arrStr[i].equals(str)) {
				return i;
			}	
		}
		return -1;
	}
	
	public boolean remove(String str) {
		for(int i=0;i<this.arrStr.length;i++) {
			if(this.arrStr[i].equals(str)) {
				this.arrStr[i]=null;
				System.out.println(str+"�� �ִ�"+i+"���� ������ϴ�.");
				System.out.println("Ȯ�� [ "+this.arrStr[i]+" ]");
				return true;
			}
		}
		System.out.println(str+"�� �Էµ��� ���� ���� �Դϴ�.");
		return false;
	}
	
	public int size() {
		return this.arrStr.length;
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		
		Scanner sc = new Scanner(System.in);
		String st = null;
		do {
			System.out.println("����Ʈ�� ������ ���ڸ� �Է��� �ּ���.");
			st = sc.nextLine();
			if(st.equals("end")) {
				break;
			}
			lt.add(st);
		}while(true);
		
		System.out.println("������ ������ ã�� ���ڸ� �Է����ּ���.");
		String str=sc.nextLine();
		int idx = lt.indexOf(str);
		if(idx==-1) {
			System.out.println(str+"�� ������ �����߿� �����ϴ�.");
		}else {
			System.out.println(str+"�� "+idx+"�濡 �ִ��󱸿� ");	
		}
		System.out.println();
		System.out.println("size : "+lt.size());
		System.out.println();
		System.out.println(lt.remove(str));

	}
}
