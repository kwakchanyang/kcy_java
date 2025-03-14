<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- signIn.jsp --%>

<%
	String id = request.getParameter("loginId");
	String pw = request.getParameter("loginPw");

	//데이터 베이스 연결
	Connection conn=null;
	PreparedStatement pt=null;
	ResultSet rs = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로드
		
		String user = "kcy";
		String pass = "1234";
		String url = "jdbc:mysql://localhost:3306/kcy";
		conn = DriverManager.getConnection(url,user,pass);
		
	}catch(Exception e){
		System.out.print("드라이버 로드 실패및 접속 실패");
		e.printStackTrace();
	}

	
	// 아이디와 암호 테이블에 조회
	
	String sql = "select * from member1 where member_id=? and password=?";
	
	try{
		pt = conn.prepareStatement(sql);
		pt.setString(1, id);
		pt.setString(2, pw);
		rs = pt.executeQuery();
		if(rs.next()){ // 참이라면 로그인성공, 거짓이라면 아이디또는 암호 틀림
			// 아이디와 암호 일치하면 로그인 처리
			out.print("<h1>로그인성공</h2>");
			// 로그인 유지 방법
			session.setAttribute("user", id);
			response.sendRedirect("main.jsp");
			
			
		}else{ // 아이디 또는 암호 틀림
			%>
				<script>
					let select = confirm("아이디 또는 비밀번호가 잘못되었습니다. \n"+
							"회원가입 하시겠습니까?");
					if(select) // 예 라면 회원가입    form을 통한것만이 아니라 내가 직접 show라는 파라미터를 직접 표현(파라미터로 뭘하는건지 정해놔야함)
						location.href="main.jsp?show=join";
					else // 아니라면 다시 로그인
						location.href="main.jsp?show=login";
				</script>
			
			
			<%
		}
		
	}catch(SQLException e){
		System.out.println("아이디 암호 조회 실패");
		e.printStackTrace()	;
	}
%>



