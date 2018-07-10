package test05;

public class arrCopy {

	public static void main(String[] args) {
		//1. 배열의 복사
		int[] arr=new int[5];
		System.out.println("arr.length : "+arr.length);
		
		int[] tmp = new int[arr.length*2];
		
		System.out.println("tmp.length : "+tmp.length);
		arr=tmp;
		System.out.println("arr.length : "+arr.length);

		//2.
		int[] arrO = new int[5];
		int[] tmpO = new int[arrO.length*2];
		
		for(int i=0;i<arrO.length;i++) {arrO[i]=i;}
		for(int i=tmpO.length-1;i>0;i--) {tmpO[i]=i;}
		
		int[] hap = new int[arrO.length+tmpO.length];
		
		System.arraycopy(arrO, 0, hap, 0, arrO.length);
		System.arraycopy(tmpO, 0, hap, arrO.length, tmpO.length);
		for(int h : hap) {
			System.out.print(h+", ");
		}
		
		
		
	}

}
