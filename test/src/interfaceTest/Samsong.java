package interfaceTest;

public class Samsong extends ElectricFan{

	public Samsong(String name, int level, int high) {
		super(name, level, high);
	}

	public String level(int level) {
		this.level=level;
		if(level>3) {
			return "1-3������ ������ ������ϴ�";
		}else {
			return this.level+"������ ����";	
		}
	}
}
