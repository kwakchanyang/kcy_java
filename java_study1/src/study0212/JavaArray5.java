package study0212;

public class JavaArray5 {

	public static void main(String[] args) {
		// 1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원배열이 여러개로 이루어진 구조

		// 변수를 여러개 만드는 것보다 배열을 만드는것이 좋다.
		int[] a = new int[] {3,4,5}; // 1차원배열 - 3의 크기
		int[] b = new int[] {1,20,60}; // 1차원배열 - 3의 크기
		int[] c = new int[] {23,98,54};	// 1차원배열 - 3의 크기
		// A반 학생의 성적 -> 1차원 배열
		// 1학년 전체 학생성적 -> 2차원 배열
		
//		int[][] abc = new int[2][3]; // 2는 1차원배열2개를 만들겠다. 3은 1차원배열의 크기 => 3의 크기를 가지는 1차원배열이 2개존재한다. =>데이터공간 총6개
//		int[][] abc = new int[][] {{1,2},{3,4}};
		int[][] abc = new int[][] {a,b,c}; // 위의 1차원배열들을 2차원배열안에 넣어준 형태
		System.out.println(abc[0][0]);
		System.out.println(abc[0]); // 메모리주소가 나옴
		
		int[][] arr = new int[3][4]; // 크기 3,4
		arr[0][0] = 10;
		arr[0]	[1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 50;
		arr[1][3]	 = 100;
		arr[2]	[1] = 40;
		
		for(int i=0;i<arr.length;i++) {  // arr.length하면 3이 들어옴 > arr이라는 참조변수만 가지고는 [3]까지만 접근가능 [0][1][2]에 =arr[i]에 접근한 다음에 몇개인지 알 수 있음.
			for(int k=0;k<arr[i].length;k++) { // arr[i].length를 해야 2번째 크기를 알수있음
				System.out.println(arr[i][k]);
			}
		}
		// 1차원배열 -> 향상된 for문 : for(int a : array){}
		// 2차원배열은??
		// 첫번째 방법
		for(int i=0;i<arr.length;i++) {
			for(int num : arr[i]) {   // 2번째 for문 부터만 향상된 for문 가능
				System.out.println(num);
			}
		}
		for(int[] tmp : arr) { // []붙이는 이유 > arr은 1차원배열들을 알고있는상태니까 
			for(int num : tmp) { // 
				
			}
		}
		
	}

}
