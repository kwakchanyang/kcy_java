package study0207;

import java.util.Scanner;

public class JavaTest2 {

	public static void main(String[] args) {
		/*
		 * 문제 4
		 * *
		 * **
		 * ***
		 * 별을 위와 같이 출력하세요
		 * 힌트>첫번째 줄이라서 별한개 두번째 줄이라서 별 두개 세번째줄이라서 별세개(이중for문)
		 * 
		 *
		 */
		
//		for(int i=1; i<=3;i++) {
//			System.out.println("");
//			for(int a=1; a<=i;a++)
//			System.out.printf("*");
////		}
//		
////		-------------교수님 답------------------
//		for(int line=1;line<=3;line++) {
//			for(int star=1;star<=line;star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		/*
		 * 문제 5
		 * 
		 * 0 1 2 3
		 * 4 5 6 7 
		 * 8 9 10 11
		 * 숫자를 위와 같이 출력하세요(이중for문)
		 * 
		 * 
		 */
//		int num=0;
//		for(int i=0;i<=2;i++) { // 줄만 바꿔줌
//			System.out.println(" ");
//			for(int i=1;i<=4;i++) {
//			System.out.printf((num++)+" ");
		
////		-------------------교수님 답------------------------
//		
//		for(int i=0;i<=2;i++) {
//			for(int k=i*4; k<=(i*4)+3;k++) // 위에 사용된변수를 안쪽에서도 사용할 수 있다.
//				System.out.println(k+" ");
//		System.out.println();
//	}
//		
		
		
		
		
		
		/*
		 * 문제 6
		 * 
		 * 비밀번호는 4자리로 구성되어있다. (총 숫자가 4개라는 뜻)
		 * 비밀번호 각각의 숫자는 1~9중 하나이고, 중복없다.1125불가능
		 * 첫번째 숫자는 네번째 숫자보다 2만큼 크다.
		 * 두번째 숫자는 세번째 숫자보다 작다.
		 * 비밀번호와 비밀번호 역순의 숫자를 더하기 하면 16566이다. 예)1234+4321
		 * 위 조건을 모두 충족하는 비밀번호 출력
		 * 힌트)for문 4개필요
		 * 
		 */
			
		
//		for(int a=1; a<=9; a++) {
//			for(int b=1; b<=9;b++) {				
//				for(int c=1; c<=9; c++) {				
//					for(int d=1; d<=9; d++) {
//						if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d) {
//							if(a==d+2) {
//								if(b<c) {  // 두 번째 숫자가 세번째보다 작다.
//									int pw = a*1000+b*100+c*10+d;
//									int rPw = d*1000+c*100+b*100+a;
//									if((pw+rPw)==16566) {
//										System.out.println(pw);
//										break;
//									}
//								}
//						}
//						
//					}
//				}
//			}
//		}
//	

//	}
		
		
		
		/* 문제 7. - 알파벳 찾기(반드시 반복문 사용해서)
		 * 			알파벳 (대문자 또는 소문자 모두 가능하게) 입력
		 * 			입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시 for문으로	
		 * 			알파벳 개수는 한정되어 있음(26개)
		 * 
		 * 
		 * 
		 *  
		 */
		
//		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 입력:");
		char alp=sc.nextLine().charAt(0);
		// 아스키 코드에서 A - 65(10진수), a - 97(10진수)  97-65=32의 차이가 있음. A+32=97(a)가됨.
		
		for(int i =1;i<=26;i++) { // 알파벳의 개수는 26개
			if(alp==(i+64) || alp==(i+96)) { // 소문자,대문자둘다 순서 같게 해줌 t=20이 나오고 T도20이 나오도록
				System.out.printf("알파벳 %c 는 %d번째 알파벳\n",alp,i);
			}
		}
		
		
		
			
				
//			}
//		}
//		
//		
		
		
		
		/* 
		 * 
		 * 오늘의 과제 - 숫자 야구
		 * 
		 * 1~9 중의 임의의 숫자 3개를 뽑아낸다.(중복없이)
		 * 3개의 숫자를 맞추기 해야한다.
		 * 예) 임의의 숫자 - 7 1 8(얘랑 비교해서 입력한 숫자를 보는것)
		 * 스트라이크-자리,숫자 둘다 맞음 /볼- 숫자는 맞음/아웃-둘다틀림
		 * 입력 : 1 2 3
		 * 결과 : 0스트라이크 1볼 2아웃
		 * 입력 : 4 7 9 
		 * 결과 : 0스트라이크 1볼 2아웃
		 * 입력 : 4 1 8
		 * 결과 : 2스트라이크 0볼 1아웃
		 * 
		 * 맟추면 3스트라이크
		 *
		 *
		 */
		
		

		
		
		
		
	}
}


