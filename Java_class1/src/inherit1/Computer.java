package inherit1;

public class Computer extends Product{
	public Computer() {};
	public Computer(String brand,int price, String name) {
		super(brand,price,name);
	}
	
	@Override
	public void power() { // 메서드를 새로만들어낸것이 아님!! 재정의임
		onOff=!onOff; // 부모쪽이 아닌 자식에서 재정의해준걸 교체해서 실행한다.
		System.out.println("컴퓨터전원: "+onOff);
	}
}
