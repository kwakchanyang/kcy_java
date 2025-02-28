package interface5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect { // 데이터베이스 연결 작업
	
	protected Connection conn; // 계정 로그인 상태 저장
	protected Statement st;// 쿼리문 보내기 위해 필요
	protected ResultSet rs; // 조회 결과 받기
	
	protected DBConnect() {
		connection(); // DB 연결 메서드
	}
	
	private void connection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로드
			
			String user = "kcy"; // 계정명
			String password = "1234"; // 비번
			String url = "jdbc:mysql://localhost:3306/kcy";// DB주소/DB명
			
			conn = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결 실패");
			e.printStackTrace();
		}
	}
}
