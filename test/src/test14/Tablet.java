package test14;

public class Tablet extends Computer{
	public String resolution;
	
	public Tablet() {
		System.out.println("Tablet 생성자");
	}
	public void printInfo() {
		super.printInfo();
		System.out.println(resolution);
	}
}