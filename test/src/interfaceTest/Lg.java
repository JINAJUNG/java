package interfaceTest;

public class Lg extends ElectricFan{

	public Lg(String name, int level, int high) {
		super(name, level, high);
	}

	public void light() {
		System.out.println("조명 온");
	}
}