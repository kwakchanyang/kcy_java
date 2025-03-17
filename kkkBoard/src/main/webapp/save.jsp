<%@page import="java.sql.SQLException"%>

<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    

<%@ page import="java.sql.Statement, java.sql.DriverManager" %>    

    

    

<%

	String title = request.getParameter("title");

	String writer = request.getParameter("writer");

	String content = request.getParameter("content");

	String cDate = request.getParameter("createDate");



	// 데이터베이스 저장하기

	

	Connection conn=null;

	try{

		Class.forName("com.mysql.cj.jdbc.Driver");

		

		String user= "kcy";

		String pass = "1234";

		String url = "jdbc:mysql://localhost:3306/kcy";

		conn = DriverManager.getConnection(url,user,pass);
		


	}catch(Exception e){

		System.out.println("드라이버 로드 실패 및 접속 실패");

		e.printStackTrace();

	}



	// 작성한 게시글을 테이블에 저장 시키기

	

	PreparedStatement pt = null;

	

	String sql="insert into kkk_board(title,writer,content,create_date)"+

		"values(?,?,?,?)";

	try{

		pt=conn.prepareStatement(sql);

		pt.setString(1, title);

		pt.setString(2, writer);

		pt.setString(3, content);

		pt.setString(4, cDate);

		pt.executeUpdate();
		
		

	}catch(SQLException e){

		System.out.println("게시글 테이블 저장 실패");

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

	<h2>게시글이 등록되었습니다.</h2>

	<h3>게시글 내용</h3>

	<ul>

		<li>제목 : <%=title %></li>

		<li>작성자 : <%=writer %></li>

		<li>내용 : <%=content %></li>

		<li>작성일 : <%=cDate %></li>

	

	

	</ul>

	

	<a href="board.jsp">Home</a>

</body>

</html>