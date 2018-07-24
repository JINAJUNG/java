package test26;

public class ListTest {

	private String[] strArr;

	public ListTest() {
		this.strArr = new String[0];
	}

	public boolean add(String str) {
		String[] tmpArr = this.strArr;
		this.strArr = new String[this.strArr.length + 1];
		for (int i = 0; i < tmpArr.length; i++) {
			this.strArr[i] = tmpArr[i];
		}
		this.strArr[this.strArr.length - 1] = str;
		return true;
	}

	public boolean remove(String str) {
		String[] tmpArr = this.strArr;
		int idx = index(str);
		this.strArr = new String[this.strArr.length - 1];
		int c=0;
		for(int i=0;i<strArr.length;i++) {
			if(i==idx) {c=1;}
			if(c==1) {
				strArr[i]=tmpArr[i+1];
			}else {
				strArr[i]=tmpArr[i];
			}
			
		}

		// for(int i=0;i<idx;i++) {
		// strArr[i]=tmpArr[i];
		// }
		// for(int i=idx+1;i<tmpArr.length;i++) {
		// strArr[i-1]=tmpArr[i];
		// }
		return true;
	}

	public int size() {
		return this.strArr.length;
	}

	public String get(int idx) {

		if (this.strArr.length <= idx) {
			System.out.println(idx + "번 방은 없음");
		}
		return this.strArr[idx];
	}

	public String toString() {
		String str = "[";
		for (String s : strArr) {
			str += s + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return str;
	}

	public int index(String str) {

		for (int i = 0; i < this.strArr.length; i++) {
			if (str.equals(this.strArr[i])) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ListTest li = new ListTest();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		// System.out.println(li.get(1));
		// System.out.println(li.index("6"));
		// System.out.println(li.size());
		li.remove("3");
		System.out.println(li);
	}
}
