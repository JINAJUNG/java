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
		System.out.println("�ӵ� : "+this.speed);
		System.out.println("�̸� : "+this.name);
		System.out.println("ȸ�� : "+this.company);
	}
}
