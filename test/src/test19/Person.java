package test19;

public class Person implements Action{

	@Override
	public void eat() {
		System.out.println("����� ��Խ��ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("����� ��ϴ�.");
	}

	@Override
	public void move() {
		System.out.println("����� �����Դϴ�.");
	}
	
	public void work() {
		System.out.println("����� ���Ѵ�.");
	}
	
	public void personTest() {
		System.out.println("����� �־�");
	}

	
}
