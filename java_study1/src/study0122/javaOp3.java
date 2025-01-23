package study0122;

import java.util.Scanner;

public class javaOp3 {

	public static void main(String[] args) {
		// 비교연산자- 두개 데이터를 비교하여 참,거짓 결과
		
		System.out.println(10 > 5);
		System.out.println(11 < 4);
		
		Scanner scan = new Scanner(System.in);
		
//		int num;
//		
////		System.out.printf(" 정수 입력 :");
////		num = scan.nextInt();
//		
////		System.out.printf("5보다 큰숫자인가?" + (num > 5)); // 기준은 변하지않는값(5)
////		boolean big;
////		big = num >= 10; // 비교연산자의값인 true,false를저장하려면 boolean필요
//		
////		System.out.println(" 10 이상인가 ?" + big);
//		
//		System.out.println( 10 == 10); // 두 숫자가 같다.
//		System.out.println( 10 == 13);
//		
//		String word = "가나다"; // 문자열의 타입은 String 클래스타입(객체) .얘는 기본 데이터타입이 아님
//		String word2 = new String("가나다");
//		
//		// <-----------문자열 비교는 equals를 사용한다-------------->
//		System.out.println("가나다" == "가나다"); // true나온이유는 메모리값만 보고 같아서 나온거지 문자열비교는 정상적인 비교방법은 아님, 객체만들어야함.
//		//System.out.println("word" == "word2"); // 변수=객체(word)안에 넣어준 값이기 때문에 word와word2는 다른객체기 때문에 false나옴 =>변수마다 할당된
//		//메모리주소가 다르기때문에 word(100) 100(가나다) word2(1004) 1004(가나다) 100!=1004니까
//		System.out.println(word.equals(word2)); // equals는 100(가나다)와1004(가나다)의 값을 비교한다.
//		
//		System.out.println('a' > 'b');
//		// == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별
//	
//		
//		System.out.println( 10 != 5); //같지 않아야만 참이 됨	
//		
		//놀이동산에서 바이킹을 타는데 키가 140이상만 탈 수 있다.
//		int tall;
//		
//		System.out.println("키: ");
//		tall = scan.nextInt();
//		System.out.println(tall >= 140);
//		
//		//바이킹 탑승조건 : 키 140이상 190이하
//		//비교연산자로 만들어진 조건식이 여러개인 경우 논리연산자를 사용
//		System.out.println(tall >= 140 && tall <=190);
		// 140 <= tall <= 190이 안되는 이유 : <=(연산자)가 2개면 피연산자(140,190)이 4개가 필요함!
		// 비교 데이터 타입 불일치 140<=tall은 true가 나옴 true(boolean타입)를 190(int)이랑 비교불가! 
		
		// 청소년 버스요금은 1000원이다. (청소년은 13세부터 19세)
		// 나이 입력받아서 청소년이면 false 아니면 true가 되게 출력하세요.
		int age = 0;
		System.out.println("나이:");
		age = scan.nextInt();
		System.out.println(!(age < 13 || age > 19));
		
		// 조건식 - 비교연산자와 논리연산자를 사용하여 만든식
		// 조건식 만드는 연습 하셔야 해요.
		// total > count
		

	}
}
