package task;

import java.util.Scanner;

public class test02024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//동전10번던져서 앞뒤맞추는게임을 만들어라
		//10번중 몇번 맞췄는지 출력해라
		int sum=0;
		for(int i=1; i<=10; i++) {
		System.out.println("1.앞,2.뒤:");
		int user = sc.nextInt();
		int coin = (int)(Math.random()*2+1);
		
		
 
		    if(user==coin) {
		
			
				sum++;
				System.out.println("컴퓨터는"+coin+"당신은"+user);
				System.out.println("맞췄습니다.");
		
			}
			else {
			System.out.println("컴퓨터는"+coin+"당신은"+user);
			System.out.println("틀렸습니다.");
			}	
			
		
		
	
		}
		System.out.println("10번중 총:"+sum+"번 맞췄습니다.");
	}
}
	
