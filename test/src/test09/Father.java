package test09;

public class Father {

	public void test() {
		System.out.println("아빠 테스트 함수");
	}
	
	public void run() {
		System.out.println("아빠 run 함수");
	}
	
	public void sleep() {
		System.out.println("아빠 sleep 함수");
	}
	
	public static void main(String[] args) {
		Father f = new Father();
		f.test();
	}
}