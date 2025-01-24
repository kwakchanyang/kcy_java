package study0123;

public class javaBitOp {

	public static void main(String[] args) {
		// 비트 논리 연산자
		System.out.println( 27 & 13); //and연산
		System.out.println( 27 | 13); //or연산
		System.out.println( 27 ^ 13); //xor연산
		System.out.println( ~13 ); // not연산 //부호비트가 음수로 바뀜=-13이 아니라 -14임(음수의 개수가 1개 모자라서)
		//(~-13)을 하면 양수가 되니까 12임.
		
		// 비트 쉬프트 연산자
		System.out.println(21 << 2); // << 시프트 연산자 비트를 왼쪽으로 2칸이동
		
		
	}

}
