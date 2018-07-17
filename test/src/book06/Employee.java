package book06;

public class Employee {

	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;
	
	public Employee(String name, int age, String address, String department) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.department=department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int setWorkHours(int workTime) {
		return workTime;
	
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
		System.out.println("부서 : "+department);
	}
}