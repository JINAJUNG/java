package test15;

public class Exec {

	public static void main(String[] args) {
//		Robot r = new Robot();
//		//System.out.println(r.w.power);
//		//r이 선언,초기화 하면서 w를 null로 초기화 시켜서 오류가 생김
//		//weapon 클래스는 null이기 때문에 power이 값을 가질 수 없음
//		r.w = new Weapon();
//		System.out.println(r.w.power);
//		//r.w를 해서 weapon을 초기화 하면 power가 초기화됨
//		r.w.power=10;
//		//r.w=null;
//		//r.w를 null로 초기화 시키면 power을 가질 수 없다.에러발생
//		//r=null;
//		//r을 null로 초기화 시키면 power을 가질 수 없다.에러발생
//		//객체가 비어버리니까 안에 변수들이 값을 가질 수 없다.
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