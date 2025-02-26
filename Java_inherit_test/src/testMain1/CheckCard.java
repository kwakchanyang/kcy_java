package testMain1;

public class CheckCard extends PayMethod{
	public CheckCard(int p,String D) {
		super(p,D);
	};
	@Override
	public void processPay() {
		System.out.println("채크카드결제"+"금액: "+this.price+"원"+" 결제일:"+this.payDate);
	}
}
