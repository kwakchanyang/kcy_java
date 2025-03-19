<%@page import="DTO.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 </title>  <!-- 진짜 웹주소를 넣어주면 폴더경로가 어디서든 접근가능 -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/smile.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">

<style>

	#main{
		padding:30px 100px;
		position:realative;
	}
	#boardTop{
		position:realative;
		width:100%;
		font-size:20px;
		text-align:center;
	}
	#boardTop .write-bt{
		position:relative;
		top:0;	right:-300px;
	}
	#boardList{
		width:100%;
		margin:20px 0;
	}
	#boardList .list-table{
		width:100%;
		border-collapse: collapse;
	}
	#boardList .list-table td{
		border-bottom:1px solid #ccc;
		padding:15px 0;
		font-size:17px;
	}
	#boardList .list-table .num{width:10%;}
	#boardList .list-table .title{width:40%;}
	#boardList .list-table .writer{ width:25%;}
	#boardList .list-table .date{ width:25%;}
	#boardList .list-table tbody tr:nth-child(odd){ /*odd=홀수*/
		background:#eee;
	}

</style>

</head>
<body> 
	
	<div id="wrap">
		<%@ include file="../header.jsp" %>
		<!-- 추가할것 여기에 추가하면 됨 -->
<%                          
	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("boardList");

%>
		<div id="main">
 			<div id="boardTop">
				<b> 러브가 무엇이오</b>
				<a href="/jsp2/board/write" class="write-bt">글쓰기</a>
			</div>
			<div id="boardList">
				<div>
					검색 : <input type="text" id="keyword">
				</div>
				<table class="list-table">
					<thead>
						<tr>
							<th class="num">번호</th>
							<th class="title">제목</th>
							<th class="writer">작성자</th>
							<th class="date">작성일</th>
						</tr>
					</thead>
					<tbody id="dataList">
		<%
			for(Board board : list){
						
		%>						
						
						<tr>
							<td class="num"><%=board.getBoardId() %></td>
							<td class="title"><%=board.getTitle() %></td>
							<td class="writer"><%=board.getWriter() %></td>
							<td class="date"><%=board.getWriteDate() %></td>
						</tr>
						
		<% } %>			
					</tbody>
				</table>
			</div>
		</div>
		
		
		
		<%@ include file="../footer.jsp" %>
	</div>
</body>
</html>
<script>
	$("#keyword").on("keyup",function(){ // #keyword라는 ID를 가진 입력필드에서 keyup이벤트가 발생할때마다 이 함수가 실행됨(사용자가 키를 눌렀다 뗼때마다 발생)
		var key = $(this).val(); // 현재 입력필드의 값을 가져와 key 변수에 저장합니다
		$("#dataList tr").filter(function(){ //#dataList라는 ID를 가진 테이블의 모든 tr 요소를 선택. filter 메서드를 사용하여 각 tr 요소의 텍스트가 입력된 key를 포함하는지 확인.
			$(this).toggle( $(this).text().indexOf(key) > -1) // indexOf(key)가 -1보다 크면, 즉 key가 해당 tr의 텍스트에 포함되어 있으면 true를 반환하고, toggle 메서드를 사용하여 해당 tr 요소의 표시 여부를 설정. 포함되지 않으면 false를 반환하여 해당 행을 숨김.
		});
	});
</script>