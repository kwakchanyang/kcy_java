package service;

import java.util.ArrayList;

import DAO.BoardDao;
import DTO.Board;
import jakarta.servlet.http.HttpServletRequest;

public class BoardService {
	
	private BoardDao dao = new BoardDao();
	
	public void save(HttpServletRequest request) {
		// request객체에서 파라미터값 가져와 Board클래스 객체에 저장
		// Board클래스 객체를 DAO에 넘겨주기
		 String writer = request.getParameter("writer");
		 String title = request.getParameter("title");
		 String content = request.getParameter("content");

		
//		 							┌Board에서 @NoArgsConstructor해줘서 이걸 적어워줘야함
		Board board = new Board(0,writer,title,content);
		dao.insert(board);
//		객체가 계속 생성되는 이유 : 저장버튼 클릭시 데이터가 서버로 전송 > http요청 발생 > 메서드실행 > 이메서드내에서 사용자의 입력값을 받아와서 새로운 Board객체 생성
	}

	public void allSelect(HttpServletRequest request) {
		// 데이터베이스 테이블에서 조회하여 가져오기
		ArrayList<Board> list = dao.select();
		// 조회결과를 ArrayList에 저장하고 request의 Attribute로 저장하기 request에 ArrayList를 저장한것
		request.setAttribute("boardList", list); // 주소를 받아온거라 request를 return하지 않는것임
	}
}