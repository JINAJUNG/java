package test23;

public class Controller {
	public void callOrder(String order) {
		if("1".equals(order)) {
			System.out.println("��������Ʈ�� ���� �ͱ���");
		}else if("2".equals(order)) {
			System.out.println("��������Ʈ�� �߰��ϰ� �ͱ���");
		}else if("3".equals(order)) {
			System.out.println("��������Ʈ�� �����ϰ� �ͱ���");
		}else if("4".equals(order)) {
			System.out.println("��������Ʈ�� �����ϰ� �ͱ���");
		}else if("q".equals(order)){
			System.out.println("���ᰢ~");
		//	System.exit(0);//��������
		}else {
			System.out.println("�������� �ʴ� ��ɾ� �ӳ״�!");
		}
	}
}
