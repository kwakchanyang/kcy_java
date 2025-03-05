package generic2;

public class Service {
//					            ┌알코올 클래스와 그의 자식들이 매개변수		
	public void drink( Bottle<? extends Alcohol> soju) { // 알코올섭취
		System.out.println(soju.item);
		System.out.println("한잔 마신다.");
		
//		@Override 진짜 클래스에서는 Bottle까지만 보는데 둘이 같음.		
//		public void drink(Bottle<Makgeolli> mk) {
//			System.out.println(mak.item);
//			System.out.println("한잔 마신다.");
//		} >> 이방법안됨. 부모인 알코올써도 타입불일치됨
//		그래서 Bottle의 타입이 뭐든 상관없이 다 받겠다.>> ?와일드카드쓰기
//		특정타입을 쓰면 걔만 들어갈수있음. 여러개 받으려면 와일드카드써야함.
	}
}
