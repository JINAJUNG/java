package test21;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		
		ArrayList<Student> sList = new ArrayList<Student>();
		
		for(int i=1;i<=5;i++) {
			String name = "테스트"+i;
			int grade = (int)(Math.random()*10)+1;
			sList.add(new Student(name,grade));
		}
		
		int sSize= sList.size();
		
		for(int i=0;i<sSize;i++) {
			for(int j=i+1;j<sSize;j++) {
				if(sList.get(i).grade < sList.get(j).grade) {
					Student tmp = sList.get(i);
					sList.set(i, sList.get(j));
					sList.set(j, tmp);
				}
			}
		}
		
		for(Student st : sList) {
			System.out.println("name : "+st.name+", grade : "+st.grade);
		}
	}
}