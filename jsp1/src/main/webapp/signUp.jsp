<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement" %>
    
<!-- 자바쪽임 ... request객체 : 사용자가 행하는 거의 모든 요청  respond객체 : 요청에 따른 응답 >> 톰캣이 다 만들어주니까 개발자들은 객체에 담긴것을 가져오기만 하면됨-->
<!-- 사용자가 입력한아이디가 톰캣을 통해 myId에 저장이 된다. 아이디리스트에서 출력하는 코드짜기  --> 
<!-- getParameter의 반환타입은 무조건 String임 -->
<%
	String myId = request.getParameter("id");
	String password = request.getParameter("pw");
	String birth = request.getParameter("birth");
	String email = request.getParameter("email");
	
	
	// 데이터베이스 저장하기 - 하지만 아이디가 중복이면 저장안함
	//main메서드가 톰캣에있기때문에 톰캣에 의해 라이브러리를 인지하게 해야함
	
	Connection conn = null; // 로그인성공했을 때 로그인정보를 담는곳
	
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
	
	//회원가입양식에 입력한 내용을 테이블에 저장할 것이다.
	// 그전에 아이디 중복 확인
	ResultSet rs = null;
	Statement st = null;
	
	String sql="select * from member1 where member_id='"+
				myId+"'";
	try{
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		if(rs.next()){ // rs.next()가 중복여부체크한게 아니라 내가 이렇게판단하겠다고 정해놓은것임 .거짓일때 저장이되야함 참이라면 아이디가 중복이라는 뜻이고, 거짓이라면 중복아니다.
			// 아이디가 중복이라면 회원가입 다시하게 해줄것
			// 다시 회원가입 양식 페이지로 이동해야 한다.
			// 이동시키는 방법으로 javascript 또는 내장객체를 사용하는 방법이 있다.
			%> <!-- 자바영역을 나와 스크립트를 작성하기 -->
				<script>
					/*alert("아이디가 중복");
					//history.back(); 이전페이지로 넘어감(이전값남아있음)
					location.href="main.jsp";//(새로운페이지-이전데이터다날라감)  >> 자바스크립트로는 한번만 동작*/
					// response 사용자에게 응답으로 다시 페이지를 준것 > 사용자컴퓨터가 받은주소로 다시 요청함 > 다시보내줌 (자바는 2번실행)
				</script>
			<%
				response.sendRedirect("main.jsp");
				return;
			
			
		}
	}catch(SQLException e){
		System.out.println("아이디 중복 확인 조회 실패");
	}

	// 아이디 중복이 아니니까 회원가입 내용을 테이블에 저장시키기
	
	PreparedStatement pt = null;
	
	sql = "insert into member1(member_id, email, password, birth)"+ "values(?, ?, ?, ?)";
	
	try{
		pt = conn.prepareStatement(sql);
		pt.setString(1, myId); // 입력한 id가 위위 sql중 values의 ?첫번째에 들어감.
		pt.setString(2, email);
		pt.setString(3, password);
		pt.setString(4, birth);
		
		pt.executeUpdate();
		
	}catch(SQLException e){
		System.out.println("회원가입 테이블 저장 실패");
		e.printStackTrace();
	}
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 회원가입 완료 </h2>
	<h3> 회원가입 내용</h3>
	<ul>
	<!-- 밑에서 출력할때는 위에서 선언한 변수이름을 출력! name값 쓰는거 아님! -->
		<li>아이디 : <%=myId %></li>
		<li>비밀번호 : <%=password %></li>
		<li>생년월일 : <%=birth %></li>
		<li>이메일 : <%=email %></li>
	</ul>
	
	<a href="main.jsp"> Home </a>
</body>
</html>