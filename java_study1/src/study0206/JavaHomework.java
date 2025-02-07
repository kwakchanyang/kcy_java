package study0206;

import java.util.Scanner;

public class JavaHomework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 내가 입력 37
		//컴퓨터가 10일때 up이라면 >(11~50)의 범위를 준다 > random()*40+11 
		// 45를 입력했을때 down이면 (11~44) random()*34+11
		// 40이면 다운이면 (11~39) random()*29+11
		// 15이면 업이다.(16~39) random()*24+16   16=15+1
		
		// 업일때와 다운일때의 숫자를 잘보자. 중복된 숫자가 뭔가 >> 공식을 만들어주는 것??
		// 15일때 범위 : (16~39) random()*24+16   16=15+1 >> 얘만봐서는 24가 어떻게 나올숫자인지 납득갈만한 숫자가 없음
		// 범위를 잘보자(16~39) 에서 (39-16)+1=24
		//  
		System.out.println("====UP & DOWN 게임(컴퓨터 버전) ====");
		System.out.println("1~50중 하나 입력:");
		int number = scan.nextInt(); //내가 입력한 숫자를 컴퓨터가 맞춘다.
		// 37입력했다면
		
		int max = 50, min=1, t=50;// t변수는 random()*t로 사용 >> +부분은 무조건 최솟값이고 최댓값은 정해지지 않아서 변수t를 만든다.
		
		while(true) {
			System.out.println("범위 : "+min+"~"+max);
			int com = (int)(Math.random()*t+min); // 20, // random식 자체가 random()*(max-min+1)+min임.이것과 비교하면서 봐봐.
			
			System.out.println("컴퓨터 :"+com);
			if(number==com) {
				System.out.println("정답!!");
				break;
			}
			if(number>com) {
				System.out.println("UP");
				min = com +1; // 업인 경우 범위의 최솟값 변경
				t = max - com; // 범위의 최대값에서 현재 값 빼면 * 값 나옴 ==>max-min+1 >> max-(com+1)+1 >> max-com
			if(number<com) {
				System.out.println("DOWN");
				max = com -1; // 다운인 경우 범위의 최대값 변경
				t = max - min + 1; // 범위의 최대값 - 최솟값 +1 하면 *값나옴
			}
		}
		
		

	}

	}}
