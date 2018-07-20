package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImple;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImple();
		HashMap<String, String> userInfo = new HashMap<String, String>(); // 는 arraylist에 담지않았기 때문에 키값이 중복되어 덮어씌어진다 그래서
																			// 마지막 값만 갖고잇다.
		//https://blog.naver.com/kyh0687/150159979296 트랜젝션 설명

		ArrayList<HashMap<String,String>> userList = new ArrayList<HashMap<String,String>>();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇명을 등록하실래요?");
//		int max = Integer.parseInt(sc.nextLine());
//		for (int i = 0; i < max; i++) {
//			System.out.print((i + 1) + "번째 유저 네임을 입력해 주세요 : ");
//			String name = sc.nextLine();
//			userInfo.put("uiName", name);
//			System.out.print((i + 1) + "번째 유저 나이를 입력해 주세요 : ");
//			try {
//				int age = Integer.parseInt(sc.nextLine());
//				userInfo.put("uiAge", age + "");
//			} catch (Exception e) {
//				i--;
//				System.out.println("나이는 숫자로 입력해주세요");
//				System.out.println("등록되지 않았습니다.");
//				//sc.reset();리셋안먹음..왜때문?
//				sc = new Scanner(System.in);
//				continue;
//			}
//			System.out.print((i + 1) + "번째 유저 기타사항을 입력해 주세요 : ");
//			String etc = sc.nextLine();
//			userInfo.put("uiEtc", etc);
//			if (udao.insertUserInfo(userInfo) == 1) {
//				System.out.println("등록 성공");
//			} else {
//				System.out.println("등록 실패");
//			}
//		}
		userInfo.put("uiName", "ㅇㅎ하이");
		userList=udao.selectUserInfoList(userInfo);
		for(HashMap<String, String> hm : userList) {
			System.out.println(hm);
		}
		
		int deleteC = udao.deleteUserInfo(userInfo);
		if(deleteC==1) {
			System.out.println("정보 삭제 성공");
		}else {
			System.out.println("정보 삭제 실패");
		}
		userInfo.put("uiName", "ㅎ한이이");
		int updateC = udao.updateUserInfo(userInfo);
		if(updateC==1) {
			System.out.println("정보 갱신 성공");
		}else {
			System.out.println("정보 갱신 실패");
		}
		userList=udao.selectUserInfoList(null);
		for(HashMap<String, String> hm : userList) {
			System.out.println(hm);
		}
		
	}
}
