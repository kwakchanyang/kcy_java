package collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainMt {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(); // 이 배열에는 문자열만 담을 수 있다.String클래스의 배열
		names.add("김춘추"); names.add("박은희");
		names.add("최예너"); names.add("정소영"	);
		names.add("김현직"); names.add("서경석");
		
		System.out.println(names);
		
		// 이순신 이름이 등록되지않으면 등록하고 이름이 있으면 등록안하고 하려면?
//		기존의 배열arr를 했을때는 for문을 만들어줘야했지만 ArrayList를 할때는 메소드를찾기
		
		boolean hasName = names.contains("이순신");
//		System.out.println(hasName); // false
		if(!hasName) // false를 true바꿔야 if가 실행되니까(if문은 조건이 true일때만 실행)
			names.add("이순신");
		
		System.out.println(names);
		
		//list -> Array(배열)
		String[] arr = names.toArray(new String[names.size()]);
		
		//Array(배열) -> list
		ArrayList<String> n = new ArrayList<>(Arrays.asList(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // arr을 출력하려면 Arrays.toString해야함.
		
		// ArrayList를 정렬하는 방법 - 오름차순
		System.out.println("==== 정렬전 (names) ====");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println("==== 정렬후 (names) ====");
		System.out.println(names);
		
		// 내림차순
		Collections.sort(names,Collections.reverseOrder());
		System.out.println(names);
		
		// 최예너 > 최예나 (변경)
		names.set(names.indexOf("최예너"), "최예나"); // 변경할 인덱스, 변경 데이터
		System.out.println(names);
		
		// 김씨 성을 가진 사람만 출력
		// 배열의 데이터를 세부적으로 접근하는 메소드는 없음 . generic타입의 string이라서 문자가 들어간거지 int라면?
		// 메소드가 없으니 내가 코드작성해야함 > for문
		for(String name : names) { //name은 이름하나하나씩 가지게됨.
			if(name.charAt(0) == '김')
				System.out.println(name);
		}
		
		names.add("박수영"); names.add("김나영");
		// 이름에 '영'을 '진'으로 변경
		for(int i=0;i<names.size();i++) {
			if(names.get(i).contains("영")) {
				names.set(i, names.get(i).replace("영", "진"));
//								 └문자열이라 바로 .replace가능				
			}
		}
		System.out.println(names);		
//		--> get,set을 사용해 ArrayList같은 리스트구조에서 요소에 접근하고 수정가능
//		ArrayList를 통해 String클래스의 객체에 접근한것 > 컬렉션이라 객체를 저장하는 동적배열로 추가,제거기능 포함됨(getter,setter..)
//		get(int index) : 주어진 인덱스에 위차한 요소를 반환 = 특정위치에 있는값 가져오기
//		set(int index, E element) : 주어진 인덱스에 위치한 요소를 새로운 요소로 교체(수정) > 중복알아서안되게 저장함
		
//		밑에방식은 names복사본만 변경되는거지 원래리스트는 변경이 되지않음
//		for(String name : names) {
//			if(name.contains("영"))
//				name=name.replace('영', '진');
//			System.out.println(name);
//		}
		
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(100);	number.add(544);
		number.add(213);	number.add(11);
		number.add(32);
		
		for(Integer num : number) {
			System.out.println(num);
		}
		
//		String[] arr = names.toArray(new String[names.size()]);
		// 1~50랜덤 범위에서 25개숫자를 저장, 중복없음
//		ArrayList<Integer> bingo = new ArrayList<>(25); // 크기지정하지않기! 넣을때마다 증가하려고 사용한는거니까
//		int[] ranNum=new int[25];
//		for(int i=0;i<bingo.size();i++) {
//			Integer[] itg = number.toArray(new Integer[number.size()]);
//			ranNum[i] = (int)(Math.random()*50+1);
//			if(ranNum[i]!=itg[i]) {
//				ranNum[i]=itg[i];
//			}
//			ranNum=itg;
//			
//		}
		
		
		// 1~50랜덤 범위에서 25개숫자를 저장, 중복없음
		ArrayList<Integer> bingo = new ArrayList<>();
		
		do {	
			int temp = (int)(Math.random()*50+1);
			if(!bingo.contains(temp)) // contains는 참,거짓이 나오는거니까 if문 생각하기 / 없는값(false)일때가 조건
				bingo.add(temp);			
		}while(bingo.size()!=25); // while쓰는 이유? ArrayList는 동적배열이라 
		
		System.out.println(bingo);

	}
	

}


// 데이터 저장용 클래스가 가져야 할 메서드는?
