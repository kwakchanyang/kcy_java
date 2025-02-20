package study0220;

import java.util.Scanner;

public class JavaMethod {
	
	// 1.반환x 입력x(매개변수) /2.반환x 매개변수o /3.반환o, 매개변수x/4. 반환o, 매개변수o
	// 똑같은 코드를 계속작성하지 않고 호출만 하면됨. 반복문은 비슷한형태가 반복될때,규칙이 있을때만 쓰는것!
	// 코드의 관리도 용이함.
	
	// 1. 반환x 입력x > 들어오는것도 나가는것도 없는 메서드
	// 메서드에 반환 값(출력값)이 없는 경우 void타입으로 작성한다. > 타입이 비어있다
	// 메서드 정의 > 이렇게 동작하도록 할것이다라는 정의만 내렸을 뿐 실행하지는 않음.
	// 대부분 단순 출력용이 많다. ex) 메뉴같은거
	// 또는 클래스 객체의 메서드인경우에도 반환과 매개변수없이 정의한다.
	static void output() {
		System.out.println(" 반환이 없는");
		System.out.println("매개변수도 없는 메서드");
	}
	
	// 2.반환x 매개변수o
	// 메서드의 내용을 실행하는데 필요한 데이터를 가지고 있지않다면
	// 메서드 외부에서 데이터를 가져와야 한다.
	static void sum(int num1,int num2) { // 두 정수의 합을 구해서 출력까지
		System.out.println("합ㅎ :"+(num1+num2));		
	}
	// 오버로딩 - 메서드이름은 똑같지만 매개변수는 한가지라도 다르게(타입or매개변수개수)
	static void sum(int num1,float num2) {
		System.out.println("합 "+(num1+num2));
	}
	
	// 3. 반환o 매개변수x - int num = scan.nextInt();
	// 매개변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성할 수 있거나
	// 클래스 객체가 가지고 있는 인스턴스변수의 데이터를 가공(계산같은거)하여
	// 외부로 내보내기 위한 목적인 경우
	
//	static int total() {
//		int a=10,b=20,c=30;
//		int tot = a+b+c;
//		return tot; // 내보내는곳과 나가는곳이 크기가 똑같아야함. tot를 int를 통해 내보내기 때문에
//					// void를 해놓고 return이 정해지면 그때 바꾸면됨.
//					// return다음에 코드는 더이상 실행되지 않음.
//	}
	
	// 4. 반환o 매개변수o  -  name.equals("박문수");
	static String game(int val) { // 1.가위 2.바위 3.보
		if(val==1)
			return "가위";
		if(val==2)
			return "바위";
		if(val==3)
			return "보";
		return "잘못입력"; // 반환이 있는 메서드에서 if문으로 return했다면 
						// 참인경우에만 동작할수 있기 때문에 별도의 return이 필요
		
//		   if()
//			return 11;
//		   else
//		    return 232;  >> 이경우에는 둘중에 무조건 return이 실행되니까
	}
	
	// 두개 정수중 큰 값 출력하는거 만들기
	// 두 정수 비교하고 출력하는 메서드 필요
	//  반환없고 매개변수 있는 메서드로!!
//	static void big(int num1,int num2) { // 두 정수의 합을 구해서 출력까지
//		if(num1>num2)
//			System.out.println("큰 수는: "+num1);
//		else
//		
//		System.out.println("큰 수는: "+num2);
//	}
	
	// 국어점수 : 88,영어점수:91, 수학점수:74
	// 세과목의 총점과 평균을 출력하세요
	// 총점 계산하는 메서드, 평균 계산하는 메서드
	
	static int total(int k, int e, int m) {
		int tot=k+e+m; //총점 계산
		return tot; // 총점 내보내기
	}
	static void avgCalc(int tot) {
		int avg=tot/3;
		System.out.println("평균 : "+avg);
	}
	public static void main(String[] args) { 
		
		int kor=88, eng=91, mat=74;
		int totScore = total(kor,eng,mat);
		System.out.println("총점 : "+totScore);
		avgCalc(totScore);
		

		
		
//		output(); // => 이렇게 작성해야 output메서드 실행된다.
//		
//		System.out.println("하하하");
//		sum(30,100);
//		sum(40,5);
//		
//		int a=100, b=232;
//		sum(a,b);
//		
//		float c=3.14f;
//		sum(a,c);
//		
//		int num = total(); // 메서드안에있는 값을 외부로 보내야 실행됨
//		// total()이하는 역할은 tot를 내보내고 위에 tot가 저장되고~
//		System.out.println(num);
//		
//		big(50,64); // 메서드 호출
		
	}

}
