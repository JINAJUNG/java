package test09;

public class obj {

	int num=3;
	boolean bl=true;
	
	int getNum() {
		return 1;
	}
	
	String getStr() {
		return "abc";
	}
	
	void test() {
		int num=10;
		System.out.println(num);
		System.out.println("난 obj의 테스트 함수");
	}
	
	void test2() {
		System.out.println(num);
		System.out.println(bl);
		test();
	}
	class bj {
		public void test3() {
			System.out.println("inner");
		}
	}
	public static void main(String[] args) {
		obj o = new obj();
		o.test();
		
	}

}

