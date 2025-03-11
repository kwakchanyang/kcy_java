package DAO;

import java.sql.SQLException;

public class MemberDAO extends DBConnect{

	public boolean userIdAndPassword(String mId, String mPw) {
		// 입력한 아이디와 비밀번호로 테이블 조회하기
		String sql = "select * from member1 where member_id='"+mId+ 
				"' and password='"+mPw+"'";
		
		// 예외처리하는이유 : 데이터베이스와의 연결과정에서 연결실패할수있어서 > 비정상적 종료 방지
		try { 
			st = conn.createStatement(); // 쿼리문 보낼수 있게 statement생성
			rs = st.executeQuery(sql); // statement로 쿼리 보내고 결과 받기
//			조회한 결과가 잘 있냐 없냐를 next()통해 먼저 따져야함.
//			비밀번호잘못입력하면 빈공간임 rs.next()했을때 false나오고 잘 입력하면 데이터가 저장되서 rs.next()하면 true나옴
//			위에 문제가 있다면 rs.next()가 동작을 하지 않으니 return rs.next()를 하는게 아니라 if문을 만든것임
			if(rs.next()) { // 로그인성공했으니까 true반환
				return true;
			}
		} catch (SQLException e) {
			System.out.println("아이디 비번 조회 실패");
			e.printStackTrace();
		}
		
		return false; // 로그인 실패(아이디 또는 비번잘못) false반환
//		return값은 MemberService의 signIn의 retrun에 넘겨줌 return dao.userIdAndPassword(mId,mPw);
//		main에서 로그인시작 > Memberservice의 signIn > useridpasswprd의 ture,false값이 sign에 넘어가고 이게 다시 main으로 넘어감
//		main에서는 사용자선택 switch > 나머지는 기능을 클래스에 따로 만들어주기(main에 다만드는거 아님)
//		사용자선택 > 로그인진행메서드(자바로는 안됨 > 디비버필요) > 목적,기능에 맞는 메서드들 모두 만들어야함.
	}

	
	
}
