package test15;

public class Exec {

	public static void main(String[] args) {
//		Robot r = new Robot();
//		//System.out.println(r.w.power);
//		//r�� ����,�ʱ�ȭ �ϸ鼭 w�� null�� �ʱ�ȭ ���Ѽ� ������ ����
//		//weapon Ŭ������ null�̱� ������ power�� ���� ���� �� ����
//		r.w = new Weapon();
//		System.out.println(r.w.power);
//		//r.w�� �ؼ� weapon�� �ʱ�ȭ �ϸ� power�� �ʱ�ȭ��
//		r.w.power=10;
//		//r.w=null;
//		//r.w�� null�� �ʱ�ȭ ��Ű�� power�� ���� �� ����.�����߻�
//		//r=null;
//		//r�� null�� �ʱ�ȭ ��Ű�� power�� ���� �� ����.�����߻�
//		//��ü�� �������ϱ� �ȿ� �������� ���� ���� �� ����.
//		System.out.println(r.w.power);
		
		Person p = new GilGong();
		LuckyNum l = new LuckyNum();
		l.checkLucky(p);
		Person r = new Robot();
		l.checkLucky(r);
		
		
		Os a = new Apple();
		ChOs chos = new ChOs();
		chos.checkOs(a);
		a = new Microsoft();
		chos.checkOs(a);
	}
}

