package inherit1;

public class TV extends Product{ // 자식 클래스
	
	public TV(){ // TV객체를 만들면 부모객체(Product)도 같이 생성됨 > TV안에 Product생김
		super(); // 부모클래스생성자메서드가 반드시 먼저 실행됨.
		//super는 부모클래스의 객체 super();부모클래스생성자메서드
		System.out.println("자식클래스생성");
	}; // 
	public TV(String brand, int price, String name) {
		super(brand,price,name);
//		super.brand=brand;  //> 원래는 이 방식인데 this로 접근할수있게함 this.brand=brand;도 가능
//		super.brand=brand; // 부모쪽에있는걸 사용하는경우에는 super을 써서 부모를 사용했다는걸 명시

	}
	
	// 오버라이딩
	// 상속관계인 경우, 인터페이스implements인 경우에 사용
	// 성립조건
	// 1. 메서드의 원형은 그대로 유지
	// 2. 내용만 변경한다.
	// 3. 상속또는 implements인 경우에만 가능
	
	@Override
	public void power() { // 메서드를 새로만들어낸것이 아님!! 재정의임
		onOff=!onOff; // 부모쪽이 아닌 자식에서 재정의해준걸 교체해서 실행한다.
		System.out.println("TV전원: "+onOff);
	}
}
