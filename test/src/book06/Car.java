package book06;

public class Car {
	private int maxSpeed;
	private int speed;
	
	public Car(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	
	public void speedUp() {
		speed+=5;
		System.out.println("최대 속도 : "+maxSpeed+", 현재속도 : "+speed);
	}
	
	public void speedUp(int speed) {
		if(speed<0) {
			System.out.println("오류 : 속도가 음수이므로 0으로 지정 : 최대 속도 : "+"최대 속도 : "+maxSpeed+", 현재속도 : "+this.speed);
		}else {
			this.speed+=speed;
			System.out.println("최대 속도 : "+maxSpeed+", 현재속도 : "+this.speed);
		}
	}
	
	public void speedDown() {
		System.out.println("최대 속도 : "+maxSpeed+", 현재속도 : "+speed);
	}
	
	public void speedDown(int speed) {
		if(speed<0 || this.speed<=0) {
			System.out.println("오류 : 속도가 음수이므로 0으로 지정 : 최대 속도 : "+"최대 속도 : "+maxSpeed+", 현재속도 : "+this.speed);
		}else {
			this.speed-=speed;
			System.out.println("최대 속도 : "+maxSpeed+", 현재속도 : "+this.speed);
		}
	}
}

