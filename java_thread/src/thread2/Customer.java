package thread2;

import java.util.Random;

//						┌추상 메서드라서 오버라이딩 해야함 
public class Customer implements Runnable{ // 손님
	private Cafe cafe;
	private final String[] menu = {"아메리카노","키워주스","라떼","아인슈페너"};
	private final Random random = new Random();
	
	public Customer(Cafe cafe) {
		this.cafe=cafe;
	}

	
	
	@Override
	public void run() {
		try {
			while(true) {
				String item = menu[random.nextInt(menu.length)];
				cafe.placeOrder(item);
// 스레드가 하나였다면 대기상태 필요없다 > 스레드가 여러개니까 하나의 프로그램에서 동작하지만 공통으로 사용하는 영역을 사용하려면 순서를 기다려야함(대기상태로 만들기)
				Thread.sleep(2000); 
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
