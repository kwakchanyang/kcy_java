package study0218;

public class JavaMain {

	public static void main(String[] args) {
		// 데이터 저장 - 변수
		// 같은 타입의 많은 양의 데이터 - 배열
		
		// 이름, 나이, 직업, 몸무게, 시력, 생년월일
		// 100명의 데이터를 저장하기 위해서는
		// 서로 다른 종류의 데이터이기에 100크기의 1차원 배열
		// 6개를 만들어야한다.	
		//String[] names = new String[100];
		// int[] ages = new int[100];
		
		
		// 변수로 만들면 시간오래걸림 > 배열을 만드는게 효율적임.(참조변수)
		// 1차원배열이 100개가 필요하다면?? >> 2차원배열만들기(참조변수)  그러나 위의 경우는 타입이 다르기때문에 2차원배열불가!!
	
		
		// 구조체 - 내가 타입을 만들어서 사용(다른 타입을 섞어서 사용가능, 개수제한 없음) >> 데이터를 저장하고 관리하는 방법중 하나임 
		//     >> 데이터를 가공하기 위한 메서드(Arrays.sort등등 > 자바안의 모든 배열에 sort가 귀속되어있음)를 그때그때 만들어써야함.
//		struct member{ // 구조체 - A 타입(int,string타입처럼 새로운타입A를 만들겠다.)
//			String name;
//			int age;
//		}
//		member info; // member타입의 변수 info
//		info.name="김유신";
//		info.age=24;
//		member[] mem = new member[100];
		
//		기본데이터 타입으로 선언한 변수는 데이터 저장이 직접 가능
//		int num=10;
//		배열 또는 클래스 타입으로 선언한 변수는 참조변수이다. 
//		참조변수에는 메모리주소저장한다. > > 그래서 배열참조변수는 index,클래스참조변수는 .을 붙인다.
//		그래서 자바에서는 new 연산자통해서 공간을 할당받아 그 공간의 주소를 저장 
		
//		Member info = new Member(); // class타입으로 선언한 변수라 참조변수이다. > 현재는 데이터공간을 저장할 능력이 없음 info□ <-(주소) name□age□eyes□
//		info.name="김유신";//배열같은 경우는 인덱스로 표기해서 공간을 활용하면 되지만 클래스는 .을 이용해서 변수이름에 접근해야 각각 공간을 사용할 수 있다.(인덱스가 없으니 변수이름필수)
//		info.age=30;
//		System.out.println(info.name); 
////																											                      ┌───인스턴스────┐
//		Member my = new Member(); // 인스턴스 생성(객체 생성) // my라는 참조변수 new로 공간할당받음. new를 사용할때마다 위치가 완전 다르기 때문에 my□ <-(주소) name□age□eyes□
//		
		// 동물종류, 동물이름, 나이
		// 동물종류에는 개, 고양이, 닭, 토끼, 코끼리 등등
		// 동물이름은 볼트, 렉스, 웅이, 꼬끼오, 총총이 등등
		// 나이는 하고싶은 나이 아무거나
		// 동물 한마리에 대해서 데이터 입력하고 출력
		
//		Animal dog = new Animal();
//		dog.kinds="개";
//		dog.name="볼트";
//		dog.age=4;
//		System.out.println(dog.kinds+" "+dog.name+" "+dog.age);
//		
		
		/* 영화제목, 장르, 관객수, 개봉년도

		위 항목의 데이터를 저장할수 있는 클래스 정의

		영화 한편에 대한 데이터 입력하고 출력까지

		*/
		
//		Movie movie = new Movie(); 
//		//Movie는 타입임 . 타입다음은 변수가옴. 기본데이터타입이면 바로 데이터다룰수 있고 클래스타입이라면
//		// 참조변수를 다룬다. >> 기본데이터타입만 new를 빼고 사용. 나머지는 다 new사용
//		movie.title="극한직업";
//		movie.genre="액션 코미디";
//		movie.viewers=10000;
//		movie.year=2020;
//		System.out.println(" 제목: "+movie.title+" 장르: "+movie.genre+" 관객수: "+movie.viewers+
//				" 개봉년도: "+movie.year);
//		
//		Member info = new Member();
//		System.out.println(info);
//		System.out.println(info.name);
//		
//		Member m1 = new Member();
//		System.out.println(m1.name); // "박문수"를 저장해주면 여기에서도 박문수가 출력됨.
		
		Member info = new Member(20,"군인");
//		Member(int age, String job, String name){
//			this.age=age;
//			this.job=job;
//		}  >> 얘가 실행됨. 
		
		System.out.println(info.job);
			
	}

}


// 클래스 - 사용자 정의 데이터 타입
// class 클래스 이름{	}	->처럼 작성
// 클래스 이름은 첫글자 대문자로

// 프로그래밍 명명 규칙( name rule )
// 1. 카멜 표기법
//		첫문자를 제외하고 단어의 첫글자를 대문자로 표현
//		myVisitorCount
//		함수, 인스턴스, 객체, 변수
// 2. 스네이크 표기법
// 		모든 단어 사이에 _를 붙여서 이름 짓기
//		my_visitor_count
//		데이터베이스의 테이블명, 컬럼명
// 3. 파스칼 표기법
//		카멜 표기법과 유사하지만 첫문자부터 대문자로 표기
//		MyVisitorCount
//		객체지향 언어(자바)의 클래스나 constructor명
// 4. 케밥 표기법
//		카멜표기법과 달리 소문자로 표현하며 단어와 단어사이에 - 붙이기
//		my-visitor-count
//		css의 class명, web url


// class가 존재해야 함수를 사용할 수 있음.
//클래스 - 데이터 저장, 기능구현
// 데이터 저장용
//class Member{ // 클래스 정의 - 클래스안의 내용으로 데이터 저장될수 있게 만들겠다고 정의만 한것
//
//	String name; // 이름 저장
//	int age; // 나이
//	float eyes; // 시력저장
//}
//
//class Animal{ // 동물 정보 저장 클래스
//	String name; // 동물 이름
//	String kinds; // 동물 종류
//	int age; // 동물 나이
//	
//}
//
//

