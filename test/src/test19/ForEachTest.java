package test19;

public class ForEachTest {

	public static void main(String[] args) {
		String[] st = new String[4];
		
		for(int i=0;i<st.length;i++) {
			st[i]="테스트"+i;
		}
		
		for(String str : st) {
			System.out.println(str);
		}
		
		String[] arr = {"민우","현경","승현"};
		String[][] multiArr = {{"1","2","3"},{"1"},{"1","5"}};  //구조알아야햄
		
		for(String[] sb: multiArr) {
			for(String s : sb) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}