<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- header.jjsp --%>
<!-- html > head > meta,title,link
		  > body > div#header > div#nav > div.top left,div.top right
		  
	클래스이름은 여러개 가질수있음 top left > top과 left2개를 가짐
 -->

<div id="header">
	<div id="nav">
		<div class="top left"> 
			<ul class="menu-list">
				<li class="menu"><a href="/jsp2">HOME</a></li>
				<li class="menu"><a href="/jsp2/board/list">러브가 무엇이오</a></li>
				<li class="menu">합시다 러브</li>
				<li class="menu">사랑이 죄가 아니잖아</li>
				<li class="menu">특급칭찬이야</li>
			</ul>
		</div>
		
		<%
			String user = (String)session.getAttribute("user");
		
		%>
		
		
		<div class="top right">
			<% if (user != null){ %>
				<b> <%=user %></b>
			<% }else {%>
			<div class="login-wrap">
				<a href="/jsp2/signin" class="login-bt">러브로그인</a>
			</div>
			<% } %>
		
		</div>
	</div>

</div>
    