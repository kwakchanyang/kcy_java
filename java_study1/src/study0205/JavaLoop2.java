package study0205;

import java.util.Scanner;

public class JavaLoop2 {
//	자바의 변수 종류
//	지역변수, 클래스변수(static), 인스턴스변수
	
	static Scanner sc = new Scanner(System.in); // 위쪽에서 사용하려면 static을 붙여야 함. public은 누구나 사용가능
												// static은 공유가능
	public static void main(String[] args) {
		
		
		
		
//		
//		for(int i=1; i<=2; i++) {
//			System.out.println("변수 i 사용 반복문"+i);
//			for(int k=1; k<=3; k++) {
//				System.out.println(i+"      변수 k 사용 "+k); // i가 2가되려면 k가 3까지 실행되고 나야 i++실행됨.=2번째 for문이 종료해야 첫번재 for문이 증감됨. 
//															// 두번째 for문안의 변수k는 지역변수라 두번째 for문 안에서만 사용가능
//															// for문(제어문)안에 사용한 변수는 다시사용가능, for문안에서 끝남 >> 어느위치에 있냐가 중요!!
//			}
//		}

//		int i=1;
//		for(int k=2; k<=9; ) {
//			System.out.println(k+"*"+i+"="+(k*i));
//			i++;
//			if(i==10) {
//				k++;
//				i=1;
//			}
//		}
		
		
//		for(int i=2; i<=9; i++) {
//			System.out.println(i+"단");
//			for(int k=1; k<=9; k++) {
//				System.out.printf("%d * %d = %d \n",i,k,i*k);
//			}
//		}
		
//		int num=0;
//		for( ; num!=100 ; ) {
//			System.out.println("정수 입력 : ");
//			num = sc.nextInt();
//		}
//		// for문으로 무한루프 표현 : for(;;), for(;true;), for(;num!=0;)
//		while(true) {
//			
//	}
		

//		for( ;true ; ) {  // for문 무한 루프 형태 >> 무한루프를 쓸때는 언제쯤 종료가 되야하는지 꼭 넣어주기!!
//		System.out.println("정수입력:");
//		int num = sc.nextInt();	
//		if(num==0) break,return; // 무한루프의 종료시점 정하기 if문과 break로
//		}
//		
//		//break는 해당 제어문(반복문,switch)을 종료 시키기만 한다. > 밑에코드 실행
//		//return은 메서드(main)를 종료 > main안에 for이 있으니까 종료시키면 밑에코드를 실행하지 않음
//		System.out.println("무한루프 종료 되었습니다.");
//		
//		for(int i=1;true; i++) {  // 조건식에 거짓이 안나온다면 무한반복됨 
//			System.out.println(i);
//		}
//		
		
//		for(초기값;조건식;증감식) {
//			반복내용
//		}
//		동작순서 : 초기값 > 조건식 비교 > 참이라면 > {내용} > 증감식 > 조건식 비교 > 참이라면 > {내용} > 증감식 > 조건식 비교 > 거짓이라면 > 종료

		
		// 10부터 100까지의 총합을 구하세요
//		단, 10단위의 숫자만 계산
		
//		int sum=0;
//		for(int i=10; i<=100; i+=10) {
//			sum=sum+i;
//
//		}
//		System.out.println("총합:"+sum);
	}

}
