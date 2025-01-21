package study0116;

public class test { //class의 첫글자는 대문자로! 이름잘못만들었다고 맘대로 바꾸지 말기!!

	public static void main(String[] args) {
		// 주석- 설명이나 메모,코드 대기, 등등
		/*
		 *  여러줄 주석 - 주석은 포로그램으로 실행 되지 않는 부분이다.
		 *  주석안에 코드 작성해도 실행안된다. 각 코드의 설명을 작성하는 용도로 사용한다.
		 *  저장 단축키 - ctrl + s
		 *  주석 단축키 - ctrl + /
		 *  실행 단축키 - ctrl + f11
		 *  변수 - 데이터 저장 메모리 공간
		 */
		System.out.println("자바 이클립스 테스트");
		
		// 데이터를 사용하려면 변수를 선언해야 한다.(이미 만들어진 공간을 사용하는 것이라 선언한다고 함)
		/* 변수를 선언할 때는 반드시 데이터 타입을 정해야 한다.
		 * 변수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 짓기
		 * 정수 : byte, short, int, long
		 * 실수 : float(숫자뒤f), double
		 * 문자 : char
		 * 논리 : boolean
		 */
		int age;
		age = 100; // age 변수에 100저장(대입연산)
		age = '가'; // 자바에서 ''표현은 문자를 의미
		age = 27;  //덮어쓰기로 들어감, 누적안되고 이전데이터는 사라짐
                   // ""표현은 문자열을 의미		
		System.out.println(27); // 변수선언안하면 27은 어딘가에 저장되어 있고 컴퓨터만 알아서 출력은 해주지만 사용자는 어디있는지 알지 못해서 한번밖에 사용하지 못함.
		System.out.println(27); //이전의 27을 불러오는 것이 아니라 어딘가에 또 저장한것을 출력하는 것임.(메모리공간차지 > cpu가 할일이 많아져 느려짐)
		//서로 다른 목적의 같은 데이터값을 사용하려면 변수를 2개만들기 > 데이터가 만들어졌다면 변수도 그만큼 꼭 만들어서 담아서 사용하기!!!
		byte num1 = 120;
		System.out.println(num1);
//		num1 = 130; // 오류남 byte의 사용범위를 넘음
		
		
		int num2 = 20; // 변수를 선언하면서 데이터 저장 - 변수 초기화
		int num3 = 43;
		// num3은 43이다 라고 하면 안됨. num3과 43이 같다는 표현이라
		// num3에 43을 저장했다, num3에 43을 대입했다 라고 표현
		
//		System.out.println(num2 + num3); --> 이렇게 그대로 쓰지 말고 밑에처럼 변수를 새로 만들어서 변수에 담아서 사용하기!!
		
		int sum = num2 + num3;
		System.out.println(sum);
		
//		사각형의 너비와 높이 값으로 넓이를 구하세요
		
//		int width = 20;
//		int height = 30;
//		int area = width *  height;
//		System.out.println(area);
//		
		int blue = 20;
		int red = 15;
		int white = 0;
//		파란컵에 있는 오렌지주스가 20ml있다.
//		빨간컵에 딸기주스가 15ml있다.
//		파란컵에 딸기주스를, 빨간컵에 오렌지주스를 담으려면 어떻게 해야 하는가?
//		blue와 red값 출력
		
//		두변수의 데이터를 맞교환하기 위해서는(단순히 맞교환 불가 blue=red에 단순히 넣어버리면 blue값이 사라짐) 비어있는 변수1개가 더 필요함. >> 정렬
		white=blue; // blue의 20을 white에 복사해주고 blue에도 계속 20이 있음.
		blue=red;   //red의15를 blue에 저장해라
		red=white;  // white의 것을 red에 넘겨라
		System.out.println(red);
		System.out.println(blue);
		
////		javascript(재선언 가능한 애들 있음 var)
//		var a=10;
//		var a=20;//둘이 다른a임
//		
//		let c=10;
//		let c=20;//재선언 불가
//
////		jav(type은 재선언 불가)
//		int b=10;
//		b = 10;
		
		int birthYear = 1991;
//		김철수가 태어난 년도를 birth_year에 저장했다.
//		나이는?
		int nowAge = 2025 - birthYear;
		System.out.println(nowAge);
		
//		변수란 데이터(값)을 저장할 수 있는 메모리 공간
//		변수의 공간에는 데이터타입에 맞는 데이터만 저장할수 있게 해줘야한ㄷ.
//		변수의 선언은 데이터타입 변수명(예 - int num;)
//		변수의 이름은 카멜 표기법이 일반적이다.
//		변수의 이름은 변수의 사용목적에 맞는 이름으로 한다.(길어도됨)
		
		float fnum = 2.156f;
		System.out.println(fnum);
		fnum = 2.123456789f;
		System.out.println(fnum);
		double dnum = 1.1234567890123456789;
		System.out.println(dnum);//마지막 16자리수가 올림해서 나옴
		
		char ch='a'; //문자
		System.out.println(ch);
		ch = '가';
		System.out.println(ch);
		ch =97;
		System.out.println(ch); //아스키 코드에 있는 숫자가 문자가 되어 나옴
		ch = 'H';
		System.out.println(ch - 'A'); 
		System.out.println('각' - 64);
		
		String name ="홍길동"; //문자열은 String 클래스타입 사용
		
		boolean isApple = true; //참,거짓 값을 가지는 타입
		
		System.out.println(isApple);
		
		
		
	}

}
