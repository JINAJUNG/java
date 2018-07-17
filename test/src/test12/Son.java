package test12;

public class Son extends Father{

	void work() {
		System.out.println("나는 개발일을 합니다.");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();

	}

}