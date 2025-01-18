package task;

public class study1 {

	public static void main(String[] args) {
		
		int todaySmoke = 3; 
		int shortLife = 2; // (분)
		int smokeYear = 20; // (년)

		int Shortlifemin = todaySmoke * shortLife * smokeYear * 365;	
		int Shortlifehr = Shortlifemin / 60;
		int Shortlifeday = Shortlifehr / 24;

		System.out.println(Shortlifemin); // 총 단축된 분
		System.out.println(Shortlifehr);  // 총 단축된 시간
		System.out.println(Shortlifeday); // 총 단축된 일


	}

}
