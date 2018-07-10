package test12;

public final class LoopTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=1;i<=arr.length;i++) {
			arr[i-1]=3*i;
			System.out.println(arr[i-1]);
		}

	}

}
