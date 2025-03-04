package inner2;

public class LocalClass {
	
	private String name; // 인스턴스 변수
	// 인스턴스란?
	// 인스턴스는 클래스의 구체적인 구현체를 의미합니다. 즉, 클래스를 기반으로 생성된 객체를 인스턴스라고 합니다. 클래스는 객체의 설계도나 청사진과 같고,
	// 인스턴스는 그 설계도를 바탕으로 실제로 메모리에 생성된 객체입니다.
	// ✔ 모든 데이터를 공유해야 한다면 static 메서드를 사용하면 간결함
	// ✔ 하지만, 객체마다 독립적인 값을 유지해야 한다면 인스턴스 메서드를 써야 함
	// ✔ 객체 지향 프로그래밍을 활용하려면 인스턴스 메서드는 필수!
	//Java에서 캡슐화를 위해 private 필드를 직접 접근하지 않고,
	// getter와 setter 메서드를 통해 값을 읽거나 변경하는 방식으로 사용
	
//	Birth bb = new Birth(); >> 외부에서 사용불가 - 정의되어 있지 않기 때문에
	
//	반환 타입이 void가 아니면 return 필요
	public void getBirth() { // 인스턴스 메서드(객체생성후 호출가능)
		
		class Birth{ // 지역 내부 클래스(잠시만 사용할때) >> getBirth안에서만 사용가능
			int year;
			int month;
		}
		Birth b = new Birth(); // 지역클래스 객체 생성
		b.year=2000;
		b.month=4;
		System.out.println(b.year+" "+b.month);
	}
	
	public String getName() { // 인스턴스 메서드(객체생성후 사용가능)
		return name;
	}

	public void setName(String name) {// 인스턴스 메서드(객체생성후 사용가능)
		this.name = name;
	}
	
	
}
