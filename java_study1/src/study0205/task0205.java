package study0205;



import java.util.Scanner;



public class task0205 {



	public static void main(String[] args) {

		// 오늘의 과제

		// 1~50중 하나를 내가 입력한다.

		// 내가 입력한 숫자를 컴퓨터가 맞춰야한다(random사용)

		// 무작위로 맞추는게 아니고 범위를 좁히면서 맞출 수 있도록 해야한다.


        Scanner scan = new Scanner(System.in);

		

		System.out.printf("정수 입력 : ");

		int num = scan.nextInt();
		int com;
		

		while(true) {

			if(num>=40&&num<=50) {
				com = (int)(Math.random()*11+40); //40~50
			}
			else if(num>=30) {
				com = (int)(Math.random()*10+30); //30~39
			}
			else if(num>=20) {
				com = (int)(Math.random()*10+20);  // 20~29
			}
			else if(num>=10) {
				com = (int)(Math.random()*10+10); // 10~19
			}		
			else {
				com = (int)(Math.random()*9+1); //1~9 		
			}
			System.out.println(com);
			
//			if(com > num)
//			System.out.println("다운");
//			if(com < num)
//			System.out.println("업");
			
			if(num==com) {
				System.out.println("정답!");
				break;
			}
		}
	}
}