package test08;

public class TypeTest {

	public static void main(String[] args) {
		
		int[] ar2;
		int[] ar1 = new int[3];
		ar1[0]=3;
		ar2=ar1;
		
		for(int i=0;i<3;i++) {
			System.out.println(ar2[i]);
		}
	}
}