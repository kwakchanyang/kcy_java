package study0206;

import java.util.Scanner;

public class JavaLoopTest1 {

	public static void main(String[] args) {
		/*
		문제 1 - 무한루프
		
			정수 한개씩 계속 입력 받기
			입력하다가 0을 입력하면
			지금까지 입력한 모든 숫자의 합 출력
			
		문제 2 - 무한루프
			컴퓨터와 가위바위보게임하기
			내가 10번을 이길때까지 계속 게임하기
			10번 이기면 그동안 몇번 패배하고 몇번 비겼는지 출력
			*/
		
//		Scanner sc = new Scanner(System.in);
//		
//		int user=10;
//		int sum=0;
//		do {
//			System.out.println("정수입력:");
//			user = sc.nextInt();
//			sum+=user;
//			
//		}while(!(user==0));
//		
//		System.out.println("지금까지 수의 합은:"+sum);
		
		
//		Scanner sc = new Scanner(System.in);
//		
//
//		int win=0;
//		int lose=0;
//		int draw=0;
//
//		while(win<10) {		
//			System.out.println("1.가위 2.바위 3.보:");
//			int com = (int)(Math.random()*3+1);
//			int user2 = sc.nextInt();
//			if(user2==com) {
//				System.out.println("비김");
//				draw++;
//			}
//			else if((user2==1 && com==3)||(user2==2&&com==1)||(user2==3 && com==2)) {
//				System.out.println("이김");
//				win++;
//			}else
//				System.out.println("패배");
//				lose++;
//			
//		
//
//	}
//		System.out.println("10번 이길동안 "+lose+"번 패배하고 "+draw+"번 비겼습니다."+win);
		
//		int user=0;
//		do {
//			System.out.println("1.가위 2.바위 3.보");
//			user = sc.nextInt();
//			int com = (int)(Math.random()*3+1);
//		}while(!(win<10));
		
		
		
		/*
		 * 문제3
		 * 
		 * 컴퓨터와 주사위게임을 한다.
		 * 각각 주사위 2개를 던져서 주사위 합이 큰쪽이 이긴다.
		 * 단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		 * 둘이 같은 숫자가 나왔다면 합이 큰쪽이 이긴다.
		 * 예) 나 - 3,4  컴 - 1,3    내가이김
		 *    나 - 5,6   컴 - 1,1    컴퓨터 이김
		 *    5판을 진행했을 때 몇승 몇패 몇무 인지 출력
		 *    
		 */
		
		Scanner sc = new Scanner(System.in);
		

		int uSum=0;
		int cSum=0;
		int game=0;
		int win=0;
		int lose=0;
		int draw=0;
		

		
		while(game!=5) {

			
			int com1 = (int)(Math.random()*6+1);
			int com2 = (int)(Math.random()*6+1);
			
			int user1 = (int)(Math.random()*6+1);
			int user2 = (int)(Math.random()*6+1);
			
			uSum=user1+user2;
			cSum=com1+com2;
			
			if((cSum==uSum)){
	            if (user1 == user2) {
                    win++; // 사용자가 같은 숫자일 때 이김
                } else if (com1 == com2) {
                    lose++; // 컴퓨터가 같은 숫자일 때 이김
                } else {
                    draw++; // 무승부
                }
            } else if (uSum > cSum) {
                if (user1 == user2) {
                    win++; // 사용자가 같은 숫자일 때 이김
                } else {
                    win++; // 사용자가 합이 클 때 이김
                }
            } else {
                if (com1 == com2) {
                    lose++; // 컴퓨터가 같은 숫자일 때 이김
                } else {
                    lose++; // 컴퓨터가 합이 클 때 이김
				
			
			
		}

		
	}game++;
	System.out.println("내첫번째 숫자:"+user1+"내두번째 숫자:"+user2+"컴퓨터첫숫자:"+com1+"컴퓨터두번째숫자:"
			+com2);
	System.out.println("내숫자의 합:"+uSum+"컴퓨터숫자의 합:"+cSum);

		}

		System.out.println("5판동안"+win+"승"+lose+"패"+draw+"무");
		// 베스킨라빈스 31게임 -- 무한루프+반복문+if문은 31이 나오면 끝나야함 몇개입력하고 그만큼만 숫자가 나오게하기
		}
	}
