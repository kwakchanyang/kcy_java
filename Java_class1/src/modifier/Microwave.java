package modifier;

import inherit1.Product;
//									┌패캐지가 달라서 import꼭해줘야함
public class Microwave extends Product{// 전자레인지
	
	public Microwave() {
		System.out.println(super.brand);
	}
	
	@Override
	public void power() {
		System.out.println("전자레인지 전원");
	}
	
}
