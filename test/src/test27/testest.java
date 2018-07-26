package test27;
import java.util.ArrayList;
import java.util.List;

public class testest {


	public static int indexOf(String[] strArr, String an) {
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].equals(an)) {
				return i;
			}

		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		String[] stAr = {"배","복숭아","사과","체리","망고","멜론","참외","체리"};
		String answer ="체리";
		
		int idx =indexOf(stAr,answer);
		System.out.println(idx+"번째 방에 "+answer+"이(가) 있습니다.");
		
	}

}