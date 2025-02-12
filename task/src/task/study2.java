package task;

import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pTime=0, pMin=0;
		
		System.out.print("주차시간(시):");
		pTime = sc.nextInt();
		System.out.print("주차시간(분):");
		pMin= sc.nextInt();
		
		
		//싸다구 주차장 주차비 결제
				// 주차장의 기본 요금은 1000원 이고 기본 시간은 30분이다.
				// 11분 주차해도 1000원 이다.
				// 10분당 100원씩 추가 요금
				// 34분 주차하면 1000원, 40분 주차하면 1100원
				// 51분 주차하면 1200원
				// 2시간이상 주차시 기본요금은 1700원이다. 
				// 2시간 10분 주차하면 1800원 , 3시간 21분 주차하면 2500원
				// 4시간이상 주차시 기본요금은 2500원이다.
		        // 4시간 15분 주하면 2600원
				// 8시간 이상 주차하면 무조건 10000원 
				// 주차 몇시간 몇분 했는지 입력하여  주차요금이 얼마인지 출력하세요
		
			int fee=0;
			if(pTime>=8) {
				fee=10000;				
			}
			else if(pTime>=4) {
				fee=2500;
			
				if(pMin>=10) {
			
				int extraMin=pTime*60+pMin;
				int extraTime=extraMin-30;
				fee=(extraTime/10)*100+fee;
			
				}
				}
			else if(pTime>=2) {
				fee=1700;
			
				if(pMin>=10) {
				
					int extraMin=pTime*60+pMin;
					int extraTime=extraMin-30;
					fee=(extraTime/10)*100+fee;
					
				}
			}else {
			fee=1000;
				
	}
			System.out.println("주차요금은"+fee+"원입니다.");

  }
}
			
	
