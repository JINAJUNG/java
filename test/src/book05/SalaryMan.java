package book05;

public class SalaryMan {
	
	int salary = 1000000;

	public SalaryMan() {
		
	}
	public SalaryMan(int salary) {
		this.salary=salary;
	}
	
	public int getAnnualGrass() {
		return salary*5;
	}
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGrass());
		System.out.println(new SalaryMan(2000000).getAnnualGrass());
	}

}
