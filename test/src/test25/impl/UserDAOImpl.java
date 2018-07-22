package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	public static Connection con = null;

	@Override
	public ArrayList<HashMap<String, String>> selectUserList(HashMap<String, String> user) {
		con = DBCon.getCon();
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
		String sql = "select * from user";
		if (user != null) {
			sql += " where ";
			if (user.get("uiNum") != null) {
				sql += "uiNum = ?";
			}
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if (user != null) {
				if (user.get("uiNum") != null) {
					ps.setString(1, user.get("uiNum"));
				}
			}
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			while (rs.next()) {
				user = new HashMap<String, String>();
				for (int i = 0; i < count; i++) {
					String column = rsmd.getColumnName(i + 1);
					user.put(column, rs.getString(column));
				}
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return userList;
	}

	@Override
	public int insertUserList(HashMap<String, String> user) {
		con = DBCon.getCon();
		String sql = "insert into user(uiName, uiAge, uiCredat, uiCretim, uiEtc,uiDelete) ";
		sql += "values (?,?,date_format(now(), '%Y%m%d'),date_format(now(), '%I%i%s'),?,'0')";
		int result = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.get("uiName"));
			ps.setString(2, user.get("uiAge"));
			ps.setString(3, user.get("uiEtc"));
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return result;
	}

	@Override
	public int updateUserList(HashMap<String, String> user) {
		// 헤시맵에 있는 아이들만 업데이트 시키도록 해보기!set값을 받아옴
		
		int result = 0;
		Iterator<String> it = user.keySet().iterator();

		while (it.hasNext()) {
			con = DBCon.getCon();
			String sql = "update user set ";
			String setColumn = it.next();
			if (setColumn.equals("uiNum")) {
				DBCon.close();
				continue;
			}
			sql += setColumn + "=?  where uiNum = ?";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				if (user != null) {
					ps.setString(1, user.get(setColumn));
					ps.setString(2, user.get("uiNum"));
				}
				result += ps.executeUpdate();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("dhdld");
			} finally {
				DBCon.close();
			}
			System.out.println(result);
		}

		return result;
	}

	@Override
	public int deleteUserList(HashMap<String, String> user) {
		con = DBCon.getCon();
		int result = 0;
		String sql = "delete from user ";
		if (user != null) {
			sql += " where ";
			if (user.get("uiNum") != null) {
				sql += "uiNum = ?";
			}
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if (user != null) {
				if (user.get("uiNum") != null) {
					ps.setString(1, user.get("uiNum"));
				}
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		System.out.println(result);
		return result;
	}

}
