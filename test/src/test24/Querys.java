package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Querys {

	static Connection c;
	static Statement stmt;
	public Querys() {
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pw = "12345678";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			c = DriverManager.getConnection(url, id, pw);
			System.out.println("db연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectM(String s) {
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(s);
			while (rs.next()) {
				int num = rs.getInt("uNum");
				String name = rs.getString("uName");
				int age = rs.getInt("uAge");
				String address = rs.getString("uAddress");
				String etc = rs.getString("uEtc");
				System.out.println(num + "," + name + "," + age + "," + address + "," + etc);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertM(String s) {
		try {
			stmt=c.createStatement();
			int insertN = stmt.executeUpdate(s);
			if(insertN==1) {
				System.out.println("insert ok");
			}else {
				System.out.println("insert fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteM(String s) {
		try {
			stmt=c.createStatement();
			int deleteN = stmt.executeUpdate(s);
			if(deleteN==1) {
				System.out.println("delete ok");
			}else {
				System.out.println("delete fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateM(String s) {
		try {
			stmt=c.createStatement();
			int updateN = stmt.executeUpdate(s);
			if(updateN==1) {
				System.out.println("update ok");
			}else {
				System.out.println("update fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//dbcon
	// 1.select
//	String sql1 = "select * from user_info where uNum=? or uName=?";
//	PreparedStatement ps = con.prepareStatement(sql1);
//	ps.setInt(1, 1);
//	ps.setString(2, "귱");
//	ResultSet rs = ps.executeQuery();
//
//	String sql = "select * from user_info";
//	Statement stmt = con.createStatement();
//	ResultSet rs = stmt.executeQuery(sql);
//
//	while (rs.next()) {
//		int num = rs.getInt("uNum");
//		String name = rs.getString("uName");
//		int age = rs.getInt("uAge");
//		String address = rs.getString("uAddress");
//		String etc = rs.getString("uEtc");
//		System.out.println(num + "," + name + "," + age + "," + address + "," + etc);
//	}

	// 2.delete
//	String jo = "1";
//	Statement stmt = con.createStatement();
//	String sql = "delete from user_info where uNum=" + jo;
//	int n = stmt.executeUpdate(sql);
//	if (n == 1) {
//		System.out.println("1번이 삭제가 됨");
//	} else {
//		System.out.println("1번이 삭제안됨 1번이 없는거 같음.");
//	}
	
	// 3.insert
//	Statement stmt = con.createStatement();
//	String sql = "insert into user_info(uName,uAge,uAddress,uEtc)";
//	sql +="values('hong',23,'서울','이티씨')";
//
//	int insertN = stmt.executeUpdate(sql);
//	if (insertN == 1) {
//		System.out.println("등록이 됨");
//	} else {
//		System.out.println("등록이 안됨");
//	}

	// 4.update
//	Statement stmt = con.createStatement();
//	String sql = "update user_info set uEtc='테스트' where uNum=4";
//	int updateN = stmt.executeUpdate(sql);
//	if (updateN == 1) {
//		System.out.println("update 됨");
//	} else {
//		System.out.println("update 안됨");
//	}
}
