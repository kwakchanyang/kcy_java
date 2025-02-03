package task;

import java.util.Scanner;

public class testIf0203 {

	public static void main(String[] args) {
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
