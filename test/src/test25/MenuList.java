package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuList {

	private static ArrayList<HashMap<String, String>> menuList = new ArrayList<HashMap<String, String>>();

	public static int insertMenu(HashMap<String, String> menu) {
		int result = 0;
		int uNum = menuList.size() + 1;
		try {
			menu.put("mNum", uNum + "");
			menuList.add(menu);
			result = 1;
		} catch (Exception e) {
			System.out.println("지금코드로 내가 출력 될꺼야.");
		}
		return result;
	}

	public static void inputData() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();

		System.out.println("메뉴를 적어주세요");
		System.out.print("메뉴명 : ");
		String mName = sc.nextLine();
		System.out.print("가격 : ");
		int mPrice = changeStr(sc.nextLine());
		System.out.print("인분 : ");
		int mCnt = changeStr(sc.nextLine());
		
		if(mPrice==-1 || mCnt==-1) {
			System.out.println("숫자가 아닌 값이 들어 왔습니다.");
			System.out.println("정보를 등록할 수 없습니다.");
			return;
		}
		
		hm.put("mName", mName);
		hm.put("mPrice", mPrice + "");
		hm.put("mCnt", mCnt + "");

		int count = insertMenu(hm);
		if(count!=0) {
			System.out.println("성공적으로 등록 되었습니다.");
		}else {
			System.out.println("등록되지 않았습니다.");
		}
		
	}

	public static int changeStr(String str) {
		int num = 0;
		try {
			num = Integer.parseInt(str);
		} catch (Exception e) {
			return -1;
		}
		return num;
	}

	public static void main(String[] args) {
		inputData();
		inputData();
		System.out.println(menuList);
	}
}
