package test09;

public class FunctionTest {

	static void print(String str) {
		System.out.println(str);
	}
	static void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	static int getNum() {
		
		return 0;
	}
	static FunctionTest getFT() {
		return new FunctionTest();
	}
	public static void main(String[] args) {
		sum(1,2);
		String str = getNum()+"";
		System.out.println(str);
		
		FunctionTest ft = getFT();
		ft.print("");
	}
}
