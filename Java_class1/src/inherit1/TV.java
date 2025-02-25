package inherit1;

public class TV extends Product{ // 자식 클래스
	
	public TV(){ // TV객체를 만들면 부모객체(Product)도 같이 생성됨 > TV안에 Product생김
//		super(); // 부모클래스의 객체 >> 얘가 사실상 생략되어 있음.
	}; // 
	public TV(String brand, int price, String name) {
//		super();
//		super.brand=brand;  > 원래는 이 방식인데 this로 접근할수있게함
		this.brand=brand;
		this.price=price;
		this.name=name;
	}
}
