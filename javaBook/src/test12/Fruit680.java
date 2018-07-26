package test12;

import java.util.ArrayList;
import java.util.List;

public class Fruit680 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitB = new FruitBox<Fruit>();
	}
}

class Fruit{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

class Juice{
	String name;
	
	Juice(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}

class Juicer{
	static Juice maker(FruitBox<? extends Fruit> box) {
		String juiceName="";
		
		for(Fruit f : box.getList()) {
			juiceName +=f+" ";
		}
		return new Juice(juiceName);
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	List<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	List<T> getList(){
		return list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}