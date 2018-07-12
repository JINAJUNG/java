package test17;

public class ThreeSixNine {

	public static void main(String[] args) {
		int ranNum=100;
		int c=0, ct=0;
		char[] num = {'3','6','9'};
		for(int i=1;i<=100;i++) {
			String s = i+"";
			for(int j=0;j<s.length();j++) {
				char ch = s.charAt(j);
				//if(ch=='3' || ch=='6' || ch=='9') {
				if(num.equals(ch)) {
					System.out.println(s+", "+ch+"\n");
					c++;
					if(i>=30 && i<=39 || i>=60 && i<=69 || i>=90 && i<=99) {
						break;
					}
				}
			}
		}
		for(int i=1;i<ranNum;i++) {
			String s = i+"";
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
					ct++;
					if(s.charAt(0) == '3' || s.charAt(0) == '6' || s.charAt(0) == '9') {
						break;
					}
				}	
			}
		}
		System.out.println("Â¦ °¹¼ö : "+c);
		System.out.println("Â¦ °¹¼ö : "+ct);
		
		
	}
}
