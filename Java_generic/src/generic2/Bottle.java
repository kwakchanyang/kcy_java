package generic2;

public class Bottle<T extends Alcohol> { // 제네릭 타입을 사용하는 클래스
//						└ 타입 제한하는 방법 / Toy는 못들어옴.	
	T item;
//				┌ make라는 메서드를 사용할때 들어올 객체에 대한 제한을 해줌
//	public <T extends Alcohol> void make(T item) {
	public void make(T item) {
		System.out.println("만들기");
		this.item=item;
		System.out.println(item);
	}
	
	public T getItem() { //읽기만 가능(값변경 불가)
		return this.item;
	}
}

// 제네릭 타입의 제한
// T extends 부모클래스명 -> 부모와 자식만 가능
// T super 클래스명 -> 해당 클래스와 클래스의 부모만 가능

//  ? 