package innerTest;

public class Car { 
	private Tire tire; // private은 set,get??
//// private Tire tire=new Tire(); >> 직접타이어를 여기서 만들겠다는 얘기
//// 타이어를 다 만들고 자동차에 끼지 자동차완성시킬때 같이 만들지 않음
//// 초기화를 하지 않는다!
//	
//	
//	// 매개변수통해서 가져온다는것은 Tire객체를 외부에서 가져온다는의미
//	// 포함관계는 외부에서 완성시켜놓은걸 가져와야함
//	public Car(Tire tire) { 
//		this.tire=tire;
//	} // >> 꼭 이렇게 생성자메서드로 가져올필요는 없음 set,get사용
//	// 포함관계에서 클래스객체 생성시기
	
	public Car(Tire tire) {
		this.tire=tire;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
}
