package test19;

public class Exec {

	public static void eat(Action a) {
		a.eat();
	}

	public static void only(Action a) {
		if (a instanceof Animal) {
		((Animal) a).hunt();
		((Animal) a).animalTest();
	} else if (a instanceof Person) {
		((Person) a).work();
		((Person) a).personTest();
	} else {
		System.out.println("둘다아냐!");
	}
	}
	public static void main(String[] args) {
		Action a = new Animal();
		// a.eat();
		// Animal ani = (Animal) a;
		// ani.hunt();
		//
		// System.out.println();
		//
		// Action p = new Person();
		// p.eat();
		// Person per = (Person) p;
		// per.work();
		eat(a);
		eat(new Animal());
		eat(new Person());
		
		only(a);
		
		

	}

}