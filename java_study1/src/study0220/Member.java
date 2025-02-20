package study0220;

public class Member {
	String userId; //아이디
	String password; // 비밀번호
	long id; // 회원번호
	
	Member(){}
	Member(String userId, String password,long id){
		this.userId=userId;
		this.password=password;
		this.id=id;
	}
	
	public String toString() { // 무조건 이 형태로 만들어야함!!
		return "아이디 : "+this.userId+"비밀번호 : "+this.password+
				"회원번호 : "+this.id; // 문자열
	}
	
	void output() { // 객체가 가지고 있는 값 출력 user1□ -> userId□password□id□output□
					// output도 내가 가지고 있는데이터라 매개변수 필요없음
		System.out.println("아이디 : "+this.userId+"비밀번호 : "+this.password+
				"회원번호 : "+this.id);
	}
}
