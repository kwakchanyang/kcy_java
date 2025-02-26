package testMain1;

public abstract class PayMethod { //부모
	protected int price;
	protected String payDate;
	
	public PayMethod() {};
	
	public PayMethod(int p,String D) {
		this.price=p;
		this.payDate=D;
	}
	public abstract void processPay();
}
