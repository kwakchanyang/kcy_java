<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!-- board.jsp 에서 제목,작성자,내용,작성일을 작성할 수 있게 태그 만들어주고

save.jsp를 통해 테이블(kkk_board)에 저장하기 -->

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>게시판</title>

</head>

<body>

	<h2>게 시 글</h2>

	<form method="post" action="save.jsp">

		제목 : <input type="text" name="title"><br>

		작성자 : <input type="text" name="writer"><br>

		내용 : <input type="text" name="content"><br>

		작성일 : <input type="date" name="createDate" value="2025-03-17"><br>

		<button type="submit">저장</button>

	

	

	

	</form>

</body>

</html>