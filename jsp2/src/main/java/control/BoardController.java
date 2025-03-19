package control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BoardService;

import java.io.IOException;

/**
 * Servlet implementation class BoardController
 */
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BoardService bs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		bs = new BoardService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		active(request,response); // active가 없다면 클라이언트가 브라우저 주소창에 URL을 입력하거나, 클릭 등으로 GET요청을 보냈을때, 아무런 응답처리하지 않아서 빈화면 뜸
								  // 서블릿이 클라이언트 요청을 받아도 JSP로 포워딩하거나,응답출력하는 코드가 없음 > 브라우저는 응답이 없는 상태로 멈춰서 아무것도 표시하지 않음
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		active(request,response); /* get,post상광없이 active실행 */
	}
	
	private void active(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = request.getRequestURI();
		String cmd = url.substring(url.lastIndexOf("/")+1); //getRequestURL >> http://localhost:8080/jsp2/board/list  http://localhost:8080/jsp2/board/static/images/smile.jpg
								 // getRequestURI >> /jsp2/board/list  /jsp2/board/static/images/smile.jpg
								  // lastIndexOf 는 뒤에서부터 값을 찾음
		System.out.println(cmd);
		
		String view="/WEB-INF/views/board/";
		
		if(cmd.equals("list")) { // 게시판 목록 페이지 요청 - /jsp2/board/list
			view += "list.jsp";
			bs.allSelect(request); // request넘기는 이유 > request를 담아서 가져오기 위해서 ...view가 null이 아니라 forward동작한
		}else if( cmd.equals("write")) { // 게시판 작성페이지 요청 - /jsp2/board/write
			view += "write.jsp";
		}else if( cmd.equals("save")) { // 게시판저장 요청 - /jsp2/board/save
			view = null;
//			BoardService bs = new BoardService();
			bs.save(request);
		}
		
		
		if( view != null) {
		//getRequestDispatcher() 메서드안에 보여줄 페이지를 모든경로 작성 // getRequestDispatcher은 서블릿에서 JSP로 요청을 전달하는 역할
		//forward()는 기존요청과 응답객체를 유지한 채 다른 JSP페이지로 제어권을 넘김 > list.jsp를 화면에 표시하도록 처리
		RequestDispatcher rdp = request.getRequestDispatcher(view);
		rdp.forward(request,response);
		} else {
			response.sendRedirect("/jsp2/board/list");
		}
	}
}
