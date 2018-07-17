package test17;

public class Jin extends Human{
	
	public Jin(String name, int age, int num) {
		super(name,age,num);
	}

	public void printHuman() {
		super.printHuman();
		System.out.println("지나쓰");
	}
}
