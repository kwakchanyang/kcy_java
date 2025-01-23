package study0123;

import java.util.Scanner;

public class javaOp4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
//		// 조건연산자
//		//   (조건식) ? 참일경우 실행 내용 : 거짓일경우 실행 내용; --> 실행내용은 변수에 저장되어 있어야함!
//		
//		//void a = ( 10 > 5 ) ? System.out.println("5보다 크다") : System.out.println("5보다 작다");
//		
//		String result = ( 10 > 5 ) ? "5보다 크다" : "5보다 작다"; //result가 참이라면 '5보다크다'만 저장됨
//		System.out.println(result);
//		
//		int age = 16;
//		int price = (age < 19) ? 1000 : 1500; //참이니까 1000만 가짐
//		System.out.printf("나이 : %d살, 버스요금 : %d원 \n", age,price);
//		
////		int a = 0;
////		int b = ( age < 15) ? a=1000 : 1500; 아직은 이런식으로 하지말기~
//		
//		
//		
//		System.out.print("첫번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자 : ");
//		int num2 = scan.nextInt();
//		
//		int res = (num1 > num2) ? num1 : num2; //둘중에 누가 클지 모르니 가정해서 조건식에 넣어줌
//		// 조건식이 참이라면 res=num1 수행
//		// 조건식이 거지이라면 res=num2 수행
//		
//		System.out.println("두숫자 중 큰숫자는 : " + res);
//		
//		//두숫자를 입력받아서 두수가 같다, 같지않다. 출력
//		System.out.print("숫자1 : ");
//		num1 = scan.nextInt();    
//		System.out.print("숫자2 : ");
//		num2 = scan.nextInt();
//		
//		String res1 = (num1 == num2) ? "두수가 같다" : "두수가 같지않다"; //!=다고 표현했다면 뒤에 문자열 위치도 바뀌어야 함.
//		System.out.println(res1);
		
		
//		System.out.print("정수 입력 :");
//		int num = scan.nextInt();
//		
//		//입력한 정수가 양수냐 음수냐, 0이냐(3개중에 1개니까 조건식은 최소2개 필요함)
//		String res = (num > 0) ? "양수":(num < 0) ? "음수" : "0이다"; 
//		System.out.println(res);
//		
		//바이킹을 타기 위해서는 키가 135이상이어야 한다.
		//바이킹 탑승여부를 출력하세요 .(키 입력받기)
		
//		System.out.print("당신의 키는? :");
//		int tall = scan.nextInt();
//		
//		String res = (tall > 135) ? "탑승가능" : (tall < 135) ? "탑승불가능" : "탑승가능"; //왜 굳이 나눴나?? (tall>=135) ? "탑승가능" : "탑승불가";
//		System.out.println(res);
		
//		System.out.println("1.파미향짬봉 2. 쿠켄 돈가스 3. 공주순대 :");
//		int select = scan.nextInt();
//		
//		int price = (select ==1) ? 9000 : 0; //
//		price = (select==2) ? 8000 : price;//1번선택했다면 9000원이 들어갔다. 그다음에 밑에걸 실행하는데 2번이아니니까 거짓이라 9000이나오게됨 =이전조건자의 결과를 이어서 사용
//		price = (select==3) ? 6500 : price;
//		
//		System.out.println("가격은"+price);
//		
		// 정수 세개를 키보드를 통해 입력받기
		//세 정수 중에서 가장 큰 정수를 출력하세요
		// 두개가 같은경우,세개가 같은경우는 배제하고!!
//		
//		System.out.println("첫번째 정수를 입력하세요:");
//		int num = scan.nextInt();
//		System.out.println("두번째 정수를 입력하세요:");
//		int num1 = scan.nextInt();
//		System.out.println("세번째 정수를 입력하세요:");
//		int num2 = scan.nextInt();
//		
//	    int number = (num > num1 ) ? num : num1;
//	    number = (num > num2) ? number : num2;
//	    
//	    System.out.println("가장 큰 정수는" + number);
	    
	    //--------------------- 교수님 답--------------
	    System.out.print("세 정수 입력:");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    int num3 = scan.nextInt();
	    
	    int max = (num1 > num2) ? num1 : num2;
	    max = (max > num3) ? max : num3;
	    
	    System.out.println("가장큰수 : "+max);
//	
	}

}


// 사칙연산자 : +, -, /, *, %
// 복합대입연산자 : +=, -=, /=, *=, %=
// a= a+123;  -> a+=123;(왼쪽과 오른쪽에 동일한 변수가 존재할 때)
// 증감연산자 : ++, --, 
// 비교연산자 : 비교연산자를 통해 조건식을 만든다. 조건식은 참 또는 거짓의 결과
//           ==, !=
// 논리연산자 : &&(and) , ||(or) , !(not)
//    논리연산자는 참이나 거짓을 가지고 연산한다(조건식 필요)
//  a > 6 && (b < 4 && b > 0 || c > 10) //and,or 은 먼저 쓰인것이 실행됨

