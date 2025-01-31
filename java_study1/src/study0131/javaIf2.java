package study0131;

import java.util.Scanner;

public class javaIf2 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		// 사각형의 너비와 높이 이다.
		// 현재 사각형은 정사각형인가 직각 사각형인가?
//		int width = 53, height = 52;
//		if(width == height )
//			System.out.println("정사각형입니다.");
//		else
//			System.out.println("직각사각형입니다");
		
		
		// 입력 한 숫자가 짝수인가ㅏ 홀수인가
		
//		int num = 0;
//		System.out.println("숫자입력 :");
//		num = in.nextInt();
//		
//		if(num%2 == 0)
//			System.out.println("짝수입니다.");
//		else
//			System.out.println("홀수입니다.");
		
		
		// 8의 배수를 구해라 num%8==0
		// 12의 약수 12%num== 0
		
		
//		int num = 15;
//		if( num > 0) {
//			System.out.println("양수이다.");
//		}else if( num < 0) {                     // 조건식은 오직 if뒤에만 올 수 있다. 그래서 조건식 2개를 쓰려면 if를 2개써야함.
//				System.out.println("음수이다.");   // else if는 계속 쓸 수 있음.
//				
//		}else {
//				System.out.println("0 이다.");
//		}
//		
		
//		int score = 81;  // 100~90은 A, 89~80은 B, 79~70은 C 나머지는 F
//		
//		if (score >=90 && score <=100){
//			System.out.println("A학점이다.");
//		}
//		if( score <=89 && score >=80) {
//			System.out.println("B학점이다.");
//		}
//		if( score <=79 && score >= 70) {
//			System.out.println("C학점이다.");
//		}else {
//			System.out.println("F학점이다. ");  // 바로위의 score <=79 && score >=70에 대한 거짓이기 때문에 95점일 경우 얘도 실행됨.
											  // else는 직전 if문과만 연결됨.	
//											  // 출력값 = A학점이다. F학점이다 
											  // if문이 여러개라 각각 실행됨.	
//		}
//		
		
//	int score = 81;  // 100~90은 A, 89~80은 B, 79~70은 C 나머지는 F
//		
//		if (score >=90 && score <=100){      // 얘가 거짓일때만 밑에꺼를 따진다.위에있는 조건식이 거짓일때만 밑에있는 조건식이 실행됨.
//			System.out.println("A학점이다.");  // 큰 숫자를 위에 넣는것이 좋다.
//		}
//		else if(score >=80) {                // 위에가 거짓이라면 무조건 90점이하니까 89점이하라는 표현을 굳이 안해줘도 됨.
//			System.out.println("B학점이다.");  
//		}
//		else if(score >= 70) {
//			System.out.println("C학점이다.");
//		}else {
//			System.out.println("F학점이다. ");  // 4개가 하나의 if문으로 묶이기 때문에 4개중에 1개만 실행된다.
//		}
//		
		
		//1입력하면 데이터 저장이라고 출력
		// 2입력하면 데이터 삭제하고 출력
		// 3입력하면 종료 라고 출력
		//1,2,3이 아닌 숫자는 잘못입력했습니다. 라고 출력
		// 정수를 입력하여 위 내용처럼 실행될수 있게 만드세요.
		int num=0;
		
		System.out.println("숫자입력 :");
		num = in.nextInt();
		
		if( num == 1 ) {
			System.out.println("데이터 저장");	
		}
		else if( num == 2) {
			System.out.println("데이터 삭제");
		}
		else if( num == 3) {
			System.out.println("종료");
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		
	}

}



/*
	변수 : 데이터(값)를 저장하기 위한 메모리 공간
	변수이름 : 데이터가 저장된 메모리공간을 사용하기 위해서는 이름을 부여해야 한다.
 	System.out.println(1000);
 	int a = 1000;
 	a=123;
 	a=23;
 	System.out.println(a);
 	
 	변수 선언 : 데이터타입 정하기, 변수이름 정하기
 			-> 사용할 데이터에 맞춰서 정하기
 			-> int num; 데이터타입 변수이름;
 			
 	데이터타입 변환 (형변환)
 		자동 형변환 : 데이터타입이 작은범위에서 큰범위로 데이터가 저장되는 경우
 		float a = 10;  ->  자동형변환(실수타입으로)
 		강제 형변환 : 데이터타입이 큰범위에서 작은범위로 데이터가 저장되는 경우
 		int b = (int)2.14f;  -> 강제형변환(정수타입으로)
 		
 		나누기 % : 나머지 구하기
 		++, -- : 증감연산자 (1씩 증가, 1씩 감소)
 	
 	if문
 		
 		if(조건식) { 조건식이 참이라면 조건식 다음의 중괄호 안에 내용만 실행
 			참일 경우 실행할 내용, 여러줄 가능
 			}
 			
 		if(조건식) {
 		}else { else는 조건식이 거짓일 경우에만 실행
 			거짓일 경우 실행할 내용, 여러줄 가능
 		
 		}
 		
 		int 나이 = 25;
 		if( 나이>= 19){
 			System.out.println("성인입니다.");
 		}
 		
 		System.out.println("청소년입니다.");  >> 성인입니다. 청소년입니다. 둘다 나옴 if문과 전혀 관계없이 무조건 실행됨.
 		
 		
 		<둘 중에 하나만 실행하고 싶을 때>
 		int 나이 = 25;
 		if( 나이>= 19){
 			System.out.println("성인입니다.");
 		}else {
 			System.out.println("청소년입니다."); 
 		}
 		
 		int money = 6400;
 		if( money >= 10000 ) {
 			System.out.println(" 충전 안함.");
 			System.out.println("현재 잔액 : " + money);  
 		}else{
 			System.out.println("잔액 부족" + (10000 - money) +  "충전");
 			money = (10000-money) + money;
 			Sytem.out.println("현재 잔액 : " + money);
 			
 		}	
 		
 		--> //참이든 거짓이든 System.out.println("현재 잔액 : " + money);  얘는 조건식이랑 상관없이 실행됨.= 불필요한 코드
 		
 		
 		int money = 6400;
 		if( money >= 10000 ) 
 			System.out.println(" 충전 안함.");  // 실행되는 내용이 한줄이면 {}생략 가능
 			 
 		else{
 			System.out.println("잔액 부족" + (10000 - money) +  "충전");
 			money = (10000-money) + money;		
 		}
 		
 		Sytem.out.println("현재 잔액 : " + money);



*/
