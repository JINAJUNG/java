package book05;

public class Student {

	private String department;
	private int studentNum;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return "Student [department=" + department + ", studentNum=" + studentNum + "]";
	}

	public static void main(String[] args) {
		Student s = new Student();

		s.setStudentNum(1501274);
		s.setDepartment("ÄÄ°ø");
		
		System.out.println(s);
	}
}
