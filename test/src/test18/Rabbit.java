package test18;

public class Rabbit {



	public String rabbitName;
	public int rank;

	public Rabbit(String rabbitName, int rank) {
		this.rabbitName = rabbitName;
		this.rank = rank;
	}

	public static void rankingUp(Rabbit[] r) { //오름차순
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

	public static Rabbit[] rankingDown(Rabbit[] r) { // 77라인에 사용, void로 가능 rabbit[]으로 불르지도 않는데 왜햇지?왤까?나는멀까?
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
		//this를 바꾸는건 내 자신의 메모리를 가리키고있는데 바꾸는것이므로 안됨?????? rabbit자체가 인스턴스라  그 안에서 뉴인스턴스가될수 없음????? 결론은 안됨 아론노... 
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
//			} //ran중복 제거
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

		r=rankingDown(r);  //Rabbit[]타입
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i].rank + ", ");
		}
	}
}
