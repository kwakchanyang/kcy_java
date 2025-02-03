package study0203;

public class JavaSwitch1 {

	public static void main(String[] args) {
		
		
		// switch문(범위xx 선택)
		// if문 
	
//		switch(1) { // case에는 같은 데이터형식을 넣어줘야함.
//		case 1:
//			System.out.println("1을 선택");
//			if() {
//			break;// 해당 제어문을 강제 종료 - if문 단독으로는 break사용 못함, 다른애들이랑 같이 쓸때는 가능 if에 break거는게 아니라 switch에 거는것
//			}
//			switch() {}
//			break; 
//		case 3:
//			System.out.println("3을 선택");  // switch(3)을하면 밑에있는 10까지도 나옴 >> {}안에 있기 때문에 >> break;를 해줌(강제종료)
//			break;
//		case 10:
//			System.out.println("10을 선택");
//			break;
//		}
		
		
		
		int num = 50;
		switch( num ) {
			case 10:
				System.out.println("10 선택");
				break;
			case 30:
				System.out.println("30 선택");
				break;
			case 20:
				System.out.println("case에 표현하는 데이터는 정수,문자,문자열");
				break;
			case 50:
				System.out.println("입력된 값에 맞는 case 실행은"+"break 또는 } 까지 실행");
				break;
			default:
				System.out.println("case에 없는값이야!! 다시해!!");
		}
		
		/*
		 * if(점수 <= 100 && 점수 >= 90){
		 * 		"A학점"
		 * }else if( 점수 >= 80){
		 * 		"B학점"
		 * }
		 */
		
		int 점수=79;
		switch(점수/10) {
		case 10:
		case 9:
			System.out.println("A 학점");
		case 8:
			System.out.println("B 학점");
		case 7:
			System.out.println("C 학점");
			break;
		default :
				System.out.println("F 학점");
		}
	}

}
