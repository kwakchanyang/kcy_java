package inherit1;

public class JavaInherit1 {

	public static void main(String[] args) {
		
		TV tv = new TV();
//		tv.onOff=true; // 전원 on
		
		Computer com = new Computer();
//		com.onOff=true; // 전원 on
		
		tv.power(); // 전원 on true
		tv.power(); // 전원 off false
		tv.brand="삼성";
		tv.price = 1200000;
		tv.name="OLED";
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