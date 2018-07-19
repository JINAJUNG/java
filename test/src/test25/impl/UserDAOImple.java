package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImple implements UserDAO {
	private Connection con;
	
	public UserDAOImple() {
		this.con=DBCon.getCon();	
	}
	
	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
	
		String sql ="insert into user_info(uiName,uiAge,uiCredat,uiCretim,uiEtc,uiDelete)";
		sql+="value(?,?,date_format(now(), '%Y%m%d'),date_format(now(), '%H%i%s'),?,'0')";  //? : 데이터 다이닝
		
		try {
			//statement 는 실행이먼저
			//preparedstatemnt는 파싱이먼저 !!생성할때 sql먼저 넣어놓음!!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));//바인딩 끝
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteUserInfo(HashMap<String, String> userInfo) {

		return 0;
	}

	@Override
	public int updateUserInfo(HashMap<String, String> userInfo) {

		return 0;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfoList(HashMap<String, String> userInfo) {

		return null;
	}

}
