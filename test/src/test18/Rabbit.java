package test18;

public class Rabbit {



	public String rabbitName;
	public int rank;

	public Rabbit(String rabbitName, int rank) {
		this.rabbitName = rabbitName;
		this.rank = rank;
	}

	public static void rankingUp(Rabbit[] r) { //��������
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				if (r[i].rank < r[j].rank) {
					Rabbit tmp = r[j];
					r[j] = r[i];
					r[i] = tmp;
				}
			}
		}
	}
	//		rankingUp(r);  //void type

	public static Rabbit[] rankingDown(Rabbit[] r) { // 77���ο� ���, void�� ���� rabbit[]���� �Ҹ����� �ʴµ� ������?�ͱ�?���¸ֱ�?
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				if (r[i].rank > r[j].rank) {
					Rabbit tmp = r[j];
					r[j] = r[i];
					r[i] = tmp;
				}
			}
		}
		return r;
	}

	public boolean rUp(Rabbit r) {
		//this�� �ٲٴ°� �� �ڽ��� �޸𸮸� ����Ű���ִµ� �ٲٴ°��̹Ƿ� �ȵ�?????? rabbit��ü�� �ν��Ͻ���  �� �ȿ��� ���ν��Ͻ����ɼ� ����????? ����� �ȵ� �Ʒг�... 
		if(this.rank<r.rank) {
//			Rabbit tmpR = this;
//			this.getClass().in
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public String toString() {
		return "Rabbit [rabbitName=" + rabbitName + ", rank=" + rank + "]";
	}
	
	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];
		for (int i = 0; i < r.length; i++) {
			int rank = (int) (Math.random() * 10) + 1;
			r[i] = new Rabbit("rabbit" + i, rank);
//			if (i > 0) {
//				for (int j = 0; j < i; j++) {
//					if (r[i].rank == r[j].rank) {
//						i--;
//					}
//				}
//			} //ran�ߺ� ����
		}
		
//		for(int i=0;i<r.length;i++) {
//			for (int j = i + 1; j < r.length; j++) {
//				if(r[i].rUp(r[j])) {
//					Rabbit tmp = r[j];
//					r[j]=r[i];
//					r[i]=tmp;
//				}	
//			}
//		}

		rankingUp(r);  //void type
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}

		System.out.println();

		r=rankingDown(r);  //Rabbit[]Ÿ��
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i].rank + ", ");
		}
	}
}
