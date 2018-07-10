package test11;

public class Student {

	private String clazz;
	private String name;
	private int grade;
	
	public void setClazz(String clazz) {
		this.clazz=clazz;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void printInfo() {
		System.out.println("class : "+clazz+", name : "+name+", grade : "+grade);
	}
	
}
