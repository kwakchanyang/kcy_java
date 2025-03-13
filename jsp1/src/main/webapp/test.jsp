<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
 	// 선언문 - 변수, 메서드선언, 클래스 정의
 	int age = 0;
	int[] arr = new int[]{10,20,30,40,50,60};
%>    
    
<%
	// 스크립틀릿 - 대부분 다 가능(메서드,클래스xx)
	age = 25;
%>
 
  
<%-- jsp주석 --%>
<!-- html주석 ctrl+shitf+/ -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> <%=age%></h1>
	
	<ul>
		<%
			for(int i=0;i<arr.length;i++) {
/* 				out.print("<li>"+arr[i]+"</li>");
			} */
		%>
			<li> <%=arr[i] %> </li>
		<% } %>
	</ul>
	
	
</body>
</html>