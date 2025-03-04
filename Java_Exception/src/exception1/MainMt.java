package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
		// 예외처리 - 코드실행에 있어서 예외적인 부분을 처리하기 위한 방법
		// 예외적 상황이 발생하는 것은 올바른 실행이 이루어 지지 않아서
		// 오류 또는 에러가 발생한다.(에러는 대부분 버전이 안맞을때?)
		// 자바에서 예외처리는 오류에 대한 처리이다.
		// 예외처리는 오류를 해결하는 방법이 아닌 회피하는 방법이다.
		// (오류가 나면 프로그램이 종료되는데 종료가 되지않게 할뿐 코드수정은 못함)
		
		int a=10;
		Scanner sc = new Scanner(System.in);
		
		try { // 오류가 예상되는 코드를 try{}에 작성. 참조변수를 선언해주는(객체만드는 순간)/사용자입력순간
			System.out.println("a 변수 입력 :");
			a = sc.nextInt();
			System.out.println("나누기 전");
			System.out.println(a/2); // 오류가 나는 순간부터 catch실행
			System.out.println("나누기 후");
			
		}
		catch(ArithmeticException e) { // try안에서 문제가 생길경우 catch가 가져감.해결x e라는 변수에 오류저장
			System.out.println("0으로 나누기 하면 안돼");
		}
		catch( Exception i) {
			System.out.println("정수 입력 해야해!");
		}
		// try구문에서 오류가 발생하면 catch구문이 실행된다.
		// catch구문이 실행되려면 발생한 오류를 처리할수 있는 클래스를 
		// 가지고 있어야 한다.
		// 모든오류에 대한 것을 catch에 모두 표현 else if처럼
		System.out.println("프로그램 종료");
	
		

	}

}
