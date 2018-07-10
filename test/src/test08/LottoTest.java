package test08;

public class LottoTest {

	public static void main(String[] args) {
		int[] bea = new int[6];
		for(int i=0;i<bea.length;i++) {
			bea[i]=(int)(Math.random()*45+1);
			System.out.println(bea[i]);
		}
	}
}
