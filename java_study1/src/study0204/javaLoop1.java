package study0204;

import java.util.Scanner;

public class javaLoop1 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=10; i=i+2) { // i==10을 하면 처음시작하는 값인1이 포함이 되지 않기 때문에 i<=10을 써줌 // i의 역할은 "반복"시켜주기 위해서 실행되는거지 출력의 목적이 아님 출력은 그냥 해본것!!
//									// 동작순서 : 초기값(i=1) > 조건식비교(i<=10) 참이니까 > {}안의 출력을 한번 실행 > 1출력됨 > i++(2) >다시 조건식 비교(2<=10) 참이니까 >{} ----->조건식이 거짓이 되기전(11)까지 계속 반복
//			System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자 입력:");		
//		int num = sc.nextInt();
//		
//		for(int i=num; i>=1; i--) {
//			System.out.println("반복문!");
//		}
		
		
		// 6번 반복하는 반복문을 만들고 싶다.
		// 1부터 시작해서 6까지 1씩 증가
		// i=1; -> 1부터 시작하겠다.
		// i<=6 -> 6까지 (반복원하는횟수가 범위에 들어가야함)
		// i++ 또는 i=i+1 -> 1씩 증가
		// for(int i=1; i<=6; i++)
		
//		// 정수5부터 17까지 출력하는 반복문 만드세요
//		for (int i=5; i<=17; i++) {
//			System.out.println(i);
//		}
//		
//		//총합 구하기 = 누적값사용할때 > 변수필요,누적합=0,,누적곱=1
//		
//		int sum=0;
//		for(int num=1; num<=10; num++) {  //num은 하나의값만 가질수 있음 1+2둘다 가질수 없음 > sum에 num++되기전 값을 넣어준다
//			sum = sum+num;
//		}
//		
//	   System.out.println("1부터10까지의합:"+sum);
	   
	   // 두개의 정수를 입력하여 두수중 작은숫자부터 큰숫자까지의 합을 구하세요.
	   // 예) 1번째 숫자를 21입력하고 2번째 숫자를 4입력했다면 4부터 21까지의 합 구하기
//	   
//	   int Fnum=0,Snum=0;
//	   System.out.println("첫번째 수, 두번째 수:");
//	   Fnum=sc.nextInt();
//	   Snum=sc.nextInt();
//	   
//	   
//	   int Tsum=0;
//	   if(Fnum>Snum) {
//		   for(int i=Snum; i<=Fnum; i++) {
//			   Tsum=Tsum+i;
//		   }
//	   }else if(Fnum<Snum) {
//		   for(int i=Fnum; i<=Snum; i++) {
//			   Tsum=Tsum+i;
//		   }
//	   }else
//		
//		   Tsum=Fnum+Snum;
//		   
//	   System.out.println(Tsum);
	   
	   
//	   int small,big;
//	   if(Fnum<Snum) {
//		   small=Fnum;
//		   big=Snum;
//	   }else {
//		   small=Snum;
//		   big=Fnum;
//	   }
//	   int sum=0;
//	   for( ; small<=big; small++) {
//		   sum=sum+small;
//	   }
//	   System.out.println(sum);
	   
	   
	   //내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
	  System.out.printf("몇단?:");
	  int num = sc.nextInt();
	  for(int i=1; i<=9; i++) {
		  System.out.printf("%d*%d=%d \n",num, i,num*i);
	  }
	   


	   
		
	   }
	
	   
	}



// 반복문 - for, while, do~while
// 반복 - 몇번을 반복할꺼냐, 몇번을 반복할것인지 정하지 않고 하는 경우와 반복횟수를 정하여 반복하는 경우
// 주로 반복횟수가 정해진 경우는 for문
// 반복횟수가 정해져 있지 않은경우는 while문	
// 