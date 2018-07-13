package test18;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person[] p = new Person[5];
		int[] bea = new int[p.length];
		int num=1;
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
			p[i].name = (i + 1) + "번째 사람";
			System.out.println(i + 1 + "번쨰 사람의 점수를 입력해 주세요");
			p[i].point = Integer.parseInt(sc.nextLine());
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].name + "님의 점수는 : " + p[i].point + "입니다.");
		}

		//등수
		for(int i=0;i<bea.length;i++) {
			bea[i]=p[i].point;
		}
		for(int i=0;i<p.length;i++) {
			for(int j=i+1;j<p.length;j++) {
				if(bea[i]<bea[j]) {
					int tmp=bea[i];
					bea[i]=bea[j];
					bea[j]=tmp;
				}
			}
		}
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p.length;j++) {
				if(bea[i]==p[j].point) {
					p[j].rank=i+1;
				}
			}
		}
		
		

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].name + "님의 점수는 : " + p[i].point + "입니다." + "등수는 : " + p[i].rank);
		}
	}
}
