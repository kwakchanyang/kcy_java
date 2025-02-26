package customer;

import store.Fruit;

public class Buyer {
	private int money;
	private Fruit item;			// 구매한 음료 또는 컵과일 저장 변수
	
	public Buyer(int money) { // Buyer객체생성시 동작할 메서드 생성
		this.money = money;   //기본생성자 메서드가 없으니 public Buyer(){}; > 값을 꼭 넣어야함
		
	}
//	set, get 메서드 (오른쪽 클릭 > source > generate getters > 모두 체크 > generate

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public void setItem(Fruit item) {
		this.item = item;
	}

	
	public String toString() {
		return ("보유머니: "+money+"원");
	}
	
}
