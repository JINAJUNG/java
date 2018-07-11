package test14;

public class Laptop extends Computer{
	public String resolution;
	
	public Laptop() {
		System.out.println("Laptop »ý¼ºÀÚ");
	}
	public void printInfo() {
		super.printInfo();
		System.out.println(resolution);
	}
}
