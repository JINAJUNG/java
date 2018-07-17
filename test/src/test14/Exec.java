package test14;

public class Exec {

	public static void main(String[] args) {
//		Animal c = new Cat();
//		c = new Dog();
		
		Computer pc = new Laptop();
		//형변환
		//1
		Laptop lp = (Laptop)pc;
		lp.resolution="들어갓";
		//2
		((Laptop)pc).resolution="바뀜?"; 
		
		pc.printInfo();
		
	}

}