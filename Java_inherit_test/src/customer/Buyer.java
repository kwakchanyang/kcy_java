package customer;

import java.util.Date;

import store.Fruit;

public class Buyer { // public final class하면 final은 변경불가
// 자식클래스는 부모를 다 변경해서 사용하기에 final붙이면 상속불가(부모클래스될수없음)
	private Fruit item;			// 구매한 음료 또는 컵과일 저장 변수
	private Date buyDate;
	private int money;
	
	public Buyer(int money) { // Buyer객체생성시 동작할 메서드 생성
		this.money = money;   //기본생성자 메서드가 없으니 public Buyer(){}; > 값을 꼭 넣어야함
		
	}
	
	public String toString() {//				┌클래스내부에서는 그냥 변수이름사용
		return ("보유머니: "+money+"원 " + "구매일: "+this.buyDate+" 구매음료: "
				+this.item);
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

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	
	
}
