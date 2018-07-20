package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static Connection con=null;
	private static final String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
	private static final String userName = "root";
	private static final String userPwd ="12345678";
	
	private static void openCon() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url, userName, userPwd);
			con.setAutoCommit(false); //자동저장 막아놓음 false, 트렌젝션을 걸어놓은것이라고 한다는데~~goto UserDAOImple->insertUserInfo 메소드에서 제대로된 값이 들어가면 try 안에서 커밋 아니라면 catch에서 rollback시킨다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		if(con==null) {
			openCon();
		}
		return DBCon.con;
	}
	
	public static void closeCon() {
		if(DBCon.con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		DBCon.con=null;
	}
	
}
