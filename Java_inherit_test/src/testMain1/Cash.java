package testMain1;

public class Cash extends PayMethod{
	public Cash(int p, String D) {
		super(p,D);
	}
	@Override
	public void processPay() {
		System.out.println("현금결제"+"금액: "+this.price+"원"+" 결제일:"+this.payDate);
	}
	
}
