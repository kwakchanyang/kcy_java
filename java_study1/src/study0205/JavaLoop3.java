package study0205;

import java.util.Scanner;

public class JavaLoop3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 동전 앞면 뒷면 맞추기 게임
		//  내 돈이 바닥 날때까지 게임 진행!!
		System.out.println("당신의 머니는 얼마? :");
		int money = scan.nextInt();
		final int 판돈 = 1000; // final은 자바스크립트의 const와 같다(상수).값변경xx
		int win=0;
		
		while(true) {
			int coin = (int)(Math.random()*2+1); // 1앞 2뒤
			System.out.println("1.앞면, 2.뒷면 :");
			int user = scan.nextInt();
			if(user==coin) {
				System.out.println("정답!!");
				win++;
			}
			else
				System.out.println("땡!!");
			money-=판돈; // 1번 진행시 1000원씩 감소
			if(money < 판돈) break;
			
		}
		System.out.println("내돈은 :"+money);
		System.out.printf("%d번 이겼습니다.",win);
		
//		int com = (int)(Math.random()*50+1); // 반복문 밖에 있어야 값이 변하지 않음 . 반복문안에 넣으면 값이 계속 변함.
//		
//		while(true) {
//			System.out.println("정수 입력 : ");
//			int num = scan.nextInt();
//			if(com==num) {
//				System.out.println("정답!");
//				break;
//			}
//			if(com > num)
//				System.out.println("업");
//			if(com < num)
//				System.out.println("다운");
//		}
		
		// for(초기값; 조건식; 증감식)
		// for(int i=1; i<=10; i++)
		// 반복 횟수가 정해져 있는 경우 for문이 가독성이 좋다.
		// 반복횟수가 없는경우 while문이 가독성이 좋다.
		
//		int i=1; //초기값
//		
//		while(i<=10)
//		{  //조건식
//			System.out.println(i);
//			i++; // 증감식
//		}
	
    }
	
}
