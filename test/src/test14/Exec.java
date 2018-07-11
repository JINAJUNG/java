package test14;

public class Exec {

	public static void main(String[] args) {
//		Animal c = new Cat();
//		c = new Dog();
		
		Computer pc = new Laptop();
		//Çüº¯È¯
		//1
		Laptop lp = (Laptop)pc;
		lp.resolution="µé¾î°«";
		//2
		((Laptop)pc).resolution="¹Ù²ñ?"; 
		
		pc.printInfo();
		
	}

}
