package inner1;

public class MainMt {

	public static void main(String[] args) {
		
//		Test.A = new Test.A();
		Test t = new Test(); // test객체를 먼저 만들고 나서 A객체를 만들수있다.
		
//		t.a.num=10; // > 클래스 바깥쪽에서 표현되므로 내부클래스가 노출된상태임 .접근연산자를 2개 썼다??포함or내부
		
		t.setNum(10); // 메서드를 만들어서 a를 감춘다. 
		t.innerView(); 
		
//		Test.A a = t.new A();
//		a.num = 10; 
//		t.num=20; // num은 A클래스 통해서만 접근할수있음 // t.a.num=20;도 불가능
		
		// 정적 내부클래스를 굳이 노출 하면서 객체를 만들고자 한다면
		Test.Dog dof = new Test.Dog();
		
		Test.origin(); //static클래스는 객체안만들고 실행가능함 /클래스 메서드실행은 객체생성없이 가능하다.
	}

}
