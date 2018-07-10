package book06;

public class Car {
	private int maxSpeed;
	private int speed;
	
	public Car(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	
	public void speedUp() {
		speed+=5;
		System.out.println("�ִ� �ӵ� : "+maxSpeed+", ����ӵ� : "+speed);
	}
	
	public void speedUp(int speed) {
		if(speed<0) {
			System.out.println("���� : �ӵ��� �����̹Ƿ� 0���� ���� : �ִ� �ӵ� : "+"�ִ� �ӵ� : "+maxSpeed+", ����ӵ� : "+this.speed);
		}else {
			this.speed+=speed;
			System.out.println("�ִ� �ӵ� : "+maxSpeed+", ����ӵ� : "+this.speed);
		}
	}
	
	public void speedDown() {
		System.out.println("�ִ� �ӵ� : "+maxSpeed+", ����ӵ� : "+speed);
	}
	
	public void speedDown(int speed) {
		if(speed<0 || this.speed<=0) {
			System.out.println("���� : �ӵ��� �����̹Ƿ� 0���� ���� : �ִ� �ӵ� : "+"�ִ� �ӵ� : "+maxSpeed+", ����ӵ� : "+this.speed);
		}else {
			this.speed-=speed;
			System.out.println("�ִ� �ӵ� : "+maxSpeed+", ����ӵ� : "+this.speed);
		}
	}
}

