package interface1;

public interface Move {
//	public int num;// 인스턴스변수 선언 불가(내용이있는메서드)
//	public static int cnt=0; // 클래스 변수 선언은 가능 > 얘는 처음부터 값을 가지는 애라 0을 넣어 초기화 해줘야함
//	public final float pi=3.14f;// 상수 선언 가능
//	
//	public abstract void out(); // 추상메서드
//	public void sum(); // 추상메서드
	
	public void moving(); // 추상메서드
	
	public void target();
	
}

// 객체라 하면 인스턴스변수 또는 메서드의 공간이 존재하는것을 의미한다.
// 인터페이스는 인스턴스변수 또는 메서드를 가질수 없고 객체를 생성못함
// 인터페이스자체가 추상메서드만 가질수있어서 abstract를 추상메서드로 분류됨.

