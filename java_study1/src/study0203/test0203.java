package study0203;

import java.util.Scanner;

public class test0203 {

	public static void main(String[] args) {

		/*
 		과제!! 2월 3일
 		
 		가위바위보 게임 만들기
 		1.가위  2.바위  3.보  
 		내가 이겼는지 , 졌는지 ,비겼는지  출력
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위, 2.바위, 3.보:");
		int user = sc.nextInt();
		
		int win = (int)(Math.random()*3+1);
		
		if(user==1 || user==2 || user==3) {
			if(win == user)
				System.out.println("비겼습니다.");
			else if(win ==1 && user==2)
				System.out.println("이겼습니다.");
			else if(win ==2 && user==3)
				System.out.println("이겼습니다.");
			else if(win ==3 && user==1)
				System.out.println("이겼습니다.");
			else
				System.out.println("졌습니다.");
			
			System.out.println("당신은"+user+"컴퓨터는"+win);
		}else {
			System.out.println("잘못입력 했습니다.");
		}
		
		
		

	}

}
