package study0205;

import java.util.Scanner;

public class task0205 {

	public static void main(String[] args) {
		// 오늘의 과제
		// 1~50중 하나를 내가 입력한다.
		// 내가 입력한 숫자를 컴퓨터가 맞춰야한다(random사용)
		// 무작위로 맞추는게 아니고 범위를 좁히면서 맞출 수 있도록 해야한다.
		
		// 13  10이상 25이하 >> 11~24 11~19 11~14 
		// 7 5이상 30이하 >> 6~29 
		// 7 5이상 20이하 >> 6~19 
		// 7 5이상 10이하 >> 6~9 6~8 n-1 n n+1
        Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		while(true) {
			if(num<=50) {
			int com = (int)(Math.random()*11+40); //40~50
				if(num>com) 
				System.out.println("업");
				else
				System.out.println("다운");
			
			}
			if(num<=40) {
			int com = (int)(Math.random()*11+30); //30~40
			if(num>com)
				System.out.println("업");
			else
				System.out.println("다운");
			}
			if(num<=30)
			
			int com = (int)(Math.random()*11+20); //30~20
			
			int com = (int)(Math.random()*11+10); //20~10
			
			int com = (int)(Math.random()*11+1); //1~10
			
	
//			if(com==num) {
//				System.out.println("정답!");
//				break;
//			}
//			if(com > num)
//				com = (int)(Math.random()*50+1);
//				System.out.println("업");
//			if(com < num)
//				com = (int)(Math.random()*50+1);
//				System.out.println("다운");
		}

	}

}
