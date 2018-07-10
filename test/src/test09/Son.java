package test09;

public class Son extends Father{

	public void test() {
		this.run();
		super.test();
	//	System.out.println("자식 테스트 함수");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.test();
		
	}
}
