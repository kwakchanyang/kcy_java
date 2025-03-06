package collection3;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
//		ArrayList<Member> list = new ArrayList<>();
//		
////		Member[] a = new Member[3]; // 객체공간생성
////		a[0] = new Member(); // 진짜 객체만드는건 new 메서드() > 호출해야함
//		
//		list.add(new Member(1l,"kcy","kcy@naver.com","1234","19990302")); // Member클래스 객체를 넣어줘야함.
////		list.get(0).setEmail("asdfa"); // list.get(0)자체가 이름임 > 이런식으로 다 넣어줘야함
////		list.get(0).setBirth("1231");
////		list.get(0).setMemberId("asfsd");
//		list.add(new Member(2l,"bmk","bmk@naver.com","1234","19981112")); // 이렇게 생성자메서드를 만들면서 값넣어준다
//		
//		System.out.println(list);
		
		MemberDao dao = new MemberDao(); // MemberDao객체생성
		
		ArrayList<Member> memberList = dao.select();
		
		for(Member m: memberList) {
			System.out.println(m);
		}
		
	}

}
