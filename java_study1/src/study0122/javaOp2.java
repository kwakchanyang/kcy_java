package study0122;

public class javaOp2 {

	public static void main(String[] args) {

		// 증감 연산자 ++, -- 1씩밖에 안됨.
		
		int a = 10, b = 10, result=0;
		// ++
		System.out.println("++ 전 : " +a);
		
		a++; // a=a+1
		System.out.println("++ 후 : "+ a);
		
		
		++a;
		System.out.println(" ++a : " +a);
		
		//증감연산자의 위치가 변수앞, 변수뒤 차이
		a=10;
		result = a++; // =다음에 a++는 먼저 r=a(r에a의값을 먼저넘기고); a=a+1(증감을한다); >> 어디에 붙이냐에 따라 선순위가 다르기 때문이다. 
		// 대입연산이 우선순위가 높기 때문에 대입연산 후 증감연산을 한다.(우선순위가 낮아짐) ==나중증가
		System.out.println("result1 = a++ :" + result);
		result = ++b; // b=b+1; 먼저 r=b를 한다.(우선순위 높아짐) ==우선증가
		System.out.println("result = ++b :" +result);
		
		//증감연산자를 변수 앞에 붙이면 우선순위가 상위권
		//증감연산자를 변수 뒤에 붙이면 우선순위가 하위권
		

	}

}
