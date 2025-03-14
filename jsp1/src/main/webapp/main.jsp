<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 1</title>


<script>
	// main.jsp페이지를 열면 처음에 로그인하기 버튼과 회원가입하기 버튼 두개만 보여야 한다.
	// 로그인하기 버튼 클릭하면 로그인 양식보여야 하고 회원가입하기 버튼클릭하면 로그인 양식은 안보이고 회원가입양식만 보여야 한다.
	// 아이디 바로 못가져오는 이유는? 아직 생성이 안된상태임 > 가져와야함 . 
	
<% //자바는 어디서든 생성가능 why?자바가 먼저 실행되니까
	String show = request.getParameter("show");//request에 show가 null임. 
	if(show==null)
		show=""; // 아무거나 넣을수없으니 빈문자열을 넣어주기

%>
	window.onload=function(){
		let loginForm = document.getElementById("signIn");
		let joinForm = document.querySelector("#signUp");
		
		loginForm.style.display = "<%=show.equals("login") ? "block" : "none" %>";
		// equals()를 사용하기 전에 꼭 null체크하기 객체가 있어야 사용할수있으니까
		joinForm.style.display = "<%=show.equals("join") ? "block" : "none" %>";
		
		let loginOn = document.getElementById("loginOn");
		let joinOn = document.getElementById("joinOn");
		
		// 화살표함수는 상위태그가 적용될수있음(기볹적으로 위에서 시작하니까) > 정확하게 표현해줘야함
		loginOn.addEventListener("click", function() {
			loginForm.style.display = "block";
			joinForm.style.display = "none";
		});
		
		joinOn.addEventListener("click",function(){
			loginForm.style.display = "none";
			joinForm.style.display = "block";
		});
		
	};

</script>
</head>
<body>


	<%
		String userId = (String)session.getAttribute("user");
		if(userId != null){
			out.print("<b>너의 심장에 박힌 이름 : "+userId+"</b>");
		}
		
	
	
	
	%>
	

	<div id="nav">
		<input type="button" id="loginOn" value="로그인하기">
		<input type="button" id="joinOn" value="회원가입하기">
	</div>

	<div id="signIn">
		<h2>너의 마음속에 로그인</h2>
		<form method="post" action="signIn.jsp">
			아이디 : <input type="text" name="loginId"><br>
			비밀번호 : <input type="password" name="loginPw"><br>
			<button>로그인</button>
		</form>
	</div>
	<div id="signUp">
	<h2>너의 마음에 가입</h2> <!-- 사용자의 주소요청이있어야만 톰캣(서버)이 동작함.input을 통해 입력값을 signUp.jsp로 넘김 > 우리눈에는 그냥 바로 signUp.jsp로 넘어가는것만 보임(자바코드 다끝내고 남은 html만 보임) -->
	<form method="post" action="signUp.jsp"> <!-- method에는 get과 toast가 있는데 숨겨야 하는 정보는 post를 해야 주소에 내 정보가 노출되지 않는다(암호화)  --> 	
	<!-- 자바 > 자바스크립트 > html동작이라 자바가 끝나고 자바의 변수를 자바스크립트에 넘겨주려고 해도 절대 불가능 -->
	<!-- input태그가 가진 데이터값을 변수와같은 용도의 name에 넣어야 전달됨!! html태그는 자바에게는 외부데이터라 매개변수를 통해 넘어가야 하는데 이 역할을 하는게 name임 > 누가 값을 가지고 있는지를 알려줘야하지?-->
		<!-- placeholder은 자리표시자 - 이 자리에 들어갈 내용을 임의로 글씨를 넣어줌 -->
		<!-- 주소에있는 물음표 : 주소?파라미터(주소에 전달되는 데이터) -->
		<!-- 자바쪽임 ... request객체 : 사용자가 행하는 거의 모든 요청  respond객체 : 요청에 따른 응답 >> 톰캣이 다 만들어주니까 개발자들은 객체에 담긴것을 가져오기만 하면됨-->
		아이디 : <input type="text" name="id" placeholder="아이디를 입력하세요"><br>
		비밀번호 : <input type="password" name="pw"> <br>
		생년월일 : <input type="date" name="birth" value="2025-03-14" min="1950-01-01" max="2008-12-31"> <br>
		이메일 : <input type="email" name="email"><br>
		
		<button>가입</button>
	
	
	</form> 
	
	</div>
</body>
</html>