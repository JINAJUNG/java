package test19;

public class ForEachTest {

	public static void main(String[] args) {
		String[] st = new String[4];
		
		for(int i=0;i<st.length;i++) {
			st[i]="Å×½ºÆ®"+i;
		}
		
		for(String str : st) {
			System.out.println(str);
		}
		
		String[] arr = {"¹Î¿ì","Çö°æ","½ÂÇö"};
		String[][] multiArr = {{"1","2","3"},{"1"},{"1","5"}};  //±¸Á¶¾Ë¾Æ¾ßÇÜ
		
		for(String[] sb: multiArr) {
			for(String s : sb) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
