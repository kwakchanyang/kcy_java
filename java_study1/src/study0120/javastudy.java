package study0120;

import java.util.Scanner;

public class javastudy {

	public static void main(String[] args) {
		
		//변수 - 데이터를 저장하기 위한 메모리 공간
		//변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		//변수 선언 방법 - 데이터타입 변수이름(예 - int,num;)
		//저장할 데이터에 맞는 데이터타입을 설정해야 한다.
		//변수이름의 첫글자는 문자로, 자바 예약어는 사용불가
		
		//자바에서 결과로 출력하는 방법
		System.out.println("출력하는 방법");
		//자바에서 키보드를 통해 데이터 입력하는 방법
		//자바에서 입력하기 위한 순서
		//1. 입력 객체 생성
		//2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		
		//Scanner 변수이름 = new Scanner(System.in);//변수이름은 내가 하고싶은대로
//		Scanner every = new Scanner(System.in);
//		
//		//num이라는 변수에 정수 데이터입력하여 저장하기
//		//nextInt()가 정수 데이터 입력하기 위한 메서드이다.
//		System.out.print("정수 입력:");
//		int num = every.nextInt(); //.은 하위의 접근 / 키보드를 통해 입력받아오겠다/ 키보드에서 5를 눌렀을때
////				정수(int,short,long,byte)를 넣어준다. 변수가 int니까 nextInt선택.
////		데이터타입중 char(문자)는 안됨 >> 데이트 타입이 아니라 class 이름임.(색깔이 다름)
//		
//		System.out.println("입력 잘되었나? " + num );
//		
		//사각형의 너비와 높이를 키보드를 통해 입력받고
		//넓이를 계산하여 출력하세요.
		
//		Scanner width = new Scanner(System.in);
//		System.out.print("너비를 입력하세요:"); //println을 하면 밑에줄에 입력됨.ln이 <br>역할임
//		int num1 = width.nextInt();
//		
//		Scanner height = new Scanner(System.in);
//		System.out.print("높이를 입력하세요:");
//		int num2 = height.nextInt();
//		
//		int dimension = num1 * num2;
//		
//		System.out.println("사각형의 넓이는:"+dimension+"입니다.");
		
		////////////교수님 답///////////
		Scanner sc = new Scanner(System.in);
		int width=0 , height=0; // 노란밑줄은 미사용변수라서 뜨는것
		System.out.print("너비 입력:");
		width = sc.nextInt();
		System.out.print("높이 입력:");
		height = sc.nextInt();
		//사각형 넓이 구하기
		int area = width * height;
		System.out.println("넓이:" + area);
		
		
		
		
	}

}
