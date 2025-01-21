package study0120;

public class task2 {
	public static void main(String[] args) {
//	사과상자에 사과가 20개 들어있다. 
// 	오렌지 상자에 오렌지가 15개 들어 있다.
// 	사과 상자는 11개, 오렌지 상자는 12개 있다면 
// 	과일은 총 몇개 인가? 
// 	(출력결과는 친절하게~~~~)
	
			
 	int apple=20;
	int orange=15;

	int appleBox=11;  //두번째 단어부터는 대문자로
	int orangeBox=12;
	
	int totalApple=apple * appleBox;
	int totalOrange=orange * orangeBox;
	
	int totalFruits=totalApple + totalOrange;
	
	System.out.println("사과 총 갯수 :"+ totalApple);
	System.out.println("오렌지 총 갯수 :"+ totalOrange);
	System.out.println("총 과일의 개수는"+totalFruits+"개입니다");
}
}