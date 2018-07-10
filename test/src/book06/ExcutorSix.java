package book06;

public class ExcutorSix {

	public static void main(String[] args) {
		Car c = new Car(300);

		c.speedUp();
		c.speedUp();
		c.speedUp(-50);
		c.speedUp(50);
		c.speedDown(-30);
		c.speedDown(30);
		c.speedDown(30);
		c.speedDown(30);
		c.speedUp(100);
		c.speedUp(300);
	}

}
