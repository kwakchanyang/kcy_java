package interface5;

public class MainMt {

	public static void main(String[] args) {		
//		DBConnect c = new DBConnect();연결잘되는지 확인해보고 지우기
		
		CRUD member = new MemberService();
		CRUD board = new BoardService();
		
		member.save();
		
//		DBConnect mem = new MemberService();
//		mem.save();	부모클래스인 DBConnect에는 save메서드가 없다 .부모로서 자식객체는 가질수있지만 기능은 없다
		
		

	}

}
