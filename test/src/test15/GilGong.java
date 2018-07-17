package test15;

public class GilGong extends Person{

	public void checkMyLuckyNum(int luckyNum) {
		System.out.println("내 행운의 번호 : "+luckyNum);
		if(this.luckyNum==luckyNum) {
			System.out.println("운수 좋은 날~");
		}
	}
}