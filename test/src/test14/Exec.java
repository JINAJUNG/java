package test14;

public class Exec {

	public static void main(String[] args) {
//		Animal c = new Cat();
//		c = new Dog();
		
		Computer pc = new Laptop();
		//����ȯ
		//1
		Laptop lp = (Laptop)pc;
		lp.resolution="��";
		//2
		((Laptop)pc).resolution="�ٲ�?"; 
		
		pc.printInfo();
		
	}

}
