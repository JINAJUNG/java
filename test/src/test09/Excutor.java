package test09;

import java.util.Arrays;

public class Excutor {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("우야");
		p.setAge(25);
		p.setAddress("서울");
		
		String[] ho = new String[2];
		for(int i=0;i<2;i++) {
			ho[i]="ho"+i;
		}
		p.setHobby(ho);
		
		for(int i=0;i<p.getHobby().length;i++) {
			System.out.println(p.getHobby()[i]);	
		}
		System.out.println(p);
		System.out.println(Arrays.toString(ho));

		
	}

}