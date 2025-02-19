package study0219;

public class Items { // 상품등록정보
	String name; // 상품이름       ┐
	String brands; // 상품 브랜드   │ -> 인스턴스변수
	int stocks; // 상품 수량		 ┘	

	//객체를 만들때 위의 인스턴스변수들을 초기화시키기 위해 사용하는 오버로딩에 의한 동작 메서드들
	Items(){} // 기본 생성자메서드
	Items(String name, int stocks){
		this.name=name;
		this.stocks=stocks;
	}
	Items(String name, String brands, int stocks){
		this.name=name;
		this.brands=brands;
		this.stocks=stocks;
		
		
	}
	
}
