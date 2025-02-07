package study0206;

import java.util.Scanner;

public class javaLoop4 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int user=0;
//		while(!(user>=1 && user <=3)) {
//			System.out.println("1. 가위 2.바위 3.보 : ");
//			user = sc.nextInt();
////			if( user>=1 && user <=3) break;
//		}System.out.println("가위바위보 진행");
		
		
//		------------do while로 >> 반복문의 조건식과 내용에 의해 만들어진 것이 연관성이 있다면--------------
		Scanner sc = new Scanner(System.in);
		
		int user=0;
		 do{
			System.out.println("1. 가위 2.바위 3.보 : ");
			user = sc.nextInt();
//			if( user>=1 && user <=3) break;
		}while(!(user>=1 && user <=3));
		
//		int a=100;
//		do{
//			System.out.println("do~while문");
//			a++;
//		}while(a<15); // do while은 ;붙여야함.
		
		// 초기값 -> {내용} > 조건식 비교 > 참이면 > {내용} >>> a=100이라 a<15거짓이어도 내용을 뱉어내고 조건식비교함.
//		int i=1;
//		int k=1;
//		while(i<=3) {  //i=1, k=1 k++에 의해 k=2 k++에 의해 k=3 거짓이라 위의 while로 돌아감. i=2 k=3이라 거짓이라 실행이 안됨.
		
//			while(k<=2) {
//				System.out.println("i="+i+" k="+k);
//				k++;
//			}
//			k=1; // for문은 초기값이 있기 때문에 이걸 넣어주지 않았지만 while은 넣어줘야함
//			i++;
//		}
		
//		for(int i=1; i<=3; i++) {
//			for(int k=1; k<=2; k++) {
//				System.out.println("i="+i+" k="+k);
//			}
//		}

	}

}
