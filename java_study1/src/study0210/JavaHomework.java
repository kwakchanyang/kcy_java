package study0210;

import java.util.Scanner;

public class JavaHomework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1,n2,n3;
		
		do { // 중복된 값 나오지 않게
			
		n1 =  (int)(Math.random()*9+1);
		n2 =  (int)(Math.random()*9+1);
		n3 =  (int)(Math.random()*9+1);
		
		}while(!(n1 != n2 && n1 !=n3 && n2 != n3)); // while문이나for문을 하면 조건식비교를 한번 더함.
		
		while(true) { // 숫자 맞출때까지 계속 입력해야 하니까 무한루프
			System.out.println("숫자 세개 :");
			int u1 = scan.nextInt();
			int u2 = scan.nextInt();
			int u3 = scan.nextInt();
			
			int str=0,ball=0; // out을 만들지 않는이유 => str+ball+out은 3을 넘지 않기 때문에 계산으로 해줌.
			//스트라이크 경우
			if( n1==u1 ) str++;
			if( n2==u2 ) str++;
			if( n3==u3 ) str++;
			
			//볼 인 경우
			if( n1==u2 || n1==u3) ball++;
			if( n2==u1 || n2==u3) ball++;
			if( n3==u1 || n3==u2) ball++;
			
			
			System.out.printf("%d스트라이크 %d볼 %d 아웃\n",str,ball,3-str-ball);
			if(str==3) break; // 3개 숫자를 맞췄다면 끝!!
		}
	}

}
