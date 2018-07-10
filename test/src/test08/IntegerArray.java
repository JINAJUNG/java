package test08;

public class IntegerArray {

	public static void main(String[] args) {

		// int a = 123; //4byte
		// long l = a; //8byte
		// a=l; //8byte는 4byte에 담길 수 없다.

		int[] arr = new int[10];

		
		
		//중복 랜덤값을 갖지 못하도록
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			if (i >= 1) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						System.out.println(i+" : "+arr[i]+"=="+arr[j]+" : "+j);
						i--;
					}
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}

}
