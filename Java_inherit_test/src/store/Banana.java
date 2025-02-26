package store;

public class Banana extends Fruit {
	
	public Banana(int cost, int capacity) {
		super(cost,capacity);
	}
	
	@Override
	public void makeJuice() {
		System.out.println("바나나 주스 제조");
	}

	@Override
	public void pieceFruit() {
		System.out.println("바나나 세조각");
		
	}
	
	@Override
	public String toString() {
		return ("바나나"+cost+"원"+capacity+"ml");
	}
	
}
