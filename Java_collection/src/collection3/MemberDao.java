package collection3;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao extends DBConnect{
	
	// 테이블에서 데이터 가져오기
	public ArrayList<Member> select() {
		String sql = "select * from member1";
		
		ArrayList<Member> list = new ArrayList<>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
//			rs에 들어있는것은 주소임 rs.next()데이터가 있냐없냐를 따짐. 있으면 true임
//			true 결과값을 내고 다음 데이터 주소에 위치함. > dbeaver의 표구조에서 1줄씩 위치하면서 옮김
//			rs.next()를 해야 실제 데이터에 접근할수있는것임 
			while(rs.next()) { // 왜 while문?for문은 변수들,범위 필요함.
				
				Member m = new Member(rs.getLong("id"),
						rs.getString("member_id"), rs.getString("email"),
						rs.getString("password"), rs.getString("birth"));
				
				list.add(m);
			}
			
		}catch(SQLException e) {
			System.out.println("member1 전체 조회 실패");
		}
		return list; // list를 반환시키는거니까 list타입을 void에서 ArrayList<Member>로 변경
	}
}
