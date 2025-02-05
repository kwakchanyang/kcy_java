package study0204;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 가위, 2. 바위 ,3. 보:");
		int me = sc.nextInt(); //키보드를 통해 입력
		
		int com = (int)(Math.random()*3+1); // 1~3 랜덤값

		
//		switch문으로 풀기
		switch(me-com) {
		case 0:
			System.out.println("비김");
			break;
		case -2: case 1:
			System.out.println("이김");
			break;
		case -1: case 2:
			System.out.println("패배...");
			break;
		}
		
		
		
		
//		if문으로 풀기
//		if(me==com) {   // 서로 같은 값이면 비김
//			System.out.println("비김");
//		}else if((me==1 && com==3) || (me==2 && com==1) || (me==3 && com==2))
//			System.out.println("이김");
//		else
//			System.out.println("패배....");

	}

}
