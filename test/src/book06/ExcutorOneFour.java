package book06;

public class ExcutorOneFour {

	public static void main(String[] args) {
//		Regular r = new Regular("�̼���",35,"����","�λ��");
//		Temporary t = new Temporary("�庸��",25,"��õ","�渮��");
//		r.setSalary(5000000);
//		r.printInfo();
//		t.setWorkHours(120);
//		t.printInfo();
		
		Employee r = new Regular("�̼���",35,"����","�λ��");
		Employee t = new Temporary("�庸��",25,"��õ","�渮��");
		r.setSalary(5000000);
		r.printInfo();
		System.out.println(t.setWorkHours(120));
		t.printInfo();
	}

}
