package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImple implements UserDAO {
	private Connection con;

	public UserDAOImple() {

	}

	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();
		int result = 0;
		// select date_format(now(), '%Y%m%d'); //날짜;
		// select date_format(now(), '%H%i%s'); //시간;
		String sql = "insert into user_info(uiName,uiAge,uiCredat,uiCretim,uiEtc,uiDelete)";
		sql += "value(?,?,date_format(now(), '%Y%m%d'),date_format(now(), '%H%i%s'),?,'0')"; // ? : 데이터 다이닝

		try {
			// statement 는 실행이먼저
			// preparedstatemnt는 파싱이먼저 !!생성할때 sql먼저 넣어놓음!!
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));// 바인딩 끝
			result = ps.executeUpdate();
			this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}
		return result;
	}

	@Override
	public int deleteUserInfo(HashMap<String, String> userInfo) {
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
		int result = 0;
		this.con = DBCon.getCon();

		String sql = "delete from user_info";
		if (userInfo != null) {
			sql += " where ";
			if (userInfo.get("uiName") != null) {
				sql += "uiName = ?";
			}
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				if (userInfo != null) {
					if (userInfo.get("uiName") != null) {
						ps.setString(1, userInfo.get("uiName"));
					}
				}
				result = ps.executeUpdate();
				this.con.commit();
			} catch (SQLException e) {
				try {
					this.con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}finally {
				DBCon.closeCon();
			}
		}
		return result;
	}

	@Override
	public int updateUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();
		ArrayList<HashMap<String,String>> userList = new ArrayList<HashMap<String,String>>();
		int result=0;
		
		String sql = "update user_info set uiName='change'";
		if(userInfo!=null) {
			sql+=" where ";
			if(userInfo.get("uiName")!=null) {
				sql+="uiName =?";
			}
		}
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if(userInfo!=null) {
				if(userInfo.get("uiName")!=null) {
					ps.setString(1, userInfo.get("uiName"));
				}
			}	
			result = ps.executeUpdate();
			this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBCon.closeCon();
		}
		
		return result;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfoList(HashMap<String, String> userInfo) {
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
		this.con = DBCon.getCon();

		String sql = "select uiNum, uiName, uiAge, uiCredat, uiCretim, uiDelete, uiEtc from user_info";
		if (userInfo != null) {
			sql += " where ";
			if (userInfo.get("uiName") != null) {
				sql += "uiName=? ";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (userInfo != null) {
				if (userInfo.get("uiName") != null) {
					ps.setString(1, userInfo.get("uiName"));
				}
			}
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData(); // 메타데이터 갖고옴
			int columns = rsmd.getColumnCount(); // 컬럼갯수 갖고옴
			while (rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				for (int i = 0; i < columns; i++) {
					String cName = rsmd.getColumnName(i + 1); // 각각의 컬럼 명을 하나씩 갖고오고 넣는다
					user.put(cName, rs.getString(cName));
				}
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}
		return userList;
	}

}
