package study0131;

import java.util.Scanner;

public class javaIf3 {

	public static void main(String[] args) {
		
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본시간은 30분이다.
		// 11분 주차해도 1000원이다.
		// 10분당 100원씩 추가 요금
		// 34분 주차하면 1000원, 40분주차하면 1100원
		//51분 주차하면 1200원
		// 주차 몇분 했는지 입력하여 주차요금이 얼마인지 출력하세요.
		
		// 조건 - 기본시간에 10분이 추가되면 요금이 변한다.
		// 30, 32, 38 -> 몫이 3이다.
		
		Scanner rate = new Scanner(System.in);
		
		int pTime=0;
		
		System.out.println("주차시간을 입력하세요 :");
		pTime = rate.nextInt();
		int br = 1000, bt =30;
		
		if( 0>pTime && pTime<=39) { //기본요금 1000원
			
		}else {
			pTime=pTime-bt;
			br=(pTime/10)*100+br;
			
		}
		System.out.println("주차 요금:"+ br);
		 
		
		
		
	}
}


