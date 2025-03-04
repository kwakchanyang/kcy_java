package exception2;

public class MainMt {

	public static void main(String[] args) {

//		int[] arr = new int[] {1,2,3,4};
//		try {
//		System.out.println(arr[6]);
//		}catch(Exception e){
//			System.out.println("인덱스 범위 벗어남");
//			e.printStackTrace();// 개발단계일때 개발자가 오류를 확인할 수 있음.(진짜 오류가 뭔지 알 수 있음)
//								// 개발이 끝났을때는 사용자가 보지 않도록 주석걸기
//		}
		
		String name = null;
		try {
//							     ┌참조변수를 사용할경우 무조건 값이 있는건 아님(null이 있는경우 오류임)	
			if(name!=null || name.equals("이순신")) {
				System.out.println("이순신이다.");
			}else {
				System.out.println("아니다.");
			}
		
		}catch(Exception e) {
			System.out.println("이름입력해라!");
			System.out.println(e.getMessage());
		}
	}

}
 