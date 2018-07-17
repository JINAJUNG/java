package book05;

public class Computer {

	public final String[] osType= {"윈도7","애플 os x ", "안드로이드"};
	private int osNum;
	private int mamory;
	public Computer(int a, int b) {
		osNum=a;
		mamory=b;
	}
	
	public void print() {
		System.out.println("운영체제 : "+osType[osNum]+", 메인메모리 : "+mamory);
	}
	public static void main(String[] args) {
		Computer pc = new Computer(0,16);
		Computer apple = new Computer(1,32);
		Computer galaxy = new Computer(2,16);

		pc.print();
		apple.print();
		galaxy.print();
	}

}