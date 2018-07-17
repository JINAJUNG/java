package test22;

public class MinMax {

	public static void main(String[] args) {
		int a=2;
		int b=10;
		int c=4;
		int d=20;
		
		int min=a;
		int max=a;
		
		int[] bea = {a,b,c,d,1,23};
		
		for(int i=1;i<bea.length;i++) {
			if(min>bea[i]) {
				min=bea[i];
			}
			if(max<bea[i]) {
				max=bea[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		for(int i=min; i<=max;i++) {
			System.out.println(i);
		}
	}
}
