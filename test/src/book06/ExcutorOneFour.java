package book06;

public class ExcutorOneFour {

	public static void main(String[] args) {
//		Regular r = new Regular("이순신",35,"서울","인사부");
//		Temporary t = new Temporary("장보고",25,"인천","경리부");
//		r.setSalary(5000000);
//		r.printInfo();
//		t.setWorkHours(120);
//		t.printInfo();
		
		Employee r = new Regular("이순신",35,"서울","인사부");
		Employee t = new Temporary("장보고",25,"인천","경리부");
		r.setSalary(5000000);
		r.printInfo();
		System.out.println(t.setWorkHours(120));
		t.printInfo();
	}

}