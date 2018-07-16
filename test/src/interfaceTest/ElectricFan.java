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
		System.out.println("��ǳ�� �۵�");
	}

	@Override
	public void off() {
		System.out.println("��ǳ�� ����");
	}

	@Override
	public String level(int level) {
		this.level=level;
		if(this.level>5) {
			return "1-5������ ������ ������ϴ�";
		}else {
			return this.level+"������ ����";	
		}
	}

	@Override
	public String height(int high) {
		this.high=high;	
		if(this.high>4) {
			return "1-3������ ������ ������ϴ�.";
		}else {
			return this.high+"���̷� ����";
		}
	}
	
	@Override
	public void spinStart() {
		System.out.println("ȸ��");
	}

	@Override
	public void spinStop() {
		System.out.println("ȸ������");
	}




}
