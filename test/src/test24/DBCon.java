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
		Connection con = null;
		
		
		// jdbc:mariadb://아이피:포트/디비이름 클라스 이름
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pw = "12345678";
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // jar파일에 접근해 Driver클래스(파일)을 불러오는 것
			con = DriverManager.getConnection(url, id, pw);
			
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
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("프로그램끝");
	}
}
