package test15;

public class GilGong extends Person{

	public void checkMyLuckyNum(int luckyNum) {
		System.out.println("�� ����� ��ȣ : "+luckyNum);
		if(this.luckyNum==luckyNum) {
			System.out.println("��� ���� ��~");
		}
	}
}