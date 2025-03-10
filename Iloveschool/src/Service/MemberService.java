package Service;

import java.util.Scanner;

import DAO.MemberDAO;

public class MemberService implements ActiveService{

	private MemberDAO dao; // MemberDAO는 회원관련 데이터베이스작업을 위한 클래스
	
	public MemberService() { this.dao= new MemberDAO();} // DAO객체 생성
	public boolean signIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n---- 로그인 ----");
		System.out.print("ID : ");
		String mId = scan.nextLine();
		System.out.println("PW : ");
		String mPw = scan.nextLine();
		// 로그인을 위해서 입력한 아이디와 비밀번호를 테이블에 조회 한다.
		
		return dao.userIdAndPassword(mId,mPw);
		
		
		
	}
	public void signUp() {
		System.out.println("회원 가입 완료");
		
	}
	
	

}
