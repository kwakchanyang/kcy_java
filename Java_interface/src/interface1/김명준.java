package interface1;
//   Move라는 인터페이스를 김명준에 적용하겠다(implements는 구현)
// 추상메서드를 갖게되는것이므로 추상클래스가되거나
public class 김명준 implements Active{

	@Override
	public void moving() {
		System.out.println("명준이가 앞으로 걸어간다.");
		
	}

	@Override
	public void target() {
		System.out.println("은호의 복부를 가격");
		
	}

}
