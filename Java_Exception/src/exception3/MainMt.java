package exception3;

public class MainMt {

	public static void main(String[] args) {
		
		int[]arr = {10,40,50,30};
		
		try {
			System.out.println(arr[5]);
		}catch(Exception e) {
			System.out.println("인덱스 범위 벗어남");
			e.printStackTrace();
		}
		
		
		String str="123ab";
		int num=0;
		try {			  
			num = Integer.parseInt(str);// Integer.parseInt는 문자열 -> 정수변환		
		}catch(Exception e) {
			System.out.println("정수로 변환 불가 - 정수만 입력");	
		}System.out.println(" 정수 : " + num); // num은 try의 지역변수라 벗어나지 못함 그래서 num이 지역변수가 안되게 밖으로 빼주기
		
		
		String word = "good Bye!!";
//		0이상의 값이 들어온다는 보장이 없으니까 둘다 try catch해주기 (인덱스가 올바르게 표현되지 않을수있다. -1나올수있음)
//		word가 null이라면 substring에서부터 오류가남.
		
		try {
			System.out.println(word.substring(word.indexOf("B")));
		}catch(Exception e) {			
			System.out.println("존재하지 않는 문자야!");
		}
		try {
			System.out.println(word.substring(word.indexOf("m")));
		}catch(Exception e) {
			System.out.println();
		}
		
	}

}
