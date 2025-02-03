package study0203;

import java.util.Scanner;

public class javaIf4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		double num = Math.random(); //랜덤값(난수)발생 >> 값의 범위가 0.0000... ~ 0.9999....(0부터1미만)라서 double해줘야함
		
		// 곱하기 계산과 더하기 계산으로 범위를 지정할 수 있다.
//		int num = (int)(Math.random()*10)+1; // ()가 가장먼저 실행 > Math를 형변환한거라 0만 나오는데 여기에 *10을 하니까 0만 나옴. >> 괄호로 묶어주기
//		System.out.println(num);  // 내가 구하고자 하는 범위가 n이면 곱하기(n+1)을 하면됨. ex) 0부터 31이 나오게 하겠다 >> 32를 곱하기 
//								  // 1부터10까지 나오게 하려면?? random*10(큰범위)+1(가장작은범위)
//								  // 7에서 13까지 ?? random*7((큰범위-작은범위)+1) + 7(가장작은범위)
//								  // 21부터 57까지 random*37 +21
//								  //37부터 121까지 random*85 + 37
//		int user=0,coin=0;
//		System.out.print("1.앞면, 2. 뒷면 :");
//		user = sc.nextInt();
//		
//		coin = (int)(Math.random()*2+1);
//		
//		if(user == coin) {
//			System.out.println("정답!!");
//		}else {
//			System.out.println("땡!!");
//		}
		
		// 컴퓨터가 동전을 15개를 가지고 있다.(1~15) 
		// 컴퓨터가 제시한 동전갯수가 짝인지 홀인지 맞추는 게임을 만드세요.
		// 1.짝 2. 홀
		
//		int user=0,coin=0;
//		System.out.println("1. 짝,2. 홀:");
//		user = sc.nextInt();
//		
//		coin = (int)(Math.random()*15+1);
//		
//		String res;
//		
//		if(coin%2==0) {		
//			res = (user==1) ? "정답!!" : "땡!!";	
//			
//		}else {
//			res = (user==2) ? "정답!" : "땡!!";
//		}
//		System.out.println(res);
//		System.out.println(coin);
//		----------------------------------------------------------------------------
//		System.out.println("1. 짝,2. 홀 :");
//		int user = sc.nextInt();
//		
//		int com = (int)(Math.random()*15+1);
//		if(com%2==0 && user==1) {
//			System.out.println("짝이다! 정답!!");
//			
//		}else if(com%2==1 && user ==2){
//			System.out.println("홀이다! 정답!!");
//		}else {
//			System.out.println("땡!!!");
//		}
		
		// 주사위게임 (육면체) (1~6)
		// 컴퓨터가 주사위를 던진다.
		// 주사위값이 3이하라면 작은값, 주사위값이 4이상이라면 큰값이다.
		// 1. 작다 2. 크다
		// 주사위값이 작은값인지 큰값인지 맞추세요
		
		System.out.println("1.작다, 2.크다 :");
		int user = sc.nextInt();
		
		int com = (int)(Math.random()*6+1);
		
		if( user==1 || user==2) {  // 사용자가 입력한 값이 1,2인지 판단만 한것일 뿐이지 딱 1이다,2다 확정한것이 아님.
			if(com <= 3 && user == 1) 
				System.out.println("3이하이므로 작은값이다"+"주사위값은"+com);
			else if(com >= 4 && user == 2)
				System.out.println("4이상이므로 큰값이다!"+"주사위값은:"+com);
			else
				System.out.println("땡!!"+"주사위값은"+com);
				
		}else {
			System.out.println("잘못입력했습니다.");
		}
	}

}
