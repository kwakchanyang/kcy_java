package inherit1;

public class Refri extends Product { //냉장고
	// abstract붙여주지 않을거면 부모의 추상메서드를 구현해야 한다.
	@Override
	public void power() { // 추상메서드 구현
		onOff=!onOff;
		System.out.println("냉장고 전원 :"+onOff);
	}
}

// 부모클래스가 추상메서드를 가지고 있는 추상클래스라면
// 자식클래스에게 추상메서드를 상속시키기 때문에
// 자식클래스 추상메서드 가지고 있는것과 마찬가지가 된다.
