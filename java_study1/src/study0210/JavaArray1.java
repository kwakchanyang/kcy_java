package study0210;

import java.util.Scanner;

public class JavaArray1 {

	public static void main(String[] args) {
		// 변수 : 값(데이터,주소 등등)을 저장하기 위한 메모리 공간 
		// 값은 하나만 가질 수 있음. int a=10; a=20;이라고 해준다해서 a값이 20으로 바뀌는게 아니라 덮어쓰는개념
		
		
		// 배열 : 같은 데이터 타입의 연속적인 메모리 공간
		// 		-> 다른말로 변수공간 여러개를 연속적으로 사용

		// 자바스크립트ㅡ 배열 => let arr = []; let arr=new Array();
		
		// 자바 배열 선언 방법
		int[] arr = new int[5]; //5개공간으로 이루어진 배열 선언 첫번째공간은 0
		int[] arr2 = new int[] {1,20,50,15}; //4개 공간 배열 선언
		
		// 자바 배열 사용법
		arr[2] = 20; // 배열은 0부터라 3번째 공간에 저장됨.
		// 얘를 출력하면 주소가 나옴. 

		arr[0]=10;
		arr[1]=30;
		arr[2]=40;
		arr[4]=60; // int type의 크기만큼 4번이동 > 5번째가 됨.
		//0부터 시작하는 이유는 arr가 알고 있는 주소 위치가
		// 첫번째니까 0번이동임.
		
		
		// 배열을 사용하려면 반복문쓰기
		// 배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		// 그래서 반복문의 초기값은 0으로 지정하면 된다.
		// 반복문의 조건식은 배열인덱스의 마지막까지 표현 될수 있게 하면 된다.
		// 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7
		for(int i=0;i<=3;i++) {  
			System.out.println(arr2[i]);
		}
		
		int[] apple = new int[10]; 
		// new가 사용된건 참조변수 = 메모리주소를 전달하는것임
		//  참조변수(뒤에 new붙어있음)를 사용하려면 배열인경우 인덱스를 객체인경우는 .접근연산자를
		//	int[]a=new int[] {11,20,55};
//		int[]b=new int[] {13,20,55};
//		
//		boolean isSame = true; // 같은배열이면 true 다르면 false >> 내가 정해줘야함.
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i] != b[i])  // 반복문이라 else를 쓰지 않음. 
//				isSame=false;
//			}
//			if(isSame) {
//				System.out.println("같은 배열");
//			}else {
//				System.out.println("다른 배열");
//			}
//		
//		long naa=100; // 참조변수가 아님. 참조변수들은 직접데이터를 가지고 있지않고 주소만 참조하고 있는 상태임.
//		Scanner[] ab = new Scanner[50]; // 50개를 입력받을수 있음.
//		ab[0];
//		//Scanner라는 이름의 클래스타입이다. 
//		
		
		Scanner sc = new Scanner(System.in);
		// 배열에 데이터 입력
		for(int i=0;i<=9;i++) {
			System.out.println("숫자 입력:");
			apple[i]=sc.nextInt();
		}
		// apple.length -> 배열의 크기(공간갯수)
		// 실수데이터는 정확도가 100%가 아니라 잘못 처리될수도 있다. 
		// 배열의 크기는 반드시 10진수 정수로 지정7
		for(int i=0;i<apple.length;i++) {
			System.out.println("배열값 :"+apple[i]);
		}
	}

}
