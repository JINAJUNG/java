package test09;

public class Father {

	public void test() {
		System.out.println("�ƺ� �׽�Ʈ �Լ�");
	}
	
	public void run() {
		System.out.println("�ƺ� run �Լ�");
	}
	
	public void sleep() {
		System.out.println("�ƺ� sleep �Լ�");
	}
	
	public static void main(String[] args) {
		Father f = new Father();
		f.test();
	}
}
