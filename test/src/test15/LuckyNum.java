package test15;

public class LuckyNum {
	private int luckyNum;
	LuckyNum(){
		luckyNum=(int)(Math.random()*10)+1;
	}
	
	public void checkLucky(Person p) {
		System.out.println(p instanceof GilGong);
		if(p instanceof GilGong) {
			//1
			//((GilGong)p).checkMyLuckyNum(luckyNum);
			
			//2
			GilGong g = (GilGong)p;
			g.checkMyLuckyNum(luckyNum);
		}
	}
}
