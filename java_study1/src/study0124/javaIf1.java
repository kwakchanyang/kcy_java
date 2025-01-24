package study0124;

public class javaIf1 {

	public static void main(String[] args) {
		//  바이킹 탑승 - 키가 140이상만 탑승
		int tall = 163;
		// if문에는 조건식이 반드시 if뒤에 붙어야 한다.
		if( tall >= 140 ){ // 중괄호에는 조건에 따라 실행될 내용작성
			System.out.println("탑승가능");
			System.out.println("키가 140이상이다.");
			int a=10;
			a =132+2;	
			
		}else { //else는 조건식이 거짓일경우 실행
			System.out.println("탑승불가");
		}

		// 두 숫자중 큰 수는?
		int num1 =35, num2 = 12;
		if (num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
		//철수와 민수 중 누구 발이 더 큰가?
		int 철수=275, 민수=260;
		if( 철수 > 민수) {
			System.out.println("철수가 발이 더 크다.");
		}else {
			System.out.println("민수가 발이 더 크다.");
		}
		
		//편의점에서 도시락 사먹는데, 가격이 5200원이다.
		// 내 통장 잔액이 4530원이라면, 얼마가 더 필요한가?
		// 잔액이 충문하다면 이체 할 필요가 없다.
		
		int money = 4530;
		if (money < 5200) {
			int money1 = 5200-money; // 이걸 여러번 사용해야 될때 변수를 만들면 좋다. 한번만 사용할거면 (5200-money)해주기
			System.out.println(money1+"이 부족합니다.");
		}else {
			System.out.println("도시락을 먹을 수 있습니다.");
		}
		
		// 바이킹 탑승 조건 - 키가 140이상 190이하만 가능
		// 키의 변수는 tall
		if (tall>=140 && tall<=190){
			System.out.println("탑승조건");
		}else {
			System.out.println("탑승불가");
		}
		
		// 후룸라이드 탑승하려면 키가 130이상 이거나 몸무게45kg이상만 가능
		tall=140;
		int wg = 35;
		if(wg <45 && tall < 130) {
			System.out.println("탑승불가");
			
		}else {
			System.out.println("탑승가능");
		}
	}

}
