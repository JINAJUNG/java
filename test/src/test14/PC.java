package test14;

public class PC extends Computer{
	public String resolution;

	public PC() {
		System.out.println("PC »ý¼ºÀÚ");
	}
	public void printInfo() {
		super.printInfo();
		System.out.println(resolution);
	}
}
