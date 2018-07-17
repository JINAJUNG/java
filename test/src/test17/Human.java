package test17;

public class Human {

	protected String name;
	protected int age;
	protected int num;
	
	public Human(String name, int age, int num) {
		this.name=name;
		this.age=age;
		this.num=num;
	}
	
	public void printHuman() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("번호 : "+num);
	}
}