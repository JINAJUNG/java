package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
	// Driver Class = org.mariadb.jdbc.Driver
	// Connection URL = jdbc:mariadb://아이피:포트/디비이름

	// http://bbsappf.org/220805623926
	public static void main(String[] args) {
		Connection con;
		
		
		// jdbc:mariadb://아이피:포트/디비이름 클라스 이름
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pw = "12345678";
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // jar파일에 접근해 Driver클래스(파일)을 불러오는 것
			con = DriverManager.getConnection(url, id, pw);
			
			// 1.select
//			String sql1 = "select * from user_info where uNum=? or uName=?";
//			PreparedStatement ps = con.prepareStatement(sql1);
//			ps.setInt(1, 1);
//			ps.setString(2, "귱");
//			ResultSet rs = ps.executeQuery();
//
//			String sql = "select * from user_info";
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//
//			while (rs.next()) {
//				int num = rs.getInt("uNum");
//				String name = rs.getString("uName");
//				int age = rs.getInt("uAge");
//				String address = rs.getString("uAddress");
//				String etc = rs.getString("uEtc");
//				System.out.println(num + "," + name + "," + age + "," + address + "," + etc);
//			}

			// 2.delete
//			String jo = "1";
//			Statement stmt = con.createStatement();
//			String sql = "delete from user_info where uNum=" + jo;
//			int n = stmt.executeUpdate(sql);
//			if (n == 1) {
//				System.out.println("1번이 삭제가 됨");
//			} else {
//				System.out.println("1번이 삭제안됨 1번이 없는거 같음.");
//			}
			
			// 3.insert
//			Statement stmt = con.createStatement();
//			String sql = "insert into user_info(uName,uAge,uAddress,uEtc)";
//			sql +="values('hong',23,'서울','이티씨')";
//
//			int insertN = stmt.executeUpdate(sql);
//			if (insertN == 1) {
//				System.out.println("등록이 됨");
//			} else {
//				System.out.println("등록이 안됨");
//			}

			// 4.update
			Statement stmt = con.createStatement();
			String sql = "update user_info set uEtc='테스트' where uNum=4";
			int updateN = stmt.executeUpdate(sql);
			if (updateN == 1) {
				System.out.println("update 됨");
			} else {
				System.out.println("update 안됨");
			}
			
			sql = "select * from user_info";
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int num = rs.getInt("uNum");
				String name = rs.getString("uName");
				int age = rs.getInt("uAge");
				String address = rs.getString("uAddress");
				String etc = rs.getString("uEtc");
				System.out.println(num + "," + name + "," + age + "," + address + "," + etc);
			}

			System.out.println("정상작동");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램끝");
	}
}
