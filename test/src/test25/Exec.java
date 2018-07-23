package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		ArrayList<HashMap<String,String>> userList;
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> user = new HashMap<String,String>();
		
		System.out.println("몇명의 정보를 입력할래?");
		int countP = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<countP;i++) {
			System.out.print((1+i)+"번째 사람 이름 : ");
			String name =sc.nextLine();
			user.put("uiName", name);
			System.out.print((1+i)+"번째 사람 나이 : ");
			try {
				int age =Integer.parseInt(sc.nextLine());
				user.put("uiAge", age+"");
			}catch(Exception e) {
				e.printStackTrace();
			}	
			System.out.print((1+i)+"번째 사람 기타 정보 : ");
			String etc =sc.nextLine();
			user.put("uiEtc", etc);
			
			int insertC = udao.insertUserList(user);
			if(insertC==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
		}
		
		user.put("uiNum", "7");
		user.put("uiName","토끼1");
		user.put("uiEtc","장미꽃");
		userList = udao.selectUserList(user);

		int updateC = udao.updateUserList(user);
		if(updateC!=0) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 실패");
		}
		user=null;
		userList = udao.selectUserList(user);
		for(HashMap<String,String> hm : userList) {
			System.out.println(hm);
		}
//		if(udao.deleteUserList(user)==1) {
//			System.out.println("삭제 성공");
//		}else {
//			System.out.println("삭제 실패");
//		}
		
	}
}
