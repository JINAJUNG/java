package test19;

public class Animal implements Action{

	@Override
	public void eat() {
		System.out.println("������ ��Խ��ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("������ ��ϴ�.");
	}

	@Override
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void hunt() {
		System.out.println("������ ����մϴ�.");
	}
	public void animalTest() {
		System.out.println("������ �վ�");
	}
}
