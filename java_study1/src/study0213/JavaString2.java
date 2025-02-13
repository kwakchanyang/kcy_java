package study0213;

public class JavaString2 {

	public static void main(String[] args) {
		
		// 문자열 메서드 (그나마 많이 쓰이는거?)
		
		String word = "i like tomato";
// 		문자열에서 특정 '문자' 추출
		System.out.println(word.charAt(7)); // 띄어쓰기도 문자에 들어감. >> t가 나옴.
		// '문자열' 추출
		System.out.println(word.substring(2,6)); // ()안의 인덱스부터 출력 (2) like tomato (2,6) 2번인덱스부터 6번인덱스 전까지(5번)
		String temp = word.substring(2,6);
		System.out.println(temp);
		
		//문자열의 길이(전체 문자가 몇개인가?)
		
		System.out.println(word.length()); // 띄어쓰기도 개수에 포함
		
		String text = "나랏말싸미 듕귁에 달아 문자와로 서르 사맛다 아니할세";
		
		//문자열에서 특정문자 또는 문자열 인덱스 구하기(indexOf와 substring함께사용)
		int idx = text.indexOf('문');
		System.out.println(idx);
		
		idx = text.indexOf("문자와로");
		System.out.println(idx);
		
		// 문자와로 부터 출력할래
		idx = text.indexOf("문자와로");
		System.out.println(text.substring(idx));
		
		idx = text.indexOf("백셩이");
		System.out.println(idx); // 없는글자는 인덱스가 -1이다. 0이상의 값이면 존재하는 글자이다.
		// indexOf() 메서드는 문자열에서 특정 문자나 문자열의 인덱스를 알려준다.
		// 알려주는데 만약 문자열에 없는 값이라면 -1를 준다.
		
		// indexOf() 메서드를 통해 문자열에 특정문자나 문자열이 포함되어 있는지 알 수 있다.
		// 포함 여부 알수 있는 메서드 !! 하나더!!
		
		System.out.println(text.contains("듕귁에"));
		
	// 문자열 비교 - equals()  		문자열A.equals(문자열B)
	// 결과는 true,false
		
		//문자열 분할
		text = "이순신-이성계-홍길동-곽재우-김철수-정하나";
		System.out.print(text.split("")[3]); // 문자열을 배열로 바꿔줌. a-b-c-d > a부터 -만날때까지를 배열에 저장함. > |a|b|c|
//		split은 배열로 바꿔주는 애기때문에 split("")아무것도 안넣어주면 서[0]경[1]림[2]이런식으로 모든글자가 배열에 하나씩 들어감.
		
		String[] names = text.split("-");
		System.out.println(names[4]);
		
		// 배열 -> 문자열로 변환
		text = String.join(",",names); // names[0]+","+names[1]
		System.out.println(text);
		
		// 대문자, 소문자
		System.out.println(word);
		System.out.println(word.toUpperCase()); // 대문자
		System.out.println(word.toLowerCase()); // 소문자
		
		// 문자열 합치기 "abc" + "zxc" -> abczxc
		System.out.println("abc"+word);
		System.out.println("abc".concat(word));
		
		// String 클래스 타입의 변수가 비었나? (문자열이 저장되어있나?)
		
		System.out.println(word.isEmpty()); // 비었을때 true
		System.out.println(word.isBlank());
		
		word="";
		System.out.println(word.isEmpty());
		System.out.println(word.isBlank());
		
		word=" "; 
		System.out.println(word.isEmpty()); // 띄어쓰기도 하나의 문자로 생각한다.
		System.out.println(word.isBlank());
		// empty는 문자열의 인덱스가 존재하지 않아야 true
		// blank는 띄어쓰기와 같이 빈공간인 경우에 비어있다고 표시 true
		System.out.println(word.length()); // 띄어쓰기가 넣어져서 길이가 1이 나옴
		
//		word=null; // null이 저장되어있는 경우에는 문자열 관련 메서드 사용불가
//		System.out.println(word.isEmpty());
//		System.out.println(word.isBlank());
//	
		
		// 문자열  바꾸기 치환
		
		word = "나는 너구리를 좋아한다";
		// replace("기존문자","바꿀문자")
		System.out.println(word.replace("너구리", "강아지"));
		System.out.println(word);
		
		text = word.replace("너구리", "강아지");
		System.out.println(text);
		
		word = "010.1234.5678.9128";
		System.out.println(word.replaceAll("[8$]","a"));
		
		/*
		 * 정규 표현식
		 * 	
		 * 	. 임의의 문자 1개를 의미
		 *  ^ 시작을 의미 (^a : a로 시작하는 단어)
		 *  $ $앞의 문자열로 문자가 끝나는지를 의미( a$ : a로 끝나는 단어)
		 * [] []괄호 안의 문자가 있는지 확인해라 뜻 ([a] : a문자가 있는지 확인)
		 *[^] []괄호안에 ^뒤의 문자가 있으면 제외해라
		 *	  [a-z] : a부터z까지 문자확인
		 *    [^a-z] : a부터z까지를 제외한 문자 
		 *  - 사이의 문자또는 숫자를 의미 ([a-z]:a부터z까지 문자확인)
		 *  	[a-z0-9] : 알파벳소문자전체, 0~9중 한 문자 
		 *  |  또는 [a|h]
		 *  () 그룹  01(0|1) : 01뒤에 0 또는 1 > 010 011
		 *  {} 개수  a{3}b : a가 3번 나오고 뒤에 b가 있다.
		 *  	^/d{3}-\d{4}-\d{4}$ : 전화번호 정규표현식	 \d는0~9 {3}은 0-9중에 3개
		 *  \d 0~9숫자 == [0-9]
		 *  \b 공백,탭,/를 의미
		 *  \B \b의 부정(공백, 탭 등이 아닌 문자
		 *  \D 0~9가 아닌거
		 *  \w 알파벳 대소문자+숫자+"_" [a-zA-Z_0-9]
		 * 
		 */
		
		word = "tomato98731*";
		// 알파벳 제외한 나머지를 0으로 변경(replace)
		System.out.println(word.replaceAll("[^a-z]","0"));
		// 알파벳 소문자를 제외한 나머지를 0으로 변경
		
		// 비밀번호 6자리이상 12자리 이하 영어,소문자,숫자포함
		// ^[a-z0-9]{6,12}$
		
		//주민등록번호 확인
		//  \d{6}\-[1-4]\d{6}
		
		String[]dept = new String[5];
		
		
		
	}

}
