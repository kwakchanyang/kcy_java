package thread2;

import java.nio.channels.InterruptedByTimeoutException;

public class Cafe {
	private Order order;
	private boolean orderPlace = false; // 주문했냐(true)안했냐(false) // 명시적 초기화(변수선언동시에 값 넣어줌)
	
	public synchronized void placeOrder(String menu) throws InterruptedException{ // 매장에서 먹기
		while(orderPlace) { // 제조하는 동안 손님대기
			wait();
		}
		order = new Order(menu);
		System.out.println("손님 매장주문 : "+order.getOrderId()+
				" - "+order.getMenu());
		orderPlace = true; // 주문했을때
		notify(); // 주문이 들어갔으니까 바리스타를 실행
	}
//	public void takeOrder(String menu) { // 포장해 가기
//		order = new Order(menu);
//		System.out.println("손님 포장주문 :"+order.getOrderId()+
//				" - "+order.getMenu());
//	}
	public synchronized Order give() throws InterruptedException{ // give를 쓰는애는 바리스타
		while(!orderPlace) { 
			wait();	// 주문이 들어오기 전까지 바리스타는 대기	 // wait있는쪽에서 notify하는거 아님!!
		}
		orderPlace  = false;
		notify();
		return order;
	}
}

// wait()과 notify()의 동기화 문제 > 속도문제(보내는사람과 받는사람의 속도를 맞춰야함) > wait과 notify가 들어있는 메서드 모두 synchronized 둘다 넣어주기
// A라는 스레드에 의해서 다른 스레드에 영향을 준다? >> 동기화 해줘야함.
// 비동기함수는 상대방의 속도가 어떻든지 내할일을 하겠다 느낌?//
// 바리스타가 실행중이면 손님에게 대기를 걸어주기