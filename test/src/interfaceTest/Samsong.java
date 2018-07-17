package interfaceTest;

public class Samsong extends ElectricFan{

	public Samsong(String name, int level, int high) {
		super(name, level, high);
	}

	public String level(int level) {
		this.level=level;
		if(level>3) {
			return "1-3까지의 범위를 벗어났습니다";
		}else {
			return this.level+"단으로 설정";	
		}
	}
}