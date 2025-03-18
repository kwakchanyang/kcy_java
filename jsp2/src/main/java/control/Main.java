package control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.MemberService;

import java.io.IOException;

/**
 * Servlet implementation class Main
 * 서블렛은 요청을 받고 페이지만 제공하는일까지만 하는것! > 진짜동작은 service클래스가함
 */
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("<h1> i love pizza </h1>");
//		response.sendRedirect("/jsp2/member/signIn.jsp"); >> signin해서 들어가지지만 주소가 이걸로 바껴버림
//																┌화면에 보여질 view 페이지의 경로			
		RequestDispatcher rd = request.getRequestDispatcher("member/signIn.jsp"); // 주소는 그대로, 내용만 바뀜
		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 처리와 메인페이지 제공
		MemberService ms = new MemberService();
		ms.login(request);
		
		
		response.sendRedirect("/jsp2"); 
		// 메인페이지 - webapp밑에 있는 index.jsp
	}

}
