package test10;

public class FuncTest {

	public void add(int a, int b) {
		System.out.println("��Ʈ���ϱ� : "+(a+b));
	}
	public void add(long a, long b) {
		System.out.println("�մ��ϱ� : "+(a+b));
	}
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.add(40, 50);
		ft.add((long)40, 60);
		
		(new FuncTest()).add((long)30, 20);
		(new FuncTest()).add(30, 20);
	}
}
