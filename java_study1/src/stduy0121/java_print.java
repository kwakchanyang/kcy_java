package stduy0121;

public class java_print {

	public static void main(String[] args) {
		System.out.println("한줄에 하나씩 출력 !@##@");
		System.out.print("한줄에\n 이어서 출력");
		System.out.print("그다음 이어서 출력");

		System.out.printf("그냥 print처럼 사용 가능");  //f는 format의 약자
		System.out.printf("println 처럼 \n 하려면 \n"); // \n은 엔터역할
		System.out.printf("다음줄에 \n 출력  \n");
		System.out.printf("%d \n",100); // %d는 ,뒤에 있는 100(데이터)를 대신해서 표현하기 위함.
		System.out.printf("%% \n"); //%출력하고 싶을  때는 %%두번 써주기. %만 쓰면 오류남.
		
		//형식 지정자를 사용하기 위해 주의 할것
		//1. 형식지정자와 데이터 위치를 맞춰야 한다.
		System.out.printf("%d %f \n",100,3.14);
		
		//2. 형식 지정자와 데이터 개수 맞추기
		System.out.printf("%d %d %d \n",10,20,30);
		
		System.out.println(2025+"년" + 1 + "월" + 21 + "일");
		System.out.printf("%d년 %d월 %d일 \n", 2025,1,21);
		
		float fnum = 5.1234f;
		System.out.println("println 출력:" + fnum); //5.1만 출력해라 불가능
		System.out.printf("printf 출력 %.1f \n",fnum); //.1 > .뒤로 한자리만 출력해라 > 5.1출력가능
		
		int num =15;
		System.out.println(num);
		System.out.printf("%4d\n",num); //%4d 정수를4자리확보하고 오른쪽정렬
		System.out.printf("오늘은 %d일입니다",21);
	}

}


/*
 * 	형식 지정자 (서식문자)
 * 	%d,%i - 10진수 정수
 *  %f - 10진수 시수
 *  %c - 문자
 *  %s - 문자열
 *  %b - boolean 타입
 * 
 */
 
 