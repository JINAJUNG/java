package book06;

public class Temporary extends Employee{
	
	private int workTime;
	private int timeSalary=10000;
	public Temporary(String name, int age, String address, String department) {
		super(name, age, address, department);
	}

	public int setWorkHours(int workTime) {
		this.workTime=workTime;
		return this.workTime*timeSalary;
	}
	
	public void printInfo() {
		System.out.println("��������");
		System.out.println("���� �ð� : "+workTime);
		System.out.println("�޿� : "+setWorkHours(workTime));
	}
	
}
