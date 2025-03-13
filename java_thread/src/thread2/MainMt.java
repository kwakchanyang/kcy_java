package thread2;

public class MainMt {

	public static void main(String[] args) {
		
//		Customer c1 = new Customer();
//		c1.start(); -> 안됨
		
//		Runnable을 사용하더라도 Thread사용해야함 > 인터페이스(Runnable)로는 객체생성못함 , Runnable은 run()메서드 하나밖에 없음 > start()을 호출해야 run이 실행되기 때문에 나머지 기능을 다 갖고 있는 Thread사용해야함
//		그럼에도 Runnable을 쓰는 이유는? 내가 기능을 안만들어줘도 됨 > 편하게 사용가능

		Cafe cafe = new Cafe(); // 카페 오픈
		
		Thread barista = new Thread(new Barista(cafe)); // 위에서 생성한 cafe에서 일하는 바리스타다 cafe를 barista에 부여
		Thread customer = new Thread(new Customer(cafe));  //이 카페에 방문한 손님이다.
		
		barista.start(); // 바리스타 스레드 시작 - 제조할 준비 완료
		customer.start(); // 손님 스레드 시작 - 주문할 결심
		// 바리스타와 손님스레드중에 뭐가 먼저 실행될지 모름 > 만약 손님스레드가 주문하기저넹 바리스타스레드가 먼저 동작한다면 어떤 오류 ??
		// 바리스타 클래스의 order.getOrderId()+" - "+order.getMenu()); 주문이 들어와야 객체가 만들어짐(placeOrder실행되고 order객체 만들어짐). 여기부터 오류 null값이 들어감 > nullPoinException오류뜸
		// 
		
	}

}

// 카페에서 손님이 주문한다.
// 주문을 하면 바리스타가 제조한다.
// 	몇명의 손님이 주문하든지 주문한 순서대로 바리스타들이 제조해야 한다.
//  주문은 여러번 받을 수 있지만 바리스타는 한정되어있음.



// Thread상속 
// Runnable 