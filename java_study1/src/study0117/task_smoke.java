package study0117;

public class task_smoke {

	public static void main(String[] args) {
		
		int todaySmoke = 4; 
		int shortLife = 2; // (분)
		int smokeYear = 20; // (년)
		int year = 365; 

		int Shortlifemin = todaySmoke * shortLife * smokeYear * year; //왜 365를 곱하나? todaySmoke * shortLife = 하루에 단축되는 수명이니까	
		int Shortlifehr = Shortlifemin / 60;
		int Shortlifeday = Shortlifehr / 24;

		System.out.println("총 단축수명(분) :" + Shortlifemin); // 총 단축된 분
		System.out.println("총 단축수명(시간) : " +Shortlifehr);  // 총 단축된 시간
		System.out.println("총 단축수명(일) : " + Shortlifeday); // 총 단축된 일
		System.out.println('총' + Shortlifemin); // '총'이라는 글자를 10진수로 변환해서 더한다.>>숫자가 나옴
//		정수끼리 계산은 답도 정수 5/2 = 2
//		둘 중 하나가 실수일  때 답도 실수가 나옴 5/2.0 = 2.5  4/2.0 = 2.0
		
	}

}
