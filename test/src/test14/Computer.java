package test14;

public class Computer {

	public String cpu;
	public int ram;
	public String hdd;
	
	public Computer() {
		System.out.println("computer 생성자");
	}
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}