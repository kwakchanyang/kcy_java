package generic_test;

public class Snack {
	protected String snackName;
	protected int price;
	
	public Snack(String snackName, int price) {
		this.snackName=snackName;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "과자이름 :"+snackName+" 가격:"+price+"원";
	}
}
