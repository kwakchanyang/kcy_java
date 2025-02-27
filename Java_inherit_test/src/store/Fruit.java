package store;

public abstract class Fruit { // 부모클래스 - 추상클래스
	protected int cost; // 판매금액
	protected int capacity; // 용량
	
	protected Fruit() {};
	protected Fruit(int c,int cp) {
		this.cost=c;
		this.capacity=cp;
	}
	
	public abstract void makeJuice(); // 과일주스 만들기
	public abstract void pieceFruit(); // 과일 소량컵에 팔기
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
