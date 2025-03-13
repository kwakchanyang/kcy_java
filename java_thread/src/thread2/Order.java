package thread2;

import lombok.Getter;


@Getter
//@RequiredArgsConstructor // final붙어있는 변수만 생성자메서드에서 매개변수로 받아서 생성됨 > Order(int orderId, String menu){}
public class Order {
	private static int counter=1;
	private final int orderId; // 주문번호
	private final String menu; // 주분메뉴
	
	public Order(String menu) {
		this.orderId=counter++;
		this.menu=menu;
	}
}
