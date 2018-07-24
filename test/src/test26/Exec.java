package test26;

import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		List<Animal> aniList = new ArrayList<Animal>();
		
		for(int i=0;i<2;i++) {
			Animal d = new Dog("댕댕이"+(i+1));
			Animal c = new Cat("고양이"+(i+1));
			
			aniList.add(d);
			aniList.add(c);
		}
		for(Animal a : aniList) {
			System.out.println(a);
		}
	}
}
