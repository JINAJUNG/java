package test09;

public class Son extends Father{

	public void test() {
		this.run();
		super.test();
	//	System.out.println("�ڽ� �׽�Ʈ �Լ�");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.test();
		
	}
}
