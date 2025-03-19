package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Board;

public class BoardDao {
	private Connection conn;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public BoardDao() { // 새로운 BoardDao객체가 생성될때 connect가 실행되서 자동으로 데이터베이스에 연결시도
		connect();
	}
	
	// 게시판 테이블에 저장 메서드
	public void insert( Board board ) {
		
		
		// values(?  ,..., (날짜)now() )
		//쿼리문 작성하고 preparedStatement를 사용하여 저장 되게 만들기
	
		// Connection conn = null;을 하면 안되는 이유 : connect()가 만든 인스턴스변수conn을 사용해야함 > 새로만들면 conn이 null상태임
		// connect의 conn을 계속사용해야 이전에 설정한 연결이 저장되어 있음 > 새로만들게 되면 null상태의 변수를 사용하게 되서 데이터베이스 작업수행 xx
		PreparedStatement pt = null;
	

		
		
		String sql = "insert into jsp_board(writer, title, content, write_date)"+
					"values(?,?,?,now())";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, board.getWriter());
			pt.setString(2, board.getTitle());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("게시글 테이블 저장 실패");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void connect() {
//	데이터베이스에 연결하는 로직을 포함, 이메서드가 호출되면 JDBC드라이버를 로드하고, 주어진 데이터베이스의 URL,사용자명,비밀번호를 사용하여
//	conn인스턴스 변수를 통해 데이터베이스에 연결
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "kcy";
			String pass = "1234";
			String url = "jdbc:mysql://210.219.170.244:3306/kcy";
			conn = DriverManager.getConnection(url,user,pass);
			
			
		}catch(Exception e){
			System.out.print("드라이버 로드 실패및 접속 실패");
			e.printStackTrace();
		}
	}
//  		ArrayList가 Board타입의 객체만을 저장할수있도록 지정
	public ArrayList<Board> select() {
		
		ArrayList<Board> list = new ArrayList<>();
		
		String sql = "select * from jsp_board order by board_id desc";
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while( rs.next()) {
				Board data = new Board(rs.getInt("board_id"),
						rs.getString("writer"), rs.getString("title"),
						rs.getString("content"),rs.getDate("write_date").toLocalDate());
				list.add(data);
			}
			
		}catch(SQLException e) {
			System.out.println("게시판 전체 조회 실패");
			e.printStackTrace();
		}
		return list;
	}
}
