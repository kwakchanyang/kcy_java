package collection3;

import java.util.ArrayList;
import java.util.Collections;

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
		
		// 이메일로 아이디와 비밀번호를 조회하기!(배엳을 조회할때는 하나씩 꺼내서 조회해야함 > 
		// ArrayList가 가지는 메서드로는 아무것도 못함. why? ArrayList의 Member객체의 타입을 씌운거라 내가 만든Member클래스의 값이 여러개이라 데이터 하나하나에 접근못함(인덱스 찾지못함)
		// ArrayList<내장클래스 String등등>은 ArrayList의 기능을 그냥사용가능 but 내가만든클래스를 제네릭<>에 넣은경우는 다 만들어야함.(add,get정도는 사용가능)
		// contains와 indexOf는 안에 for문과 if문을 내장하고 있어서 밑에과정들을 안하고 사용했음. > 반복문돌려 찾으려는대상을 먼저찾아야 변경가능하니까 
		// 	// 최예너 > 최예나 (변경)
//		for() {				┐
//			if() {			│
//				변경			│ -> 이런식으로 다해줘야 하지만 ArrayList에서 사용가능한 indexOf를 사용하면 밑에처럼 간단히 사용가능
//			}				┘
//		}
//		names.set(names.indexOf("최예너"), "최예나"); // 변경할 인덱스, 변경 데이터
//		System.out.println(names);   
		
		
		
//		String email = "brown@gmail.com"; 
//		for( Member mem: memberList) {
//			if(mem.getEmail().equals(email)) {
//				System.out.println(mem.getMemberId());
//				System.out.println(mem.getPassword());
//				break;
//			}
//		}
//		
//		// contains와 indexOf의 공통점 : 대상이 있는지없는지 확인위해 하나씩하나씩 다 비교하면서 확인 
//		// Object의 메서드 중 ..모든클래스는 toString은 다 출력하는 역할 . equals 비교함 > contains와 indexOf를사용할수있는이유 : equals를 불러와서 실행
//		// 그래서 우리가 equals를 구현해야 contains와 indexOf를 사용할 수 있다. 
//		
//		System.out.println(// ┌ equals를 불러와서 false(타입까지비교: memberList는 리스트고 email은 String)를 뱉은것일뿐이지 contains의 결과는 아님
//				memberList.contains(email)
//				);
//		"11"과 contains(11) >> 문자열과 정수니까 타입이 달라서 false임
		
		
//		memberList.contains(대상);
//		contains는 타입에 대해서도 비교하기 때문에 동일한 타입으로 비교할수있게 email은 String클래스타입이라 안된다.
//		Member클래스 객체에 email을 담아서 비교되게 한다.
		
//		Member 대상 = new Member();	// 타입을 맞춰주려고 String email을 쓰지않고 똑같은 Member클래스를 만든것임
//		대상.setEmail("red@naver.com"); // brown@gmail.com
//		for(int i=0;i<memberList.size();i++) {
//			Member cmp = memberList.get(i); //Member클래스의 equals실행 : 대상이 Object obj의 매개변수로 들어가고 equals가 실행됨 equals를 실행시킨건 cmp > this는 cmp
//
//			if(cmp.equals(대상)) {
//				System.out.println("찾았다!");
//			}
//		}
//		
//		System.out.println(memberList.contains(대상));
		
		// 장은호 생년월일이 memberList에 등록된 사람들중
		// 생년월일이 같은 회원이 있나?
		Member 장은호 = new Member();
		장은호.setBirth("19901221");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kk1");
//		for(int i=0;i<memberList.size();i++) {
//			Member same = memberList.get(i);
//			
//			if(same.equals(장은호)) {
//				System.out.println("생년월일이 같은 사람이 있습니다.");
//			}
//		}
//		
		System.out.println(memberList.contains(장은호)); // false
		System.out.println(memberList.indexOf(장은호)); // -1(일치하는게 없어서)
		
//		Collections.sort(memberList);
		// 4 7 9 1 5 (버블정렬) > 인접한것끼리 비교 4,7비교(오름차순) 앞쪽보다뒤가더작냐?아니요 > 자리안바꿈 > 한칸씩이동하면서 바로뒤의 데이터와 비교
		// 7,9비교 > 자리안바뀜 > 9,1비교 > 자리바뀜 >4 7 1 9 5 >9,5비교 > 자리바뀜 > 4 7 1 5 9 > 맨뒤의 데이터는 정렬이끝난애임(큰데이터가 점점뒤로 밀려나는형식)
		// 처음부터 다시비교(전체데이터개수 -1만큼 반복함) 4,7비교 > 자리안바꿈 > 7,1비교 > 자리바뀜 > 4 1 7 5 9 .....



		// 오름차순할 때  4 7 일때 4-7=-3(음수)  9 1 일때 9-1=8(양수) 
		// 양수가 나오면 바꾸고 음수,0이면 자리바꾸지 않음.
		// compareTo의 결과값이 sort의 자리바꿈을 판단함.
		// 내림차순을 할때는 계산식을바꾸거나 부호바꾸기(기존식 * -1)
		// sort를 사용하려며 compareTo를 만들어야함
		// compareTo는 object에 없음
		System.out.println("apple".compareTo("bag")); // 사전적순서차이 : a-b=-1
		Collections.sort(memberList);
		for(Member m:memberList) {
			System.out.println(m.getId()+" "+m.getBirth()+" "+m.getAge());
		}
		
		
		
	}

}
