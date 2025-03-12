package CustomerService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;

	protected DBConnect() {
		connection();
	}
	private void connection() {
		// 드라이버 로드
		// 계정로그인
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패 또는 연결실패");
			e.printStackTrace();
		}
		
		String user = "kcy";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/kcy";
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("계정 접속 실패");
			e.printStackTrace();
		}
	}
}
