<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String path = "http://localhost:8080/jsp2/";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원가입 </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/loveicon.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">

<link rel="stylesheet" href="<%=path %>static/css/signUp.css">

<script src="<%=path%>static/javascript/signUp.js"></script>

</head>
<body>
	
	<div id="wrap">
		<%@ include file="../header.jsp" %>
	                   
	    <div id="main">
	    	
		<form method="post" action="signUpSave.jsp">
		
			<div id="formData">
				<div class="inputField"> <!-- 일반적으로 name과 id의 이름은 같게 -->
					<input type="email" name="email" id="email">
					<label for="email">이메일</label>
                </div>
				<div class="inputField">
					<input type="password" name="password" id="password" class="pwChk">
					<label for="password">비밀번호</label>	
				</div>
				<div class="inputField"> <!-- 얘는 name필요없음.  getParameter안해도됨 > html에서 이미 일치,불일치 여부 뜨게 해놔서 -->
					<input type="password" id="chk" class="pwChk">
					<label for="chk">비밀번호 확인 
						<b id="pwRes"></b>		
					</label>		
				</div>
				<div class="inputField">
					<input type="text" name="name" id="name">
					<label for="name">이름</label>		
				</div>
				<div class="inputField">
					<input type="text" name="tel" id="tel">
					<label for="tel">연락처</label>	
				</div>
				<div class="inputField">
					<b>생일 년월</b>
					<select id="birthYear" name="birthYear"></select>	
					<label for="birthYear">년</label>	
					<select id="birthMonth" name="birthMonth"></select>
					<label for="birthMonth">월</label>
				</div>
				
				<button id="joinBt">SignUp</button>
				
			</div>
		
		</form>
	
	    </div>   
	                           
		<%@ include file="../footer.jsp" %>
	</div>

</body>
</html>






