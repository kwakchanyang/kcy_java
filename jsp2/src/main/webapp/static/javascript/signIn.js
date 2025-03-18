/**
 *  signIn.js
 */

 // 로그인하기 위해 아이디 비밀번호 입력해야 로그인 버튼이 클릭된다.
 
 window.onload=function(){ // 현재 페이지 로드완료되면(html내용이 브라우저에 모두 표시)
	 let bt=document.getElementsByClassName("signIn-bt")[0];
	 bt.disabled=true; // 로그인 버튼 비활성화
	 
	 let inputId = document.getElementById("userId");
	 let inputPw = document.getElementById("userPw");
	 
	 inputId.addEventListener("keyup", function(){
		if(inputId.value != '' && inputPw.value != ''){
			bt.disabled=false; // 로그인 버튼 활성화
		}else
		 	bt.disabled=true; // 로그인 버튼 비활성화
		 
	 });
	 
	 inputPw.addEventListener("keyup", function(){
		 if(inputId.value != '' && inputPw.value != ''){
			 bt.disabled=false;
		 }else
		 	bt.disabled=true;
	 });
	 
	 document
	 .getElementsByClassName("join")[0]
	 .addEventListener("click",function(){
		 location.href="signUp.jsp";
	 });
	 	
	 
 };