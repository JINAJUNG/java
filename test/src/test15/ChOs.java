package test15;

public class ChOs {

	public void checkOs(Os o) {
		System.out.println(o instanceof Apple);
		o.memory=(int)(Math.random()*64)+1;
		if(o instanceof Apple) {
			((Apple)o).typePrint(o.memory);
		}else if(o instanceof Microsoft) {
			((Microsoft)o).typePrint(o.memory);
		}
	}
}
