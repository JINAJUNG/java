package test05;

public class arrEx {

	public static void main(String[] args) {
		//1>ÃÑÇÕ Æò±Õ
		int[] score = {55,55,15,89,26,10,89,55,15,89};
		for(int i : score) {
			System.out.print(i+", ");
		}
		System.out.println();
//		int hap=0;
//		
//		for(int i=0;i<score.length;i++) {
//			hap+=score[i];
//		}
//		
//		System.out.println("\nÇÕ : "+hap);
//		System.out.println("Æò±Õ : "+(hap/score.length));

		
//		//2>ÃÖ´ë°ª ÃÖ¼Ò°ª
//
//		int min=score[0];
//		int max=score[0];
//		
//		for(int i=0;i<score.length;i++) {
//			if(score[i]>max) {
//				max=score[i];
//			}
//			if(score[i]<min) {
//				min=score[i];
//			}
//		}
//		System.out.println("max : "+max);
//		System.out.println("min : "+min);
		
		
//		//3> ¼¯±â(¼ÅÇÃ)
//		int[] ranBea = new int[score.length];
//		for(int i=0;i<score.length;i++) {
//			int ran = (int)(Math.random()*(score.length-1));
//			ranBea[i]=ran;
//			int tmp=score[i];
//			score[i]=score[ran];
//			score[ran]=tmp;
//		}
//		System.out.print("¼ÅÇÃ : ");
//		for(int i : score) {
//			System.out.print(i+", ");
//		}
		
		
//		//4> Á¤·Ä
//		for(int i=0;i<score.length;i++) {
//			for(int j=i+1;j<score.length;j++) {
//				if(score[i]<=score[j]) { //<,>,<=,>=
//					int tmp=score[i];
//					score[i]=score[j];
//					score[j]=tmp;
//				}
//			}
//		}
//		for(int i : score) {
//			System.out.println(i);
//		}
		
		
		//5> ºóµµ ¼ö ±¸ÇÏ±â
		int[] bin = new int[score.length];
		int[] binC = new int[score.length];
		
		int k=0;
		int inser=1;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score.length;j++) {
				if(i==j) {
					continue;
				}
				if(score[i]==score[j]) {
					bin[k]=score[j];
					if(binC[k]==0) {
						binC[k]=inser;
					}					
					if(binC[k]>0) {
						binC[k]+=1;
					}
				}
			}
			k++;
		}
		for(int i=0;i<score.length;i++) {
			if(binC[i]!=0) {
				System.out.print("bin : "+bin[i]);
				System.out.println(" binC : "+binC[i]);	
			}			
		}
	}
}
