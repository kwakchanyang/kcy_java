package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
		
		// a라는 배열에 추가로 넣고싶을때? a[5]=10; 인덱스에러남. 불가
		// 배열에 정수를 추가로 저장될 수 있게 하기!!
		
//		MyArray a = new MyArray();
//		a.add(100);// arr□ <-주소  100□  >> 공간이 한개만 확보된상태라 20이 들어갈 공간이 없음
////		어떻게 해야할까? 공간이+1인 배열을 새로만들어서 여기에 옮겨주기(주소넣어주기) > 반복
////		arr□ 100□ >> 100□20□ >> 100□20□50□ >> 계속옮기는걸 MyArray에 코드 짜주기
//		a.add(20); // 2번째 공간이 필요함
//		a.add(50);
//		a.add(1241);
//		a.add(342);
////		
//		
//		
//		System.out.println(a.get(11));

//		┌제네릭사용하도록된 클래스이지만 <>타입지정안해서 Object타입임 >> 꼭 타입적어야함
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(2311);
		list.add("집가자");
		list.add("포카칩");
		list.add(2.333);
		
		System.out.println(list.size()); // 크기 - 데이터몇개 저장되어있는가
		
		System.out.println(list.get(2)); // 인덱스위치의 데이터출력
		
		System.out.println(list.indexOf("포카칩")); // 배열에 특정데이터 어디?
		
		list.remove(0); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카칩"); // 삭제할 데이터 입력하여 삭제
		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o : list) {
			System.out.println(o);
		}
//		list.add는 배열의 마지막에 추가
		list.add(1,"내가 원하는곳"); // 내가원하는 인덱스위치에 추가됨
//		add는 오버로딩된것임 > 마지막에 추가되는경우는 매개변수1개, 원하는위치에 추가되는 add는 매개변수2개
//		remove도 오버로딩 : 정수넣어 삭제, 문자열넣어삭제
		System.out.println(list);
		System.out.println(list.contains("장미란"));
		
//		int[] a = new int[3];의 방식으로 위에 처럼하려면 다 코드짜줘야함 > 메소드가 없어서 > array쓰자!
		
		list.clear(); // 배열모두 삭제
		System.out.println(list);
	}

}



/*
	자바 컬렉션 프레임워크
	자료구조와 알고리즘을 클래스화 시켜놓은것
	자료구조 - 데이터를 저장관리하는 방법
	알고리즘 - 저장된 데이터를 가공하는 방법
	
	Collection		     Map
	  List					HashMap
		ArrayList			TreeMap
		LinkedList			Properties
		Vector
		Stack
		Quene
		
	   Set
	   	HashSet
	   	TreeSet
	





 */




