package study0203;

import java.util.Scanner;

public class test0203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
 		과제!! 2월 3일
 		
 		가위바위보 게임 만들기
 		1.가위  2.바위  3.보  
 		내가 이겼는지 , 졌는지 ,비겼는지  출력
 */
		System.out.println("1. 가위, 2. 바위, 3. 보 : ");
		int user = sc.nextInt();
		int win = (int)(Math.random()*3+1);
		
		
		

	}

}
