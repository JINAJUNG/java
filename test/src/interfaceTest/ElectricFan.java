package interfaceTest;

public class ElectricFan implements Wind{

	protected int level;
	protected int high;
	protected String name;
	
	public ElectricFan(String name, int level, int high) {
		this.name=name;
		this.level=level;
		this.high=high;
	}
	
	@Override
	public void on() {
		System.out.println("선풍기 작동");
	}

	@Override
	public void off() {
		System.out.println("선풍기 멈춤");
	}

	@Override
	public String level(int level) {
		this.level=level;
		if(this.level>5) {
			return "1-5까지의 범위를 벗어났습니다";
		}else {
			return this.level+"단으로 설정";	
		}
	}

	@Override
	public String height(int high) {
		this.high=high;	
		if(this.high>4) {
			return "1-3까지의 범위를 벗어났습니다.";
		}else {
			return this.high+"높이로 설정";
		}
	}
	
	@Override
	public void spinStart() {
		System.out.println("회전");
	}

	@Override
	public void spinStop() {
		System.out.println("회전멈춤");
	}




}