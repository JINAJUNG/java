package book05;

public class Computer {

	public final String[] osType= {"����7","���� os x ", "�ȵ���̵�"};
	private int osNum;
	private int mamory;
	public Computer(int a, int b) {
		osNum=a;
		mamory=b;
	}
	
	public void print() {
		System.out.println("�ü�� : "+osType[osNum]+", ���θ޸� : "+mamory);
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
