package book06;

import java.util.Scanner;

public class Student extends Person{

	private String college;
	private String major;
	private int studentNum;
	private double[] grade = new double[8];
	private double hap=0;
	
	Scanner sc = new Scanner(System.in);
	
	public Student(String name, int age, String address, String college, String major, int studentNum) {
		super(name, age, address);
		this.college = college;
		this.major = major;
		this.studentNum = studentNum;
	}
	
	public void average() {
		System.out.println("8�б� ������ ������� �Է��ϼ���.");
		for(int i=0;i<grade.length;i++) {
			System.out.print((i+1)+"�б� ���� : ");
			grade[i]=sc.nextDouble();
			hap+=grade[i];
		}
		System.out.println("8�б� �� ��� ������ "+(hap/8)+"�Դϴ�.");
	}
	
}
