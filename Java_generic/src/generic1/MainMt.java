package generic1;

public class MainMt {

	public static void main(String[] args) {
		
//		Drink d = new Drink(); //타입지정안해서 d.하면 최상위 타입인 object뜸
		Drink<String> d = new Drink<String>(); // T자리에 어떤 타입을 쓸건지
		d.name = "토마토주스";
		d.ml = 350;
		d.경림추천("토마토");
		
		Integer m; // int 기본타입의 자바 클래스명
		Float f; // float기본타입의 자바 클래스명
		Double D;// double 기본타입의 자바 클래스명
		Byte bt; // Byte 기본타입의 자바 클래스명
		Short s;// short 기본타입의 자바 클래스명
		Character c;//char 기본타입의 자바 클래스명
		Boolean bl; // Boolean 기본타입의 자바 클래스명
		Long lg;// long 기본타입의 자바 클래스명
	}

}

/*
	제네릭 - 속에 특유한, 속명  상표명 - 일반명
		 - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방법
		 - 제네릭 타입으로는 무조건 클래스타입, 인터페이스만 가능(int,float등등 안됨!)
-> int : Integer 클래스
		 
		 class A{  
		 	int num;
		 	float fnum;
		 	String name;
		 }
		 class B{
		  	int 




*/