package test17;

public class Student {

	private String name;
	private int point;
	
	public Student(String name, int point) {
		this.name=name;
		this.point=point;
	}
	
	public String toString() {
		return name+"님의 점수는 "+point;
	}
	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("진승현",80);
		s[1] = new Student("승현",60);
		s[2] = new Student("현진",70);
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].point<s[j].point) {
					Student tmp=s[j];
					s[j]=s[i];
					s[i]=tmp;
				}
				
			}
		}
		for(Student st : s) {
			System.out.println(st);
		}
	}
}