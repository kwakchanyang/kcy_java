package inner2;

public class MainMt {

	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		
		lc.getBirth();
		// 지역 내부클래스는 해당 메서드를 호출해야 사용가능
		
		Item item = new Item();
		item.sale();
		
		// 익명클래스는 이름이 없기 때문에 기존에 있는 클래스를 이용해서 만듦.(오버라이딩)
		// 익명클래스는 일회성임!!(객체를 한번만 사용할때 유용)
		// 일반적으로 한 번만 사용할 클래스라면 굳이 새 클래스를 만들지 않고 익명 클래스로 처리
		// 별도의 하위 클래스를 만들지 않고, 즉석에서 원하는 기능을 변경할 때 유용
		// 익명클래스 선언법 new 클래스명/인터페이스명(){...}
		// 즉석에서 인터페이스를 구현하거나 클래스를 상속받아 오버라이딩할 수 있음
		// 익명 클래스를 이용해 Item인터페이스를 즉석에서 구현하고 sale()을 오버라이딩
		// 별도의 implements Item없이 바로 객체를 생성하면서 기능정의 가능
		// let bb = function(){}   ┐얘네 둘은 이름없는함수 > 기존에있는 함수이용함.
		// let cc ()=>{}		   ┘
		
		// 정의{} + 객체생성(new)
		
		Item shoes = new Item() { // Item이라는 객체가 생성되는것이 아님
			@Override
			public void sale() {
				System.out.println("신발 판매");
			}
			
		}; // 익명클래스는 {}뒤에 ;붙이기
		// 한번더 다시 사용하려면 익명클래스 다시 정의하고 객체생성 shoes1
		// Item클래스가 부모클래스가 되고 익명클래스가 자식클래스
		shoes.sale();
		Item shoes1 = new Item() {
			@Override
			public void sale() {
				make(); // 내부에서만 사용가능
				System.out.println("신발 판매");
			}
			
			public void make() {
				System.out.println("신발 만들기");
			}
		}; // 익명클래스 다시 정의하고 객체생성
	
		shoes1.sale(); // 오버라이딩한 메서드만 사용가능
//		shoes1.make(); // 오류 - 오버라이딩된게 아니라 새로 만들어진 메서드임
		// 만드는것자체는 오류안뜸 -> Item이 부모고 익명클래스는 자식임 > 타입불일치
		// int a = 3.14(실수); > int타입으로 만드는건 가능하지만 표현가능한것은 3까지임.
		// shoes의 타입은 Item임 Item이라는 클래스가 가지고 있는것은 sale까지니까..
		// Item이라는 클래스타입으로는 make를 표현할 수 없음. 내부사용은가능


//interface Animal{ // Animal인터페이스 정의
//	public void eat(); // 추상메서드
//}

	Animal dog = new Animal() {
		@Override
		public void eat() {
			System.out.println("멍멍이가 밥을 먹는다");
		} 	
	};// 인터페이스를 implements한 익명클래스 정의와 객체	
	dog.eat();
}



@FunctionalInterface
interface Animal{ // Animal 인터페이스 정의
	public void eat(); // 추상메서드
}



// function aa(){} >> 이름있는함수
class A{
	
}
}
