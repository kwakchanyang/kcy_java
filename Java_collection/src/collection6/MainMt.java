package collection6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMt {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("이성계"); set.add("강감찬");
		set.add("문익점"); set.add("박문수");
		set.add("정약용");
		
		System.out.println(set);

		set.add("김유신");
		System.out.println(set); // 김유신을 또 넣어도 한번만 넣어짐 = 중복불가
		
		//HashSet은 직접 값 한개씩 출력불가
		//HashSet에 저장되어 있는 값 하나씩 출력하는 방법1
		// get은 HashSet에 없는메소드라 ArrayList통해 배열로 바꿔주고 하나씩 get할수 있음
		ArrayList<String> array = new ArrayList<>(set); 
		
		System.out.println(array.get(2));
		
		// 두 번째 방법
		Iterator<String> it = set.iterator(); // Iterator라는 인터페이스 통해 Iterator은 반복자라는 뜻으로 배열이나 그와 유사한 자료구조의 내부요소를 순회하는 객체
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 거래내역 - 3달치 거래내역 가져온다.
		// 만원이하, 5만원이하, 10만원이하
		// 거래내역을 데이터베이스에서 가져와서 ArrayList나 vector에 저장
		// 반복문 돌리면서 if문 사용해서 만원이하인경우
		// HashSet A에 저장, 5만원이하는 HashSet B에 저장.
		// HashSet C에는 10만원 이하 저장
		
		set.remove("김유신");
		System.out.println(set);
		System.out.println(set.contains("강감찬"));
		
		// 집합 직접 구현 하기
		HashSet<String> 찬양과일 = new HashSet<>();
		찬양과일.add("바나나"); 찬양과일.add("수박");
		찬양과일.add("딸기"); 찬양과일.add("참외");
		찬양과일.add("키위"); 찬양과일.add("메론");
		
		HashSet<String> 예나과일 = new HashSet<>();
		예나과일.add("체리"); 예나과일.add("자두");
		예나과일.add("메론"); 예나과일.add("무화과");
		예나과일.add("망고"); 예나과일.add("바나나");
		예나과일.add("수박"); 예나과일.add("오렌지");
		
		// 교집합
		HashSet<String> 교집합 = new HashSet<>(); // 찬양과일의 바나나를 꺼내와서 예나과일의 전체와 비교 
		Iterator<String> 과일 = 찬양과일.iterator(); 
		while(과일.hasNext()) { // next()는 호출할 때마다 다음 요소로 이동하므로, 한 번만 호출해야 한다.
			String fruit = 과일.next(); // 그래서 next를 변수에 저장하면 값이 유지된다. 그래야 가져온값을 여러번 사용할수있다. 
			if(예나과일.contains(fruit)) // true이면 둘다 가지고 있다. next는 한번씩 넘어가고 next를 두번쓴다면 next바나나 > next수박이 나옴. 한번사용할때마다 다음으로 넘어감(건너뜀)
			{
				교집합.add(fruit);
			}
		}
		System.out.println(교집합);
		
		// 차집합
		// 찬양과일의 차집합 구하기(공통을 뺀 나머지)
		// 위에서 교집합을 구하지 않았다는 가정하에 만들것임
		HashSet<String> 차집합 = new HashSet<>();
		과일 = 찬양과일.iterator(); // 위에서 이미 과일 변수를 만들어 놨으니 Iterator을 다시 부여해 줘야함. > Iterator는 일회용이다.
		while(과일.hasNext()) {
			String fruit = 과일.next();	
			if(!예나과일.contains(fruit)) { // false(포함되지 않음)를 not해주기 > 포함되지 않는것을 찾는것
				차집합.add(fruit); // 공통된 과일을 뺀 나머지
			}
		}
		System.out.println(차집합);
		
		// 합집합 (중복없이 넣어짐)
		// 찬양과일과 예나과일의 모든 과일
		HashSet<String> 합집합 = new HashSet<>();
		과일 = 찬양과일.iterator();
		while(과일.hasNext())
			합집합.add(과일.next());
		
		과일 = 예나과일.iterator();
		while(과일.hasNext())
			합집합.add(과일.next());
		
		System.out.println(합집합);
		
		// Set의 메서드를 이용하여 교집합, 차집합, 합집합
		
		HashSet<String> 교집합2 = new HashSet<>(찬양과일); // 교집합2가 찬양과일을 다 가지게됨
		
		교집합2.retainAll(예나과일); // retainAll - 교집합
		System.out.println(교집합2);
		
		HashSet<String>  차집합2 = new HashSet<>(찬양과일); // ()안에는 차집합을 구할 HashSet을 넣어줘야함. 계속 만들어주는 이유> 원본이 훼손되지 않도록 하기 위함
		차집합2.removeAll(예나과일); // removeAll - 차집합
		System.out.println(차집합2);
		
		HashSet<String> 합집합2 = new HashSet<>(찬양과일); // 지금상태에서는 합집합2에 찬양과일만 담겨있음
		합집합2.addAll(예나과일); // addAll - 합집합  - 알아서 중복이 제거 되기 때문에 그냥 다 합쳐도됨.
		System.out.println(합집합2);
	}

}


/*
	Set - 순차저장 안됨, 중복불가
	
	HashSet - 그룹화 목적(집합 - 교집합, 합집합, 차집합)
	TreeSet - 오름차순 정렬, 검색에 특화


*/