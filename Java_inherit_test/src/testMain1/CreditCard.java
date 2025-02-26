package testMain1;

public class CreditCard extends PayMethod{
	
	public CreditCard(int p,String D) {
		super(p,D);
	}
	@Override
	public void processPay() {//                 ┌this를 붙여 구분해줌
		System.out.println("신용카드결제"+"금액: "+this.price+"원"+" 결제일:"+this.payDate);
	}
}
