package collection3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	public Connection conn;
	public Statement st;
	public ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	public void connection() {
		// 드라이버 로드
		// 계정로그인
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "kcy";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/kcy";
			
			conn = DriverManager.getConnection(url,user,password);
			
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결실패");
			e.printStackTrace();
		}
	}
	
}
