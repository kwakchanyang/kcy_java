package service;

import DAO.MemberDao;
import jakarta.servlet.http.HttpServletRequest;

public class MemberService { 
//						┌로그인할때 입력한 값을 매개변수로 받아오기
	public void login(HttpServletRequest request) { //login실행을 doPost안에서 호출
		
		String email = request.getParameter("userId");
		String pass = request.getParameter("userPw");
		
		MemberDao dao = new MemberDao();
		
		if( dao.loginCheck(email, pass)) {
			request.getSession().setAttribute("user", email);
			//Session: 접속한 사용자에게 연결되었다는 값을 준다 > 연결 유지 > 값을 잃으면 연결끊김 > 새로운세션되면 user값 잃음
		}
	}
	
}

// 클라이언트의 요청 처리 흐름
// 주소에 의한 요청 -> 서블렛(컨트롤) -> 서비스(실제 처리 코드)
//	-> DAO(데이터베이스 필요시)
//	-> 서비스클래스의 메서드실행( 테이블에서 가져온거 있다면 서비스쪽으로 리턴)
//	-> DAO로 부터 받은거 있다면 서블렛에게 리턴
//	-> 서블렛(클라이언트에게 페이지 제공)