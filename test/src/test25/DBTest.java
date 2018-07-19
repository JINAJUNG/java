package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	// alter table user_info modify column uName varchar(200) not null; - mariadb
	// alter modify명령문
	// final을 해도 add는 된다 다만, 오른쪽 초기화부분을 새로 할 수 없다. 내부에 접근?은 가능하다.
	public final static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
	public static Scanner sc = new Scanner(System.in);

	public static int insertUser(HashMap<String, String> user) {
		int result = 0;
		int uNum = userList.size() + 1;
		try {
			user.put("uNum", uNum + "");
			userList.add(user);
			result = 1;
		} catch (Exception e) {
			System.out.println("지금코드로 내가 출력 될꺼야.");
		}
		return result;
	}

	public static void selectUser() {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			// if (user.get("uName").equals("똥통웜")) {
			// System.out.println(user);
			// } else {
			// System.out.println("nono");
			// }
			System.out.println(user);
		}
	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();

		System.out.println("이름을 입력해 주세요.");
		String name = sc.nextLine();
		hm.put("uName", name);
		System.out.println("나이를 입력해 주세요");
		String age = sc.nextLine();

		try {
			int ageN = Integer.parseInt(age);
		} catch (Exception e) {
			System.out.println("문자가 나이가 되면 이상하자나");
			return;
		}
		// for (int i = 0; i < age.length(); i++) {
		// int c =(int)age.charAt(i);
		// if (c >= 48 && c <= 57) { //48 : '0', 57 : '9'
		//
		// } else {
		// System.out.println("문자가 나이가될 순 없지?");
		// return;
		// }
		// }

		hm.put("uAge", age);
		int cnt = insertUser(hm);
		if (cnt == 1) {
			System.out.println("유저등록성공");
		} else {
			System.out.println("유저등록실패");
		}
	}

	public static HashMap<String, String> getUser(String uName) {
		for (HashMap<String, String> u : userList) {
			if (u.get("uName").equals(uName)) {
				return u;
			}
		}
		return null;
	}
	
	public static int userIndexOf(String str) {
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).get("uName").equals(str)) {
				return i;
			}
		}
		return -1;
	}

	public static void removeUser(String uName) {
		for (int i = 0; i < userList.size();) {
			HashMap<String, String> u = userList.get(i);
			if (u.get("uName").equals(uName)) {
				System.out.println("해당 유저를 삭제 했습니다.");
				userList.remove(i);
			} else {
				System.out.println("해당유저가 등록되어있는지 확인해 주세요.");
				i++;
			}
		}
	}

	public static void removeUser(HashMap<String,String> user) {
		userList.remove(user);
	}
	public static void removeUser(int idx) {
		userList.remove(idx);
	}
	public static void main(String[] args) {
		inputUser();
		inputUser();
		inputUser();
		inputUser();
		selectUser();
		HashMap<String, String> user = getUser("뚱냥이");
		System.out.println("검색된 유저 : " + user);
		//removeUser("a");
		//removeUser(user);
		int idx = userIndexOf("a");
		if(idx!=-1) {
			removeUser(idx);	
		}
		selectUser();
	}

}
