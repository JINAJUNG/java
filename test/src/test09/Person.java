package test09;

import java.util.Arrays;

public class Person {
	
	private String name;
	private int age;
	private String address;
	public String[] hobby;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", hobby=" + Arrays.toString(hobby)
				+ "]";
	}

//	public String toString() {
//		String str = "���̸��� : "+this.name;
//		str+=", ���̴� : "+this.age;
//		str+=", �ּҴ� : "+this.address;
//		
//		return str;
//	}
}
