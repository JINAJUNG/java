package test12;

public class PrintObject {

	String str = "poStr";
	
	public String toString() {
		return "�� Ŭ������ str�̶� ������"+str+"�̶�� ���� ������ ����";
	}
	public static void main(String[] args) {
		PrintObject po = new PrintObject();
		System.out.println(po);
	}

}
