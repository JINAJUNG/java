package test10;

public class overloadingTest {
	
	int a=3;
	
	//중복정의
	public void test() {
		
	}
	public int test(int i) {
		return i;
	}
	public int test(String i) {
		return 0;
	}
	public int test(int i, String s) {
		return i;
	}
	public int test(String s, int i) {
		return i;
	}
	
	public static void main(String[] args) {
		(new overloadingTest()).a=4; //메모리생성
		overloadingTest ol = new overloadingTest();
	}

}
