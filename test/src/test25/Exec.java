package test25;

import java.util.HashMap;

import test25.impl.UserDAOImple;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImple();
		HashMap<String,String> userInfo = new HashMap<String,String>();
		
		userInfo.put("uiName","김철수철수");
		userInfo.put("uiAge","40");
		userInfo.put("uiEtc","Etc");
		if(udao.insertUserInfo(userInfo)==1) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 실패");
		}
	}

}
