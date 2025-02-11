package study0211;

import java.util.Arrays;
import java.util.Collections;

public class JavaArray3 {

	public static void main(String[] args) {

//		int[]number = new int[] {10,20,30,44,55,66,100,2323};
//		
//		for(int num : number) {
//			System.out.println(num); 
//		}
////		 배열의 인덱스 사용 불가 => 인덱스활용이 아니라 배열에 있는 데이터를 순차적으로 꺼내서 저장한것이기 때문에
////		 배열의 데이터를 변경하거나 삭제 불가
////		 특정값을 찾아내거나 출력할때 사용함
		
		// 문제 
		// tall 배열은 A반학생들의 키를 저장한것이다.
		// A반의 평균키 보다 큰 키를 찾아서 출력하세요.
//		float[] tall = new float[] {167.2f, 163.4f, 175.7f, 173.8f, 158.3f};
//		
//		float avg=0,sum=0;
//		for(float aStudent : tall) {
//			sum = sum + aStudent; // 총합 구하기
//		}
//		avg = sum / tall.length; // 평균 구하기
//		
//		for(float aStudent : tall) {
//			if( avg <= aStudent)
//				System.out.println(aStudent);				
//		}
		
		// 배열 관련 메서드
		
		int[] num = new int[] {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(num));
		// 자바에서 데이터 출력 메서드이름은 toString
		
		int[] a = new int[7];
		System.out.println(Arrays.toString(a)); // 비어있어서 0만나옴
		
		// 배열 복사
		// arraycopy( 복사배열, 복사배열시작인덱스, 저장배열, 저장시작인덱스, 크기(개수));
		System.arraycopy(num, 0, a, 0, num.length);
		System.out.println(Arrays.toString(a));
		
		// 배열 비교
		boolean isSame = Arrays.equals(num, a);// for문 만들어서 넣어줄 필요 없음
		System.out.println(isSame );
		
		// 배열 정렬
		int[] arr = new int[] {34,223,5,645,64,43,9999,860,72,12,59875,533};
		System.out.println("===정렬전===");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("-----정렬후-----");
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {5,4,1,2,3};
		
		Arrays.sort(arr2,Collections.reverseOrder());
		System.out.println(arr2);
		// comparator구현 필요 : 기본데이터타입(arr)을 안되고 클래스타입(arr2)만됨.
		// 클래스 Interger,String..등등
		
		String[] names = {"이순신","이성계","김춘추","정약용","문인적"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names,Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		
		
		
		
		
}
}
