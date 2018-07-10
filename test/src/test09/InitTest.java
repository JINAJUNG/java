package test09;

public class InitTest {
	int n = 10;
	String str = "str";

	public static void main(String[] args) {
		InitTest it = new InitTest();
		it.n=20;
		System.out.println(it.n);
		it=new InitTest();
		System.out.println(it.n);
	}

}
