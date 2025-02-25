package inherit1;

public class Product { // 부모클래스
	protected boolean onOff = false; // 자식클래스에서만 사용가능하게 하려면 protected붙이기//(같은 패키지에서만 사용되거나 패키지가 달라도 자식일경우는 사용가능)
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; // 제품명 - LG휘센, 캐리어A32 등
	
	public void power() {
		onOff=!onOff;
		System.out.println("전원 :"+onOff);
	}
}
