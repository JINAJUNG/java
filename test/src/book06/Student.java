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
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		for(int i=0;i<grade.length;i++) {
			System.out.print((i+1)+"학기 학점 : ");
			grade[i]=sc.nextDouble();
			hap+=grade[i];
		}
		System.out.println("8학기 총 평균 학점은 "+(hap/8)+"입니다.");
	}
	
}
