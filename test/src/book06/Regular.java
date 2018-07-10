package book06;

public class Regular extends Employee{
	
	private int salary;
	public Regular(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void printInfo() {
		System.out.println("Á¤±ÔÁ÷");
	}
}
