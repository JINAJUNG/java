package test20;

public class Solid extends Cart{

	public Solid(String name, int speed, int damage) {
		super(name, speed, damage);
	}

	public String attack(int damage) {
		return this.damage+damage+"��ŭ ���� �մϴ�.";
	}
}
