package inherit1;

public class JavaInherit1 {

	public static void main(String[] args) {
		// main > TV()호출 > Product() > product끝나고 tv끝나고 지워짐 > tv초기화(a=10,b=20)전 product가 먼저 실행
//		tv에 product가 생성되는거라 tv가 상속되면(확장) > 이때 product가 초기화되고 //호출된건 자식먼저지만 공간자체의 초기화순서는 부모먼저임(바꿀수없음)
//		tv안의 부모(super)가 제일위에 있어야함 > 부모가 먼저 초기화해야함. > 그후에 a=10,b=20으로 tv가 초기화
//		TV tv = new TV();
////		tv.onOff=true; // 전원 on
//		
//		tv.power(); // 전원 on true
//		tv.power(); // 전원 off false
//		tv.brand="삼성";
//		tv.price = 1200000;
//		tv.name="OLED";
//		
//		Computer com = new Computer();
//		com.onOff=true; // 전원 on
		
		TV tv = new TV("삼성",950000,"st60");
		Aircon air = new Aircon("캐리어",542000,"ca18t");
		Computer com = new Computer("삼성",173000,"매직스테이션10");
		
		tv.power();
		air.power();
		com.power();
		
//		Product p = new Product();
	}

}

/* 상속 - 클래스들의 관계를 부모-자식 관계로 설정한다. 상속-확장(extends)
	부모클래스의 변수 또는 메서드를 자식 클래스에서 사용가능하다.
	여러 클래스들의 공통요소를 부모클래스로 구성한다.
	예) TV, 컴퓨터, 냉장고, 에어컨
		전기(파워), 플러그, 가격, 브랜드, 등등등
		가전제품 부모클래스 에 파워,가격,브랜드를 정의한다. > 부모가 가진걸 자식이 사용할 수 있다.
		
		다향성 - 다양한 형태
			TV t = new TV();
			computer com = new computer();
			
			가전제품 tv = new TV(); // 부모라서 자식을 품을수있음 . 하나의 타입으로 여러종류의 객체를 표현가능
		
	css에서 글자색을 red로 설정한다.
	<div id="a">
		<div class="b"></div>
		<ul class="c"></ul>
		<p class="d"></p>
	</div>
	
	.b{color:red} .c{color:red;} .d{color:red;} 를 하지않고 상위태그(부모태그에게)
	#a{color:red;}를 해주면 된다.
	

*/