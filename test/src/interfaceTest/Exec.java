package interfaceTest;

public class Exec {

	public static void level(Wind[] w) {
		for(Wind win : w) {
			System.out.println(win.level(4));
		}
	}
	
	public static void light(Wind[] w) {
		for(Wind win : w) {		
			if(win instanceof Lg) {
				Lg l = (Lg)win;
				l.light();
			}else {
				System.out.println("LG 제품이 아닙니다.");
			}	
		}
	}
	public static void main(String[] args) {
		
		Wind[] w = new Wind[2];
		w[0] = new Lg("lg",5,3);
		w[1] = new Samsong("sam",1,1);

		level(w);
		light(w);
	}
}
