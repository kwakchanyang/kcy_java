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
		
//		int pTime=0;
//		
//		System.out.println("주차시간을 입력하세요 :");
//		pTime = rate.nextInt();
//		int br = 1000, bt =30;
//		
//		if( 0>pTime && pTime<=39) { //기본요금 1000원  // 0분도 하려면 0입력했을때 어떻게 할것인지 조건식 추가해야함.
//			
//		}else {
//			pTime=pTime-bt;
//			br=(pTime/10)*100+br;
//			
//		}
//		System.out.println("주차 요금:"+ br);
		
		
		int pHour, pMin;// 주차시간,분
		int cost = 1000;
		int totalTime = 0;// 총 주차 시간(분) - 기본시간제외한 나머지
		
		System.out.println("주차 시간( 시간, 분) : ");
		pHour = rate.nextInt();  // 주차 몇시간 입력
		pMin = rate.nextInt();  // 주차 몇분 입력
		
		totalTime = pHour*60+pMin;  // 시간을 분으로 바꿔줌
		if(pHour >= 8) { //8시간 이상 주차
			  			// if문으로 묶여있으니 8시간이아니라면 밑에있는 4시간인지 따지고 밑으로 차례대로 하나만 실행됨
						// 하나가 실행됐으면 나머지는 실행하지 않음
			cost=10000;
			totalTime=0; //8시간 이상이라는 시간에 대해서 이미 요금계산완료
		}else if(pHour >= 4) { //4시간 이상 주차시
			cost=2500;
			totalTime -= 240; // 4시간의 기본 시간 빼기
		}else if(pHour >= 2) { //2시간 이상 주차시
			cost=1700;
			totalTime -= 120;
		}else { //2시간 미만 주차시
			totalTime = totalTime < 30 ?  0 : totalTime-30;	
		}
		
		int price = cost + (totalTime/10 * 100);
		System.out.println("주차요금은:"+price+"입니다.");
		
		
		
		
	}
}


