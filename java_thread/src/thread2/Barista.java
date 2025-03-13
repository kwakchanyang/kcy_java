package thread2;

public class Barista implements Runnable{
	private final Cafe cafe; // 바리스타가 일하는 카페 
	// final을 붙이는 이유 : 실수로 값이 변경되지 않게 하기 위해 > 그냥참조변수니까 run에서도 변경이 가능cafe = new Cafe(); 을 하지 못함. final에 값 넣을수있는 시기는 딱 한군데 : 초기화단계(this.cafe=cafe;)
	
	public Barista(Cafe cafe) { // 생성자메서드 통한 초기화 // 바리스타가 일하는 카페를 넣어줘야 주문을 받지!!
		this.cafe=cafe;
	}


	@Override
	public void run() { // 제조하기 위한 내용 - 주문전까지는 대기(sleep으로 시간걸면 내가 시간을 설정해야 하는데? 손님이 언제 주문할줄알고?? 
//							-> wait쓰하다가 손님이 주문을 하면 그때 준비하다가 실행 시작 
		try {
			while(true) {
				Order order = cafe.give();
				System.out.println("바리스타 제조 : "+order.getOrderId()+
						" - "+order.getMenu());
				Thread.sleep(3000); // 그냥 주문 시간 설정만한거 nullpointer와 상관없음
				System.out.println("바리스타 제조완료 : "+order.getMenu());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
