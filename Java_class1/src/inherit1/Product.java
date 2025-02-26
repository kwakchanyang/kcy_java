package inherit1;

public abstract class Product { // 부모클래스 >> 추상메서드를 가지는 클래스는 반드시 추성클래스해야함.
	protected boolean onOff = false; // 자식클래스에서만 사용가능하게 하려면 protected붙이기//(같은 패키지에서만 사용되거나 패키지가 달라도 자식일경우는 사용가능)
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; // 제품명 - LG휘센, 캐리어A32 등
	
	public Product() { // 생성자메서드는 만들어진 공간에 초기화(초기값을줌) 메서드는 공간을 만들어주는게아님 new연산자에 의해 공간이 만들어지는것
		System.out.println("부모클래스 생성");
	}
	public Product(String brand, int price, String name) {
		this.brand=brand;
		this.price=price;
		this.name=name;
	}
	public abstract void power(); // 추상메서드
	// 자식클래스에서 오버라이딩 하기 때문에
	// 부모는 추상적인 메서드로 만들기만 하면된다(형태만있으면됨)
	// 추상메서드는 반드시 추상클래스에서만 가능
	
	// 추상 클래스는 객체 생성이 불가
	// 추상 클래스는 추상메서드를 가질수 있는 클래스이다.
	// 추상 메서드는 메모리의 크기를 얼마나 할당해야하는지
	// 측정불가하기 때문에 객체공간 할당이 안된다.
	// 객체공간 할당 받으려면 얼마의 메모리가 필요한지 측정이 되어야 된다.
	
//	{}자식쪽의 내용을 실행할것이라 부모는 내용을 가지지 않아도 됨.
//		onOff=!onOff;
//		System.out.println("전원 :"+onOff);
	
}
