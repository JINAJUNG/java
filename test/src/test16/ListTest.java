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
				System.out.println(str+"이 있던"+i+"방을 비웠습니다.");
				System.out.println("확인 [ "+this.arrStr[i]+" ]");
				return true;
			}
		}
		System.out.println(str+"은 입력되지 않은 문자 입니다.");
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
			System.out.println("리스트에 저장할 문자를 입력해 주세요.");
			st = sc.nextLine();
			if(st.equals("end")) {
				break;
			}
			lt.add(st);
		}while(true);
		
		System.out.println("저장한 문자중 찾을 문자를 입력해주세요.");
		String str=sc.nextLine();
		int idx = lt.indexOf(str);
		if(idx==-1) {
			System.out.println(str+"은 저장한 문자중에 없습니다.");
		}else {
			System.out.println(str+"은 "+idx+"방에 있더라구요 ");	
		}
		System.out.println();
		System.out.println("size : "+lt.size());
		System.out.println();
		System.out.println(lt.remove(str));

	}
}
