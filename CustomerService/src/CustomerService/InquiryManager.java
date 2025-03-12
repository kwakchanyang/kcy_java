package CustomerService;
import java.sql.*;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class InquiryManager extends DBConnect{
	
	
	public void addInquiry(Inquiry i) {
		//'2025-03-11'
		//추가
		String sql = "insert into inquiry(title, context, customer_info, state, register_time) values ('"
				+ i.getTitle()+"', '"+i.getContext()+"', '"+i.getCustomerInfo()+"', '"+i.getState()+"', '"+i.getRegisterTime()+"');";
//		System.out.println(sql);
		
		try { 
			st = conn.createStatement(); // 쿼리문 보낼수 있게 statement생성
			st.executeUpdate(sql); // statement로 쿼리 보내고 결과 받기
			
		} catch (SQLException e) {
			System.out.println("추가 실패");
			e.printStackTrace();
		}
	}
	
	public void deleteInquiry(int inqId) {
		//문의 id로 삭제
		String sql = "delete from inquiry where id =" + inqId;
//		System.out.println(sql);
		
		try { 
			st = conn.createStatement(); // 쿼리문 보낼수 있게 statement생성
			st.executeUpdate(sql); // statement로 쿼리 보내고 결과 받기
			
		} catch (SQLException e) {
			System.out.println("삭제 실패");
			e.printStackTrace();
		}
		
	}
	
	public void updateInquiryState(int inqId, int stateNum) {
		//상태 변경
		String stateString = null;
		switch(stateNum) {
		case 1:
			stateString = "접수됨";
			break;
		case 2:
			stateString = "처리 중";
			break;
		case 3:
			stateString = "완료됨";
			break;
		default:
			System.out.println("잘못된 상태 입력");
			return;
		}
		
		String sql = "update inquiry set state = '" + stateString + "' where id = "+ inqId;
//		System.out.println(sql);
		
		try { 
			st = conn.createStatement(); // 쿼리문 보낼수 있게 statement생성
			st.executeUpdate(sql); // statement로 쿼리 보내고 결과 받기
			
		} catch (SQLException e) {
			System.out.println("존재하지 않는 id");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Inquiry> searchInquiry(String keyword) {
		//특정 단어가 포함된 문의 검색
		//사용자가 입력한 키워드 포함 문의만 필터링하여 출력
		String sql = "select * from inquiry where context like '%" + keyword + "%' order by register_time desc";
//		System.out.println(sql);
		
		ArrayList<Inquiry> list = new ArrayList<Inquiry>();
	
		try { 
			st = conn.createStatement(); // 쿼리문 보낼수 있게 statement생성
			rs = st.executeQuery(sql); // statement로 쿼리 보내고 결과 받기
			while(rs.next()) {
				Inquiry data = new Inquiry( // 객체만들고
						rs.getInt("id"), rs.getString("title"), rs.getString("context"), rs.getString("customer_info"), rs.getString("state"),
						rs.getString("register_time")
						);
						
				list.add(data);
			}
		} catch (SQLException e) {
			System.out.println("존재하지 않는 id");
			e.printStackTrace();
		}

		return list;
		
	}
}
