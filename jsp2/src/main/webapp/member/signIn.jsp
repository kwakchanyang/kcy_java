<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- signIn.jsp --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내맘속에로그인</title>  <!-- 진짜 웹주소를 넣어주면 폴더경로가 어디서든 접근가능 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/smile.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/signIn.css">
<script src="http://localhost:8080/jsp2/static/javascript/signIn.js"></script>
</head>
<body> 
	<%@ include file="../header.jsp" %>
	
	<div id="main">
		<h2 class="page-title">로그인</h2>
		<p class="love-word">
			사랑에는 한가지 법칙밖에 없다. <br>
			그것은 사랑하는 사람을 <br>
			행복하게 만드는 것이다.
		</p>
		
		<div id="formWrap">
			<form id="fm" name="fm" role="form" method="post" action="signin"><!-- post방식이라 doPost실행됨 -->
			<!-- 같은주소(signin)이지만 요청방식에 따라 다른페이지 나오게 get:로그인페이지 제공/post:로그인 처리동작 > HOME페이지 제공-->
				<div class="input-field">
					<label for="userId">아이디</label>
					<input type="text" name="userId" id="userId" >
				</div>
				<div class="input-field">
					<label for="userPw">비밀번호</label>
					<input type="password" name="userPw" id="userPw">
				</div>
				<div class="form-bt">
					<button class="signIn-bt">로그인</button>
				</div>
			</form>
		</div>
		
		<div id="forgetAndJoin">
			<div class="forget"> 아이디 / 비밀번호 찾기</div>
			<div class="join" >회원가입</div>
		</div>
		
		<p>
			너밖에 없어서 널 사랑하게 아니라 <br>
			널 사랑하다 보니 너밖에 없더라.
		</p>
		
		
	</div>
	
	<%@ include file="../footer.jsp" %>
</body>
</html>