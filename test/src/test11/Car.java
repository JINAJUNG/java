package test11;

public class Car {

	private int speed;
	private String name;
	private String company;
	
	public Car(int speed, String name, String company) {
		this.speed=speed;
		this.name=name;
		this.company=company;
	}
	
	public void printInfo() {
		System.out.println("속도 : "+this.speed);
		System.out.println("이름 : "+this.name);
		System.out.println("회사 : "+this.company);
	}
}
