package testMain1;

public class Account extends PayMethod{
	public Account(int p,String D) {
		super(p,D);
	}
	@Override
	public void processPay() {
		System.out.println("계좌결제"+"금액: "+this.price+"원"+" 결제일:"+this.payDate);
	}
}
