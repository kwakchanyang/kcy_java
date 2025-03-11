package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import VO.School;

public class schoolDAO extends DBConnect{

	public ArrayList<School> searchSelect(String searchWord) {
		
		String sql = "select * from school where school_name like"+
						"'%"+searchWord+"%'";
		
		ArrayList<School> list = new ArrayList<School>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				School data = new School( // 객체만들고
			rs.getInt("id"), rs.getString("diff"), rs.getString("school_name"),
			rs.getString("address"), rs.getInt("post_code"),
			rs.getString("tel"), rs.getString("fax"),
			rs.getString("education_office"), rs.getString("public_private"),
			rs.getString("homepage") // School의 변수명이 아닌 디비버 테이블의 컬럼명 입력 + 작성순서는 클래스에 만든 변수순서대로 
						);
						
				list.add(data); // list에 저장
			}
		} catch (SQLException e) {
			System.out.println(" 학교 검색 실패");
			e.printStackTrace();
		}
		
		return list; // return해야 list가 나옴
	}



	public void saveData(String id, int schoolNum) {
		// id변수는 로그인한 아이디이고, schoolNum은 선택한 학교 번호(id)이다.
		// insert, delete, update는 executeUpdate메서드를 사용하고
		// 결과는 없기에 ResultSet으로 안받아도 된다.
		// 내가 선택한 학교번호가 테이블에 저장될수 있게 saveData메서드 내용을
		// 완성하세요.
		
		String sql = "insert into my_school(member_id,school_id) values('"+id+"', "+schoolNum+")";
		
		try { // try catch를 통해 위의 쿼리문을 보내야함.
			st = conn.createStatement();
			st.executeUpdate(sql); 
			
		} catch (SQLException e) {
			System.out.println("조회 실패");
			e.printStackTrace();
		}
		
	
	}
	
}
