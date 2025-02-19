package study0218;

public class Member { //이 {을 기준으로가 내부라고 표현. 그외는 외부
	// class는 이렇게 정의해줄거야만 할 수 있지 만드는것은 외부에서 만들어야함.
	//	외부에서 만든 클래스공간의 주소를 연결시켜주는 것이 this임. 외부에서는 info에 넣어놨으니 info.을 쓰면 되는데
	// 여기서는 info를 쓸 수 없으니 this를 사용함.
	String name; // 이름, 인스턴스 변수
	int age; // 나이
	String job; // 직업
	
	// 생성자 메서드(함수) >> 기본 생성자 메서드(매개변수x)
	Member(){
		this.name="박문수";
		System.out.println(this);
	}
	
	// 생성자 메서드(클래스이름과 동일하게)
	// 생성자 메서드는 자바에서 클래스 정의 할 때 
	// 기본 생성자 메서드도 같이 만들어진다.
	// 눈에 보이지 않게 생략 처리 된것이지 없는것은 아니다.
	// 생성자메서드는 클래스 객체 공간생성시
	// 인스턴스들의 초기화를 담당하는 메서드이다.
	// info□ -> name□job□age□ > Member의 공간
	// 초기화 시켜준다 name null job null age 0 >> 문자열은 null 정수데이터타입은 0이됨.
	
	//Member을 10개 만든다 > name:박문수,age,job
	//m1 > name:박문수,age,job	
	//....
	//클래스 내부에서 this는 객체자신을 의미 this가 가리키는 것은info에서는 info(주소),m1에서는 m1(주소)
	//함수를 이용하는 법 function Member(name,age){document.write(name);document.write(age);}
	//그 기능을 할수 있는 매개변수통해서 값을 넘겨주고 사용한다. 
	//직접 가지고 있는 값을 사용할 때는 this.output=function(){document.write(this.name)}
	
	Member(int age, String job){
		
	}
//	         ┌얘는 매개변수임
	Member(int age, String job, String name){
		this.age=age;
		this.job=job;
	}
	// 오버로딩 조건
	// 1. 메서드 이름이 같아야 한다.
	// 2. 매개변수가 같으면 안된다.
	// 3. 매개변수 갯수가 달라도 성립
	// 4. 하나의 클래스 내부에서만 가능하다.
	
	// 자바변수 종류
	// 인스턴스변수
	// 지역변수(매개변수)
	// 클래스변수
	
	// 변수 우선순위
	// 지역변수 > 
	

}
